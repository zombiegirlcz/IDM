package com.revolut.feature.apm.services.ideal.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "StartType", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IDealFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<IDealFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartType f62829b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartType f62830a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((StartType) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(StartType startType) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f62830a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f62830a, ((InputData) obj2).f62830a);
        }

        public final int hashCode() {
            return this.f62830a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62830a, i);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType;", "Landroid/os/Parcelable;", "PaymentConfirmedMobile", "SuccessAuth", "SuccessQrAuth", "PaymentConfirmedDesktop", "StartRegistrationFromPayment", "StartRegistrationFromSettings", "AddAccounts", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$AddAccounts;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$PaymentConfirmedDesktop;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$PaymentConfirmedMobile;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$StartRegistrationFromPayment;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$StartRegistrationFromSettings;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$SuccessAuth;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$SuccessQrAuth;", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface StartType extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$AddAccounts;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AddAccounts implements StartType {

            @NotNull
            public static final Parcelable.Creator<AddAccounts> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62831a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AddAccounts(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AddAccounts[i];
                }
            }

            public AddAccounts(String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f62831a = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AddAccounts) && Intrinsics.f(this.f62831a, ((AddAccounts) obj2).f62831a);
            }

            public final int hashCode() {
                return this.f62831a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62831a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$PaymentConfirmedDesktop;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType;", "<init>", "()V", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PaymentConfirmedDesktop implements StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PaymentConfirmedDesktop f62832a = new PaymentConfirmedDesktop();

            @NotNull
            public static final Parcelable.Creator<PaymentConfirmedDesktop> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PaymentConfirmedDesktop.f62832a;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$PaymentConfirmedMobile;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PaymentConfirmedMobile implements StartType {

            @NotNull
            public static final Parcelable.Creator<PaymentConfirmedMobile> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62833a;

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

            public PaymentConfirmedMobile(String redirectUrl) {
                Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
                this.f62833a = redirectUrl;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PaymentConfirmedMobile) && Intrinsics.f(this.f62833a, ((PaymentConfirmedMobile) obj2).f62833a);
            }

            public final int hashCode() {
                return this.f62833a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62833a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$StartRegistrationFromPayment;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StartRegistrationFromPayment implements StartType {

            @NotNull
            public static final Parcelable.Creator<StartRegistrationFromPayment> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62834a;

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
                this.f62834a = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof StartRegistrationFromPayment) && Intrinsics.f(this.f62834a, ((StartRegistrationFromPayment) obj2).f62834a);
            }

            public final int hashCode() {
                return this.f62834a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62834a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$StartRegistrationFromSettings;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType;", "<init>", "()V", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class StartRegistrationFromSettings implements StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final StartRegistrationFromSettings f62835a = new StartRegistrationFromSettings();

            @NotNull
            public static final Parcelable.Creator<StartRegistrationFromSettings> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return StartRegistrationFromSettings.f62835a;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$SuccessAuth;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SuccessAuth implements StartType {

            @NotNull
            public static final Parcelable.Creator<SuccessAuth> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62836a;

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

            public SuccessAuth(String redirectUrl) {
                Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
                this.f62836a = redirectUrl;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SuccessAuth) && Intrinsics.f(this.f62836a, ((SuccessAuth) obj2).f62836a);
            }

            public final int hashCode() {
                return this.f62836a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62836a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType$SuccessQrAuth;", "Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFlowDestination$StartType;", "<init>", "()V", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SuccessQrAuth implements StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SuccessQrAuth f62837a = new SuccessQrAuth();

            @NotNull
            public static final Parcelable.Creator<SuccessQrAuth> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SuccessQrAuth.f62837a;
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IDealFlowDestination((StartType) parcel.readParcelable(IDealFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IDealFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDealFlowDestination(StartType startType) {
        super(new InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f62829b = startType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof IDealFlowDestination) && Intrinsics.f(this.f62829b, ((IDealFlowDestination) obj2).f62829b);
    }

    public final int hashCode() {
        return this.f62829b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62829b, i);
    }
}
