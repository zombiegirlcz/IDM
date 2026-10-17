package com.revolut.feature.topup_screen.api.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/destination/ExternalCardDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalCardDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ExternalCardDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f90508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpMethodsContext f90509c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            return new ExternalCardDetailsDestination(parcel.readInt() == 0 ? null : TopUpMethodsContext.CREATOR.createFromParcel(parcel), l.valueOf(parcel.readString()), string, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalCardDetailsDestination[i];
        }
    }

    public ExternalCardDetailsDestination(TopUpMethodsContext topUpMethodsContext, l pocketType, String externalCardId, boolean z) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f90507a = externalCardId;
        this.f90508b = pocketType;
        this.f90509c = topUpMethodsContext;
        this.d = z;
    }

    /* JADX INFO: renamed from: X4, reason: from getter */
    public final l getF90508b() {
        return this.f90508b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF90507a() {
        return this.f90507a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TopUpMethodsContext getF90509c() {
        return this.f90509c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExternalCardDetailsDestination)) {
            return false;
        }
        ExternalCardDetailsDestination externalCardDetailsDestination = (ExternalCardDetailsDestination) obj2;
        return Intrinsics.f(this.f90507a, externalCardDetailsDestination.f90507a) && this.f90508b == externalCardDetailsDestination.f90508b && Intrinsics.f(this.f90509c, externalCardDetailsDestination.f90509c) && this.d == externalCardDetailsDestination.d;
    }

    public final int hashCode() {
        int iC = t61.a.c(this.f90508b, this.f90507a.hashCode() * 31, 31);
        TopUpMethodsContext topUpMethodsContext = this.f90509c;
        return Boolean.hashCode(this.d) + ((iC + (topUpMethodsContext == null ? 0 : topUpMethodsContext.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90507a);
        dest.writeString(this.f90508b.name());
        TopUpMethodsContext topUpMethodsContext = this.f90509c;
        if (topUpMethodsContext == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            topUpMethodsContext.writeToParcel(dest, i);
        }
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ ExternalCardDetailsDestination(String str, l lVar) {
        this(null, lVar, str, false);
    }
}
