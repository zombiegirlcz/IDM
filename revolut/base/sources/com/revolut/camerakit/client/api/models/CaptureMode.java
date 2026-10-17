package com.revolut.camerakit.client.api.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CaptureMode;", "Landroid/os/Parcelable;", "AutoCapture", "DetectedManualCapture", "ManualCapture", "AutoCaptureTimeout", "Lcom/revolut/camerakit/client/api/models/CaptureMode$AutoCapture;", "Lcom/revolut/camerakit/client/api/models/CaptureMode$AutoCaptureTimeout;", "Lcom/revolut/camerakit/client/api/models/CaptureMode$DetectedManualCapture;", "Lcom/revolut/camerakit/client/api/models/CaptureMode$ManualCapture;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CaptureMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CaptureMode$AutoCapture;", "Lcom/revolut/camerakit/client/api/models/CaptureMode;", "", "toString", "()Ljava/lang/String;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoCapture implements CaptureMode {

        @NotNull
        public static final Parcelable.Creator<AutoCapture> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f50713b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoCapture(parcel.readInt() != 0, parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoCapture[i];
            }
        }

        public AutoCapture() {
            this(3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoCapture)) {
                return false;
            }
            AutoCapture autoCapture = (AutoCapture) obj2;
            return this.f50712a == autoCapture.f50712a && this.f50713b == autoCapture.f50713b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f50713b) + (Boolean.hashCode(this.f50712a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f50712a ? 1 : 0);
            dest.writeLong(this.f50713b);
        }

        public /* synthetic */ AutoCapture(int i) {
            this((i & 1) == 0, 0L);
        }

        public AutoCapture(boolean z, long j2) {
            this.f50712a = z;
            this.f50713b = j2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CaptureMode$AutoCaptureTimeout;", "Lcom/revolut/camerakit/client/api/models/CaptureMode;", "", "toString", "()Ljava/lang/String;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoCaptureTimeout implements CaptureMode {

        @NotNull
        public static final Parcelable.Creator<AutoCaptureTimeout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f50714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f50715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f50716c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoCaptureTimeout(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoCaptureTimeout[i];
            }
        }

        public /* synthetic */ AutoCaptureTimeout(long j2) {
            this(j2, 1000L, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoCaptureTimeout)) {
                return false;
            }
            AutoCaptureTimeout autoCaptureTimeout = (AutoCaptureTimeout) obj2;
            return this.f50714a == autoCaptureTimeout.f50714a && this.f50715b == autoCaptureTimeout.f50715b && this.f50716c == autoCaptureTimeout.f50716c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50716c) + d.c(Long.hashCode(this.f50714a) * 31, 31, this.f50715b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f50714a);
            dest.writeLong(this.f50715b);
            dest.writeInt(this.f50716c ? 1 : 0);
        }

        public AutoCaptureTimeout(long j2, long j3, boolean z) {
            this.f50714a = j2;
            this.f50715b = j3;
            this.f50716c = z;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CaptureMode$DetectedManualCapture;", "Lcom/revolut/camerakit/client/api/models/CaptureMode;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DetectedManualCapture implements CaptureMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DetectedManualCapture f50717a = new DetectedManualCapture();

        @NotNull
        public static final Parcelable.Creator<DetectedManualCapture> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DetectedManualCapture.f50717a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetectedManualCapture[i];
            }
        }

        private DetectedManualCapture() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CaptureMode$ManualCapture;", "Lcom/revolut/camerakit/client/api/models/CaptureMode;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManualCapture implements CaptureMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManualCapture f50718a = new ManualCapture();

        @NotNull
        public static final Parcelable.Creator<ManualCapture> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManualCapture.f50718a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManualCapture[i];
            }
        }

        private ManualCapture() {
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
