package com.revolut.feature.topup_screen.impl.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/destination/TopupFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopupFlowDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TopupFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpTarget f90590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pte.a f90591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f90592c;
    public final PreselectedTopUpMethodId d;
    public final boolean e;
    public final d f;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopupFlowDestination((TopUpTarget) parcel.readParcelable(TopupFlowDestination.class.getClassLoader()), pte.a.valueOf(parcel.readString()), (b) parcel.readSerializable(), (PreselectedTopUpMethodId) parcel.readParcelable(TopupFlowDestination.class.getClassLoader()), parcel.readInt() != 0, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopupFlowDestination[i];
        }
    }

    public TopupFlowDestination(TopUpTarget target, pte.a topUpFlow, b currency, PreselectedTopUpMethodId preselectedTopUpMethodId, boolean z, d dVar) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(topUpFlow, "topUpFlow");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f90590a = target;
        this.f90591b = topUpFlow;
        this.f90592c = currency;
        this.d = preselectedTopUpMethodId;
        this.e = z;
        this.f = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TopupFlowDestination)) {
            return false;
        }
        TopupFlowDestination topupFlowDestination = (TopupFlowDestination) obj2;
        return Intrinsics.f(this.f90590a, topupFlowDestination.f90590a) && this.f90591b == topupFlowDestination.f90591b && Intrinsics.f(this.f90592c, topupFlowDestination.f90592c) && Intrinsics.f(this.d, topupFlowDestination.d) && this.e == topupFlowDestination.e && Intrinsics.f(this.f, topupFlowDestination.f);
    }

    public final int hashCode() {
        int iJ = l.j(this.f90592c, (this.f90591b.hashCode() + (this.f90590a.hashCode() * 31)) * 31, 31);
        PreselectedTopUpMethodId preselectedTopUpMethodId = this.d;
        int iC = j6.a.c((iJ + (preselectedTopUpMethodId == null ? 0 : preselectedTopUpMethodId.hashCode())) * 31, 31, this.e);
        d dVar = this.f;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90590a, i);
        dest.writeString(this.f90591b.name());
        dest.writeSerializable(this.f90592c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeSerializable(this.f);
    }
}
