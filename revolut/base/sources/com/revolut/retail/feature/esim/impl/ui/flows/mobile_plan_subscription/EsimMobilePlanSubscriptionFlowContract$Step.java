package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import dej.c4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lgj.e;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\"À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Subscription", "MobilePlanBilling", "MobilePlanPayments", "MobilePlanInvoices", "MobilePlanCancellation", "MobilePlanCheckout", "NumberTransferCreation", "NumberTransferConfirmation", "EsimRefund", "Help", "Instructions", "EsimHome", "NumberPurchase", "PlanChange", "PlanUpgrade", "Restricted", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$EsimHome;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$EsimRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$Instructions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanBilling;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanCancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanInvoices;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanPayments;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$NumberPurchase;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$NumberTransferCreation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$PlanChange;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$PlanUpgrade;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$Subscription;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanSubscriptionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$EsimHome;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimHome implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EsimHome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c4 f100828a;

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
            this.f100828a = subscriptionTab;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EsimHome) && this.f100828a == ((EsimHome) obj2).f100828a;
        }

        public final int hashCode() {
            return this.f100828a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100828a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$EsimRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EsimRefund implements EsimMobilePlanSubscriptionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EsimRefund f100829a = new EsimRefund();

        @NotNull
        public static final Parcelable.Creator<EsimRefund> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EsimRefund.f100829a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimRefund[i];
            }
        }

        private EsimRefund() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Help implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Help> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100830a;

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
            this.f100830a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Help) && Intrinsics.f(this.f100830a, ((Help) obj2).f100830a);
        }

        public final int hashCode() {
            String str = this.f100830a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100830a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$Instructions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instructions implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Instructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100831a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instructions(((EsimInstructionType) parcel.readParcelable(Instructions.class.getClassLoader())).f72115a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instructions[i];
            }
        }

        public Instructions(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f100831a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Instructions)) {
                return false;
            }
            String str = ((Instructions) obj2).f100831a;
            EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
            return Intrinsics.f(this.f100831a, str);
        }

        public final int hashCode() {
            EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
            return this.f100831a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new EsimInstructionType(this.f100831a), i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanBilling;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanBilling implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanBilling> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100832a;

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
            this.f100832a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanBilling) && Intrinsics.f(this.f100832a, ((MobilePlanBilling) obj2).f100832a);
        }

        public final int hashCode() {
            return this.f100832a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100832a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanCancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanCancellation implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanCancellation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType f100834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGiftRecipient f100835c;
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
            this.f100833a = subscriptionId;
            this.f100834b = cancellationType;
            this.f100835c = esimGiftRecipient;
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
            return Intrinsics.f(this.f100833a, mobilePlanCancellation.f100833a) && Intrinsics.f(this.f100834b, mobilePlanCancellation.f100834b) && Intrinsics.f(this.f100835c, mobilePlanCancellation.f100835c) && Intrinsics.f(this.d, mobilePlanCancellation.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f100834b.hashCode() + (this.f100833a.hashCode() * 31)) * 31;
            EsimGiftRecipient esimGiftRecipient = this.f100835c;
            int iHashCode2 = (iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31;
            String str = this.d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100833a);
            dest.writeParcelable(this.f100834b, i);
            dest.writeParcelable(this.f100835c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanCheckout implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100837b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanCheckout(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanCheckout[i];
            }
        }

        public MobilePlanCheckout(String mobilePlanId, String mobileSubscriptionIdToResubscribe) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(mobileSubscriptionIdToResubscribe, "mobileSubscriptionIdToResubscribe");
            this.f100836a = mobilePlanId;
            this.f100837b = mobileSubscriptionIdToResubscribe;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanCheckout)) {
                return false;
            }
            MobilePlanCheckout mobilePlanCheckout = (MobilePlanCheckout) obj2;
            return Intrinsics.f(this.f100836a, mobilePlanCheckout.f100836a) && Intrinsics.f(this.f100837b, mobilePlanCheckout.f100837b);
        }

        public final int hashCode() {
            return this.f100837b.hashCode() + (this.f100836a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100836a);
            dest.writeString(this.f100837b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanInvoices;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanInvoices implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanInvoices> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100838a;

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
            this.f100838a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanInvoices) && Intrinsics.f(this.f100838a, ((MobilePlanInvoices) obj2).f100838a);
        }

        public final int hashCode() {
            return this.f100838a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100838a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$MobilePlanPayments;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanPayments implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanPayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100839a;

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
            this.f100839a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MobilePlanPayments) && Intrinsics.f(this.f100839a, ((MobilePlanPayments) obj2).f100839a);
        }

        public final int hashCode() {
            return this.f100839a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100839a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$NumberPurchase;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberPurchase implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberPurchase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f100841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGiftRecipient f100842c;

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
            this.f100840a = subscriptionId;
            this.f100841b = startType;
            this.f100842c = esimGiftRecipient;
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
            return Intrinsics.f(this.f100840a, numberPurchase.f100840a) && this.f100841b == numberPurchase.f100841b && Intrinsics.f(this.f100842c, numberPurchase.f100842c);
        }

        public final int hashCode() {
            int iHashCode = (this.f100841b.hashCode() + (this.f100840a.hashCode() * 31)) * 31;
            EsimGiftRecipient esimGiftRecipient = this.f100842c;
            return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100840a);
            dest.writeString(this.f100841b.name());
            dest.writeParcelable(this.f100842c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberTransferConfirmation implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberTransferConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100845c;
        public final EsimGiftRecipient d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NumberTransferConfirmation(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(NumberTransferConfirmation.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(NumberTransferConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NumberTransferConfirmation[i];
            }
        }

        public NumberTransferConfirmation(String subscriptionId, String phoneNumber, EsimPhoneNumberPorting porting, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(porting, "porting");
            this.f100843a = subscriptionId;
            this.f100844b = phoneNumber;
            this.f100845c = porting;
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
            if (!(obj2 instanceof NumberTransferConfirmation)) {
                return false;
            }
            NumberTransferConfirmation numberTransferConfirmation = (NumberTransferConfirmation) obj2;
            return Intrinsics.f(this.f100843a, numberTransferConfirmation.f100843a) && Intrinsics.f(this.f100844b, numberTransferConfirmation.f100844b) && Intrinsics.f(this.f100845c, numberTransferConfirmation.f100845c) && Intrinsics.f(this.d, numberTransferConfirmation.d);
        }

        public final int hashCode() {
            int iC = y.c(this.f100845c, p.a.c(this.f100843a.hashCode() * 31, 31, this.f100844b), 31);
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100843a);
            dest.writeString(this.f100844b);
            dest.writeParcelable(this.f100845c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$NumberTransferCreation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberTransferCreation implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberTransferCreation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPhoneNumberSelections f100847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100848c;
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
            this.f100846a = subscriptionId;
            this.f100847b = phoneNumberSelections;
            this.f100848c = porting;
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
            return Intrinsics.f(this.f100846a, numberTransferCreation.f100846a) && Intrinsics.f(this.f100847b, numberTransferCreation.f100847b) && Intrinsics.f(this.f100848c, numberTransferCreation.f100848c) && Intrinsics.f(this.d, numberTransferCreation.d);
        }

        public final int hashCode() {
            int iC = y.c(this.f100848c, (this.f100847b.hashCode() + (this.f100846a.hashCode() * 31)) * 31, 31);
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100846a);
            dest.writeParcelable(this.f100847b, i);
            dest.writeParcelable(this.f100848c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$PlanChange;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanChange implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100850b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanChange(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanChange[i];
            }
        }

        public PlanChange(String subscriptionId, String mobilePlanId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f100849a = subscriptionId;
            this.f100850b = mobilePlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanChange)) {
                return false;
            }
            PlanChange planChange = (PlanChange) obj2;
            return Intrinsics.f(this.f100849a, planChange.f100849a) && Intrinsics.f(this.f100850b, planChange.f100850b);
        }

        public final int hashCode() {
            return this.f100850b.hashCode() + (this.f100849a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100849a);
            dest.writeString(this.f100850b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$PlanUpgrade;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanUpgrade implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanUpgrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100852b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanUpgrade(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanUpgrade[i];
            }
        }

        public PlanUpgrade(String subscriptionId, String mobilePlanId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f100851a = subscriptionId;
            this.f100852b = mobilePlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanUpgrade)) {
                return false;
            }
            PlanUpgrade planUpgrade = (PlanUpgrade) obj2;
            return Intrinsics.f(this.f100851a, planUpgrade.f100851a) && Intrinsics.f(this.f100852b, planUpgrade.f100852b);
        }

        public final int hashCode() {
            return this.f100852b.hashCode() + (this.f100851a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100851a);
            dest.writeString(this.f100852b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Restricted implements EsimMobilePlanSubscriptionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f100853a;

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
            this.f100853a = promptInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Restricted) && Intrinsics.f(this.f100853a, ((Restricted) obj2).f100853a);
        }

        public final int hashCode() {
            return this.f100853a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100853a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step$Subscription;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_subscription/EsimMobilePlanSubscriptionFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Subscription implements EsimMobilePlanSubscriptionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Subscription f100854a = new Subscription();

        @NotNull
        public static final Parcelable.Creator<Subscription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Subscription.f100854a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subscription[i];
            }
        }

        private Subscription() {
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
