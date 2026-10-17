package com.revolut.trading.orders.ui.invest.placement.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$InputData;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Edit", "Review", "ScaPrompt", "Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step$Edit;", "Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step$Review;", "Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step$ScaPrompt;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestOrderFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step$Edit;", "Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements InvestOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestOrderEditScreenContract$InputData f106836a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit(InvestOrderEditScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(InvestOrderEditScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f106836a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Edit) && Intrinsics.f(this.f106836a, ((Edit) obj2).f106836a);
        }

        public final int hashCode() {
            return this.f106836a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106836a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step$Review;", "Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements InvestOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestOrderReviewScreenContract$InputData f106837a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(InvestOrderReviewScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(InvestOrderReviewScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f106837a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Review) && Intrinsics.f(this.f106837a, ((Review) obj2).f106837a);
        }

        public final int hashCode() {
            return this.f106837a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106837a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step$ScaPrompt;", "Lcom/revolut/trading/orders/ui/invest/placement/flow/InvestOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScaPrompt implements InvestOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ScaPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InvestOrderFlowContract$Step f106839b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScaPrompt(parcel.readString(), (InvestOrderFlowContract$Step) parcel.readParcelable(ScaPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScaPrompt[i];
            }
        }

        public ScaPrompt(String legalEntityId, InvestOrderFlowContract$Step nextStep) {
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            this.f106838a = legalEntityId;
            this.f106839b = nextStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScaPrompt)) {
                return false;
            }
            ScaPrompt scaPrompt = (ScaPrompt) obj2;
            return Intrinsics.f(this.f106838a, scaPrompt.f106838a) && Intrinsics.f(this.f106839b, scaPrompt.f106839b);
        }

        public final int hashCode() {
            return this.f106839b.hashCode() + (this.f106838a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106838a);
            dest.writeParcelable(this.f106839b, i);
        }
    }
}
