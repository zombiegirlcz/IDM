package com.revolut.feature.stories.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/stories/models/PageBackground;", "Landroid/os/Parcelable;", "<init>", "()V", "SolidColor", "ImageSource", "VideoSource", "Lcom/revolut/feature/stories/models/PageBackground$ImageSource;", "Lcom/revolut/feature/stories/models/PageBackground$SolidColor;", "Lcom/revolut/feature/stories/models/PageBackground$VideoSource;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PageBackground implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/PageBackground$ImageSource;", "Lcom/revolut/feature/stories/models/PageBackground;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ImageSource extends PageBackground {

        @NotNull
        public static final Parcelable.Creator<ImageSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f88775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f88777c;

        /* JADX INFO: loaded from: classes7.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ImageSource(parcel.readInt(), (Image) parcel.readParcelable(ImageSource.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImageSource[i];
            }
        }

        public ImageSource(int i, Image image, boolean z) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f88775a = image;
            this.f88776b = i;
            this.f88777c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ImageSource)) {
                return false;
            }
            ImageSource imageSource = (ImageSource) obj2;
            return Intrinsics.f(this.f88775a, imageSource.f88775a) && this.f88776b == imageSource.f88776b && this.f88777c == imageSource.f88777c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f88777c) + j6.a.b(this.f88776b, this.f88775a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88775a, i);
            dest.writeInt(this.f88776b);
            dest.writeInt(this.f88777c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/PageBackground$SolidColor;", "Lcom/revolut/feature/stories/models/PageBackground;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SolidColor extends PageBackground {

        @NotNull
        public static final Parcelable.Creator<SolidColor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f88779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f88780c;

        /* JADX INFO: loaded from: classes7.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SolidColor(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SolidColor[i];
            }
        }

        public SolidColor(int i, boolean z, boolean z3) {
            this.f88778a = i;
            this.f88779b = z;
            this.f88780c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SolidColor)) {
                return false;
            }
            SolidColor solidColor = (SolidColor) obj2;
            return this.f88778a == solidColor.f88778a && this.f88779b == solidColor.f88779b && this.f88780c == solidColor.f88780c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f88780c) + j6.a.c(Integer.hashCode(this.f88778a) * 31, 31, this.f88779b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f88778a);
            dest.writeInt(this.f88779b ? 1 : 0);
            dest.writeInt(this.f88780c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/PageBackground$VideoSource;", "Lcom/revolut/feature/stories/models/PageBackground;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VideoSource extends PageBackground {

        @NotNull
        public static final Parcelable.Creator<VideoSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Video f88781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f88783c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Video video = (Video) parcel.readParcelable(VideoSource.class.getClassLoader());
                int i = parcel.readInt();
                boolean z4 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z6 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new VideoSource(video, i, z4, z6, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoSource[i];
            }
        }

        public VideoSource(Video video, int i, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(video, "video");
            this.f88781a = video;
            this.f88782b = i;
            this.f88783c = z;
            this.d = z3;
            this.e = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VideoSource)) {
                return false;
            }
            VideoSource videoSource = (VideoSource) obj2;
            return Intrinsics.f(this.f88781a, videoSource.f88781a) && this.f88782b == videoSource.f88782b && this.f88783c == videoSource.f88783c && this.d == videoSource.d && this.e == videoSource.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.b(this.f88782b, this.f88781a.hashCode() * 31, 31), 31, this.f88783c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88781a, i);
            dest.writeInt(this.f88782b);
            dest.writeInt(this.f88783c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    private PageBackground() {
    }
}
