package com.revolut.retail.feature.esim.impl.ui.flows.get_plan;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlowContract$Step;
import dej.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectPlan", "Checkout", "MobilePlanCheckout", "MobilePlanResubscribeCheckout", "MobilePlanChangeCheckout", "MobilePlanNumberSelection", "PostCheckout", "Restricted", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$MobilePlanChangeCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$MobilePlanCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$MobilePlanNumberSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$MobilePlanResubscribeCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$PostCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$SelectPlan;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimGetPlanFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout implements EsimGetPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100617b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(String dataPlanId, String str) {
            Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
            this.f100616a = dataPlanId;
            this.f100617b = str;
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
            return Intrinsics.f(this.f100616a, checkout.f100616a) && Intrinsics.f(this.f100617b, checkout.f100617b);
        }

        public final int hashCode() {
            int iHashCode = this.f100616a.hashCode() * 31;
            String str = this.f100617b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100616a);
            dest.writeString(this.f100617b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$MobilePlanChangeCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanChangeCheckout implements EsimGetPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanChangeCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100619b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanChangeCheckout(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanChangeCheckout[i];
            }
        }

        public MobilePlanChangeCheckout(String mobilePlanId, String str) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f100618a = mobilePlanId;
            this.f100619b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanChangeCheckout)) {
                return false;
            }
            MobilePlanChangeCheckout mobilePlanChangeCheckout = (MobilePlanChangeCheckout) obj2;
            return Intrinsics.f(this.f100618a, mobilePlanChangeCheckout.f100618a) && Intrinsics.f(this.f100619b, mobilePlanChangeCheckout.f100619b);
        }

        public final int hashCode() {
            int iHashCode = this.f100618a.hashCode() * 31;
            String str = this.f100619b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100618a);
            dest.writeString(this.f100619b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$MobilePlanCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanCheckout implements EsimGetPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100622c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanCheckout(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanCheckout[i];
            }
        }

        public MobilePlanCheckout(String mobilePlanId, String str, String str2) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f100620a = mobilePlanId;
            this.f100621b = str;
            this.f100622c = str2;
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
            return Intrinsics.f(this.f100620a, mobilePlanCheckout.f100620a) && Intrinsics.f(this.f100621b, mobilePlanCheckout.f100621b) && Intrinsics.f(this.f100622c, mobilePlanCheckout.f100622c);
        }

        public final int hashCode() {
            int iHashCode = this.f100620a.hashCode() * 31;
            String str = this.f100621b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f100622c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100620a);
            dest.writeString(this.f100621b);
            dest.writeString(this.f100622c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$MobilePlanNumberSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanNumberSelection implements EsimGetPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanNumberSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPhoneNumberSelections f100624b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobilePlanNumberSelection(parcel.readString(), (EsimPhoneNumberSelections) parcel.readParcelable(MobilePlanNumberSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MobilePlanNumberSelection[i];
            }
        }

        public MobilePlanNumberSelection(String mobilePlanId, EsimPhoneNumberSelections phoneNumberSelections) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
            this.f100623a = mobilePlanId;
            this.f100624b = phoneNumberSelections;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MobilePlanNumberSelection)) {
                return false;
            }
            MobilePlanNumberSelection mobilePlanNumberSelection = (MobilePlanNumberSelection) obj2;
            return Intrinsics.f(this.f100623a, mobilePlanNumberSelection.f100623a) && Intrinsics.f(this.f100624b, mobilePlanNumberSelection.f100624b);
        }

        public final int hashCode() {
            return this.f100624b.hashCode() + (this.f100623a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100623a);
            dest.writeParcelable(this.f100624b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$MobilePlanResubscribeCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MobilePlanResubscribeCheckout implements EsimGetPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MobilePlanResubscribeCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100626b;

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

        public MobilePlanResubscribeCheckout(String mobilePlanId, String subscriptionId) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100625a = mobilePlanId;
            this.f100626b = subscriptionId;
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
            return Intrinsics.f(this.f100625a, mobilePlanResubscribeCheckout.f100625a) && Intrinsics.f(this.f100626b, mobilePlanResubscribeCheckout.f100626b);
        }

        public final int hashCode() {
            return this.f100626b.hashCode() + (this.f100625a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100625a);
            dest.writeString(this.f100626b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Restricted implements EsimGetPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f100628a;

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
            this.f100628a = promptInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Restricted) && Intrinsics.f(this.f100628a, ((Restricted) obj2).f100628a);
        }

        public final int hashCode() {
            return this.f100628a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100628a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$SelectPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectPlan implements EsimGetPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f100630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGetPlanLaunchMode f100631c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectPlan(parcel.readString(), parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()), (EsimGetPlanLaunchMode) parcel.readParcelable(SelectPlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPlan[i];
            }
        }

        public SelectPlan(String str, m mVar, EsimGetPlanLaunchMode esimGetPlanLaunchMode) {
            this.f100629a = str;
            this.f100630b = mVar;
            this.f100631c = esimGetPlanLaunchMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectPlan)) {
                return false;
            }
            SelectPlan selectPlan = (SelectPlan) obj2;
            return Intrinsics.f(this.f100629a, selectPlan.f100629a) && this.f100630b == selectPlan.f100630b && Intrinsics.f(this.f100631c, selectPlan.f100631c);
        }

        public final int hashCode() {
            String str = this.f100629a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            m mVar = this.f100630b;
            int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
            EsimGetPlanLaunchMode esimGetPlanLaunchMode = this.f100631c;
            return iHashCode2 + (esimGetPlanLaunchMode != null ? esimGetPlanLaunchMode.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100629a);
            m mVar = this.f100630b;
            if (mVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mVar.name());
            }
            dest.writeParcelable(this.f100631c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step$PostCheckout;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/get_plan/EsimGetPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostCheckout implements EsimGetPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PostCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimPostCheckoutFlowContract$Step f100627a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostCheckout((EsimPostCheckoutFlowContract$Step) parcel.readParcelable(PostCheckout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostCheckout[i];
            }
        }

        public PostCheckout(EsimPostCheckoutFlowContract$Step showStep) {
            Intrinsics.checkNotNullParameter(showStep, "showStep");
            this.f100627a = showStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PostCheckout) && Intrinsics.f(this.f100627a, ((PostCheckout) obj2).f100627a);
        }

        public final int hashCode() {
            return this.f100627a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100627a, i);
        }

        public PostCheckout() {
            this(EsimPostCheckoutFlowContract$Step.EsimHome.f100859a);
        }
    }
}
