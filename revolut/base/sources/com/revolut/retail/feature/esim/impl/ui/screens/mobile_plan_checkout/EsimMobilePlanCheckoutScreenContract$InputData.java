package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "PurchaseNewPlan", "ChangePlan", "ReSubscribeToMobilePlanSubscription", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData$ChangePlan;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData$PurchaseNewPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData$ReSubscribeToMobilePlanSubscription;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanCheckoutScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData$ChangePlan;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangePlan implements EsimMobilePlanCheckoutScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ChangePlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimGiftRecipient f101146c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangePlan(parcel.readString(), parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(ChangePlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangePlan[i];
            }
        }

        public ChangePlan(String mobilePlanId, String str, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            this.f101144a = mobilePlanId;
            this.f101145b = str;
            this.f101146c = esimGiftRecipient;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData
        /* JADX INFO: renamed from: F0, reason: from getter */
        public final EsimGiftRecipient getD() {
            return this.f101146c;
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
            return Intrinsics.f(this.f101144a, changePlan.f101144a) && Intrinsics.f(this.f101145b, changePlan.f101145b) && Intrinsics.f(this.f101146c, changePlan.f101146c);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData
        /* JADX INFO: renamed from: h4, reason: from getter */
        public final String getF101150a() {
            return this.f101144a;
        }

        public final int hashCode() {
            int iHashCode = this.f101144a.hashCode() * 31;
            String str = this.f101145b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EsimGiftRecipient esimGiftRecipient = this.f101146c;
            return iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101144a);
            dest.writeString(this.f101145b);
            dest.writeParcelable(this.f101146c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData$PurchaseNewPlan;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurchaseNewPlan implements EsimMobilePlanCheckoutScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PurchaseNewPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f101149c;
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
            this.f101147a = mobilePlanId;
            this.f101148b = str;
            this.f101149c = str2;
            this.d = esimGiftRecipient;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData
        /* JADX INFO: renamed from: F0, reason: from getter */
        public final EsimGiftRecipient getD() {
            return this.d;
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
            return Intrinsics.f(this.f101147a, purchaseNewPlan.f101147a) && Intrinsics.f(this.f101148b, purchaseNewPlan.f101148b) && Intrinsics.f(this.f101149c, purchaseNewPlan.f101149c) && Intrinsics.f(this.d, purchaseNewPlan.d);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData
        /* JADX INFO: renamed from: g2, reason: from getter */
        public final String getF101151b() {
            return this.f101148b;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData
        /* JADX INFO: renamed from: h4, reason: from getter */
        public final String getF101150a() {
            return this.f101147a;
        }

        public final int hashCode() {
            int iHashCode = this.f101147a.hashCode() * 31;
            String str = this.f101148b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f101149c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iHashCode3 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101147a);
            dest.writeString(this.f101148b);
            dest.writeString(this.f101149c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData$ReSubscribeToMobilePlanSubscription;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReSubscribeToMobilePlanSubscription implements EsimMobilePlanCheckoutScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ReSubscribeToMobilePlanSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f101152c;
        public final EsimGiftRecipient d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReSubscribeToMobilePlanSubscription(parcel.readString(), parcel.readString(), parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(ReSubscribeToMobilePlanSubscription.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReSubscribeToMobilePlanSubscription[i];
            }
        }

        public ReSubscribeToMobilePlanSubscription(String mobilePlanId, String str, String mobilePlanSubscriptionId, EsimGiftRecipient esimGiftRecipient) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(mobilePlanSubscriptionId, "mobilePlanSubscriptionId");
            this.f101150a = mobilePlanId;
            this.f101151b = str;
            this.f101152c = mobilePlanSubscriptionId;
            this.d = esimGiftRecipient;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData
        /* JADX INFO: renamed from: F0, reason: from getter */
        public final EsimGiftRecipient getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReSubscribeToMobilePlanSubscription)) {
                return false;
            }
            ReSubscribeToMobilePlanSubscription reSubscribeToMobilePlanSubscription = (ReSubscribeToMobilePlanSubscription) obj2;
            return Intrinsics.f(this.f101150a, reSubscribeToMobilePlanSubscription.f101150a) && Intrinsics.f(this.f101151b, reSubscribeToMobilePlanSubscription.f101151b) && Intrinsics.f(this.f101152c, reSubscribeToMobilePlanSubscription.f101152c) && Intrinsics.f(this.d, reSubscribeToMobilePlanSubscription.d);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData
        /* JADX INFO: renamed from: g2, reason: from getter */
        public final String getF101151b() {
            return this.f101151b;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData
        /* JADX INFO: renamed from: h4, reason: from getter */
        public final String getF101150a() {
            return this.f101150a;
        }

        public final int hashCode() {
            int iHashCode = this.f101150a.hashCode() * 31;
            String str = this.f101151b;
            int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f101152c);
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iC + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101150a);
            dest.writeString(this.f101151b);
            dest.writeString(this.f101152c);
            dest.writeParcelable(this.d, i);
        }
    }

    /* JADX INFO: renamed from: F0 */
    EsimGiftRecipient getD();

    /* JADX INFO: renamed from: g2 */
    default String getF101151b() {
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    String getF101150a();
}
