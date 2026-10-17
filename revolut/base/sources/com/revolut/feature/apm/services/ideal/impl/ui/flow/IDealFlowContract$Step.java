package com.revolut.feature.apm.services.ideal.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import gd2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PaymentConfirmedMobile", "SuccessAuth", "SuccessQrAuth", "PaymentConfirmedDesktop", "StartRegistrationFromPayment", "StartRegistrationFromSettings", "AddAccounts", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$AddAccounts;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$PaymentConfirmedDesktop;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$PaymentConfirmedMobile;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$StartRegistrationFromPayment;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$StartRegistrationFromSettings;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$SuccessAuth;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$SuccessQrAuth;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IDealFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$AddAccounts;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddAccounts extends IDealFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddAccounts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f62849b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddAccounts(parcel.readString(), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddAccounts[i];
            }
        }

        public AddAccounts(String str, d entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.f62848a = str;
            this.f62849b = entryPoint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddAccounts)) {
                return false;
            }
            AddAccounts addAccounts = (AddAccounts) obj2;
            return Intrinsics.f(this.f62848a, addAccounts.f62848a) && this.f62849b == addAccounts.f62849b;
        }

        public final int hashCode() {
            String str = this.f62848a;
            return this.f62849b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62848a);
            dest.writeString(this.f62849b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$PaymentConfirmedDesktop;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step;", "<init>", "()V", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentConfirmedDesktop extends IDealFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentConfirmedDesktop f62850a = new PaymentConfirmedDesktop();

        @NotNull
        public static final Parcelable.Creator<PaymentConfirmedDesktop> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentConfirmedDesktop.f62850a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentConfirmedDesktop[i];
            }
        }

        private PaymentConfirmedDesktop() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$PaymentConfirmedMobile;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentConfirmedMobile extends IDealFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentConfirmedMobile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62851a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentConfirmedMobile(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentConfirmedMobile[i];
            }
        }

        public PaymentConfirmedMobile(String redirectUri) {
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            this.f62851a = redirectUri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentConfirmedMobile) && Intrinsics.f(this.f62851a, ((PaymentConfirmedMobile) obj2).f62851a);
        }

        public final int hashCode() {
            return this.f62851a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62851a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$StartRegistrationFromPayment;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartRegistrationFromPayment extends IDealFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StartRegistrationFromPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62852a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartRegistrationFromPayment(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartRegistrationFromPayment[i];
            }
        }

        public StartRegistrationFromPayment(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f62852a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StartRegistrationFromPayment) && Intrinsics.f(this.f62852a, ((StartRegistrationFromPayment) obj2).f62852a);
        }

        public final int hashCode() {
            return this.f62852a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62852a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$StartRegistrationFromSettings;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step;", "<init>", "()V", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StartRegistrationFromSettings extends IDealFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StartRegistrationFromSettings f62853a = new StartRegistrationFromSettings();

        @NotNull
        public static final Parcelable.Creator<StartRegistrationFromSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StartRegistrationFromSettings.f62853a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartRegistrationFromSettings[i];
            }
        }

        private StartRegistrationFromSettings() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$SuccessAuth;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SuccessAuth extends IDealFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SuccessAuth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62854a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SuccessAuth(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SuccessAuth[i];
            }
        }

        public SuccessAuth(String redirectUri) {
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            this.f62854a = redirectUri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SuccessAuth) && Intrinsics.f(this.f62854a, ((SuccessAuth) obj2).f62854a);
        }

        public final int hashCode() {
            return this.f62854a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62854a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step$SuccessQrAuth;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlowContract$Step;", "<init>", "()V", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SuccessQrAuth extends IDealFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuccessQrAuth f62855a = new SuccessQrAuth();

        @NotNull
        public static final Parcelable.Creator<SuccessQrAuth> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SuccessQrAuth.f62855a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SuccessQrAuth[i];
            }
        }

        private SuccessQrAuth() {
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

    private IDealFlowContract$Step() {
    }
}
