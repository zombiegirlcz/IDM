package com.revolut.biometric_verification.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/api/navigation/BiometricVerificationFlowProvider$LoadingType", "Landroid/os/Parcelable;", "NoLoading", "Loading", "Lcom/revolut/biometric_verification/api/navigation/BiometricVerificationFlowProvider$LoadingType$Loading;", "Lcom/revolut/biometric_verification/api/navigation/BiometricVerificationFlowProvider$LoadingType$NoLoading;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationFlowProvider$LoadingType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/api/navigation/BiometricVerificationFlowProvider$LoadingType$Loading;", "Lcom/revolut/biometric_verification/api/navigation/BiometricVerificationFlowProvider$LoadingType;", "<init>", "()V", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements BiometricVerificationFlowProvider$LoadingType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f50457a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f50457a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/api/navigation/BiometricVerificationFlowProvider$LoadingType$NoLoading;", "Lcom/revolut/biometric_verification/api/navigation/BiometricVerificationFlowProvider$LoadingType;", "<init>", "()V", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoLoading implements BiometricVerificationFlowProvider$LoadingType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoLoading f50458a = new NoLoading();

        @NotNull
        public static final Parcelable.Creator<NoLoading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoLoading.f50458a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoLoading[i];
            }
        }

        private NoLoading() {
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
