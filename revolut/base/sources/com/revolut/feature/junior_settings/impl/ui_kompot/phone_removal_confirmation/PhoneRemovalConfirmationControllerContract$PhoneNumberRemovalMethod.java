package com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/phone_removal_confirmation/PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod", "Landroid/os/Parcelable;", "RemoteLoginInvitation", "Profile", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/phone_removal_confirmation/PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod$Profile;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/phone_removal_confirmation/PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod$RemoteLoginInvitation;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/phone_removal_confirmation/PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod$Profile;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/phone_removal_confirmation/PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Profile implements PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod {

        @NotNull
        public static final Parcelable.Creator<Profile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77310a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Profile(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Profile[i];
            }
        }

        public Profile(String juniorPhoneNumber) {
            Intrinsics.checkNotNullParameter(juniorPhoneNumber, "juniorPhoneNumber");
            this.f77310a = juniorPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Profile) && Intrinsics.f(this.f77310a, ((Profile) obj2).f77310a);
        }

        public final int hashCode() {
            return this.f77310a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77310a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/phone_removal_confirmation/PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod$RemoteLoginInvitation;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/phone_removal_confirmation/PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoteLoginInvitation implements PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod {

        @NotNull
        public static final Parcelable.Creator<RemoteLoginInvitation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77311a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoteLoginInvitation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoteLoginInvitation[i];
            }
        }

        public RemoteLoginInvitation(String juniorPhoneNumber) {
            Intrinsics.checkNotNullParameter(juniorPhoneNumber, "juniorPhoneNumber");
            this.f77311a = juniorPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemoteLoginInvitation) && Intrinsics.f(this.f77311a, ((RemoteLoginInvitation) obj2).f77311a);
        }

        public final int hashCode() {
            return this.f77311a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77311a);
        }
    }
}
