package com.revolut.feature.pay_later.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "LinkedPlansNavigationDestination", "AccountDetailsNavigationDestination", "PlanDetails", "PlanDetailsNavigationDestination", "PlansList", "PlansListNavigationDestination", "RepaymentDetails", "RepaymentDetailsNavigationDestination", "RepaymentsList", "RepaymentsListNavigationDestination", "SelectRepaymentNavigationDestination", "SelectPlanNavigationDestination", "PartialRepayments", "PartialRepaymentsNavigationDestination", "RepayAmount", "RepayAmountNavigationDestination", "PaymentBreakdownNavigationDestination", "PlanProgressNavigationDestination", "ActivationNavigationDestination", "DeactivationNavigationDestination", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PartialRepayments;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PlanDetails;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PlansList;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepayAmount;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepaymentDetails;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepaymentsList;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PayLaterKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$AccountDetailsNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountDetailsNavigationDestination implements PayLaterKompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountDetailsNavigationDestination f78822a = new AccountDetailsNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<AccountDetailsNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountDetailsNavigationDestination.f78822a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetailsNavigationDestination[i];
            }
        }

        private AccountDetailsNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$ActivationNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActivationNavigationDestination implements PayLaterKompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActivationNavigationDestination f78823a = new ActivationNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<ActivationNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActivationNavigationDestination.f78823a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivationNavigationDestination[i];
            }
        }

        private ActivationNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$DeactivationNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeactivationNavigationDestination implements PayLaterKompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeactivationNavigationDestination f78824a = new DeactivationNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<DeactivationNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeactivationNavigationDestination.f78824a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeactivationNavigationDestination[i];
            }
        }

        private DeactivationNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$LinkedPlansNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedPlansNavigationDestination implements PayLaterKompotDestination {

        @NotNull
        public static final Parcelable.Creator<LinkedPlansNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78825a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedPlansNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedPlansNavigationDestination[i];
            }
        }

        public LinkedPlansNavigationDestination(String transactionId) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f78825a = transactionId;
        }

        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getF78825a() {
            return this.f78825a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedPlansNavigationDestination) && Intrinsics.f(this.f78825a, ((LinkedPlansNavigationDestination) obj2).f78825a);
        }

        public final int hashCode() {
            return this.f78825a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78825a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PartialRepayments;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartialRepayments extends PayLaterKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f78826g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PartialRepayments(String transactionId) {
            super(null, new PartialRepaymentsNavigationDestination(transactionId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f78826g = transactionId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PartialRepayments) && Intrinsics.f(this.f78826g, ((PartialRepayments) obj2).f78826g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f78826g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PartialRepaymentsNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PartialRepaymentsNavigationDestination$InputData;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartialRepaymentsNavigationDestination extends InternalDestination<InputData> implements PayLaterKompotDestination {

        @NotNull
        public static final Parcelable.Creator<PartialRepaymentsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78827b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PartialRepaymentsNavigationDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputData implements IOData$Input {

            @NotNull
            public static final Parcelable.Creator<InputData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f78828a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InputData(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputData[i];
                }
            }

            public InputData(String transactionId) {
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                this.f78828a = transactionId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof InputData) && Intrinsics.f(this.f78828a, ((InputData) obj2).f78828a);
            }

            public final int hashCode() {
                return this.f78828a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f78828a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PartialRepaymentsNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PartialRepaymentsNavigationDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PartialRepaymentsNavigationDestination(String transactionId) {
            super(new InputData(transactionId));
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f78827b = transactionId;
        }

        /* JADX INFO: renamed from: L0, reason: from getter */
        public final String getF78827b() {
            return this.f78827b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PartialRepaymentsNavigationDestination) && Intrinsics.f(this.f78827b, ((PartialRepaymentsNavigationDestination) obj2).f78827b);
        }

        public final int hashCode() {
            return this.f78827b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78827b);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PaymentBreakdownNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PaymentBreakdownNavigationDestination$InputData;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentBreakdownNavigationDestination extends InternalDestination<InputData> implements PayLaterKompotDestination {

        @NotNull
        public static final Parcelable.Creator<PaymentBreakdownNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78829b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PaymentBreakdownNavigationDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputData implements IOData$Input {

            @NotNull
            public static final Parcelable.Creator<InputData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f78830a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InputData(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputData[i];
                }
            }

            public InputData(boolean z) {
                this.f78830a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof InputData) && this.f78830a == ((InputData) obj2).f78830a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f78830a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f78830a ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentBreakdownNavigationDestination(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentBreakdownNavigationDestination[i];
            }
        }

        public PaymentBreakdownNavigationDestination(boolean z) {
            super(new InputData(z));
            this.f78829b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentBreakdownNavigationDestination) && this.f78829b == ((PaymentBreakdownNavigationDestination) obj2).f78829b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78829b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f78829b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PlanDetails;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDetails extends PayLaterKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f78831g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanDetails(String planId) {
            super(null, new PlanDetailsNavigationDestination(planId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f78831g = planId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanDetails) && Intrinsics.f(this.f78831g, ((PlanDetails) obj2).f78831g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f78831g.hashCode() * 31;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PlanDetailsNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PlanDetailsNavigationDestination$InputData;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDetailsNavigationDestination extends InternalDestination<InputData> implements PayLaterKompotDestination {

        @NotNull
        public static final Parcelable.Creator<PlanDetailsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78832b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PlanDetailsNavigationDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputData implements IOData$Input {

            @NotNull
            public static final Parcelable.Creator<InputData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f78833a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InputData(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputData[i];
                }
            }

            public InputData(String planId) {
                Intrinsics.checkNotNullParameter(planId, "planId");
                this.f78833a = planId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof InputData) && Intrinsics.f(this.f78833a, ((InputData) obj2).f78833a);
            }

            public final int hashCode() {
                return this.f78833a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f78833a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanDetailsNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanDetailsNavigationDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanDetailsNavigationDestination(String planId) {
            super(new InputData(planId));
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f78832b = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanDetailsNavigationDestination) && Intrinsics.f(this.f78832b, ((PlanDetailsNavigationDestination) obj2).f78832b);
        }

        public final int hashCode() {
            return this.f78832b.hashCode();
        }

        /* JADX INFO: renamed from: n0, reason: from getter */
        public final String getF78832b() {
            return this.f78832b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78832b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PlanProgressNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanProgressNavigationDestination implements PayLaterKompotDestination {

        @NotNull
        public static final Parcelable.Creator<PlanProgressNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78834a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanProgressNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanProgressNavigationDestination[i];
            }
        }

        public PlanProgressNavigationDestination(String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f78834a = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanProgressNavigationDestination) && Intrinsics.f(this.f78834a, ((PlanProgressNavigationDestination) obj2).f78834a);
        }

        public final int hashCode() {
            return this.f78834a.hashCode();
        }

        /* JADX INFO: renamed from: n0, reason: from getter */
        public final String getF78834a() {
            return this.f78834a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78834a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PlansList;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlansList extends PayLaterKompotFeatureConfig {
        public PlansList() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof PlansList);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return 0;
        }

        public PlansList(int i) {
            super(null, PlansListNavigationDestination.f78835a, false, null, 0, 60);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PlansListNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlansListNavigationDestination implements PayLaterKompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlansListNavigationDestination f78835a = new PlansListNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<PlansListNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlansListNavigationDestination.f78835a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlansListNavigationDestination[i];
            }
        }

        private PlansListNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepayAmount;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepayAmount extends PayLaterKompotFeatureConfig {
        public RepayAmount() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof RepayAmount);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return 0;
        }

        public RepayAmount(int i) {
            super(null, RepayAmountNavigationDestination.f78836b, false, null, 0, 60);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepayAmountNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RepayAmountNavigationDestination extends InternalDestination<IOData$EmptyInput> implements PayLaterKompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RepayAmountNavigationDestination f78836b = new RepayAmountNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<RepayAmountNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RepayAmountNavigationDestination.f78836b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepayAmountNavigationDestination[i];
            }
        }

        private RepayAmountNavigationDestination() {
            super(IOData$EmptyInput.f98299a);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepaymentDetails;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentDetails extends PayLaterKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f78837g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f78838h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RepaymentDetails(String planId, int i) {
            super(null, new RepaymentDetailsNavigationDestination(planId, i), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f78837g = planId;
            this.f78838h = i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RepaymentDetails)) {
                return false;
            }
            RepaymentDetails repaymentDetails = (RepaymentDetails) obj2;
            return Intrinsics.f(this.f78837g, repaymentDetails.f78837g) && this.f78838h == repaymentDetails.f78838h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return a.b(this.f78838h, this.f78837g.hashCode() * 31, 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepaymentDetailsNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepaymentDetailsNavigationDestination$InputData;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentDetailsNavigationDestination extends InternalDestination<InputData> implements PayLaterKompotDestination {

        @NotNull
        public static final Parcelable.Creator<RepaymentDetailsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f78840c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepaymentDetailsNavigationDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputData implements IOData$Input {

            @NotNull
            public static final Parcelable.Creator<InputData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f78841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f78842b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InputData(parcel.readString(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputData[i];
                }
            }

            public InputData(String planId, int i) {
                Intrinsics.checkNotNullParameter(planId, "planId");
                this.f78841a = planId;
                this.f78842b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InputData)) {
                    return false;
                }
                InputData inputData = (InputData) obj2;
                return Intrinsics.f(this.f78841a, inputData.f78841a) && this.f78842b == inputData.f78842b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f78842b) + (this.f78841a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f78841a);
                dest.writeInt(this.f78842b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentDetailsNavigationDestination(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentDetailsNavigationDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RepaymentDetailsNavigationDestination(String planId, int i) {
            super(new InputData(planId, i));
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f78839b = planId;
            this.f78840c = i;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF78840c() {
            return this.f78840c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RepaymentDetailsNavigationDestination)) {
                return false;
            }
            RepaymentDetailsNavigationDestination repaymentDetailsNavigationDestination = (RepaymentDetailsNavigationDestination) obj2;
            return Intrinsics.f(this.f78839b, repaymentDetailsNavigationDestination.f78839b) && this.f78840c == repaymentDetailsNavigationDestination.f78840c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f78840c) + (this.f78839b.hashCode() * 31);
        }

        /* JADX INFO: renamed from: n0, reason: from getter */
        public final String getF78839b() {
            return this.f78839b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78839b);
            dest.writeInt(this.f78840c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepaymentsList;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentsList extends PayLaterKompotFeatureConfig {
        public RepaymentsList() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getI() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof RepaymentsList);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return 0;
        }

        public RepaymentsList(int i) {
            super(null, RepaymentsListNavigationDestination.f78843a, false, null, 0, 60);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$RepaymentsListNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RepaymentsListNavigationDestination implements PayLaterKompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RepaymentsListNavigationDestination f78843a = new RepaymentsListNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<RepaymentsListNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RepaymentsListNavigationDestination.f78843a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentsListNavigationDestination[i];
            }
        }

        private RepaymentsListNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$SelectPlanNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectPlanNavigationDestination implements PayLaterKompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectPlanNavigationDestination f78844a = new SelectPlanNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<SelectPlanNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectPlanNavigationDestination.f78844a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPlanNavigationDestination[i];
            }
        }

        private SelectPlanNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$SelectRepaymentNavigationDestination;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectRepaymentNavigationDestination extends InternalDestination<IOData$EmptyInput> implements PayLaterKompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SelectRepaymentNavigationDestination f78845b = new SelectRepaymentNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<SelectRepaymentNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectRepaymentNavigationDestination.f78845b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectRepaymentNavigationDestination[i];
            }
        }

        private SelectRepaymentNavigationDestination() {
            super(IOData$EmptyInput.f98299a);
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
