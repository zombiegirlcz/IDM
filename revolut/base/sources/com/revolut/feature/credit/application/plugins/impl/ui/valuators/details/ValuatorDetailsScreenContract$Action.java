package com.revolut.feature.credit.application.plugins.impl.ui.valuators.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action", "Landroid/os/Parcelable;", "ShowMap", "Call", "OpenBrowser", "SendEmail", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action$Call;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action$OpenBrowser;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action$SendEmail;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action$ShowMap;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ValuatorDetailsScreenContract$Action extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action$Call;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Call implements ValuatorDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<Call> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68500a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Call(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Call[i];
            }
        }

        public Call(String phoneNumber) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f68500a = phoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Call) && Intrinsics.f(this.f68500a, ((Call) obj2).f68500a);
        }

        public final int hashCode() {
            return this.f68500a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68500a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action$OpenBrowser;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenBrowser implements ValuatorDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<OpenBrowser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68501a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenBrowser(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenBrowser[i];
            }
        }

        public OpenBrowser(String websiteLink) {
            Intrinsics.checkNotNullParameter(websiteLink, "websiteLink");
            this.f68501a = websiteLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenBrowser) && Intrinsics.f(this.f68501a, ((OpenBrowser) obj2).f68501a);
        }

        public final int hashCode() {
            return this.f68501a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68501a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action$SendEmail;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SendEmail implements ValuatorDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<SendEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68502a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SendEmail(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SendEmail[i];
            }
        }

        public SendEmail(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f68502a = email;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SendEmail) && Intrinsics.f(this.f68502a, ((SendEmail) obj2).f68502a);
        }

        public final int hashCode() {
            return this.f68502a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68502a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action$ShowMap;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowMap implements ValuatorDetailsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<ShowMap> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final co3.a f68503a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowMap((co3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowMap[i];
            }
        }

        public ShowMap(co3.a location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f68503a = location;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowMap) && Intrinsics.f(this.f68503a, ((ShowMap) obj2).f68503a);
        }

        public final int hashCode() {
            return this.f68503a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68503a);
        }
    }
}
