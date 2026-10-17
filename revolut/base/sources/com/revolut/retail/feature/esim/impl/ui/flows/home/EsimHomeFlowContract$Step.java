package com.revolut.retail.feature.esim.impl.ui.flows.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lgj.e;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006(À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "GetDataPlan", "Subscriptions", "GiftRecipientSelection", "ExpiredSubscriptions", "Checkout", "MobilePlanResubscribeCheckout", "SubscriptionDetails", "Help", "ConnectivityTroubleshooting", "EsimRefund", "MobilePlanDetails", "MobilePlanBilling", "MobilePlanPayments", "MobilePlanInvoices", "MobilePlanCancellation", "NumberTransferConfirmation", "NumberTransferCreation", "NumberPurchase", "Restricted", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$ConnectivityTroubleshooting;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$EsimRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$ExpiredSubscriptions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$GetDataPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$GiftRecipientSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanBilling;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanCancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanDetails;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanInvoices;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanPayments;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanResubscribeCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$NumberPurchase;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$NumberTransferCreation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$SubscriptionDetails;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$Subscriptions;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimHomeFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGiftRecipient f100654c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(parcel.readString(), parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(Checkout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public /* synthetic */ Checkout(String str, EsimGiftRecipient esimGiftRecipient, int i) {
            this(str, (String) null, (i & 4) != 0 ? null : esimGiftRecipient);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Checkout)) {
                return false;
            }
            Checkout checkout = (Checkout) obj2;
            return Intrinsics.f(this.f100652a, checkout.f100652a) && Intrinsics.f(this.f100653b, checkout.f100653b) && Intrinsics.f(this.f100654c, checkout.f100654c);
        }

        public final int hashCode() {
            int iHashCode = this.f100652a.hashCode() * 31;
            String str = this.f100653b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EsimGiftRecipient esimGiftRecipient = this.f100654c;
            return iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100652a);
            dest.writeString(this.f100653b);
            dest.writeParcelable(this.f100654c, i);
        }

        public Checkout(String dataPlanId, String str, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
            this.f100652a = dataPlanId;
            this.f100653b = str;
            this.f100654c = esimGiftRecipient;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$ConnectivityTroubleshooting;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConnectivityTroubleshooting implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConnectivityTroubleshooting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100655a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConnectivityTroubleshooting(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConnectivityTroubleshooting[i];
            }
        }

        public ConnectivityTroubleshooting() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConnectivityTroubleshooting) && Intrinsics.f(this.f100655a, ((ConnectivityTroubleshooting) obj2).f100655a);
        }

        public final int hashCode() {
            String str = this.f100655a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100655a);
        }

        public ConnectivityTroubleshooting(String str) {
            this.f100655a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$EsimRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimRefund implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EsimRefund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100656a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimRefund(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimRefund[i];
            }
        }

        public EsimRefund(String str) {
            this.f100656a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EsimRefund) && Intrinsics.f(this.f100656a, ((EsimRefund) obj2).f100656a);
        }

        public final int hashCode() {
            String str = this.f100656a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100656a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$ExpiredSubscriptions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExpiredSubscriptions implements EsimHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExpiredSubscriptions f100657a = new ExpiredSubscriptions();

        @NotNull
        public static final Parcelable.Creator<ExpiredSubscriptions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExpiredSubscriptions.f100657a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpiredSubscriptions[i];
            }
        }

        private ExpiredSubscriptions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$GetDataPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetDataPlan implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GetDataPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimGetPlanLaunchMode f100658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimGiftRecipient f100659b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetDataPlan((EsimGetPlanLaunchMode) parcel.readParcelable(GetDataPlan.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(GetDataPlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetDataPlan[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GetDataPlan() {
            this(null, 0 == true ? 1 : 0, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GetDataPlan)) {
                return false;
            }
            GetDataPlan getDataPlan = (GetDataPlan) obj2;
            return Intrinsics.f(this.f100658a, getDataPlan.f100658a) && Intrinsics.f(this.f100659b, getDataPlan.f100659b);
        }

        public final int hashCode() {
            EsimGetPlanLaunchMode esimGetPlanLaunchMode = this.f100658a;
            int iHashCode = (esimGetPlanLaunchMode == null ? 0 : esimGetPlanLaunchMode.hashCode()) * 31;
            EsimGiftRecipient esimGiftRecipient = this.f100659b;
            return iHashCode + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100658a, i);
            dest.writeParcelable(this.f100659b, i);
        }

        public GetDataPlan(EsimGetPlanLaunchMode esimGetPlanLaunchMode, EsimGiftRecipient esimGiftRecipient) {
            this.f100658a = esimGetPlanLaunchMode;
            this.f100659b = esimGiftRecipient;
        }

        public /* synthetic */ GetDataPlan(EsimGetPlanLaunchMode esimGetPlanLaunchMode, EsimGiftRecipient esimGiftRecipient, int i) {
            this((i & 1) != 0 ? null : esimGetPlanLaunchMode, (i & 2) != 0 ? null : esimGiftRecipient);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$GiftRecipientSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiftRecipientSelection implements EsimHomeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiftRecipientSelection f100660a = new GiftRecipientSelection();

        @NotNull
        public static final Parcelable.Creator<GiftRecipientSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiftRecipientSelection.f100660a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftRecipientSelection[i];
            }
        }

        private GiftRecipientSelection() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Help implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Help> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100661a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Help(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Help[i];
            }
        }

        public Help() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Help) && Intrinsics.f(this.f100661a, ((Help) obj2).f100661a);
        }

        public final int hashCode() {
            String str = this.f100661a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100661a);
        }

        public Help(String str) {
            this.f100661a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanBilling;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanBilling implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanBilling> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100662a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanBilling(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanBilling[i];
            }
        }

        public MobilePlanBilling(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100662a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanBilling) && Intrinsics.f(this.f100662a, ((MobilePlanBilling) obj2).f100662a);
        }

        public final int hashCode() {
            return this.f100662a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100662a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanCancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanCancellation implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanCancellation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType f100664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGiftRecipient f100665c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanCancellation(parcel.readString(), (EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) parcel.readParcelable(MobilePlanCancellation.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(MobilePlanCancellation.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanCancellation[i];
            }
        }

        public MobilePlanCancellation(String subscriptionId, EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType, EsimGiftRecipient esimGiftRecipient, String str) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
            this.f100663a = subscriptionId;
            this.f100664b = cancellationType;
            this.f100665c = esimGiftRecipient;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanCancellation)) {
                return false;
            }
            MobilePlanCancellation mobilePlanCancellation = (MobilePlanCancellation) obj2;
            return Intrinsics.f(this.f100663a, mobilePlanCancellation.f100663a) && Intrinsics.f(this.f100664b, mobilePlanCancellation.f100664b) && Intrinsics.f(this.f100665c, mobilePlanCancellation.f100665c) && Intrinsics.f(this.d, mobilePlanCancellation.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f100664b.hashCode() + (this.f100663a.hashCode() * 31)) * 31;
            EsimGiftRecipient esimGiftRecipient = this.f100665c;
            int iHashCode2 = (iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31;
            String str = this.d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100663a);
            dest.writeParcelable(this.f100664b, i);
            dest.writeParcelable(this.f100665c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanDetails;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanDetails implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100666a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanDetails[i];
            }
        }

        public MobilePlanDetails(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100666a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanDetails) && Intrinsics.f(this.f100666a, ((MobilePlanDetails) obj2).f100666a);
        }

        public final int hashCode() {
            return this.f100666a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100666a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanInvoices;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanInvoices implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanInvoices> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100667a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanInvoices(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanInvoices[i];
            }
        }

        public MobilePlanInvoices(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100667a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanInvoices) && Intrinsics.f(this.f100667a, ((MobilePlanInvoices) obj2).f100667a);
        }

        public final int hashCode() {
            return this.f100667a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100667a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanPayments;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanPayments implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanPayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100668a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanPayments(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanPayments[i];
            }
        }

        public MobilePlanPayments(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100668a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanPayments) && Intrinsics.f(this.f100668a, ((MobilePlanPayments) obj2).f100668a);
        }

        public final int hashCode() {
            return this.f100668a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100668a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$MobilePlanResubscribeCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanResubscribeCheckout implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanResubscribeCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100670b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanResubscribeCheckout(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanResubscribeCheckout[i];
            }
        }

        public MobilePlanResubscribeCheckout(String mobilePlanId, String subscriptionIdToResubscribe) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(subscriptionIdToResubscribe, "subscriptionIdToResubscribe");
            this.f100669a = mobilePlanId;
            this.f100670b = subscriptionIdToResubscribe;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanResubscribeCheckout)) {
                return false;
            }
            MobilePlanResubscribeCheckout mobilePlanResubscribeCheckout = (MobilePlanResubscribeCheckout) obj2;
            return Intrinsics.f(this.f100669a, mobilePlanResubscribeCheckout.f100669a) && Intrinsics.f(this.f100670b, mobilePlanResubscribeCheckout.f100670b);
        }

        public final int hashCode() {
            return this.f100670b.hashCode() + (this.f100669a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100669a);
            dest.writeString(this.f100670b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$NumberPurchase;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberPurchase implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberPurchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f100672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGiftRecipient f100673c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NumberPurchase(parcel.readString(), e.valueOf(parcel.readString()), (EsimGiftRecipient) parcel.readParcelable(NumberPurchase.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NumberPurchase[i];
            }
        }

        public NumberPurchase(String subscriptionId, e startType, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f100671a = subscriptionId;
            this.f100672b = startType;
            this.f100673c = esimGiftRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NumberPurchase)) {
                return false;
            }
            NumberPurchase numberPurchase = (NumberPurchase) obj2;
            return Intrinsics.f(this.f100671a, numberPurchase.f100671a) && this.f100672b == numberPurchase.f100672b && Intrinsics.f(this.f100673c, numberPurchase.f100673c);
        }

        public final int hashCode() {
            int iHashCode = (this.f100672b.hashCode() + (this.f100671a.hashCode() * 31)) * 31;
            EsimGiftRecipient esimGiftRecipient = this.f100673c;
            return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100671a);
            dest.writeString(this.f100672b.name());
            dest.writeParcelable(this.f100673c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$NumberTransferCreation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberTransferCreation implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberTransferCreation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPhoneNumberSelections f100678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100679c;
        public final EsimGiftRecipient d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                EsimPhoneNumberSelections esimPhoneNumberSelections = (EsimPhoneNumberSelections) parcel.readParcelable(NumberTransferCreation.class.getClassLoader());
                return new NumberTransferCreation((EsimGiftRecipient) parcel.readParcelable(NumberTransferCreation.class.getClassLoader()), (EsimPhoneNumberPorting) parcel.readParcelable(NumberTransferCreation.class.getClassLoader()), esimPhoneNumberSelections, string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NumberTransferCreation[i];
            }
        }

        public NumberTransferCreation(EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPorting porting, EsimPhoneNumberSelections phoneNumberSelections, String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
            Intrinsics.checkNotNullParameter(porting, "porting");
            this.f100677a = subscriptionId;
            this.f100678b = phoneNumberSelections;
            this.f100679c = porting;
            this.d = esimGiftRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NumberTransferCreation)) {
                return false;
            }
            NumberTransferCreation numberTransferCreation = (NumberTransferCreation) obj2;
            return Intrinsics.f(this.f100677a, numberTransferCreation.f100677a) && Intrinsics.f(this.f100678b, numberTransferCreation.f100678b) && Intrinsics.f(this.f100679c, numberTransferCreation.f100679c) && Intrinsics.f(this.d, numberTransferCreation.d);
        }

        public final int hashCode() {
            int iC = y.c(this.f100679c, (this.f100678b.hashCode() + (this.f100677a.hashCode() * 31)) * 31, 31);
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100677a);
            dest.writeParcelable(this.f100678b, i);
            dest.writeParcelable(this.f100679c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Restricted implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f100680a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Restricted((PromptMarketingScreenContract$InputData) parcel.readParcelable(Restricted.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Restricted[i];
            }
        }

        public Restricted(PromptMarketingScreenContract$InputData promptInput) {
            Intrinsics.checkNotNullParameter(promptInput, "promptInput");
            this.f100680a = promptInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Restricted) && Intrinsics.f(this.f100680a, ((Restricted) obj2).f100680a);
        }

        public final int hashCode() {
            return this.f100680a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100680a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$SubscriptionDetails;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubscriptionDetails implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SubscriptionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100681a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubscriptionDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionDetails[i];
            }
        }

        public SubscriptionDetails(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100681a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SubscriptionDetails) && Intrinsics.f(this.f100681a, ((SubscriptionDetails) obj2).f100681a);
        }

        public final int hashCode() {
            return this.f100681a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100681a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$Subscriptions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subscriptions implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Subscriptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimHomeFlowContract$InputData.InitialDestination.PreferredView f100682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100684c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Subscriptions((EsimHomeFlowContract$InputData.InitialDestination.PreferredView) parcel.readParcelable(Subscriptions.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subscriptions[i];
            }
        }

        public Subscriptions() {
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
            if (!(obj2 instanceof Subscriptions)) {
                return false;
            }
            Subscriptions subscriptions = (Subscriptions) obj2;
            return Intrinsics.f(this.f100682a, subscriptions.f100682a) && this.f100683b == subscriptions.f100683b && this.f100684c == subscriptions.f100684c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100684c) + j6.a.c(this.f100682a.hashCode() * 31, 31, this.f100683b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100682a, i);
            dest.writeInt(this.f100683b ? 1 : 0);
            dest.writeInt(this.f100684c ? 1 : 0);
        }

        public Subscriptions(EsimHomeFlowContract$InputData.InitialDestination.PreferredView preferredView, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(preferredView, "preferredView");
            this.f100682a = preferredView;
            this.f100683b = z;
            this.f100684c = z3;
        }

        public /* synthetic */ Subscriptions(int i) {
            this(EsimHomeFlowContract$InputData.InitialDestination.PreferredView.CurrentDevice.f100647a, false, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberTransferConfirmation implements EsimHomeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberTransferConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100676c;
        public final EsimGiftRecipient d;
        public final hgj.c e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NumberTransferConfirmation(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(NumberTransferConfirmation.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(NumberTransferConfirmation.class.getClassLoader()), hgj.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NumberTransferConfirmation[i];
            }
        }

        public NumberTransferConfirmation(String subscriptionId, String phoneNumber, EsimPhoneNumberPorting porting, EsimGiftRecipient esimGiftRecipient, hgj.c navigationIcon) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(porting, "porting");
            Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
            this.f100674a = subscriptionId;
            this.f100675b = phoneNumber;
            this.f100676c = porting;
            this.d = esimGiftRecipient;
            this.e = navigationIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NumberTransferConfirmation)) {
                return false;
            }
            NumberTransferConfirmation numberTransferConfirmation = (NumberTransferConfirmation) obj2;
            return Intrinsics.f(this.f100674a, numberTransferConfirmation.f100674a) && Intrinsics.f(this.f100675b, numberTransferConfirmation.f100675b) && Intrinsics.f(this.f100676c, numberTransferConfirmation.f100676c) && Intrinsics.f(this.d, numberTransferConfirmation.d) && this.e == numberTransferConfirmation.e;
        }

        public final int hashCode() {
            int iC = y.c(this.f100676c, p.a.c(this.f100674a.hashCode() * 31, 31, this.f100675b), 31);
            EsimGiftRecipient esimGiftRecipient = this.d;
            return this.e.hashCode() + ((iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100674a);
            dest.writeString(this.f100675b);
            dest.writeParcelable(this.f100676c, i);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
        }

        public /* synthetic */ NumberTransferConfirmation(String str, String str2, EsimPhoneNumberPorting esimPhoneNumberPorting, EsimGiftRecipient esimGiftRecipient) {
            this(str, str2, esimPhoneNumberPorting, esimGiftRecipient, hgj.c.DEFAULT);
        }
    }
}
