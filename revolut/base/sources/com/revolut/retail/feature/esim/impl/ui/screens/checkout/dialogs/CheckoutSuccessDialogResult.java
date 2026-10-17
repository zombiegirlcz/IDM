package com.revolut.retail.feature.esim.impl.ui.screens.checkout.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult;", "Landroid/os/Parcelable;", "InstallationAvailable", "InstallationUnavailable", "ShareEsim", "PhoneNumberPorting", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult$InstallationAvailable;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult$InstallationUnavailable;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult$PhoneNumberPorting;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult$ShareEsim;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CheckoutSuccessDialogResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult$InstallationAvailable;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstallationAvailable implements CheckoutSuccessDialogResult {

        @NotNull
        public static final Parcelable.Creator<InstallationAvailable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimProfile f100931a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstallationAvailable((EsimProfile) parcel.readParcelable(InstallationAvailable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstallationAvailable[i];
            }
        }

        public InstallationAvailable(EsimProfile esimProfile) {
            Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
            this.f100931a = esimProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstallationAvailable) && Intrinsics.f(this.f100931a, ((InstallationAvailable) obj2).f100931a);
        }

        public final int hashCode() {
            return this.f100931a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100931a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult$InstallationUnavailable;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstallationUnavailable implements CheckoutSuccessDialogResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstallationUnavailable f100932a = new InstallationUnavailable();

        @NotNull
        public static final Parcelable.Creator<InstallationUnavailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstallationUnavailable.f100932a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstallationUnavailable[i];
            }
        }

        private InstallationUnavailable() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult$PhoneNumberPorting;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneNumberPorting implements CheckoutSuccessDialogResult {

        @NotNull
        public static final Parcelable.Creator<PhoneNumberPorting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100933a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneNumberPorting(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneNumberPorting[i];
            }
        }

        public PhoneNumberPorting(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f100933a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PhoneNumberPorting) && Intrinsics.f(this.f100933a, ((PhoneNumberPorting) obj2).f100933a);
        }

        public final int hashCode() {
            return this.f100933a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100933a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult$ShareEsim;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/dialogs/CheckoutSuccessDialogResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShareEsim implements CheckoutSuccessDialogResult {

        @NotNull
        public static final Parcelable.Creator<ShareEsim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100934a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareEsim(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShareEsim[i];
            }
        }

        public ShareEsim(String simProfileId) {
            Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
            this.f100934a = simProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShareEsim) && Intrinsics.f(this.f100934a, ((ShareEsim) obj2).f100934a);
        }

        public final int hashCode() {
            return this.f100934a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100934a);
        }
    }
}
