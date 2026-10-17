package com.revolut.feature.revolutpay.management.impl.ui.management.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "SelectPaymentMethod", "SelectShippingContact", "PayWithSmileSettings", "PayWithSmileEnrollment", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$PayWithSmileEnrollment;", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$PayWithSmileSettings;", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$ProductArticle;", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$SelectPaymentMethod;", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$SelectShippingContact;", "feature_revolut_pay_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPayManagementHomeControllerContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$PayWithSmileEnrollment;", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step;", "<init>", "()V", "feature_revolut_pay_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayWithSmileEnrollment implements RevolutPayManagementHomeControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayWithSmileEnrollment f84586a = new PayWithSmileEnrollment();

        @NotNull
        public static final Parcelable.Creator<PayWithSmileEnrollment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayWithSmileEnrollment.f84586a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayWithSmileEnrollment[i];
            }
        }

        private PayWithSmileEnrollment() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$PayWithSmileSettings;", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step;", "<init>", "()V", "feature_revolut_pay_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayWithSmileSettings implements RevolutPayManagementHomeControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayWithSmileSettings f84587a = new PayWithSmileSettings();

        @NotNull
        public static final Parcelable.Creator<PayWithSmileSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayWithSmileSettings.f84587a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayWithSmileSettings[i];
            }
        }

        private PayWithSmileSettings() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$ProductArticle;", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements RevolutPayManagementHomeControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f84588a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle((ProductArticleParams) parcel.readParcelable(ProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f84588a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && Intrinsics.f(this.f84588a, ((ProductArticle) obj2).f84588a);
        }

        public final int hashCode() {
            return this.f84588a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84588a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$SelectPaymentMethod;", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step;", "<init>", "()V", "feature_revolut_pay_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectPaymentMethod implements RevolutPayManagementHomeControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectPaymentMethod f84589a = new SelectPaymentMethod();

        @NotNull
        public static final Parcelable.Creator<SelectPaymentMethod> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectPaymentMethod.f84589a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPaymentMethod[i];
            }
        }

        private SelectPaymentMethod() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step$SelectShippingContact;", "Lcom/revolut/feature/revolutpay/management/impl/ui/management/home/RevolutPayManagementHomeControllerContract$Step;", "<init>", "()V", "feature_revolut_pay_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectShippingContact implements RevolutPayManagementHomeControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectShippingContact f84590a = new SelectShippingContact();

        @NotNull
        public static final Parcelable.Creator<SelectShippingContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectShippingContact.f84590a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectShippingContact[i];
            }
        }

        private SelectShippingContact() {
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
