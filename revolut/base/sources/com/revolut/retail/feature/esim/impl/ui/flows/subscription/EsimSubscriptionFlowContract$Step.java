package com.revolut.retail.feature.esim.impl.ui.flows.subscription;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import dej.c4;
import dej.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Subscription", "Checkout", "Help", "ConnectivityTroubleshooting", "EsimHome", "EsimRefund", "ChangeDataPlan", "Restricted", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$ChangeDataPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$ConnectivityTroubleshooting;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$EsimHome;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$EsimRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$Subscription;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimSubscriptionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$ChangeDataPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeDataPlan implements EsimSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChangeDataPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGiftRecipient f100885c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeDataPlan(parcel.readString(), parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(ChangeDataPlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeDataPlan[i];
            }
        }

        public ChangeDataPlan(String subscriptionId, String planId, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f100883a = subscriptionId;
            this.f100884b = planId;
            this.f100885c = esimGiftRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChangeDataPlan)) {
                return false;
            }
            ChangeDataPlan changeDataPlan = (ChangeDataPlan) obj2;
            return Intrinsics.f(this.f100883a, changeDataPlan.f100883a) && Intrinsics.f(this.f100884b, changeDataPlan.f100884b) && Intrinsics.f(this.f100885c, changeDataPlan.f100885c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f100883a.hashCode() * 31, 31, this.f100884b);
            EsimGiftRecipient esimGiftRecipient = this.f100885c;
            return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100883a);
            dest.writeString(this.f100884b);
            dest.writeParcelable(this.f100885c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout implements EsimSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimGiftRecipient f100887b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(Checkout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(String dataPlanId, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
            this.f100886a = dataPlanId;
            this.f100887b = esimGiftRecipient;
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
            return Intrinsics.f(this.f100886a, checkout.f100886a) && Intrinsics.f(this.f100887b, checkout.f100887b);
        }

        public final int hashCode() {
            int iHashCode = this.f100886a.hashCode() * 31;
            EsimGiftRecipient esimGiftRecipient = this.f100887b;
            return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100886a);
            dest.writeParcelable(this.f100887b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$ConnectivityTroubleshooting;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConnectivityTroubleshooting implements EsimSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConnectivityTroubleshooting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100888a;

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
            return (obj2 instanceof ConnectivityTroubleshooting) && Intrinsics.f(this.f100888a, ((ConnectivityTroubleshooting) obj2).f100888a);
        }

        public final int hashCode() {
            String str = this.f100888a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100888a);
        }

        public ConnectivityTroubleshooting(String str) {
            this.f100888a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$EsimRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimRefund implements EsimSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EsimRefund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100890a;

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
            this.f100890a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EsimRefund) && Intrinsics.f(this.f100890a, ((EsimRefund) obj2).f100890a);
        }

        public final int hashCode() {
            String str = this.f100890a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100890a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Help implements EsimSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Help> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100891a;

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

        public Help(String str) {
            this.f100891a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Help) && Intrinsics.f(this.f100891a, ((Help) obj2).f100891a);
        }

        public final int hashCode() {
            String str = this.f100891a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100891a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Restricted implements EsimSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f100892a;

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
            this.f100892a = promptInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Restricted) && Intrinsics.f(this.f100892a, ((Restricted) obj2).f100892a);
        }

        public final int hashCode() {
            return this.f100892a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100892a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$EsimHome;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimHome implements EsimSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EsimHome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c4 f100889a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimHome(c4.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimHome[i];
            }
        }

        public EsimHome(c4 subscriptionTab) {
            Intrinsics.checkNotNullParameter(subscriptionTab, "subscriptionTab");
            this.f100889a = subscriptionTab;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EsimHome) && this.f100889a == ((EsimHome) obj2).f100889a;
        }

        public final int hashCode() {
            return this.f100889a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100889a.name());
        }

        public EsimHome() {
            this(c4.ACTIVE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step$Subscription;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/subscription/EsimSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subscription implements EsimSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Subscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f100894b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Subscription(parcel.readString(), m.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subscription[i];
            }
        }

        public Subscription(String subscriptionId, m planType) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(planType, "planType");
            this.f100893a = subscriptionId;
            this.f100894b = planType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj2;
            return Intrinsics.f(this.f100893a, subscription.f100893a) && this.f100894b == subscription.f100894b;
        }

        public final int hashCode() {
            return this.f100894b.hashCode() + (this.f100893a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100893a);
            dest.writeString(this.f100894b.name());
        }

        public /* synthetic */ Subscription(String str) {
            this(str, m.DATA_PLAN);
        }
    }
}
