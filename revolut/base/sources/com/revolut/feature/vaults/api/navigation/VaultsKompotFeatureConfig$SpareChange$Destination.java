package com.revolut.feature.vaults.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/vaults/api/navigation/VaultsKompotFeatureConfig$SpareChange$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_vaults_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VaultsKompotFeatureConfig$SpareChange$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<VaultsKompotFeatureConfig$SpareChange$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f94733b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VaultsKompotFeatureConfig$SpareChange$Destination(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VaultsKompotFeatureConfig$SpareChange$Destination[i];
        }
    }

    public VaultsKompotFeatureConfig$SpareChange$Destination(String accountId, Long l2) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f94732a = accountId;
        this.f94733b = l2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF94732a() {
        return this.f94732a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getF94733b() {
        return this.f94733b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VaultsKompotFeatureConfig$SpareChange$Destination)) {
            return false;
        }
        VaultsKompotFeatureConfig$SpareChange$Destination vaultsKompotFeatureConfig$SpareChange$Destination = (VaultsKompotFeatureConfig$SpareChange$Destination) obj2;
        return Intrinsics.f(this.f94732a, vaultsKompotFeatureConfig$SpareChange$Destination.f94732a) && Intrinsics.f(this.f94733b, vaultsKompotFeatureConfig$SpareChange$Destination.f94733b);
    }

    public final int hashCode() {
        int iHashCode = this.f94732a.hashCode() * 31;
        Long l2 = this.f94733b;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94732a);
        Long l2 = this.f94733b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
    }
}
