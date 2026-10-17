package com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/earn/assets/shared/impl/ui/preview/EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel", "", "", "toString", "()Ljava/lang/String;", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingProduct f70803a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel((StakingProduct) parcel.readParcelable(EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel[i];
        }
    }

    public EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel(StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f70803a = stakingProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel) && Intrinsics.f(this.f70803a, ((EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel) obj2).f70803a);
    }

    public final int hashCode() {
        return this.f70803a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f70803a, i);
    }
}
