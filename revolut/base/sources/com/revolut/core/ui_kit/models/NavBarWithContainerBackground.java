package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "Landroid/os/Parcelable;", "<init>", "()V", "ImageBackground", "VideoBackground", "TransparentBackground", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground$ImageBackground;", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground$TransparentBackground;", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground$VideoBackground;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class NavBarWithContainerBackground implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground$TransparentBackground;", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransparentBackground extends NavBarWithContainerBackground {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransparentBackground f57882a = new TransparentBackground();

        @NotNull
        public static final Parcelable.Creator<TransparentBackground> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransparentBackground.f57882a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransparentBackground[i];
            }
        }

        private TransparentBackground() {
        }

        @Override // com.revolut.core.ui_kit.models.NavBarWithContainerBackground
        /* JADX INFO: renamed from: a */
        public final Image getE() {
            ColorImage.INSTANCE.getClass();
            return ColorImage.Companion.a();
        }

        @Override // com.revolut.core.ui_kit.models.NavBarWithContainerBackground
        /* JADX INFO: renamed from: b */
        public final s8 getD() {
            return s8.DEFAULT;
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

    private NavBarWithContainerBackground() {
    }

    /* JADX INFO: renamed from: a */
    public abstract Image getE();

    /* JADX INFO: renamed from: b */
    public abstract s8 getD();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground$ImageBackground;", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ImageBackground extends NavBarWithContainerBackground {

        @NotNull
        public static final Parcelable.Creator<ImageBackground> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f57879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s8 f57880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f57881c;
        public final com.revolut.core.ui.models.Color d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ImageBackground((Image) parcel.readParcelable(ImageBackground.class.getClassLoader()), s8.valueOf(parcel.readString()), (Image) parcel.readParcelable(ImageBackground.class.getClassLoader()), (com.revolut.core.ui.models.Color) parcel.readParcelable(ImageBackground.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImageBackground[i];
            }
        }

        public ImageBackground(Image image, s8 paletteType, Image image2, com.revolut.core.ui.models.Color color) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(paletteType, "paletteType");
            this.f57879a = image;
            this.f57880b = paletteType;
            this.f57881c = image2;
            this.d = color;
        }

        @Override // com.revolut.core.ui_kit.models.NavBarWithContainerBackground
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Image getE() {
            return this.f57879a;
        }

        @Override // com.revolut.core.ui_kit.models.NavBarWithContainerBackground
        /* JADX INFO: renamed from: b, reason: from getter */
        public final s8 getD() {
            return this.f57880b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final com.revolut.core.ui.models.Color getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ImageBackground)) {
                return false;
            }
            ImageBackground imageBackground = (ImageBackground) obj2;
            return Intrinsics.f(this.f57879a, imageBackground.f57879a) && this.f57880b == imageBackground.f57880b && Intrinsics.f(this.f57881c, imageBackground.f57881c) && Intrinsics.f(this.d, imageBackground.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f57880b.hashCode() + (this.f57879a.hashCode() * 31)) * 31;
            Image image = this.f57881c;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            com.revolut.core.ui.models.Color color = this.d;
            return iHashCode2 + (color != null ? color.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57879a, i);
            dest.writeString(this.f57880b.name());
            dest.writeParcelable(this.f57881c, i);
            dest.writeParcelable(this.d, i);
        }

        public /* synthetic */ ImageBackground(Image image, s8 s8Var, Color.SolidRes solidRes, int i) {
            this(image, (i & 2) != 0 ? s8.DEFAULT : s8Var, (Image) null, (i & 8) != 0 ? null : solidRes);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground$VideoBackground;", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VideoBackground extends NavBarWithContainerBackground {

        @NotNull
        public static final Parcelable.Creator<VideoBackground> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Video f57883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f57884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final VideoShutter f57885c;
        public final s8 d;
        public final Image e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VideoBackground((Video) parcel.readParcelable(VideoBackground.class.getClassLoader()), (Image) parcel.readParcelable(VideoBackground.class.getClassLoader()), (VideoShutter) parcel.readParcelable(VideoBackground.class.getClassLoader()), s8.valueOf(parcel.readString()), (Image) parcel.readParcelable(VideoBackground.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoBackground[i];
            }
        }

        public VideoBackground(Video video, Image image, VideoShutter videoShutter, s8 paletteType, Image image2) {
            Intrinsics.checkNotNullParameter(video, "video");
            Intrinsics.checkNotNullParameter(paletteType, "paletteType");
            Intrinsics.checkNotNullParameter(image2, "image");
            this.f57883a = video;
            this.f57884b = image;
            this.f57885c = videoShutter;
            this.d = paletteType;
            this.e = image2;
        }

        @Override // com.revolut.core.ui_kit.models.NavBarWithContainerBackground
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Image getE() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit.models.NavBarWithContainerBackground
        /* JADX INFO: renamed from: b, reason: from getter */
        public final s8 getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VideoBackground)) {
                return false;
            }
            VideoBackground videoBackground = (VideoBackground) obj2;
            return Intrinsics.f(this.f57883a, videoBackground.f57883a) && Intrinsics.f(this.f57884b, videoBackground.f57884b) && Intrinsics.f(this.f57885c, videoBackground.f57885c) && this.d == videoBackground.d && Intrinsics.f(this.e, videoBackground.e);
        }

        public final int hashCode() {
            int iHashCode = this.f57883a.hashCode() * 31;
            Image image = this.f57884b;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            VideoShutter videoShutter = this.f57885c;
            return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (videoShutter != null ? videoShutter.hashCode() : 0)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57883a, i);
            dest.writeParcelable(this.f57884b, i);
            dest.writeParcelable(this.f57885c, i);
            dest.writeString(this.d.name());
            dest.writeParcelable(this.e, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ VideoBackground(Video video, Image image, VideoShutter videoShutter, s8 s8Var, int i) {
            Image imageA;
            Image image2 = (i & 2) != 0 ? null : image;
            VideoShutter videoShutter2 = (i & 4) != 0 ? null : videoShutter;
            s8 s8Var2 = (i & 8) != 0 ? s8.DEFAULT : s8Var;
            if (image2 == null) {
                ColorImage.INSTANCE.getClass();
                imageA = ColorImage.Companion.a();
            } else {
                imageA = image2;
            }
            this(video, image2, videoShutter2, s8Var2, imageA);
        }
    }
}
