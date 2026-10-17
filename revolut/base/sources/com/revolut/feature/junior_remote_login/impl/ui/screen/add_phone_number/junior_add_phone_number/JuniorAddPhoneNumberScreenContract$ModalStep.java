package com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/junior_remote_login/impl/ui/screen/add_phone_number/junior_add_phone_number/JuniorAddPhoneNumberScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ChangeCountryCode", "PersonalDataConsentConfirmation", "Lcom/revolut/feature/junior_remote_login/impl/ui/screen/add_phone_number/junior_add_phone_number/JuniorAddPhoneNumberScreenContract$ModalStep$ChangeCountryCode;", "Lcom/revolut/feature/junior_remote_login/impl/ui/screen/add_phone_number/junior_add_phone_number/JuniorAddPhoneNumberScreenContract$ModalStep$PersonalDataConsentConfirmation;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorAddPhoneNumberScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/screen/add_phone_number/junior_add_phone_number/JuniorAddPhoneNumberScreenContract$ModalStep$ChangeCountryCode;", "Lcom/revolut/feature/junior_remote_login/impl/ui/screen/add_phone_number/junior_add_phone_number/JuniorAddPhoneNumberScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeCountryCode extends JuniorAddPhoneNumberScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ChangeCountryCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77202a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeCountryCode(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeCountryCode[i];
            }
        }

        public ChangeCountryCode(String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f77202a = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeCountryCode) && Intrinsics.f(this.f77202a, ((ChangeCountryCode) obj2).f77202a);
        }

        public final int hashCode() {
            return this.f77202a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77202a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/screen/add_phone_number/junior_add_phone_number/JuniorAddPhoneNumberScreenContract$ModalStep$PersonalDataConsentConfirmation;", "Lcom/revolut/feature/junior_remote_login/impl/ui/screen/add_phone_number/junior_add_phone_number/JuniorAddPhoneNumberScreenContract$ModalStep;", "<init>", "()V", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PersonalDataConsentConfirmation extends JuniorAddPhoneNumberScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PersonalDataConsentConfirmation f77203a = new PersonalDataConsentConfirmation();

        @NotNull
        public static final Parcelable.Creator<PersonalDataConsentConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PersonalDataConsentConfirmation.f77203a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalDataConsentConfirmation[i];
            }
        }

        private PersonalDataConsentConfirmation() {
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

    private JuniorAddPhoneNumberScreenContract$ModalStep() {
    }
}
