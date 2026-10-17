package com.revolut.feature.crypto.asset.details.api.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/asset/details/api/dialog/StakingRewardsDialogDescriptor$Type", "Landroid/os/Parcelable;", "InPeriod", "Overdue", "Lcom/revolut/feature/crypto/asset/details/api/dialog/StakingRewardsDialogDescriptor$Type$InPeriod;", "Lcom/revolut/feature/crypto/asset/details/api/dialog/StakingRewardsDialogDescriptor$Type$Overdue;", "feature_crypto_asset_details_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StakingRewardsDialogDescriptor$Type extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/asset/details/api/dialog/StakingRewardsDialogDescriptor$Type$InPeriod;", "Lcom/revolut/feature/crypto/asset/details/api/dialog/StakingRewardsDialogDescriptor$Type;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InPeriod implements StakingRewardsDialogDescriptor$Type {

        @NotNull
        public static final Parcelable.Creator<InPeriod> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingProduct f70775a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InPeriod((StakingProduct) parcel.readParcelable(InPeriod.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InPeriod[i];
            }
        }

        public InPeriod(StakingProduct stakingProduct) {
            Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
            this.f70775a = stakingProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InPeriod) && Intrinsics.f(this.f70775a, ((InPeriod) obj2).f70775a);
        }

        public final int hashCode() {
            return this.f70775a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70775a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/asset/details/api/dialog/StakingRewardsDialogDescriptor$Type$Overdue;", "Lcom/revolut/feature/crypto/asset/details/api/dialog/StakingRewardsDialogDescriptor$Type;", "<init>", "()V", "feature_crypto_asset_details_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Overdue implements StakingRewardsDialogDescriptor$Type {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Overdue f70776a = new Overdue();

        @NotNull
        public static final Parcelable.Creator<Overdue> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Overdue.f70776a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overdue[i];
            }
        }

        private Overdue() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
