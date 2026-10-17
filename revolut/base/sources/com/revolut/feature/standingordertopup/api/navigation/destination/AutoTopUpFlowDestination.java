package com.revolut.feature.standingordertopup.api.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/standingordertopup/api/navigation/destination/AutoTopUpFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_standing_order_topup_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoTopUpFlowDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AutoTopUpFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f88174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f88175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88176c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoTopUpFlowDestination((b) parcel.readSerializable(), l.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoTopUpFlowDestination[i];
        }
    }

    public AutoTopUpFlowDestination(b bVar, l pocketType, String str) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f88174a = bVar;
        this.f88175b = pocketType;
        this.f88176c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoTopUpFlowDestination)) {
            return false;
        }
        AutoTopUpFlowDestination autoTopUpFlowDestination = (AutoTopUpFlowDestination) obj2;
        return Intrinsics.f(this.f88174a, autoTopUpFlowDestination.f88174a) && this.f88175b == autoTopUpFlowDestination.f88175b && Intrinsics.f(this.f88176c, autoTopUpFlowDestination.f88176c);
    }

    public final int hashCode() {
        b bVar = this.f88174a;
        int iC = t61.a.c(this.f88175b, (bVar == null ? 0 : bVar.hashCode()) * 31, 31);
        String str = this.f88176c;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f88174a);
        dest.writeString(this.f88175b.name());
        dest.writeString(this.f88176c);
    }
}
