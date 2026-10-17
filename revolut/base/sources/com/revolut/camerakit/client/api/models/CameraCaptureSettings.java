package com.revolut.camerakit.client.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.camerakit.client.api.models.PhotoCompressionQuality;
import com.revolut.camerakit.client.api.models.PhotoMaximumResolution;
import com.revolut.camerakit.client.api.models.PhotoTiming;
import com.revolut.camerakit.core.settings.VideoEncodingBitRate;
import com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings;
import com.revolut.camerakit.core.settings.WatermarkSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yw.j;
import yw.n;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings;", "Landroid/os/Parcelable;", "Photo", "Video", "Compound", "FaceEmbedding", "CompactSelfie", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$CompactSelfie;", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$Compound;", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$FaceEmbedding;", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$Photo;", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$Video;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CameraCaptureSettings extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$CompactSelfie;", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CompactSelfie implements CameraCaptureSettings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CompactSelfie f50693a = new CompactSelfie();

        @NotNull
        public static final Parcelable.Creator<CompactSelfie> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CompactSelfie.f50693a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CompactSelfie[i];
            }
        }

        private CompactSelfie() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$Compound;", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings;", "", "toString", "()Ljava/lang/String;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Compound implements CameraCaptureSettings {

        @NotNull
        public static final Parcelable.Creator<Compound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Photo f50694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Video f50695b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Compound(Photo.CREATOR.createFromParcel(parcel), Video.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Compound[i];
            }
        }

        public Compound(Photo photo, Video video) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            Intrinsics.checkNotNullParameter(video, "video");
            this.f50694a = photo;
            this.f50695b = video;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Compound)) {
                return false;
            }
            Compound compound = (Compound) obj2;
            return Intrinsics.f(this.f50694a, compound.f50694a) && Intrinsics.f(this.f50695b, compound.f50695b);
        }

        public final int hashCode() {
            return this.f50695b.hashCode() + (this.f50694a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f50694a.writeToParcel(dest, i);
            this.f50695b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$FaceEmbedding;", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings;", "<init>", "()V", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FaceEmbedding implements CameraCaptureSettings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FaceEmbedding f50696a = new FaceEmbedding();

        @NotNull
        public static final Parcelable.Creator<FaceEmbedding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FaceEmbedding.f50696a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FaceEmbedding[i];
            }
        }

        private FaceEmbedding() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$Photo;", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Photo implements CameraCaptureSettings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PhotoTiming f50698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PhotoCompressionQuality f50699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PhotoMaximumResolution f50700c;
        public final String d;
        public final j e;
        public final WatermarkSettings f;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Photo> CREATOR = new b();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Photo f50697g = new Photo(PhotoTiming.Unspecified.f50732a, PhotoCompressionQuality.Default.f50729a, PhotoMaximumResolution.Default.f50731a, null, j.LOSSY, new WatermarkSettings());

        /* JADX INFO: renamed from: com.revolut.camerakit.client.api.models.CameraCaptureSettings$Photo$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Photo((PhotoTiming) parcel.readParcelable(Photo.class.getClassLoader()), (PhotoCompressionQuality) parcel.readParcelable(Photo.class.getClassLoader()), (PhotoMaximumResolution) parcel.readParcelable(Photo.class.getClassLoader()), parcel.readString(), j.valueOf(parcel.readString()), (WatermarkSettings) parcel.readParcelable(Photo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Photo[i];
            }
        }

        public Photo(PhotoTiming timing, PhotoCompressionQuality compressionQuality, PhotoMaximumResolution maximumResolution, String str, j compressionType, WatermarkSettings watermarkSettings) {
            Intrinsics.checkNotNullParameter(timing, "timing");
            Intrinsics.checkNotNullParameter(compressionQuality, "compressionQuality");
            Intrinsics.checkNotNullParameter(maximumResolution, "maximumResolution");
            Intrinsics.checkNotNullParameter(compressionType, "compressionType");
            Intrinsics.checkNotNullParameter(watermarkSettings, "watermarkSettings");
            this.f50698a = timing;
            this.f50699b = compressionQuality;
            this.f50700c = maximumResolution;
            this.d = str;
            this.e = compressionType;
            this.f = watermarkSettings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) obj2;
            return Intrinsics.f(this.f50698a, photo.f50698a) && Intrinsics.f(this.f50699b, photo.f50699b) && Intrinsics.f(this.f50700c, photo.f50700c) && Intrinsics.f(this.d, photo.d) && this.e == photo.e && Intrinsics.f(this.f, photo.f);
        }

        public final int hashCode() {
            int iHashCode = (this.f50700c.hashCode() + ((this.f50699b.hashCode() + (this.f50698a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50698a, i);
            dest.writeParcelable(this.f50699b, i);
            dest.writeParcelable(this.f50700c, i);
            dest.writeString(this.d);
            dest.writeString(this.e.name());
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings$Video;", "Lcom/revolut/camerakit/client/api/models/CameraCaptureSettings;", "", "toString", "()Ljava/lang/String;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Video implements CameraCaptureSettings {

        @NotNull
        public static final Parcelable.Creator<Video> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VideoDuration f50701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final VideoEncodingBitRate f50703c;
        public final boolean d;
        public final boolean e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final n f50704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final VideoImuDataCollectionSettings f50705h;
        public final WatermarkSettings i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Video((VideoDuration) parcel.readParcelable(Video.class.getClassLoader()), parcel.readInt(), (VideoEncodingBitRate) parcel.readParcelable(Video.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), n.valueOf(parcel.readString()), (VideoImuDataCollectionSettings) parcel.readParcelable(Video.class.getClassLoader()), (WatermarkSettings) parcel.readParcelable(Video.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Video[i];
            }
        }

        public Video(VideoDuration duration, int i, VideoEncodingBitRate encodingBitRate, boolean z, boolean z3, String str, n storagePolicy, VideoImuDataCollectionSettings imuDataCollectionSettings, WatermarkSettings watermarkSettings) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(encodingBitRate, "encodingBitRate");
            Intrinsics.checkNotNullParameter(storagePolicy, "storagePolicy");
            Intrinsics.checkNotNullParameter(imuDataCollectionSettings, "imuDataCollectionSettings");
            Intrinsics.checkNotNullParameter(watermarkSettings, "watermarkSettings");
            this.f50701a = duration;
            this.f50702b = i;
            this.f50703c = encodingBitRate;
            this.d = z;
            this.e = z3;
            this.f = str;
            this.f50704g = storagePolicy;
            this.f50705h = imuDataCollectionSettings;
            this.i = watermarkSettings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Video)) {
                return false;
            }
            Video video = (Video) obj2;
            return Intrinsics.f(this.f50701a, video.f50701a) && this.f50702b == video.f50702b && Intrinsics.f(this.f50703c, video.f50703c) && this.d == video.d && this.e == video.e && Intrinsics.f(this.f, video.f) && this.f50704g == video.f50704g && Intrinsics.f(this.f50705h, video.f50705h) && Intrinsics.f(this.i, video.i);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c((this.f50703c.hashCode() + j6.a.b(this.f50702b, this.f50701a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e);
            String str = this.f;
            return this.i.hashCode() + ((this.f50705h.hashCode() + ((this.f50704g.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50701a, i);
            dest.writeInt(this.f50702b);
            dest.writeParcelable(this.f50703c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeString(this.f);
            dest.writeString(this.f50704g.name());
            dest.writeParcelable(this.f50705h, i);
            dest.writeParcelable(this.i, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Video(VideoDuration videoDuration, int i, VideoEncodingBitRate videoEncodingBitRate, boolean z, String str, n nVar, VideoImuDataCollectionSettings videoImuDataCollectionSettings, WatermarkSettings watermarkSettings, int i2) {
            VideoImuDataCollectionSettings videoImuDataCollectionSettings2;
            String str2 = (i2 & 32) != 0 ? null : str;
            n nVar2 = (i2 & 64) != 0 ? n.FILE : nVar;
            if ((i2 & 128) != 0) {
                VideoImuDataCollectionSettings.INSTANCE.getClass();
                videoImuDataCollectionSettings2 = VideoImuDataCollectionSettings.f50742c;
            } else {
                videoImuDataCollectionSettings2 = videoImuDataCollectionSettings;
            }
            this(videoDuration, i, videoEncodingBitRate, z, false, str2, nVar2, videoImuDataCollectionSettings2, (i2 & 256) != 0 ? new WatermarkSettings() : watermarkSettings);
        }
    }
}
