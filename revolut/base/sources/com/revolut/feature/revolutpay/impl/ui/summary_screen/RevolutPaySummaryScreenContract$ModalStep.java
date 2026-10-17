package com.revolut.feature.revolutpay.impl.ui.summary_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.ExpandableDisclaimerConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.Cashback;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.EarningRepresentation;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.extension.SummaryAccountPickerExtension$AccountPickerConfiguration;
import com.revolut.feature.revolutpay.shared.ui.summary_screen.mapper.RevPointsEarningItemMapper;
import com.revolut.kompot.navigable.flow.FlowStep;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.l;
import u6c.z;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\"À\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RiskScreen", "RequestCvv", "PaymentBreakdown", "ExpandableDisclaimer", "NonBoostedRevPointsInfo", "BoostedRevPointsInfo", "GenericRevPointsInfo", "RevPointsEarningInfo", "RampFeesExplainer", "OrderSummary", "MoveMoney", "CashbackExplainer", "AccountPicker", "RunWorkflow", "TerminalPayment", "PayLaterApplication", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$AccountPicker;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$BoostedRevPointsInfo;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$CashbackExplainer;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$ExpandableDisclaimer;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$GenericRevPointsInfo;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$MoveMoney;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$NonBoostedRevPointsInfo;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$OrderSummary;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$PayLaterApplication;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$PaymentBreakdown;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RampFeesExplainer;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RequestCvv;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RevPointsEarningInfo;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RiskScreen;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RunWorkflow;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$TerminalPayment;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPaySummaryScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$AccountPicker;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountPicker implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AccountPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SummaryAccountPickerExtension$AccountPickerConfiguration f84530a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountPicker(SummaryAccountPickerExtension$AccountPickerConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountPicker[i];
            }
        }

        public AccountPicker(SummaryAccountPickerExtension$AccountPickerConfiguration accountPickerConfiguration) {
            Intrinsics.checkNotNullParameter(accountPickerConfiguration, "accountPickerConfiguration");
            this.f84530a = accountPickerConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountPicker) && Intrinsics.f(this.f84530a, ((AccountPicker) obj2).f84530a);
        }

        public final int hashCode() {
            return this.f84530a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f84530a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$BoostedRevPointsInfo;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BoostedRevPointsInfo implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BoostedRevPointsInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EarningRepresentation.BoostedRule f84531a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BoostedRevPointsInfo((EarningRepresentation.BoostedRule) parcel.readParcelable(BoostedRevPointsInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BoostedRevPointsInfo[i];
            }
        }

        public BoostedRevPointsInfo(EarningRepresentation.BoostedRule boostedRuleRepresentation) {
            Intrinsics.checkNotNullParameter(boostedRuleRepresentation, "boostedRuleRepresentation");
            this.f84531a = boostedRuleRepresentation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BoostedRevPointsInfo) && Intrinsics.f(this.f84531a, ((BoostedRevPointsInfo) obj2).f84531a);
        }

        public final int hashCode() {
            return this.f84531a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84531a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$CashbackExplainer;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashbackExplainer implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CashbackExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cashback f84532a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashbackExplainer((Cashback) parcel.readParcelable(CashbackExplainer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashbackExplainer[i];
            }
        }

        public CashbackExplainer(Cashback cashback) {
            Intrinsics.checkNotNullParameter(cashback, "cashback");
            this.f84532a = cashback;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CashbackExplainer) && Intrinsics.f(this.f84532a, ((CashbackExplainer) obj2).f84532a);
        }

        public final int hashCode() {
            return this.f84532a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84532a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$ExpandableDisclaimer;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpandableDisclaimer implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExpandableDisclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExpandableDisclaimerConfiguration f84533a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpandableDisclaimer((ExpandableDisclaimerConfiguration) parcel.readParcelable(ExpandableDisclaimer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpandableDisclaimer[i];
            }
        }

        public ExpandableDisclaimer(ExpandableDisclaimerConfiguration expandableDisclaimerConfiguration) {
            Intrinsics.checkNotNullParameter(expandableDisclaimerConfiguration, "expandableDisclaimerConfiguration");
            this.f84533a = expandableDisclaimerConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExpandableDisclaimer) && Intrinsics.f(this.f84533a, ((ExpandableDisclaimer) obj2).f84533a);
        }

        public final int hashCode() {
            return this.f84533a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84533a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$GenericRevPointsInfo;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GenericRevPointsInfo implements RevolutPaySummaryScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenericRevPointsInfo f84534a = new GenericRevPointsInfo();

        @NotNull
        public static final Parcelable.Creator<GenericRevPointsInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GenericRevPointsInfo.f84534a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GenericRevPointsInfo[i];
            }
        }

        private GenericRevPointsInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$MoveMoney;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f84535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f84537c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney(l.valueOf(parcel.readString()), parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(l moveMoneyTarget, String str, long j2) {
            Intrinsics.checkNotNullParameter(moveMoneyTarget, "moveMoneyTarget");
            this.f84535a = moveMoneyTarget;
            this.f84536b = str;
            this.f84537c = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoveMoney)) {
                return false;
            }
            MoveMoney moveMoney = (MoveMoney) obj2;
            return this.f84535a == moveMoney.f84535a && Intrinsics.f(this.f84536b, moveMoney.f84536b) && this.f84537c == moveMoney.f84537c;
        }

        public final int hashCode() {
            int iHashCode = this.f84535a.hashCode() * 31;
            String str = this.f84536b;
            return Long.hashCode(this.f84537c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84535a.name());
            dest.writeString(this.f84536b);
            dest.writeLong(this.f84537c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$NonBoostedRevPointsInfo;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NonBoostedRevPointsInfo implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<NonBoostedRevPointsInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EarningRepresentation.CardRule f84538a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NonBoostedRevPointsInfo((EarningRepresentation.CardRule) parcel.readParcelable(NonBoostedRevPointsInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NonBoostedRevPointsInfo[i];
            }
        }

        public NonBoostedRevPointsInfo(EarningRepresentation.CardRule cardRuleRepresentation) {
            Intrinsics.checkNotNullParameter(cardRuleRepresentation, "cardRuleRepresentation");
            this.f84538a = cardRuleRepresentation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NonBoostedRevPointsInfo) && Intrinsics.f(this.f84538a, ((NonBoostedRevPointsInfo) obj2).f84538a);
        }

        public final int hashCode() {
            return this.f84538a.f84422a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84538a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$OrderSummary;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderSummary implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OrderSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84539a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderSummary(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderSummary[i];
            }
        }

        public OrderSummary(String orderToken) {
            Intrinsics.checkNotNullParameter(orderToken, "orderToken");
            this.f84539a = orderToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderSummary) && Intrinsics.f(this.f84539a, ((OrderSummary) obj2).f84539a);
        }

        public final int hashCode() {
            return this.f84539a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84539a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$PayLaterApplication;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayLaterApplication implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PayLaterApplication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentMethod f84540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84542c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayLaterApplication((PaymentMethod) parcel.readParcelable(PayLaterApplication.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayLaterApplication[i];
            }
        }

        public PayLaterApplication(PaymentMethod paymentMethod, String str, String str2, String indicativeOfferId) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(indicativeOfferId, "indicativeOfferId");
            this.f84540a = paymentMethod;
            this.f84541b = str;
            this.f84542c = str2;
            this.d = indicativeOfferId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PayLaterApplication)) {
                return false;
            }
            PayLaterApplication payLaterApplication = (PayLaterApplication) obj2;
            return Intrinsics.f(this.f84540a, payLaterApplication.f84540a) && Intrinsics.f(this.f84541b, payLaterApplication.f84541b) && Intrinsics.f(this.f84542c, payLaterApplication.f84542c) && Intrinsics.f(this.d, payLaterApplication.d);
        }

        public final int hashCode() {
            int iHashCode = this.f84540a.hashCode() * 31;
            String str = this.f84541b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f84542c;
            return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84540a, i);
            dest.writeString(this.f84541b);
            dest.writeString(this.f84542c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$PaymentBreakdown;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentBreakdown implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PaymentBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Quote f84543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f84544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PaymentBreakdownControllerDescriptor$BreakdownDisclaimer f84545c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentBreakdown((Quote) parcel.readParcelable(PaymentBreakdown.class.getClassLoader()), (dj0.d) parcel.readSerializable(), (PaymentBreakdownControllerDescriptor$BreakdownDisclaimer) parcel.readParcelable(PaymentBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentBreakdown[i];
            }
        }

        public PaymentBreakdown(Quote quote, dj0.d totalInRequestedAmount, PaymentBreakdownControllerDescriptor$BreakdownDisclaimer disclaimer) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            Intrinsics.checkNotNullParameter(totalInRequestedAmount, "totalInRequestedAmount");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            this.f84543a = quote;
            this.f84544b = totalInRequestedAmount;
            this.f84545c = disclaimer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentBreakdown)) {
                return false;
            }
            PaymentBreakdown paymentBreakdown = (PaymentBreakdown) obj2;
            return Intrinsics.f(this.f84543a, paymentBreakdown.f84543a) && Intrinsics.f(this.f84544b, paymentBreakdown.f84544b) && Intrinsics.f(this.f84545c, paymentBreakdown.f84545c);
        }

        public final int hashCode() {
            return this.f84545c.hashCode() + v7.c(this.f84543a.hashCode() * 31, 31, this.f84544b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84543a, i);
            dest.writeSerializable(this.f84544b);
            dest.writeParcelable(this.f84545c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RampFeesExplainer;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RampFeesExplainer implements RevolutPaySummaryScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RampFeesExplainer f84546a = new RampFeesExplainer();

        @NotNull
        public static final Parcelable.Creator<RampFeesExplainer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RampFeesExplainer.f84546a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RampFeesExplainer[i];
            }
        }

        private RampFeesExplainer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RequestCvv;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestCvv implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RequestCvv> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentMethod.Card f84547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84549c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestCvv((PaymentMethod.Card) parcel.readParcelable(RequestCvv.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestCvv[i];
            }
        }

        public RequestCvv(PaymentMethod.Card selectedPaymentMethod, String str, String str2, String merchantPublicKey) {
            Intrinsics.checkNotNullParameter(selectedPaymentMethod, "selectedPaymentMethod");
            Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
            this.f84547a = selectedPaymentMethod;
            this.f84548b = str;
            this.f84549c = str2;
            this.d = merchantPublicKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RequestCvv)) {
                return false;
            }
            RequestCvv requestCvv = (RequestCvv) obj2;
            return Intrinsics.f(this.f84547a, requestCvv.f84547a) && Intrinsics.f(this.f84548b, requestCvv.f84548b) && Intrinsics.f(this.f84549c, requestCvv.f84549c) && Intrinsics.f(this.d, requestCvv.d);
        }

        public final int hashCode() {
            int iHashCode = this.f84547a.hashCode() * 31;
            String str = this.f84548b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f84549c;
            return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84547a, i);
            dest.writeString(this.f84548b);
            dest.writeString(this.f84549c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RevPointsEarningInfo;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsEarningInfo implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPointsEarningInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsEarningItemMapper.RevPointsEarningParcel f84550a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsEarningInfo((RevPointsEarningItemMapper.RevPointsEarningParcel) parcel.readParcelable(RevPointsEarningInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsEarningInfo[i];
            }
        }

        public RevPointsEarningInfo(RevPointsEarningItemMapper.RevPointsEarningParcel revPointsEarningParcel) {
            Intrinsics.checkNotNullParameter(revPointsEarningParcel, "revPointsEarningParcel");
            this.f84550a = revPointsEarningParcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsEarningInfo) && Intrinsics.f(this.f84550a, ((RevPointsEarningInfo) obj2).f84550a);
        }

        public final int hashCode() {
            return this.f84550a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84550a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RiskScreen;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskScreen implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RiskScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f84551a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskScreen(z.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskScreen[i];
            }
        }

        public RiskScreen(z condition) {
            Intrinsics.checkNotNullParameter(condition, "condition");
            this.f84551a = condition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RiskScreen) && this.f84551a == ((RiskScreen) obj2).f84551a;
        }

        public final int hashCode() {
            return this.f84551a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84551a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$RunWorkflow;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RunWorkflow implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RunWorkflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84553b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RunWorkflow(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RunWorkflow[i];
            }
        }

        public RunWorkflow(String paymentToken, String workflowId) {
            Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f84552a = paymentToken;
            this.f84553b = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RunWorkflow)) {
                return false;
            }
            RunWorkflow runWorkflow = (RunWorkflow) obj2;
            return Intrinsics.f(this.f84552a, runWorkflow.f84552a) && Intrinsics.f(this.f84553b, runWorkflow.f84553b);
        }

        public final int hashCode() {
            return this.f84553b.hashCode() + (this.f84552a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84552a);
            dest.writeString(this.f84553b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep$TerminalPayment;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TerminalPayment implements RevolutPaySummaryScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TerminalPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentInitiationParams f84554a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TerminalPayment((PaymentInitiationParams) parcel.readParcelable(TerminalPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TerminalPayment[i];
            }
        }

        public TerminalPayment(PaymentInitiationParams paymentInitiationParams) {
            Intrinsics.checkNotNullParameter(paymentInitiationParams, "paymentInitiationParams");
            this.f84554a = paymentInitiationParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TerminalPayment) && Intrinsics.f(this.f84554a, ((TerminalPayment) obj2).f84554a);
        }

        public final int hashCode() {
            return this.f84554a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84554a, i);
        }
    }
}
