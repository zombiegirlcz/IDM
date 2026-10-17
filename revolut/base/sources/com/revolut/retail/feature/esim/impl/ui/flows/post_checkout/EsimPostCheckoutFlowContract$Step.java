package com.revolut.retail.feature.esim.impl.ui.flows.post_checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EsimHome", "InstallationInstructions", "ShareEsim", "NumberTransferConfirmation", "Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step$EsimHome;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step$InstallationInstructions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step$ShareEsim;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimPostCheckoutFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step$EsimHome;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EsimHome implements EsimPostCheckoutFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EsimHome f100859a = new EsimHome();

        @NotNull
        public static final Parcelable.Creator<EsimHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EsimHome.f100859a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimHome[i];
            }
        }

        private EsimHome() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step$InstallationInstructions;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstallationInstructions implements EsimPostCheckoutFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstallationInstructions f100860a = new InstallationInstructions();

        @NotNull
        public static final Parcelable.Creator<InstallationInstructions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstallationInstructions.f100860a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstallationInstructions[i];
            }
        }

        private InstallationInstructions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberTransferConfirmation implements EsimPostCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberTransferConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100863c;
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
            this.f100861a = subscriptionId;
            this.f100862b = phoneNumber;
            this.f100863c = porting;
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
            return Intrinsics.f(this.f100861a, numberTransferConfirmation.f100861a) && Intrinsics.f(this.f100862b, numberTransferConfirmation.f100862b) && Intrinsics.f(this.f100863c, numberTransferConfirmation.f100863c) && Intrinsics.f(this.d, numberTransferConfirmation.d);
        }

        public final int hashCode() {
            int iC = y.c(this.f100863c, p.a.c(this.f100861a.hashCode() * 31, 31, this.f100862b), 31);
            EsimGiftRecipient esimGiftRecipient = this.d;
            return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100861a);
            dest.writeString(this.f100862b);
            dest.writeParcelable(this.f100863c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step$ShareEsim;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/post_checkout/EsimPostCheckoutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShareEsim implements EsimPostCheckoutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShareEsim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100864a;

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
            this.f100864a = simProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShareEsim) && Intrinsics.f(this.f100864a, ((ShareEsim) obj2).f100864a);
        }

        public final int hashCode() {
            return this.f100864a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100864a);
        }
    }
}
