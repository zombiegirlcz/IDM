package com.revolut.feature_crypto_order_flow.impl.order_summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_crypto_order_flow.api.navigation.AccountBalanceLimitBottomSheetControllerProvider$InputData;
import com.revolut.feature_crypto_order_flow.api.navigation.FirmPriceDevianceBottomSheetControllerProvider$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/order_summary/OrderSummaryScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FirmPriceDeviance", "AccountBalanceLimit", "Lcom/revolut/feature_crypto_order_flow/impl/order_summary/OrderSummaryScreenContract$ModalStep$AccountBalanceLimit;", "Lcom/revolut/feature_crypto_order_flow/impl/order_summary/OrderSummaryScreenContract$ModalStep$FirmPriceDeviance;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderSummaryScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/order_summary/OrderSummaryScreenContract$ModalStep$AccountBalanceLimit;", "Lcom/revolut/feature_crypto_order_flow/impl/order_summary/OrderSummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountBalanceLimit implements OrderSummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AccountBalanceLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountBalanceLimitBottomSheetControllerProvider$InputData f96776a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountBalanceLimit((AccountBalanceLimitBottomSheetControllerProvider$InputData) parcel.readParcelable(AccountBalanceLimit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountBalanceLimit[i];
            }
        }

        public AccountBalanceLimit(AccountBalanceLimitBottomSheetControllerProvider$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f96776a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountBalanceLimit) && Intrinsics.f(this.f96776a, ((AccountBalanceLimit) obj2).f96776a);
        }

        public final int hashCode() {
            return this.f96776a.f96712a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96776a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/order_summary/OrderSummaryScreenContract$ModalStep$FirmPriceDeviance;", "Lcom/revolut/feature_crypto_order_flow/impl/order_summary/OrderSummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FirmPriceDeviance implements OrderSummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FirmPriceDeviance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FirmPriceDevianceBottomSheetControllerProvider$InputData f96777a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FirmPriceDeviance((FirmPriceDevianceBottomSheetControllerProvider$InputData) parcel.readParcelable(FirmPriceDeviance.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FirmPriceDeviance[i];
            }
        }

        public FirmPriceDeviance(FirmPriceDevianceBottomSheetControllerProvider$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f96777a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FirmPriceDeviance) && Intrinsics.f(this.f96777a, ((FirmPriceDeviance) obj2).f96777a);
        }

        public final int hashCode() {
            return this.f96777a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96777a, i);
        }
    }
}
