package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionCancellationConfirmation;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPayPocketSelection", "RevPointsInfo", "CancellationConfirmation", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep$CancellationConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep$RevPointsInfo;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanBillingScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep$CancellationConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationConfirmation implements EsimMobilePlanBillingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancellationConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType f101094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimSubscriptionCancellationConfirmation f101095b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationConfirmation((EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) parcel.readParcelable(CancellationConfirmation.class.getClassLoader()), (EsimSubscriptionCancellationConfirmation) parcel.readParcelable(CancellationConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationConfirmation[i];
            }
        }

        public CancellationConfirmation(EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType, EsimSubscriptionCancellationConfirmation confirmation) {
            Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
            Intrinsics.checkNotNullParameter(confirmation, "confirmation");
            this.f101094a = cancellationType;
            this.f101095b = confirmation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancellationConfirmation)) {
                return false;
            }
            CancellationConfirmation cancellationConfirmation = (CancellationConfirmation) obj2;
            return Intrinsics.f(this.f101094a, cancellationConfirmation.f101094a) && Intrinsics.f(this.f101095b, cancellationConfirmation.f101095b);
        }

        public final int hashCode() {
            return this.f101095b.hashCode() + (this.f101094a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101094a, i);
            dest.writeParcelable(this.f101095b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPayPocketSelection implements EsimMobilePlanBillingScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPayPocketSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f101096a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPayPocketSelection((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPayPocketSelection[i];
            }
        }

        public RevPayPocketSelection(d originalPrice) {
            Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
            this.f101096a = originalPrice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPayPocketSelection) && Intrinsics.f(this.f101096a, ((RevPayPocketSelection) obj2).f101096a);
        }

        public final int hashCode() {
            return this.f101096a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101096a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep$RevPointsInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreenContract$ModalStep;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsInfo implements EsimMobilePlanBillingScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsInfo f101097a = new RevPointsInfo();

        @NotNull
        public static final Parcelable.Creator<RevPointsInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsInfo.f101097a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsInfo[i];
            }
        }

        private RevPointsInfo() {
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
