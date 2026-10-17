package com.revolut.feature.staking.impl.stake.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BalancePicker", "EarnRateBottomSheet", "CryptoScaPrompt", "Lcom/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep$BalancePicker;", "Lcom/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep$CryptoScaPrompt;", "Lcom/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep$EarnRateBottomSheet;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StakeControllerContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep$BalancePicker;", "Lcom/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalancePicker extends StakeControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BalancePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88141a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BalancePicker(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalancePicker[i];
            }
        }

        public BalancePicker(String selectedPocketId) {
            Intrinsics.checkNotNullParameter(selectedPocketId, "selectedPocketId");
            this.f88141a = selectedPocketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BalancePicker) && Intrinsics.f(this.f88141a, ((BalancePicker) obj2).f88141a);
        }

        public final int hashCode() {
            return this.f88141a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88141a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep$CryptoScaPrompt;", "Lcom/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoScaPrompt extends StakeControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CryptoScaPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f88143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88144c;
        public final StakingPocket d;
        public final StakingProduct e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoScaPrompt(parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), (StakingPocket) parcel.readParcelable(CryptoScaPrompt.class.getClassLoader()), (StakingProduct) parcel.readParcelable(CryptoScaPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoScaPrompt[i];
            }
        }

        public CryptoScaPrompt(String legalEntityId, d amount, String sourcePocketId, StakingPocket stakingPocket, StakingProduct stakingProduct) {
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
            Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
            this.f88142a = legalEntityId;
            this.f88143b = amount;
            this.f88144c = sourcePocketId;
            this.d = stakingPocket;
            this.e = stakingProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoScaPrompt)) {
                return false;
            }
            CryptoScaPrompt cryptoScaPrompt = (CryptoScaPrompt) obj2;
            return Intrinsics.f(this.f88142a, cryptoScaPrompt.f88142a) && Intrinsics.f(this.f88143b, cryptoScaPrompt.f88143b) && Intrinsics.f(this.f88144c, cryptoScaPrompt.f88144c) && Intrinsics.f(this.d, cryptoScaPrompt.d) && Intrinsics.f(this.e, cryptoScaPrompt.e);
        }

        public final int hashCode() {
            int iC = p.a.c(v7.c(this.f88142a.hashCode() * 31, 31, this.f88143b), 31, this.f88144c);
            StakingPocket stakingPocket = this.d;
            return this.e.hashCode() + ((iC + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88142a);
            dest.writeSerializable(this.f88143b);
            dest.writeString(this.f88144c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep$EarnRateBottomSheet;", "Lcom/revolut/feature/staking/impl/stake/v2/StakeControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EarnRateBottomSheet extends StakeControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EarnRateBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TiersRateItemMapper$Parcel f88145a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EarnRateBottomSheet((TiersRateItemMapper$Parcel) parcel.readParcelable(EarnRateBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarnRateBottomSheet[i];
            }
        }

        public EarnRateBottomSheet(TiersRateItemMapper$Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f88145a = parcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EarnRateBottomSheet) && Intrinsics.f(this.f88145a, ((EarnRateBottomSheet) obj2).f88145a);
        }

        public final int hashCode() {
            return this.f88145a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88145a, i);
        }
    }

    private StakeControllerContract$ModalStep() {
    }
}
