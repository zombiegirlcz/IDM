package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimMigrationFromDataPlansOnly;
import com.revolut.retail.feature.esim.api.model.EsimPriceBreakdown;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefund;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$ContractStatementData;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPayPocketSelection", "ExchangeBreakdown", "CompleteNumberTransfer", "EsimMigration", "EsimInstallation", "PlanSummary", "RevPointsInfo", "UpdatedBill", "Refund", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$CompleteNumberTransfer;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$EsimMigration;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$ExchangeBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$PlanSummary;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$Refund;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$RevPointsInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$UpdatedBill;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanCheckoutScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$CompleteNumberTransfer;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CompleteNumberTransfer implements EsimMobilePlanCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CompleteNumberTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimCheckoutPortingSteps f101153a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CompleteNumberTransfer((EsimCheckoutPortingSteps) parcel.readParcelable(CompleteNumberTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CompleteNumberTransfer[i];
            }
        }

        public CompleteNumberTransfer(EsimCheckoutPortingSteps transferSteps) {
            Intrinsics.checkNotNullParameter(transferSteps, "transferSteps");
            this.f101153a = transferSteps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CompleteNumberTransfer) && Intrinsics.f(this.f101153a, ((CompleteNumberTransfer) obj2).f101153a);
        }

        public final int hashCode() {
            return this.f101153a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101153a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimInstallation implements EsimMobilePlanCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EsimInstallation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimProfile f101154a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimInstallation((EsimProfile) parcel.readParcelable(EsimInstallation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimInstallation[i];
            }
        }

        public EsimInstallation(EsimProfile esimProfile) {
            Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
            this.f101154a = esimProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EsimInstallation) && Intrinsics.f(this.f101154a, ((EsimInstallation) obj2).f101154a);
        }

        public final int hashCode() {
            return this.f101154a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101154a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$EsimMigration;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimMigration implements EsimMobilePlanCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EsimMigration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimProfile f101155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimMigrationFromDataPlansOnly f101156b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimMigration((EsimProfile) parcel.readParcelable(EsimMigration.class.getClassLoader()), (EsimMigrationFromDataPlansOnly) parcel.readParcelable(EsimMigration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimMigration[i];
            }
        }

        public EsimMigration(EsimProfile esimProfile, EsimMigrationFromDataPlansOnly migrationFromDataPlansOnly) {
            Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
            Intrinsics.checkNotNullParameter(migrationFromDataPlansOnly, "migrationFromDataPlansOnly");
            this.f101155a = esimProfile;
            this.f101156b = migrationFromDataPlansOnly;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EsimMigration)) {
                return false;
            }
            EsimMigration esimMigration = (EsimMigration) obj2;
            return Intrinsics.f(this.f101155a, esimMigration.f101155a) && Intrinsics.f(this.f101156b, esimMigration.f101156b);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101156b.f100292a) + (this.f101155a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101155a, i);
            dest.writeParcelable(this.f101156b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$ExchangeBreakdown;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeBreakdown implements EsimMobilePlanCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExchangeBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimMobilePlanCheckoutScreenContract$ExchangeBreakdownData f101157a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeBreakdown(EsimMobilePlanCheckoutScreenContract$ExchangeBreakdownData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeBreakdown[i];
            }
        }

        public ExchangeBreakdown(EsimMobilePlanCheckoutScreenContract$ExchangeBreakdownData breakdownData) {
            Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
            this.f101157a = breakdownData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExchangeBreakdown) && Intrinsics.f(this.f101157a, ((ExchangeBreakdown) obj2).f101157a);
        }

        public final int hashCode() {
            return this.f101157a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f101157a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$PlanSummary;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSummary implements EsimMobilePlanCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PlanSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimDataPlan f101158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimGiftRecipient f101159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimMobilePlanSummaryScreenContract$ContractStatementData f101160c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSummary((EsimDataPlan) parcel.readParcelable(PlanSummary.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(PlanSummary.class.getClassLoader()), parcel.readInt() == 0 ? null : EsimMobilePlanSummaryScreenContract$ContractStatementData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSummary[i];
            }
        }

        public PlanSummary(EsimDataPlan mobilePlan, EsimGiftRecipient esimGiftRecipient, EsimMobilePlanSummaryScreenContract$ContractStatementData esimMobilePlanSummaryScreenContract$ContractStatementData) {
            Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
            this.f101158a = mobilePlan;
            this.f101159b = esimGiftRecipient;
            this.f101160c = esimMobilePlanSummaryScreenContract$ContractStatementData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanSummary)) {
                return false;
            }
            PlanSummary planSummary = (PlanSummary) obj2;
            return Intrinsics.f(this.f101158a, planSummary.f101158a) && Intrinsics.f(this.f101159b, planSummary.f101159b) && Intrinsics.f(this.f101160c, planSummary.f101160c);
        }

        public final int hashCode() {
            int iHashCode = this.f101158a.hashCode() * 31;
            EsimGiftRecipient esimGiftRecipient = this.f101159b;
            int iHashCode2 = (iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31;
            EsimMobilePlanSummaryScreenContract$ContractStatementData esimMobilePlanSummaryScreenContract$ContractStatementData = this.f101160c;
            return iHashCode2 + (esimMobilePlanSummaryScreenContract$ContractStatementData != null ? esimMobilePlanSummaryScreenContract$ContractStatementData.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101158a, i);
            dest.writeParcelable(this.f101159b, i);
            EsimMobilePlanSummaryScreenContract$ContractStatementData esimMobilePlanSummaryScreenContract$ContractStatementData = this.f101160c;
            if (esimMobilePlanSummaryScreenContract$ContractStatementData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                esimMobilePlanSummaryScreenContract$ContractStatementData.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$Refund;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refund implements EsimMobilePlanCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Refund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionRefund f101161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPriceBreakdown f101162b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Refund((EsimSubscriptionRefund) parcel.readParcelable(Refund.class.getClassLoader()), (EsimPriceBreakdown) parcel.readParcelable(Refund.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Refund[i];
            }
        }

        public Refund(EsimSubscriptionRefund refund, EsimPriceBreakdown priceBreakdown) {
            Intrinsics.checkNotNullParameter(refund, "refund");
            Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
            this.f101161a = refund;
            this.f101162b = priceBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Refund)) {
                return false;
            }
            Refund refund = (Refund) obj2;
            return Intrinsics.f(this.f101161a, refund.f101161a) && Intrinsics.f(this.f101162b, refund.f101162b);
        }

        public final int hashCode() {
            return this.f101162b.hashCode() + (this.f101161a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101161a, i);
            dest.writeParcelable(this.f101162b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$RevPayPocketSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPayPocketSelection implements EsimMobilePlanCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPayPocketSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f101163a;

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
            this.f101163a = originalPrice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPayPocketSelection) && Intrinsics.f(this.f101163a, ((RevPayPocketSelection) obj2).f101163a);
        }

        public final int hashCode() {
            return this.f101163a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101163a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$RevPointsInfo;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsInfo implements EsimMobilePlanCheckoutScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsInfo f101164a = new RevPointsInfo();

        @NotNull
        public static final Parcelable.Creator<RevPointsInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsInfo.f101164a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep$UpdatedBill;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdatedBill implements EsimMobilePlanCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UpdatedBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel f101165a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdatedBill(EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdatedBill[i];
            }
        }

        public UpdatedBill(EsimMobilePlanCheckoutScreenContract$UpdatedBillParcel updatedBillParcel) {
            Intrinsics.checkNotNullParameter(updatedBillParcel, "updatedBillParcel");
            this.f101165a = updatedBillParcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpdatedBill) && Intrinsics.f(this.f101165a, ((UpdatedBill) obj2).f101165a);
        }

        public final int hashCode() {
            return this.f101165a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f101165a.writeToParcel(dest, i);
        }
    }
}
