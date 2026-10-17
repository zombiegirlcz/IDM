package com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.navigable.flow.FlowStep;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AutoStakingControl", "EarnAssetDetails", "Clarification", "AllTimeRewards", "MonthRewards", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$AllTimeRewards;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$AutoStakingControl;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$Clarification;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$EarnAssetDetails;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$MonthRewards;", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EarnAssetsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$AllTimeRewards;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AllTimeRewards implements EarnAssetsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllTimeRewards f70789a = new AllTimeRewards();

        @NotNull
        public static final Parcelable.Creator<AllTimeRewards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllTimeRewards.f70789a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllTimeRewards[i];
            }
        }

        private AllTimeRewards() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$AutoStakingControl;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoStakingControl implements EarnAssetsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AutoStakingControl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f70790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StakingProduct f70791b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoStakingControl((d) parcel.readSerializable(), (StakingProduct) parcel.readParcelable(AutoStakingControl.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoStakingControl[i];
            }
        }

        public AutoStakingControl(d pocket, StakingProduct stakingProduct) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
            this.f70790a = pocket;
            this.f70791b = stakingProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoStakingControl)) {
                return false;
            }
            AutoStakingControl autoStakingControl = (AutoStakingControl) obj2;
            return Intrinsics.f(this.f70790a, autoStakingControl.f70790a) && Intrinsics.f(this.f70791b, autoStakingControl.f70791b);
        }

        public final int hashCode() {
            return this.f70791b.hashCode() + (this.f70790a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70790a);
            dest.writeParcelable(this.f70791b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$Clarification;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Clarification implements EarnAssetsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Clarification f70792a = new Clarification();

        @NotNull
        public static final Parcelable.Creator<Clarification> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Clarification.f70792a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Clarification[i];
            }
        }

        private Clarification() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$EarnAssetDetails;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EarnAssetDetails implements EarnAssetsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EarnAssetDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingPocket f70793a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EarnAssetDetails((StakingPocket) parcel.readParcelable(EarnAssetDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarnAssetDetails[i];
            }
        }

        public EarnAssetDetails(StakingPocket stakingPocket) {
            Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
            this.f70793a = stakingPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EarnAssetDetails) && Intrinsics.f(this.f70793a, ((EarnAssetDetails) obj2).f70793a);
        }

        public final int hashCode() {
            return this.f70793a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70793a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep$MonthRewards;", "Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/assets/EarnAssetsScreenContract$ModalStep;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MonthRewards implements EarnAssetsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MonthRewards f70794a = new MonthRewards();

        @NotNull
        public static final Parcelable.Creator<MonthRewards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MonthRewards.f70794a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MonthRewards[i];
            }
        }

        private MonthRewards() {
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
