package com.revolut.feature_trustdock_ic_chip_api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput;", "Landroid/os/Parcelable;", "<init>", "()V", "Completed", "Cancelled", "DeviceNotSupported", "ServiceUnavailable", "NetworkError", "VerificationFailed", "CameraPermissionRequired", "UnknownError", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$CameraPermissionRequired;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$Cancelled;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$Completed;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$DeviceNotSupported;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$NetworkError;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$ServiceUnavailable;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$UnknownError;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$VerificationFailed;", "feature_trustdock_ic_chip_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TrustdockIcChipSdkOutput implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$CameraPermissionRequired;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput;", "<init>", "()V", "feature_trustdock_ic_chip_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CameraPermissionRequired extends TrustdockIcChipSdkOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CameraPermissionRequired f98143a = new CameraPermissionRequired();

        @NotNull
        public static final Parcelable.Creator<CameraPermissionRequired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CameraPermissionRequired.f98143a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CameraPermissionRequired[i];
            }
        }

        private CameraPermissionRequired() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$Cancelled;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput;", "<init>", "()V", "feature_trustdock_ic_chip_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancelled extends TrustdockIcChipSdkOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancelled f98144a = new Cancelled();

        @NotNull
        public static final Parcelable.Creator<Cancelled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancelled.f98144a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancelled[i];
            }
        }

        private Cancelled() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$Completed;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput;", "", "toString", "()Ljava/lang/String;", "feature_trustdock_ic_chip_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Completed extends TrustdockIcChipSdkOutput {

        @NotNull
        public static final Parcelable.Creator<Completed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98145a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Completed(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Completed[i];
            }
        }

        public Completed(String verificationId) {
            Intrinsics.checkNotNullParameter(verificationId, "verificationId");
            this.f98145a = verificationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Completed) && Intrinsics.f(this.f98145a, ((Completed) obj2).f98145a);
        }

        public final int hashCode() {
            return this.f98145a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98145a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$DeviceNotSupported;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput;", "<init>", "()V", "feature_trustdock_ic_chip_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeviceNotSupported extends TrustdockIcChipSdkOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeviceNotSupported f98146a = new DeviceNotSupported();

        @NotNull
        public static final Parcelable.Creator<DeviceNotSupported> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeviceNotSupported.f98146a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeviceNotSupported[i];
            }
        }

        private DeviceNotSupported() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$NetworkError;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput;", "<init>", "()V", "feature_trustdock_ic_chip_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NetworkError extends TrustdockIcChipSdkOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NetworkError f98147a = new NetworkError();

        @NotNull
        public static final Parcelable.Creator<NetworkError> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NetworkError.f98147a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NetworkError[i];
            }
        }

        private NetworkError() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$ServiceUnavailable;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput;", "<init>", "()V", "feature_trustdock_ic_chip_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ServiceUnavailable extends TrustdockIcChipSdkOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ServiceUnavailable f98148a = new ServiceUnavailable();

        @NotNull
        public static final Parcelable.Creator<ServiceUnavailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ServiceUnavailable.f98148a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ServiceUnavailable[i];
            }
        }

        private ServiceUnavailable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$UnknownError;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput;", "<init>", "()V", "feature_trustdock_ic_chip_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnknownError extends TrustdockIcChipSdkOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownError f98149a = new UnknownError();

        @NotNull
        public static final Parcelable.Creator<UnknownError> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnknownError.f98149a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnknownError[i];
            }
        }

        private UnknownError() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput$VerificationFailed;", "Lcom/revolut/feature_trustdock_ic_chip_api/TrustdockIcChipSdkOutput;", "<init>", "()V", "feature_trustdock_ic_chip_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VerificationFailed extends TrustdockIcChipSdkOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VerificationFailed f98150a = new VerificationFailed();

        @NotNull
        public static final Parcelable.Creator<VerificationFailed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VerificationFailed.f98150a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VerificationFailed[i];
            }
        }

        private VerificationFailed() {
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

    private TrustdockIcChipSdkOutput() {
    }
}
