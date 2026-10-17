package com.revolut.feature.freelancer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.freelancer.common.models.partner.PartnerConfirmParams;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import ds6.j;
import ehe.n;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.d;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import pi3.h;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:)\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*\u0082\u0001\u0002+,¨\u0006-"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "InvoiceDetails", "InvoiceDetailsNavigationDestination", "AddTaxRateNavigationDestination", "AnnualInboundVolumeDestination", "SalesFiltersDestination", "AddCustomerDestination", "FreelancerAddCustomer", "CustomerDetails", "FreelancerProfileDestination", "AddInvoiceNotesDestination", "OrderInitPageListDestination", "OrderInitPageDetailsDestination", "OrderInitPageSaleHistoryDestination", "ProPostActivationPromptDestination", "ReferralInfoDestination", "InvoiceListDestination", "InvoiceSettingsDestination", "SaleAmountCatalogueSinglePick", "InvoiceNumberSettingsDestination", "Cashback", "CashbackUpsell", "NewSale", "AccountRestrictionPrompts", "ConfirmEcommerceIntegration", "ManageEcommercePlugin", "Onboarding", "PendingAccount", "AutomaticSaleTransfer", "VatReminderSettings", "CreateSubaccountPrompt", "SaleDetails", "SaleRefund", "OrderPaymentRefund", "QrShare", "TaxHub", "TaxProfile", "ProPerks", "AccountClosure", "AcquiringPayments", "AcquiringOrders", "FreelancerIneligibility", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerAddCustomer;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$InvoiceDetails;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerBizFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AccountClosure;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountClosure implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountClosure f73175a = new AccountClosure();

        @NotNull
        public static final Parcelable.Creator<AccountClosure> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountClosure.f73175a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountClosure[i];
            }
        }

        private AccountClosure() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AccountRestrictionPrompts;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountRestrictionPrompts implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<AccountRestrictionPrompts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f73176a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountRestrictionPrompts(d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountRestrictionPrompts[i];
            }
        }

        public AccountRestrictionPrompts(d bannerType) {
            Intrinsics.checkNotNullParameter(bannerType, "bannerType");
            this.f73176a = bannerType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF73176a() {
            return this.f73176a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountRestrictionPrompts) && this.f73176a == ((AccountRestrictionPrompts) obj2).f73176a;
        }

        public final int hashCode() {
            return this.f73176a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73176a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringPayments;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InitialStep", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcquiringPayments implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<AcquiringPayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InitialStep f73182a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringPayments$InitialStep;", "Landroid/os/Parcelable;", "Payments", "PaymentDetails", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringPayments$InitialStep$PaymentDetails;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringPayments$InitialStep$Payments;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InitialStep extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringPayments$InitialStep$PaymentDetails;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringPayments$InitialStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PaymentDetails implements InitialStep {

                @NotNull
                public static final Parcelable.Creator<PaymentDetails> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f73183a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PaymentDetails(((AcquiringPayment$Id) parcel.readParcelable(PaymentDetails.class.getClassLoader())).f73363a);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new PaymentDetails[i];
                    }
                }

                public PaymentDetails(String paymentId) {
                    Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                    this.f73183a = paymentId;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getF73183a() {
                    return this.f73183a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof PaymentDetails) && Intrinsics.f(this.f73183a, ((PaymentDetails) obj2).f73183a);
                }

                public final int hashCode() {
                    return this.f73183a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(new AcquiringPayment$Id(this.f73183a), i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringPayments$InitialStep$Payments;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringPayments$InitialStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Payments implements InitialStep {

                @NotNull
                public static final Parcelable.Creator<Payments> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AcquiringPaymentsQuery f73184a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Payments((AcquiringPaymentsQuery) parcel.readParcelable(Payments.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Payments[i];
                    }
                }

                public Payments(AcquiringPaymentsQuery query) {
                    Intrinsics.checkNotNullParameter(query, "query");
                    this.f73184a = query;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final AcquiringPaymentsQuery getF73184a() {
                    return this.f73184a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Payments) && Intrinsics.f(this.f73184a, ((Payments) obj2).f73184a);
                }

                public final int hashCode() {
                    return this.f73184a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f73184a, i);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcquiringPayments((InitialStep) parcel.readParcelable(AcquiringPayments.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcquiringPayments[i];
            }
        }

        public AcquiringPayments() {
            this(0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InitialStep getF73182a() {
            return this.f73182a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AcquiringPayments) && Intrinsics.f(this.f73182a, ((AcquiringPayments) obj2).f73182a);
        }

        public final int hashCode() {
            return this.f73182a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73182a, i);
        }

        public AcquiringPayments(InitialStep initialStep) {
            Intrinsics.checkNotNullParameter(initialStep, "initialStep");
            this.f73182a = initialStep;
        }

        public /* synthetic */ AcquiringPayments(int i) {
            this(new InitialStep.Payments(new AcquiringPaymentsQuery((String) null, (LocalDateTime) null, (LocalDateTime) null, (Set) null, (Set) null, (Set) null, CertificateBody.profileType)));
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AddInvoiceNotesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddInvoiceNotesDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<AddInvoiceNotesDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73188a;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddInvoiceNotesDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddInvoiceNotesDestination[i];
            }
        }

        public AddInvoiceNotesDestination(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73188a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddInvoiceNotesDestination) && Intrinsics.f(this.f73188a, ((AddInvoiceNotesDestination) obj2).f73188a);
        }

        public final int hashCode() {
            return this.f73188a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73188a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AddTaxRateNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddTaxRateNavigationDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddTaxRateNavigationDestination f73189a = new AddTaxRateNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<AddTaxRateNavigationDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddTaxRateNavigationDestination.f73189a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddTaxRateNavigationDestination[i];
            }
        }

        private AddTaxRateNavigationDestination() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AnnualInboundVolumeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnnualInboundVolumeDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnnualInboundVolumeDestination f73190a = new AnnualInboundVolumeDestination();

        @NotNull
        public static final Parcelable.Creator<AnnualInboundVolumeDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnnualInboundVolumeDestination.f73190a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnnualInboundVolumeDestination[i];
            }
        }

        private AnnualInboundVolumeDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AutomaticSaleTransfer;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AutomaticSaleTransfer implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutomaticSaleTransfer f73191a = new AutomaticSaleTransfer();

        @NotNull
        public static final Parcelable.Creator<AutomaticSaleTransfer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AutomaticSaleTransfer.f73191a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutomaticSaleTransfer[i];
            }
        }

        private AutomaticSaleTransfer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$Cashback;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/freelancer/api/navigation/a", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cashback implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<Cashback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.freelancer.api.navigation.a f73192a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cashback(com.revolut.feature.freelancer.api.navigation.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cashback[i];
            }
        }

        public Cashback() {
            this(0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.revolut.feature.freelancer.api.navigation.a getF73192a() {
            return this.f73192a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cashback) && this.f73192a == ((Cashback) obj2).f73192a;
        }

        public final int hashCode() {
            return this.f73192a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73192a.name());
        }

        public Cashback(com.revolut.feature.freelancer.api.navigation.a initialStep) {
            Intrinsics.checkNotNullParameter(initialStep, "initialStep");
            this.f73192a = initialStep;
        }

        public /* synthetic */ Cashback(int i) {
            this(com.revolut.feature.freelancer.api.navigation.a.DETAILS);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ConfirmEcommerceIntegration;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmEcommerceIntegration implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ConfirmEcommerceIntegration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PartnerConfirmParams f73194a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmEcommerceIntegration((PartnerConfirmParams) parcel.readParcelable(ConfirmEcommerceIntegration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmEcommerceIntegration[i];
            }
        }

        public ConfirmEcommerceIntegration(PartnerConfirmParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f73194a = params;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PartnerConfirmParams getF73194a() {
            return this.f73194a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmEcommerceIntegration) && Intrinsics.f(this.f73194a, ((ConfirmEcommerceIntegration) obj2).f73194a);
        }

        public final int hashCode() {
            return this.f73194a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73194a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$CreateSubaccountPrompt;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/freelancer/api/navigation/b", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateSubaccountPrompt implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CreateSubaccountPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f73195a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateSubaccountPrompt(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateSubaccountPrompt[i];
            }
        }

        public CreateSubaccountPrompt(b promptType) {
            Intrinsics.checkNotNullParameter(promptType, "promptType");
            this.f73195a = promptType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF73195a() {
            return this.f73195a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateSubaccountPrompt) && this.f73195a == ((CreateSubaccountPrompt) obj2).f73195a;
        }

        public final int hashCode() {
            return this.f73195a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73195a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$CustomerDetails;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomerDetails implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CustomerDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73196a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomerDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomerDetails[i];
            }
        }

        public CustomerDetails(String customerId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            this.f73196a = customerId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF73196a() {
            return this.f73196a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomerDetails) && Intrinsics.f(this.f73196a, ((CustomerDetails) obj2).f73196a);
        }

        public final int hashCode() {
            return this.f73196a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73196a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerAddCustomer;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreelancerAddCustomer extends FreelancerBizFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f73197g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f73198h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f73199j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Address f73200l;

        public FreelancerAddCustomer() {
            this(null, null, null, null, null, null, CertificateBody.profileType);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF81832g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FreelancerAddCustomer)) {
                return false;
            }
            FreelancerAddCustomer freelancerAddCustomer = (FreelancerAddCustomer) obj2;
            return Intrinsics.f(this.f73197g, freelancerAddCustomer.f73197g) && Intrinsics.f(this.f73198h, freelancerAddCustomer.f73198h) && Intrinsics.f(this.i, freelancerAddCustomer.i) && Intrinsics.f(this.f73199j, freelancerAddCustomer.f73199j) && Intrinsics.f(this.k, freelancerAddCustomer.k) && Intrinsics.f(this.f73200l, freelancerAddCustomer.f73200l);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f73197g;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f73198h;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f73199j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.k;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Address address = this.f73200l;
            return (iHashCode5 + (address != null ? address.hashCode() : 0)) * 31;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FreelancerAddCustomer(String str, String str2, String str3, String str4, String str5, Address address, int i) {
            str = (i & 1) != 0 ? null : str;
            str2 = (i & 2) != 0 ? null : str2;
            str3 = (i & 4) != 0 ? null : str3;
            str4 = (i & 8) != 0 ? null : str4;
            str5 = (i & 16) != 0 ? null : str5;
            Address address2 = (i & 32) != 0 ? null : address;
            String str6 = str5;
            String str7 = str4;
            String str8 = str3;
            String str9 = str2;
            String str10 = str;
            super(new AddCustomerDestination(str10, str9, str8, str7, str6, address2));
            this.f73197g = str10;
            this.f73198h = str9;
            this.i = str8;
            this.f73199j = str7;
            this.k = str6;
            this.f73200l = address2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerIneligibility;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FreelancerIneligibility implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FreelancerIneligibility f73201a = new FreelancerIneligibility();

        @NotNull
        public static final Parcelable.Creator<FreelancerIneligibility> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FreelancerIneligibility.f73201a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreelancerIneligibility[i];
            }
        }

        private FreelancerIneligibility() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "LaunchMode", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreelancerProfileDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<FreelancerProfileDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LaunchMode f73202a;

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "Vat", "ProcessingFees", "WebsiteUrl", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode$Default;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode$ProcessingFees;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode$Vat;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode$WebsiteUrl;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class LaunchMode implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode$Default;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Default extends LaunchMode {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Default f73203a = new Default();

                @NotNull
                public static final Parcelable.Creator<Default> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Default.f73203a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Default[i];
                    }
                }

                private Default() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode$ProcessingFees;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ProcessingFees extends LaunchMode {

                @NotNull
                public static final Parcelable.Creator<ProcessingFees> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Set f73204a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        int i = parcel.readInt();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                        for (int i2 = 0; i2 != i; i2++) {
                            linkedHashSet.add(as6.a.valueOf(parcel.readString()));
                        }
                        return new ProcessingFees(linkedHashSet);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ProcessingFees[i];
                    }
                }

                public ProcessingFees() {
                    this(0);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof ProcessingFees) && Intrinsics.f(this.f73204a, ((ProcessingFees) obj2).f73204a);
                }

                public final int hashCode() {
                    return this.f73204a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Iterator itV = n.v(this.f73204a, dest);
                    while (itV.hasNext()) {
                        dest.writeString(((as6.a) itV.next()).name());
                    }
                }

                public ProcessingFees(Set includedGroupTypes) {
                    Intrinsics.checkNotNullParameter(includedGroupTypes, "includedGroupTypes");
                    this.f73204a = includedGroupTypes;
                }

                public /* synthetic */ ProcessingFees(int i) {
                    this(d0.i1(as6.a.a()));
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode$Vat;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Vat extends LaunchMode {

                @NotNull
                public static final Parcelable.Creator<Vat> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f73205a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Vat(parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Vat[i];
                    }
                }

                public Vat(boolean z) {
                    this.f73205a = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Vat) && this.f73205a == ((Vat) obj2).f73205a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f73205a);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f73205a ? 1 : 0);
                }
            }

            private LaunchMode() {
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode$WebsiteUrl;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$FreelancerProfileDestination$LaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WebsiteUrl extends LaunchMode {

                @NotNull
                public static final Parcelable.Creator<WebsiteUrl> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final gs6.a f73206a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new WebsiteUrl(gs6.a.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WebsiteUrl[i];
                    }
                }

                public WebsiteUrl(gs6.a urlVerificationMode) {
                    Intrinsics.checkNotNullParameter(urlVerificationMode, "urlVerificationMode");
                    this.f73206a = urlVerificationMode;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof WebsiteUrl) && this.f73206a == ((WebsiteUrl) obj2).f73206a;
                }

                public final int hashCode() {
                    return this.f73206a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f73206a.name());
                }

                public WebsiteUrl() {
                    this(gs6.a.REGULAR);
                }
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreelancerProfileDestination((LaunchMode) parcel.readParcelable(FreelancerProfileDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreelancerProfileDestination[i];
            }
        }

        public FreelancerProfileDestination() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FreelancerProfileDestination) && Intrinsics.f(this.f73202a, ((FreelancerProfileDestination) obj2).f73202a);
        }

        public final int hashCode() {
            return this.f73202a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73202a, i);
        }

        public FreelancerProfileDestination(LaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            this.f73202a = launchMode;
        }

        public /* synthetic */ FreelancerProfileDestination(int i) {
            this(LaunchMode.Default.f73203a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$InvoiceDetails;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvoiceDetails extends FreelancerBizFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f73210g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvoiceDetails(String invoiceId) {
            super(new InvoiceDetailsNavigationDestination(invoiceId));
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73210g = invoiceId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF81832g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvoiceDetails) && Intrinsics.f(this.f73210g, ((InvoiceDetails) obj2).f73210g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f73210g.hashCode();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$InvoiceDetailsNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvoiceDetailsNavigationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<InvoiceDetailsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73211a;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvoiceDetailsNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvoiceDetailsNavigationDestination[i];
            }
        }

        public InvoiceDetailsNavigationDestination(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73211a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvoiceDetailsNavigationDestination) && Intrinsics.f(this.f73211a, ((InvoiceDetailsNavigationDestination) obj2).f73211a);
        }

        public final int hashCode() {
            return this.f73211a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73211a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$InvoiceListDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/freelancer/api/navigation/c", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvoiceListDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<InvoiceListDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f73212a;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvoiceListDestination(c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvoiceListDestination[i];
            }
        }

        public InvoiceListDestination() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvoiceListDestination) && this.f73212a == ((InvoiceListDestination) obj2).f73212a;
        }

        public final int hashCode() {
            return this.f73212a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73212a.name());
        }

        public InvoiceListDestination(c mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f73212a = mode;
        }

        public /* synthetic */ InvoiceListDestination(int i) {
            this(c.ONE_TIME);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$InvoiceNumberSettingsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvoiceNumberSettingsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<InvoiceNumberSettingsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73213a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvoiceNumberSettingsDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvoiceNumberSettingsDestination[i];
            }
        }

        public InvoiceNumberSettingsDestination(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73213a = invoiceId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF73213a() {
            return this.f73213a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvoiceNumberSettingsDestination) && Intrinsics.f(this.f73213a, ((InvoiceNumberSettingsDestination) obj2).f73213a);
        }

        public final int hashCode() {
            return this.f73213a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73213a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$InvoiceSettingsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvoiceSettingsDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvoiceSettingsDestination f73214a = new InvoiceSettingsDestination();

        @NotNull
        public static final Parcelable.Creator<InvoiceSettingsDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InvoiceSettingsDestination.f73214a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvoiceSettingsDestination[i];
            }
        }

        private InvoiceSettingsDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ManageEcommercePlugin;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManageEcommercePlugin implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManageEcommercePlugin f73215a = new ManageEcommercePlugin();

        @NotNull
        public static final Parcelable.Creator<ManageEcommercePlugin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManageEcommercePlugin.f73215a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageEcommercePlugin[i];
            }
        }

        private ManageEcommercePlugin() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$NewSale;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewSale implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<NewSale> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cs6.c f73216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f73217b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewSale(cs6.c.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewSale[i];
            }
        }

        public NewSale(cs6.c saleType, xi0.b bVar) {
            Intrinsics.checkNotNullParameter(saleType, "saleType");
            this.f73216a = saleType;
            this.f73217b = bVar;
        }

        /* JADX INFO: renamed from: T8, reason: from getter */
        public final xi0.b getF73217b() {
            return this.f73217b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final cs6.c getF73216a() {
            return this.f73216a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewSale)) {
                return false;
            }
            NewSale newSale = (NewSale) obj2;
            return this.f73216a == newSale.f73216a && Intrinsics.f(this.f73217b, newSale.f73217b);
        }

        public final int hashCode() {
            int iHashCode = this.f73216a.hashCode() * 31;
            xi0.b bVar = this.f73217b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73216a.name());
            dest.writeSerializable(this.f73217b);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$OrderInitPageDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderInitPageDetailsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<OrderInitPageDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73223a;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderInitPageDetailsDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderInitPageDetailsDestination[i];
            }
        }

        public OrderInitPageDetailsDestination(String pageId) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            this.f73223a = pageId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderInitPageDetailsDestination) && Intrinsics.f(this.f73223a, ((OrderInitPageDetailsDestination) obj2).f73223a);
        }

        public final int hashCode() {
            return this.f73223a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73223a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$OrderInitPageListDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderInitPageListDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderInitPageListDestination f73224a = new OrderInitPageListDestination();

        @NotNull
        public static final Parcelable.Creator<OrderInitPageListDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderInitPageListDestination.f73224a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderInitPageListDestination[i];
            }
        }

        private OrderInitPageListDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$OrderInitPageSaleHistoryDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderInitPageSaleHistoryDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<OrderInitPageSaleHistoryDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73225a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderInitPageSaleHistoryDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderInitPageSaleHistoryDestination[i];
            }
        }

        public OrderInitPageSaleHistoryDestination(String pageId) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            this.f73225a = pageId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF73225a() {
            return this.f73225a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderInitPageSaleHistoryDestination) && Intrinsics.f(this.f73225a, ((OrderInitPageSaleHistoryDestination) obj2).f73225a);
        }

        public final int hashCode() {
            return this.f73225a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73225a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$OrderPaymentRefund;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderPaymentRefund implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<OrderPaymentRefund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AcquiringOrderPayment f73226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f73227b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderPaymentRefund((AcquiringOrderPayment) parcel.readParcelable(OrderPaymentRefund.class.getClassLoader()), (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderPaymentRefund[i];
            }
        }

        public OrderPaymentRefund(AcquiringOrderPayment orderPayment, dj0.d amountToRefund) {
            Intrinsics.checkNotNullParameter(orderPayment, "orderPayment");
            Intrinsics.checkNotNullParameter(amountToRefund, "amountToRefund");
            this.f73226a = orderPayment;
            this.f73227b = amountToRefund;
        }

        /* JADX INFO: renamed from: R7, reason: from getter */
        public final dj0.d getF73227b() {
            return this.f73227b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AcquiringOrderPayment getF73226a() {
            return this.f73226a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderPaymentRefund)) {
                return false;
            }
            OrderPaymentRefund orderPaymentRefund = (OrderPaymentRefund) obj2;
            return Intrinsics.f(this.f73226a, orderPaymentRefund.f73226a) && Intrinsics.f(this.f73227b, orderPaymentRefund.f73227b);
        }

        public final int hashCode() {
            return this.f73227b.hashCode() + (this.f73226a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73226a, i);
            dest.writeSerializable(this.f73227b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$PendingAccount;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingAccount implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PendingAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f73228a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingAccount(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingAccount[i];
            }
        }

        public PendingAccount(boolean z) {
            this.f73228a = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF73228a() {
            return this.f73228a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PendingAccount) && this.f73228a == ((PendingAccount) obj2).f73228a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f73228a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f73228a ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "NotNowAction", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProPostActivationPromptDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ProPostActivationPromptDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dr6.a f73232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NotNowAction f73233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f73234c;

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction;", "Landroid/os/Parcelable;", "<init>", "()V", "DoNothing", "IssueVirtualCard", "SelectPlan", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction$DoNothing;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction$IssueVirtualCard;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction$SelectPlan;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class NotNowAction implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction$DoNothing;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class DoNothing extends NotNowAction {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final DoNothing f73235a = new DoNothing();

                @NotNull
                public static final Parcelable.Creator<DoNothing> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return DoNothing.f73235a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new DoNothing[i];
                    }
                }

                private DoNothing() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction$IssueVirtualCard;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class IssueVirtualCard extends NotNowAction {

                @NotNull
                public static final Parcelable.Creator<IssueVirtualCard> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NaviCommand f73236a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final wi0.b f73237b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new IssueVirtualCard((NaviCommand) parcel.readParcelable(IssueVirtualCard.class.getClassLoader()), (wi0.b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new IssueVirtualCard[i];
                    }
                }

                public IssueVirtualCard(NaviCommand localPromptCommand, wi0.b countryCode) {
                    Intrinsics.checkNotNullParameter(localPromptCommand, "localPromptCommand");
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    this.f73236a = localPromptCommand;
                    this.f73237b = countryCode;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final NaviCommand getF73236a() {
                    return this.f73236a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof IssueVirtualCard)) {
                        return false;
                    }
                    IssueVirtualCard issueVirtualCard = (IssueVirtualCard) obj2;
                    return Intrinsics.f(this.f73236a, issueVirtualCard.f73236a) && Intrinsics.f(this.f73237b, issueVirtualCard.f73237b);
                }

                /* JADX INFO: renamed from: getCountryCode, reason: from getter */
                public final wi0.b getF73237b() {
                    return this.f73237b;
                }

                public final int hashCode() {
                    return this.f73237b.f297794a.hashCode() + (this.f73236a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f73236a, i);
                    dest.writeSerializable(this.f73237b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction$SelectPlan;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPostActivationPromptDestination$NotNowAction;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SelectPlan extends NotNowAction {

                @NotNull
                public static final Parcelable.Creator<SelectPlan> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NaviCommand f73238a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SelectPlan((NaviCommand) parcel.readParcelable(SelectPlan.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SelectPlan[i];
                    }
                }

                public SelectPlan(NaviCommand selectPlanCommand) {
                    Intrinsics.checkNotNullParameter(selectPlanCommand, "selectPlanCommand");
                    this.f73238a = selectPlanCommand;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final NaviCommand getF73238a() {
                    return this.f73238a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof SelectPlan) && Intrinsics.f(this.f73238a, ((SelectPlan) obj2).f73238a);
                }

                public final int hashCode() {
                    return this.f73238a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f73238a, i);
                }
            }

            private NotNowAction() {
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProPostActivationPromptDestination(dr6.a.valueOf(parcel.readString()), (NotNowAction) parcel.readParcelable(ProPostActivationPromptDestination.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ProPostActivationPromptDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProPostActivationPromptDestination[i];
            }
        }

        public ProPostActivationPromptDestination(dr6.a onboardingArticleContext, NotNowAction notNowAction, NaviCommand mainScreenCommand) {
            Intrinsics.checkNotNullParameter(onboardingArticleContext, "onboardingArticleContext");
            Intrinsics.checkNotNullParameter(notNowAction, "notNowAction");
            Intrinsics.checkNotNullParameter(mainScreenCommand, "mainScreenCommand");
            this.f73232a = onboardingArticleContext;
            this.f73233b = notNowAction;
            this.f73234c = mainScreenCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProPostActivationPromptDestination)) {
                return false;
            }
            ProPostActivationPromptDestination proPostActivationPromptDestination = (ProPostActivationPromptDestination) obj2;
            return this.f73232a == proPostActivationPromptDestination.f73232a && Intrinsics.f(this.f73233b, proPostActivationPromptDestination.f73233b) && Intrinsics.f(this.f73234c, proPostActivationPromptDestination.f73234c);
        }

        public final int hashCode() {
            return this.f73234c.hashCode() + ((this.f73233b.hashCode() + (this.f73232a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73232a.name());
            dest.writeParcelable(this.f73233b, i);
            dest.writeParcelable(this.f73234c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$QrShare;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrShare implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<QrShare> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f73239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73240b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrShare((dj0.d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrShare[i];
            }
        }

        public QrShare(dj0.d dVar, String qrCodeUrl) {
            Intrinsics.checkNotNullParameter(qrCodeUrl, "qrCodeUrl");
            this.f73239a = dVar;
            this.f73240b = qrCodeUrl;
        }

        /* JADX INFO: renamed from: Z0, reason: from getter */
        public final dj0.d getF73239a() {
            return this.f73239a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF73240b() {
            return this.f73240b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QrShare)) {
                return false;
            }
            QrShare qrShare = (QrShare) obj2;
            return Intrinsics.f(this.f73239a, qrShare.f73239a) && Intrinsics.f(this.f73240b, qrShare.f73240b);
        }

        public final int hashCode() {
            dj0.d dVar = this.f73239a;
            return this.f73240b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73239a);
            dest.writeString(this.f73240b);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ReferralInfoDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReferralInfoDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReferralInfoDestination f73241a = new ReferralInfoDestination();

        @NotNull
        public static final Parcelable.Creator<ReferralInfoDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReferralInfoDestination.f73241a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReferralInfoDestination[i];
            }
        }

        private ReferralInfoDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleAmountCatalogueSinglePick;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SaleAmountCatalogueSinglePick implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SaleAmountCatalogueSinglePick f73242a = new SaleAmountCatalogueSinglePick();

        @NotNull
        public static final Parcelable.Creator<SaleAmountCatalogueSinglePick> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SaleAmountCatalogueSinglePick.f73242a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SaleAmountCatalogueSinglePick[i];
            }
        }

        private SaleAmountCatalogueSinglePick() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleDetails;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Sale", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SaleDetails implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SaleDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Sale f73243a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleDetails$Sale;", "Landroid/os/Parcelable;", "SaleDetails", "SaleId", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleDetails$Sale$SaleDetails;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleDetails$Sale$SaleId;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Sale extends Parcelable {

            /* JADX INFO: renamed from: com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$SaleDetails$Sale$SaleDetails, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleDetails$Sale$SaleDetails;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleDetails$Sale;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0487SaleDetails implements Sale {

                @NotNull
                public static final Parcelable.Creator<C0487SaleDetails> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FreelancerOrder f73244a;

                /* JADX INFO: renamed from: com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$SaleDetails$Sale$SaleDetails$a */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new C0487SaleDetails((FreelancerOrder) parcel.readParcelable(C0487SaleDetails.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new C0487SaleDetails[i];
                    }
                }

                public C0487SaleDetails(FreelancerOrder order) {
                    Intrinsics.checkNotNullParameter(order, "order");
                    this.f73244a = order;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final FreelancerOrder getF73244a() {
                    return this.f73244a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C0487SaleDetails) && Intrinsics.f(this.f73244a, ((C0487SaleDetails) obj2).f73244a);
                }

                public final int hashCode() {
                    return this.f73244a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f73244a, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleDetails$Sale$SaleId;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleDetails$Sale;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SaleId implements Sale {

                @NotNull
                public static final Parcelable.Creator<SaleId> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f73245a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SaleId(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SaleId[i];
                    }
                }

                public SaleId(String id10) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    this.f73245a = id10;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof SaleId) && Intrinsics.f(this.f73245a, ((SaleId) obj2).f73245a);
                }

                /* JADX INFO: renamed from: getId, reason: from getter */
                public final String getF73245a() {
                    return this.f73245a;
                }

                public final int hashCode() {
                    return this.f73245a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f73245a);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SaleDetails((Sale) parcel.readParcelable(SaleDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SaleDetails[i];
            }
        }

        public SaleDetails(Sale sale) {
            Intrinsics.checkNotNullParameter(sale, "sale");
            this.f73243a = sale;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Sale getF73243a() {
            return this.f73243a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SaleDetails) && Intrinsics.f(this.f73243a, ((SaleDetails) obj2).f73243a);
        }

        public final int hashCode() {
            return this.f73243a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73243a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SaleRefund;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SaleRefund implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SaleRefund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f73246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FreelancerOrder f73247b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SaleRefund((FreelancerOrder) parcel.readParcelable(SaleRefund.class.getClassLoader()), (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SaleRefund[i];
            }
        }

        public SaleRefund(FreelancerOrder order, dj0.d amountToRefund) {
            Intrinsics.checkNotNullParameter(amountToRefund, "amountToRefund");
            Intrinsics.checkNotNullParameter(order, "order");
            this.f73246a = amountToRefund;
            this.f73247b = order;
        }

        /* JADX INFO: renamed from: R7, reason: from getter */
        public final dj0.d getF73246a() {
            return this.f73246a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FreelancerOrder getF73247b() {
            return this.f73247b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SaleRefund)) {
                return false;
            }
            SaleRefund saleRefund = (SaleRefund) obj2;
            return Intrinsics.f(this.f73246a, saleRefund.f73246a) && Intrinsics.f(this.f73247b, saleRefund.f73247b);
        }

        public final int hashCode() {
            return this.f73247b.hashCode() + (this.f73246a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73246a);
            dest.writeParcelable(this.f73247b, i);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$SalesFiltersDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SalesFiltersDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SalesFiltersDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerSalesFilters$CompoundFreelancerSalesFilter f73248a;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SalesFiltersDestination((FreelancerSalesFilters$CompoundFreelancerSalesFilter) parcel.readParcelable(SalesFiltersDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalesFiltersDestination[i];
            }
        }

        public SalesFiltersDestination(FreelancerSalesFilters$CompoundFreelancerSalesFilter filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.f73248a = filter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SalesFiltersDestination) && Intrinsics.f(this.f73248a, ((SalesFiltersDestination) obj2).f73248a);
        }

        public final int hashCode() {
            return this.f73248a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73248a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InitialStep", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxHub implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<TaxHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InitialStep f73249a;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep;", "Landroid/os/Parcelable;", "Assessment", "Hub", "TaxProfile", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep$Assessment;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep$Hub;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep$TaxProfile;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InitialStep extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep$Assessment;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Assessment implements InitialStep {

                @NotNull
                public static final Parcelable.Creator<Assessment> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f73250a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final j f73251b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Assessment(j.valueOf(parcel.readString()), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Assessment[i];
                    }
                }

                public Assessment(j taxType, String taxCalendarEventId) {
                    Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
                    Intrinsics.checkNotNullParameter(taxType, "taxType");
                    this.f73250a = taxCalendarEventId;
                    this.f73251b = taxType;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getF73250a() {
                    return this.f73250a;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final j getF73251b() {
                    return this.f73251b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Assessment)) {
                        return false;
                    }
                    Assessment assessment = (Assessment) obj2;
                    return Intrinsics.f(this.f73250a, assessment.f73250a) && this.f73251b == assessment.f73251b;
                }

                public final int hashCode() {
                    return this.f73251b.hashCode() + (this.f73250a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f73250a);
                    dest.writeString(this.f73251b.name());
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep$Hub;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Hub implements InitialStep {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Hub f73252a = new Hub();

                @NotNull
                public static final Parcelable.Creator<Hub> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Hub.f73252a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Hub[i];
                    }
                }

                private Hub() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep$TaxProfile;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxHub$InitialStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class TaxProfile implements InitialStep {

                @NotNull
                public static final Parcelable.Creator<TaxProfile> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Set f73253a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        int i = parcel.readInt();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                        for (int i2 = 0; i2 != i; i2++) {
                            linkedHashSet.add(j.valueOf(parcel.readString()));
                        }
                        return new TaxProfile(linkedHashSet);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new TaxProfile[i];
                    }
                }

                public TaxProfile(Set allowedTaxTypes) {
                    Intrinsics.checkNotNullParameter(allowedTaxTypes, "allowedTaxTypes");
                    this.f73253a = allowedTaxTypes;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Set getF73253a() {
                    return this.f73253a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof TaxProfile) && Intrinsics.f(this.f73253a, ((TaxProfile) obj2).f73253a);
                }

                public final int hashCode() {
                    return this.f73253a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Iterator itV = n.v(this.f73253a, dest);
                    while (itV.hasNext()) {
                        dest.writeString(((j) itV.next()).name());
                    }
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxHub((InitialStep) parcel.readParcelable(TaxHub.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxHub[i];
            }
        }

        public TaxHub() {
            this(0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InitialStep getF73249a() {
            return this.f73249a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxHub) && Intrinsics.f(this.f73249a, ((TaxHub) obj2).f73249a);
        }

        public final int hashCode() {
            return this.f73249a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73249a, i);
        }

        public TaxHub(InitialStep initialStep) {
            Intrinsics.checkNotNullParameter(initialStep, "initialStep");
            this.f73249a = initialStep;
        }

        public /* synthetic */ TaxHub(int i) {
            this(InitialStep.Hub.f73252a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$TaxProfile;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxProfile implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<TaxProfile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f73254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73255b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxProfile(j.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxProfile[i];
            }
        }

        public TaxProfile(j taxType, String str) {
            Intrinsics.checkNotNullParameter(taxType, "taxType");
            this.f73254a = taxType;
            this.f73255b = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF73255b() {
            return this.f73255b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final j getF73254a() {
            return this.f73254a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxProfile)) {
                return false;
            }
            TaxProfile taxProfile = (TaxProfile) obj2;
            return this.f73254a == taxProfile.f73254a && Intrinsics.f(this.f73255b, taxProfile.f73255b);
        }

        public final int hashCode() {
            int iHashCode = this.f73254a.hashCode() * 31;
            String str = this.f73255b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73254a.name());
            dest.writeString(this.f73255b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$VatReminderSettings;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VatReminderSettings implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VatReminderSettings f73256a = new VatReminderSettings();

        @NotNull
        public static final Parcelable.Creator<VatReminderSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VatReminderSettings.f73256a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VatReminderSettings[i];
            }
        }

        private VatReminderSettings() {
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

    public FreelancerBizFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InitialStep", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcquiringOrders implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<AcquiringOrders> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InitialStep f73177a;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep;", "Landroid/os/Parcelable;", "InPersonOrders", "EcommerceOrders", "RegularOrders", "OrderDetails", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep$EcommerceOrders;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep$InPersonOrders;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep$OrderDetails;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep$RegularOrders;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InitialStep extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep$EcommerceOrders;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class EcommerceOrders implements InitialStep {

                @NotNull
                public static final Parcelable.Creator<EcommerceOrders> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AcquiringOrderFilter f73178a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new EcommerceOrders((AcquiringOrderFilter) parcel.readParcelable(EcommerceOrders.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new EcommerceOrders[i];
                    }
                }

                public EcommerceOrders() {
                    this(null);
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final AcquiringOrderFilter getF73178a() {
                    return this.f73178a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof EcommerceOrders) && Intrinsics.f(this.f73178a, ((EcommerceOrders) obj2).f73178a);
                }

                public final int hashCode() {
                    AcquiringOrderFilter acquiringOrderFilter = this.f73178a;
                    if (acquiringOrderFilter == null) {
                        return 0;
                    }
                    return acquiringOrderFilter.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f73178a, i);
                }

                public EcommerceOrders(AcquiringOrderFilter acquiringOrderFilter) {
                    this.f73178a = acquiringOrderFilter;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep$InPersonOrders;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class InPersonOrders implements InitialStep {

                @NotNull
                public static final Parcelable.Creator<InPersonOrders> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AcquiringOrderFilter f73179a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new InPersonOrders((AcquiringOrderFilter) parcel.readParcelable(InPersonOrders.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new InPersonOrders[i];
                    }
                }

                public InPersonOrders() {
                    this(null);
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final AcquiringOrderFilter getF73179a() {
                    return this.f73179a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof InPersonOrders) && Intrinsics.f(this.f73179a, ((InPersonOrders) obj2).f73179a);
                }

                public final int hashCode() {
                    AcquiringOrderFilter acquiringOrderFilter = this.f73179a;
                    if (acquiringOrderFilter == null) {
                        return 0;
                    }
                    return acquiringOrderFilter.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f73179a, i);
                }

                public InPersonOrders(AcquiringOrderFilter acquiringOrderFilter) {
                    this.f73179a = acquiringOrderFilter;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep$OrderDetails;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class OrderDetails implements InitialStep {

                @NotNull
                public static final Parcelable.Creator<OrderDetails> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f73180a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new OrderDetails(((AcquiringOrder$Id) parcel.readParcelable(OrderDetails.class.getClassLoader())).f73342a);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new OrderDetails[i];
                    }
                }

                public OrderDetails(String orderId) {
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    this.f73180a = orderId;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getF73180a() {
                    return this.f73180a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof OrderDetails) && Intrinsics.f(this.f73180a, ((OrderDetails) obj2).f73180a);
                }

                public final int hashCode() {
                    return this.f73180a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(new AcquiringOrder$Id(this.f73180a), i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep$RegularOrders;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AcquiringOrders$InitialStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class RegularOrders implements InitialStep {

                @NotNull
                public static final Parcelable.Creator<RegularOrders> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AcquiringOrderFilter f73181a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new RegularOrders((AcquiringOrderFilter) parcel.readParcelable(RegularOrders.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new RegularOrders[i];
                    }
                }

                public RegularOrders() {
                    this(null);
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final AcquiringOrderFilter getF73181a() {
                    return this.f73181a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof RegularOrders) && Intrinsics.f(this.f73181a, ((RegularOrders) obj2).f73181a);
                }

                public final int hashCode() {
                    AcquiringOrderFilter acquiringOrderFilter = this.f73181a;
                    if (acquiringOrderFilter == null) {
                        return 0;
                    }
                    return acquiringOrderFilter.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f73181a, i);
                }

                public RegularOrders(AcquiringOrderFilter acquiringOrderFilter) {
                    this.f73181a = acquiringOrderFilter;
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcquiringOrders((InitialStep) parcel.readParcelable(AcquiringOrders.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcquiringOrders[i];
            }
        }

        public AcquiringOrders(InitialStep initialStep) {
            Intrinsics.checkNotNullParameter(initialStep, "initialStep");
            this.f73177a = initialStep;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InitialStep getF73177a() {
            return this.f73177a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AcquiringOrders) && Intrinsics.f(this.f73177a, ((AcquiringOrders) obj2).f73177a);
        }

        public final int hashCode() {
            return this.f73177a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73177a, i);
        }

        public AcquiringOrders() {
            this(new InitialStep.RegularOrders(null));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$CashbackUpsell;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashbackUpsell implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CashbackUpsell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f73193a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashbackUpsell((h) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashbackUpsell[i];
            }
        }

        public CashbackUpsell(h hVar) {
            this.f73193a = hVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final h getF73193a() {
            return this.f73193a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CashbackUpsell) && Intrinsics.f(this.f73193a, ((CashbackUpsell) obj2).f73193a);
        }

        public final int hashCode() {
            h hVar = this.f73193a;
            if (hVar == null) {
                return 0;
            }
            return hVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73193a);
        }

        public CashbackUpsell() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$Onboarding;", "Lcom/revolut/kompot/common/StackDestination;", "Default", "RetailBridge", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$Onboarding$Default;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$Onboarding$RetailBridge;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Onboarding implements StackDestination {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$Onboarding$Default;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$Onboarding;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Default extends Onboarding {

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f73218a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final FreelancerOnboardingArticleConfig f73219b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final FreelancerOnboardingNavStrategy f73220c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Default(parcel.readInt() != 0, (FreelancerOnboardingArticleConfig) parcel.readParcelable(Default.class.getClassLoader()), (FreelancerOnboardingNavStrategy) parcel.readParcelable(Default.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Default() {
                this((FreelancerOnboardingArticleConfig) null, (FreelancerOnboardingNavStrategy) (0 == true ? 1 : 0), 7);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final FreelancerOnboardingArticleConfig getF73219b() {
                return this.f73219b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final FreelancerOnboardingNavStrategy getF73220c() {
                return this.f73220c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Default)) {
                    return false;
                }
                Default r56 = (Default) obj2;
                return this.f73218a == r56.f73218a && Intrinsics.f(this.f73219b, r56.f73219b) && Intrinsics.f(this.f73220c, r56.f73220c);
            }

            public final int hashCode() {
                int iHashCode = (this.f73219b.hashCode() + (Boolean.hashCode(this.f73218a) * 31)) * 31;
                FreelancerOnboardingNavStrategy freelancerOnboardingNavStrategy = this.f73220c;
                return iHashCode + (freelancerOnboardingNavStrategy == null ? 0 : freelancerOnboardingNavStrategy.hashCode());
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: n1, reason: from getter */
            public final boolean getF86766c() {
                return this.f73218a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f73218a ? 1 : 0);
                dest.writeParcelable(this.f73219b, i);
                dest.writeParcelable(this.f73220c, i);
            }

            public Default(boolean z, FreelancerOnboardingArticleConfig articleConfig, FreelancerOnboardingNavStrategy freelancerOnboardingNavStrategy) {
                Intrinsics.checkNotNullParameter(articleConfig, "articleConfig");
                this.f73218a = z;
                this.f73219b = articleConfig;
                this.f73220c = freelancerOnboardingNavStrategy;
            }

            public /* synthetic */ Default(FreelancerOnboardingArticleConfig freelancerOnboardingArticleConfig, FreelancerOnboardingNavStrategy freelancerOnboardingNavStrategy, int i) {
                this((i & 1) != 0, (i & 2) != 0 ? FreelancerOnboardingArticleConfig.DoNotShowArticle.f73172a : freelancerOnboardingArticleConfig, (i & 4) != 0 ? null : freelancerOnboardingNavStrategy);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$Onboarding$RetailBridge;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$Onboarding;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RetailBridge extends Onboarding {

            @NotNull
            public static final Parcelable.Creator<RetailBridge> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f73221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final FreelancerOnboardingArticleConfig f73222b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RetailBridge(parcel.readInt() != 0, (FreelancerOnboardingArticleConfig) parcel.readParcelable(RetailBridge.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RetailBridge[i];
                }
            }

            public RetailBridge(boolean z, FreelancerOnboardingArticleConfig articleConfig) {
                Intrinsics.checkNotNullParameter(articleConfig, "articleConfig");
                this.f73221a = z;
                this.f73222b = articleConfig;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final FreelancerOnboardingArticleConfig getF73222b() {
                return this.f73222b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof RetailBridge)) {
                    return false;
                }
                RetailBridge retailBridge = (RetailBridge) obj2;
                return this.f73221a == retailBridge.f73221a && Intrinsics.f(this.f73222b, retailBridge.f73222b);
            }

            public final int hashCode() {
                return this.f73222b.hashCode() + (Boolean.hashCode(this.f73221a) * 31);
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: n1, reason: from getter */
            public final boolean getF86766c() {
                return this.f73221a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f73221a ? 1 : 0);
                dest.writeParcelable(this.f73222b, i);
            }

            public RetailBridge() {
                this(true, FreelancerOnboardingArticleConfig.DoNotShowArticle.f73172a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPerks;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InitialStep", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProPerks implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ProPerks> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InitialStep f73229a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPerks$InitialStep;", "Landroid/os/Parcelable;", "Perks", "PerkDetails", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPerks$InitialStep$PerkDetails;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPerks$InitialStep$Perks;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InitialStep extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPerks$InitialStep$PerkDetails;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPerks$InitialStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PerkDetails implements InitialStep {

                @NotNull
                public static final Parcelable.Creator<PerkDetails> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f73230a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PerkDetails(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new PerkDetails[i];
                    }
                }

                public PerkDetails(String perkId) {
                    Intrinsics.checkNotNullParameter(perkId, "perkId");
                    this.f73230a = perkId;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getF73230a() {
                    return this.f73230a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof PerkDetails) && Intrinsics.f(this.f73230a, ((PerkDetails) obj2).f73230a);
                }

                public final int hashCode() {
                    return this.f73230a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f73230a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPerks$InitialStep$Perks;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$ProPerks$InitialStep;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Perks implements InitialStep {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Perks f73231a = new Perks();

                @NotNull
                public static final Parcelable.Creator<Perks> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Perks.f73231a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Perks[i];
                    }
                }

                private Perks() {
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

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProPerks((InitialStep) parcel.readParcelable(ProPerks.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProPerks[i];
            }
        }

        public ProPerks(InitialStep initialStep) {
            Intrinsics.checkNotNullParameter(initialStep, "initialStep");
            this.f73229a = initialStep;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InitialStep getF73229a() {
            return this.f73229a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProPerks) && Intrinsics.f(this.f73229a, ((ProPerks) obj2).f73229a);
        }

        public final int hashCode() {
            return this.f73229a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73229a, i);
        }

        public ProPerks() {
            this(InitialStep.Perks.f73231a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureConfig$AddCustomerDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddCustomerDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<AddCustomerDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73187c;
        public final String d;
        public final String e;
        public final Address f;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddCustomerDestination(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(AddCustomerDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddCustomerDestination[i];
            }
        }

        public AddCustomerDestination(String str, String str2, String str3, String str4, String str5, Address address) {
            this.f73185a = str;
            this.f73186b = str2;
            this.f73187c = str3;
            this.d = str4;
            this.e = str5;
            this.f = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddCustomerDestination)) {
                return false;
            }
            AddCustomerDestination addCustomerDestination = (AddCustomerDestination) obj2;
            return Intrinsics.f(this.f73185a, addCustomerDestination.f73185a) && Intrinsics.f(this.f73186b, addCustomerDestination.f73186b) && Intrinsics.f(this.f73187c, addCustomerDestination.f73187c) && Intrinsics.f(this.d, addCustomerDestination.d) && Intrinsics.f(this.e, addCustomerDestination.e) && Intrinsics.f(this.f, addCustomerDestination.f);
        }

        public final int hashCode() {
            String str = this.f73185a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f73186b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f73187c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Address address = this.f;
            return iHashCode5 + (address != null ? address.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73185a);
            dest.writeString(this.f73186b);
            dest.writeString(this.f73187c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
        }

        public AddCustomerDestination() {
            this(null, null, null, null, null, null);
        }
    }
}
