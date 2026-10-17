package com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "LockedUnstake", "OpenOrders", "LockedGift", "Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep$LockedGift;", "Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep$LockedUnstake;", "Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep$OpenOrders;", "feature_crypto_locked_balance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoBalanceBreakdownContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep$LockedGift;", "Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_locked_balance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LockedGift implements CryptoBalanceBreakdownContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LockedGift> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70876a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LockedGift(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LockedGift[i];
            }
        }

        public LockedGift(String assetId) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            this.f70876a = assetId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LockedGift) && Intrinsics.f(this.f70876a, ((LockedGift) obj2).f70876a);
        }

        public final int hashCode() {
            return this.f70876a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70876a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep$LockedUnstake;", "Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_locked_balance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LockedUnstake implements CryptoBalanceBreakdownContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LockedUnstake> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StakingPocket f70877a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LockedUnstake((StakingPocket) parcel.readParcelable(LockedUnstake.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LockedUnstake[i];
            }
        }

        public LockedUnstake(StakingPocket stakingPocket) {
            Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
            this.f70877a = stakingPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LockedUnstake) && Intrinsics.f(this.f70877a, ((LockedUnstake) obj2).f70877a);
        }

        public final int hashCode() {
            return this.f70877a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70877a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep$OpenOrders;", "Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_locked_balance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenOrders implements CryptoBalanceBreakdownContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OpenOrders> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70878a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenOrders(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenOrders[i];
            }
        }

        public OpenOrders(String assetId) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            this.f70878a = assetId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenOrders) && Intrinsics.f(this.f70878a, ((OpenOrders) obj2).f70878a);
        }

        public final int hashCode() {
            return this.f70878a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70878a);
        }
    }
}
