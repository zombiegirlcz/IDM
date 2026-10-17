package com.revolut.core.ui_kit_core.displayers.image.models;

import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable;", "Landroid/os/Parcelable;", "<init>", "()V", "Gradient", "ResDrawable", "AnimatedGradientDrawable", "Shimmering", "ImagePlaceholder", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$AnimatedGradientDrawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Gradient;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$ImagePlaceholder;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$ResDrawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UrlImageDrawable implements Parcelable {

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$AnimatedGradientDrawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnimatedGradientDrawable extends UrlImageDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnimatedGradientDrawable f60035a = new AnimatedGradientDrawable();

        @NotNull
        public static final Parcelable.Creator<AnimatedGradientDrawable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnimatedGradientDrawable.f60035a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnimatedGradientDrawable[i];
            }
        }

        private AnimatedGradientDrawable() {
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

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Gradient;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gradient extends UrlImageDrawable {

        @NotNull
        public static final Parcelable.Creator<Gradient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GradientDrawable.Orientation f60038c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gradient(parcel.readInt(), parcel.readInt(), GradientDrawable.Orientation.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gradient[i];
            }
        }

        public Gradient(int i, int i2, GradientDrawable.Orientation orientation) {
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.f60036a = i;
            this.f60037b = i2;
            this.f60038c = orientation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF60037b() {
            return this.f60037b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GradientDrawable.Orientation getF60038c() {
            return this.f60038c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF60036a() {
            return this.f60036a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) obj2;
            return this.f60036a == gradient.f60036a && this.f60037b == gradient.f60037b && this.f60038c == gradient.f60038c;
        }

        public final int hashCode() {
            return this.f60038c.hashCode() + j6.a.b(this.f60037b, Integer.hashCode(this.f60036a) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f60036a);
            dest.writeInt(this.f60037b);
            dest.writeString(this.f60038c.name());
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$ImagePlaceholder;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ImagePlaceholder extends UrlImageDrawable {

        @NotNull
        public static final Parcelable.Creator<ImagePlaceholder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f60039a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ImagePlaceholder((Image) parcel.readParcelable(ImagePlaceholder.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImagePlaceholder[i];
            }
        }

        public ImagePlaceholder(Image image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f60039a = image;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Image getF60039a() {
            return this.f60039a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ImagePlaceholder) && Intrinsics.f(this.f60039a, ((ImagePlaceholder) obj2).f60039a);
        }

        public final int hashCode() {
            return this.f60039a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60039a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable;", "<init>", "()V", "Transformable", "Chip", "Companion", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering$Chip;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering$Companion;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering$Transformable;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Shimmering extends UrlImageDrawable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: loaded from: classes20.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering$Chip;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Chip extends Shimmering {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Chip f60042a = new Chip();

            @NotNull
            public static final Parcelable.Creator<Chip> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Chip.f60042a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Chip[i];
                }
            }

            private Chip() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering$Companion;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion extends Shimmering {

            @NotNull
            public static final Parcelable.Creator<Companion> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Shimmering.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Companion[i];
                }
            }

            private Companion() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering$Transformable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$Shimmering;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Transformable extends Shimmering {

            @NotNull
            public static final Parcelable.Creator<Transformable> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ImageTransformations f60043a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Transformable(ImageTransformations.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Transformable[i];
                }
            }

            public Transformable(ImageTransformations defaultTransformation) {
                Intrinsics.checkNotNullParameter(defaultTransformation, "defaultTransformation");
                this.f60043a = defaultTransformation;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Transformable) && Intrinsics.f(this.f60043a, ((Transformable) obj2).f60043a);
            }

            public final int hashCode() {
                return this.f60043a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f60043a.writeToParcel(dest, i);
            }
        }

        private Shimmering() {
        }
    }

    private UrlImageDrawable() {
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable$ResDrawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImageDrawable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResDrawable extends UrlImageDrawable {

        @NotNull
        public static final Parcelable.Creator<ResDrawable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f60041b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResDrawable(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResDrawable[i];
            }
        }

        public ResDrawable(int i, Integer num) {
            this.f60040a = i;
            this.f60041b = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getF60041b() {
            return this.f60041b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF60040a() {
            return this.f60040a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ResDrawable)) {
                return false;
            }
            ResDrawable resDrawable = (ResDrawable) obj2;
            return this.f60040a == resDrawable.f60040a && Intrinsics.f(this.f60041b, resDrawable.f60041b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f60040a) * 31;
            Integer num = this.f60041b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f60040a);
            Integer num = this.f60041b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public /* synthetic */ ResDrawable(int i) {
            this(i, null);
        }
    }
}
