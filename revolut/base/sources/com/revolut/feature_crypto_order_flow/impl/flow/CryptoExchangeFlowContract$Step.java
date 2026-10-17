package com.revolut.feature_crypto_order_flow.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CryptoExchangeStep", "OrderSummaryStep", "CryptoScaPromptStep", "Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step$CryptoExchangeStep;", "Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step$CryptoScaPromptStep;", "Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step$OrderSummaryStep;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoExchangeFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step$CryptoExchangeStep;", "Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoExchangeStep extends CryptoExchangeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CryptoExchangeStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoExchangeScreenContract$InputData f96765a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoExchangeStep(CryptoExchangeScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoExchangeStep[i];
            }
        }

        public CryptoExchangeStep(CryptoExchangeScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f96765a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoExchangeStep) && Intrinsics.f(this.f96765a, ((CryptoExchangeStep) obj2).f96765a);
        }

        public final int hashCode() {
            return this.f96765a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96765a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step$CryptoScaPromptStep;", "Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoScaPromptStep extends CryptoExchangeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CryptoScaPromptStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OrderSummaryScreenContract$InputData f96767b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoScaPromptStep(parcel.readString(), OrderSummaryScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoScaPromptStep[i];
            }
        }

        public CryptoScaPromptStep(String legalEntityId, OrderSummaryScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            Intrinsics.checkNotNullParameter(input, "input");
            this.f96766a = legalEntityId;
            this.f96767b = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoScaPromptStep)) {
                return false;
            }
            CryptoScaPromptStep cryptoScaPromptStep = (CryptoScaPromptStep) obj2;
            return Intrinsics.f(this.f96766a, cryptoScaPromptStep.f96766a) && Intrinsics.f(this.f96767b, cryptoScaPromptStep.f96767b);
        }

        public final int hashCode() {
            return this.f96767b.f96775a.hashCode() + (this.f96766a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96766a);
            this.f96767b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step$OrderSummaryStep;", "Lcom/revolut/feature_crypto_order_flow/impl/flow/CryptoExchangeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderSummaryStep extends CryptoExchangeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OrderSummaryStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OrderSummaryScreenContract$InputData f96768a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderSummaryStep(OrderSummaryScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderSummaryStep[i];
            }
        }

        public OrderSummaryStep(OrderSummaryScreenContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f96768a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderSummaryStep) && Intrinsics.f(this.f96768a, ((OrderSummaryStep) obj2).f96768a);
        }

        public final int hashCode() {
            return this.f96768a.f96775a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96768a.writeToParcel(dest, i);
        }
    }

    private CryptoExchangeFlowContract$Step() {
    }
}
