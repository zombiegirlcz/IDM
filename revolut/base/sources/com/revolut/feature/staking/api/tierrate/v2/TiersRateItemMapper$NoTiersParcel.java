package com.revolut.feature.staking.api.tierrate.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/staking/api/tierrate/v2/TiersRateItemMapper$NoTiersParcel", "Lcom/revolut/feature/staking/api/tierrate/v2/TiersRateItemMapper$Parcel;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TiersRateItemMapper$NoTiersParcel implements TiersRateItemMapper$Parcel {

    @NotNull
    public static final Parcelable.Creator<TiersRateItemMapper$NoTiersParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f88102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f88103b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TiersRateItemMapper$NoTiersParcel(StakingProduct.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TiersRateItemMapper$NoTiersParcel[i];
        }
    }

    public TiersRateItemMapper$NoTiersParcel(StakingProduct stakingProduct, b bVar) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f88102a = stakingProduct;
        this.f88103b = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TiersRateItemMapper$NoTiersParcel)) {
            return false;
        }
        TiersRateItemMapper$NoTiersParcel tiersRateItemMapper$NoTiersParcel = (TiersRateItemMapper$NoTiersParcel) obj2;
        return Intrinsics.f(this.f88102a, tiersRateItemMapper$NoTiersParcel.f88102a) && Intrinsics.f(this.f88103b, tiersRateItemMapper$NoTiersParcel.f88103b);
    }

    public final int hashCode() {
        int iHashCode = this.f88102a.hashCode() * 31;
        b bVar = this.f88103b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f88102a.writeToParcel(dest, i);
        dest.writeSerializable(this.f88103b);
    }
}
