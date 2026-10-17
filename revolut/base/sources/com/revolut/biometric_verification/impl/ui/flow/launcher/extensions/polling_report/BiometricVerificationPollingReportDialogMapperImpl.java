package com.revolut.biometric_verification.impl.ui.flow.launcher.extensions.polling_report;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BiometricVerificationPollingReportDialogMapperImpl {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/flow/launcher/extensions/polling_report/BiometricVerificationPollingReportDialogMapperImpl$PollingDefaultErrorDialogPayload;", "Landroid/os/Parcelable;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PollingDefaultErrorDialogPayload implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PollingDefaultErrorDialogPayload f50490a = new PollingDefaultErrorDialogPayload();

        @NotNull
        public static final Parcelable.Creator<PollingDefaultErrorDialogPayload> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PollingDefaultErrorDialogPayload.f50490a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PollingDefaultErrorDialogPayload[i];
            }
        }

        private PollingDefaultErrorDialogPayload() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/flow/launcher/extensions/polling_report/BiometricVerificationPollingReportDialogMapperImpl$PollingGenericErrorDialogPayload;", "Landroid/os/Parcelable;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PollingGenericErrorDialogPayload implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PollingGenericErrorDialogPayload f50491a = new PollingGenericErrorDialogPayload();

        @NotNull
        public static final Parcelable.Creator<PollingGenericErrorDialogPayload> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PollingGenericErrorDialogPayload.f50491a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PollingGenericErrorDialogPayload[i];
            }
        }

        private PollingGenericErrorDialogPayload() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/flow/launcher/extensions/polling_report/BiometricVerificationPollingReportDialogMapperImpl$PollingSuccessDialogPayload;", "Landroid/os/Parcelable;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PollingSuccessDialogPayload implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PollingSuccessDialogPayload f50492a = new PollingSuccessDialogPayload();

        @NotNull
        public static final Parcelable.Creator<PollingSuccessDialogPayload> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PollingSuccessDialogPayload.f50492a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PollingSuccessDialogPayload[i];
            }
        }

        private PollingSuccessDialogPayload() {
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
