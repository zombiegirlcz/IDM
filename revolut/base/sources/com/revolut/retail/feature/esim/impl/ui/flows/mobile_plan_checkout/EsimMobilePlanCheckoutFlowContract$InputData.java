package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "PurchaseNewPlan", "ChangePlan", "ResubscribeToMobilePlanSubscription", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData$ChangePlan;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData$PurchaseNewPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData$ResubscribeToMobilePlanSubscription;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanCheckoutFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData$ChangePlan;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangePlan implements EsimMobilePlanCheckoutFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ChangePlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100711c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangePlan(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangePlan[i];
            }
        }

        public ChangePlan(String mobilePlanId, String str, String str2) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f100709a = mobilePlanId;
            this.f100710b = str;
            this.f100711c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChangePlan)) {
                return false;
            }
            ChangePlan changePlan = (ChangePlan) obj2;
            return Intrinsics.f(this.f100709a, changePlan.f100709a) && Intrinsics.f(this.f100710b, changePlan.f100710b) && Intrinsics.f(this.f100711c, changePlan.f100711c);
        }

        public final int hashCode() {
            int iHashCode = this.f100709a.hashCode() * 31;
            String str = this.f100710b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f100711c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100709a);
            dest.writeString(this.f100710b);
            dest.writeString(this.f100711c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData$PurchaseNewPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurchaseNewPlan implements EsimMobilePlanCheckoutFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PurchaseNewPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100714c;
        public final EsimGiftRecipient d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurchaseNewPlan(parcel.readString(), parcel.readString(), parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(PurchaseNewPlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurchaseNewPlan[i];
            }
        }

        public PurchaseNewPlan(String mobilePlanId, String str, String str2, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f100712a = mobilePlanId;
            this.f100713b = str;
            this.f100714c = str2;
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
            if (!(obj2 instanceof PurchaseNewPlan)) {
                return false;
            }
            PurchaseNewPlan purchaseNewPlan = (PurchaseNewPlan) obj2;
            return Intrinsics.f(this.f100712a, purchaseNewPlan.f100712a) && Intrinsics.f(this.f100713b, purchaseNewPlan.f100713b) && Intrinsics.f(this.f100714c, purchaseNewPlan.f100714c) && Intrinsics.f(this.d, purchaseNewPlan.d);
        }

        public final int hashCode() {
            int iHashCode = this.f100712a.hashCode() * 31;
            String str = this.f100713b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f100714c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iHashCode3 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100712a);
            dest.writeString(this.f100713b);
            dest.writeString(this.f100714c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData$ResubscribeToMobilePlanSubscription;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_checkout/EsimMobilePlanCheckoutFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResubscribeToMobilePlanSubscription implements EsimMobilePlanCheckoutFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ResubscribeToMobilePlanSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100717c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResubscribeToMobilePlanSubscription(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResubscribeToMobilePlanSubscription[i];
            }
        }

        public ResubscribeToMobilePlanSubscription(String mobilePlanId, String str, String mobilePlanSubscriptionId) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(mobilePlanSubscriptionId, "mobilePlanSubscriptionId");
            this.f100715a = mobilePlanId;
            this.f100716b = str;
            this.f100717c = mobilePlanSubscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ResubscribeToMobilePlanSubscription)) {
                return false;
            }
            ResubscribeToMobilePlanSubscription resubscribeToMobilePlanSubscription = (ResubscribeToMobilePlanSubscription) obj2;
            return Intrinsics.f(this.f100715a, resubscribeToMobilePlanSubscription.f100715a) && Intrinsics.f(this.f100716b, resubscribeToMobilePlanSubscription.f100716b) && Intrinsics.f(this.f100717c, resubscribeToMobilePlanSubscription.f100717c);
        }

        public final int hashCode() {
            int iHashCode = this.f100715a.hashCode() * 31;
            String str = this.f100716b;
            return this.f100717c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100715a);
            dest.writeString(this.f100716b);
            dest.writeString(this.f100717c);
        }
    }
}
