package com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction", "Landroid/os/Parcelable;", "NotApplicable", "Remove", "Keep", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction$Keep;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction$NotApplicable;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction$Remove;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LogoutConfirmationControllerContract$PhoneNumberRemovalAction extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction$Keep;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction;", "<init>", "()V", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Keep implements LogoutConfirmationControllerContract$PhoneNumberRemovalAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Keep f77301a = new Keep();

        @NotNull
        public static final Parcelable.Creator<Keep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Keep.f77301a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Keep[i];
            }
        }

        private Keep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction$NotApplicable;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction;", "<init>", "()V", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotApplicable implements LogoutConfirmationControllerContract$PhoneNumberRemovalAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotApplicable f77302a = new NotApplicable();

        @NotNull
        public static final Parcelable.Creator<NotApplicable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotApplicable.f77302a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotApplicable[i];
            }
        }

        private NotApplicable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction$Remove;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/logout_confirmation/LogoutConfirmationControllerContract$PhoneNumberRemovalAction;", "<init>", "()V", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Remove implements LogoutConfirmationControllerContract$PhoneNumberRemovalAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Remove f77303a = new Remove();

        @NotNull
        public static final Parcelable.Creator<Remove> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Remove.f77303a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remove[i];
            }
        }

        private Remove() {
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
