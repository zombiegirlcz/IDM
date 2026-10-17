package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Type", "ColorType", "Layer", "IconLayer", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrCodeAppearance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QrCodeAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f59970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorType f59971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorType f59972c;
    public final Layer d;
    public final float e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$ColorType;", "Landroid/os/Parcelable;", "ColorAbsolute", "ColorAttr", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$ColorType$ColorAbsolute;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$ColorType$ColorAttr;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ColorType implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$ColorType$ColorAbsolute;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$ColorType;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ColorAbsolute extends ColorType {

            @NotNull
            public static final Parcelable.Creator<ColorAbsolute> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59973a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ColorAbsolute(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ColorAbsolute[i];
                }
            }

            public ColorAbsolute(int i) {
                this.f59973a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF59973a() {
                return this.f59973a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ColorAbsolute) && this.f59973a == ((ColorAbsolute) obj2).f59973a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f59973a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59973a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$ColorType$ColorAttr;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$ColorType;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ColorAttr extends ColorType {

            @NotNull
            public static final Parcelable.Creator<ColorAttr> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59974a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ColorAttr(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ColorAttr[i];
                }
            }

            public ColorAttr(int i) {
                this.f59974a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF59974a() {
                return this.f59974a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ColorAttr) && this.f59974a == ((ColorAttr) obj2).f59974a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f59974a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59974a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer;", "Landroid/os/Parcelable;", "<init>", "()V", "ColorAbsolute", "ColorAttr", "DrawableResource", "Image", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer$ColorAbsolute;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer$ColorAttr;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer$DrawableResource;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer$Image;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Layer implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer$ColorAbsolute;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ColorAbsolute extends Layer {

            @NotNull
            public static final Parcelable.Creator<ColorAbsolute> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59979a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ColorAbsolute(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ColorAbsolute[i];
                }
            }

            public ColorAbsolute(int i) {
                this.f59979a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF59979a() {
                return this.f59979a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ColorAbsolute) && this.f59979a == ((ColorAbsolute) obj2).f59979a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f59979a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59979a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer$ColorAttr;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ColorAttr extends Layer {

            @NotNull
            public static final Parcelable.Creator<ColorAttr> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59980a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ColorAttr(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ColorAttr[i];
                }
            }

            public ColorAttr(int i) {
                this.f59980a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF59980a() {
                return this.f59980a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ColorAttr) && this.f59980a == ((ColorAttr) obj2).f59980a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f59980a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59980a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer$DrawableResource;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DrawableResource extends Layer {

            @NotNull
            public static final Parcelable.Creator<DrawableResource> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59981a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f59982b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DrawableResource(parcel.readInt(), parcel.readFloat());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DrawableResource[i];
                }
            }

            public DrawableResource(int i, float f) {
                this.f59981a = i;
                this.f59982b = f;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getF59982b() {
                return this.f59982b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getF59981a() {
                return this.f59981a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DrawableResource)) {
                    return false;
                }
                DrawableResource drawableResource = (DrawableResource) obj2;
                return this.f59981a == drawableResource.f59981a && Float.compare(this.f59982b, drawableResource.f59982b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f59982b) + (Integer.hashCode(this.f59981a) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59981a);
                dest.writeFloat(this.f59982b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer$Image;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Layer;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Image extends Layer {

            @NotNull
            public static final Parcelable.Creator<Image> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.revolut.core.ui_kit_core.displayers.image.Image f59983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f59984b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Image((com.revolut.core.ui_kit_core.displayers.image.Image) parcel.readParcelable(Image.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Image[i];
                }
            }

            public Image(com.revolut.core.ui_kit_core.displayers.image.Image image, boolean z) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.f59983a = image;
                this.f59984b = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF59984b() {
                return this.f59984b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final com.revolut.core.ui_kit_core.displayers.image.Image getF59983a() {
                return this.f59983a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj2;
                return Intrinsics.f(this.f59983a, image.f59983a) && this.f59984b == image.f59984b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f59984b) + (this.f59983a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f59983a, i);
                dest.writeInt(this.f59984b ? 1 : 0);
            }
        }

        private Layer() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QrCodeAppearance((Type) parcel.readParcelable(QrCodeAppearance.class.getClassLoader()), (ColorType) parcel.readParcelable(QrCodeAppearance.class.getClassLoader()), (ColorType) parcel.readParcelable(QrCodeAppearance.class.getClassLoader()), (Layer) parcel.readParcelable(QrCodeAppearance.class.getClassLoader()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrCodeAppearance[i];
        }
    }

    public QrCodeAppearance(Type type, ColorType dataColor, ColorType blankColor, Layer backgroundLayer, float f) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(dataColor, "dataColor");
        Intrinsics.checkNotNullParameter(blankColor, "blankColor");
        Intrinsics.checkNotNullParameter(backgroundLayer, "backgroundLayer");
        this.f59970a = type;
        this.f59971b = dataColor;
        this.f59972c = blankColor;
        this.d = backgroundLayer;
        this.e = f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Layer getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ColorType getF59972c() {
        return this.f59972c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ColorType getF59971b() {
        return this.f59971b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QrCodeAppearance)) {
            return false;
        }
        QrCodeAppearance qrCodeAppearance = (QrCodeAppearance) obj2;
        return Intrinsics.f(this.f59970a, qrCodeAppearance.f59970a) && Intrinsics.f(this.f59971b, qrCodeAppearance.f59971b) && Intrinsics.f(this.f59972c, qrCodeAppearance.f59972c) && Intrinsics.f(this.d, qrCodeAppearance.d) && Float.compare(this.e, qrCodeAppearance.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + ((this.f59972c.hashCode() + ((this.f59971b.hashCode() + (this.f59970a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f59970a, i);
        dest.writeParcelable(this.f59971b, i);
        dest.writeParcelable(this.f59972c, i);
        dest.writeParcelable(this.d, i);
        dest.writeFloat(this.e);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Type;", "Landroid/os/Parcelable;", "Classic", "Rounded", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Type$Classic;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Type$Rounded;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Type extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Type$Classic;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Type;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final /* data */ class Classic implements Type {

            @NotNull
            public static final Parcelable.Creator<Classic> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IconLayer f59985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f59986b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Classic(parcel.readInt() == 0 ? null : IconLayer.CREATOR.createFromParcel(parcel), parcel.readFloat());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Classic[i];
                }
            }

            public Classic(IconLayer iconLayer, float f) {
                this.f59985a = iconLayer;
                this.f59986b = f;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final IconLayer getF59985a() {
                return this.f59985a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Classic)) {
                    return false;
                }
                Classic classic = (Classic) obj2;
                return Intrinsics.f(this.f59985a, classic.f59985a) && Float.compare(this.f59986b, classic.f59986b) == 0;
            }

            public final int hashCode() {
                IconLayer iconLayer = this.f59985a;
                return Float.hashCode(this.f59986b) + ((iconLayer == null ? 0 : iconLayer.hashCode()) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                IconLayer iconLayer = this.f59985a;
                if (iconLayer == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    iconLayer.writeToParcel(dest, i);
                }
                dest.writeFloat(this.f59986b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Type$Rounded;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Type;", "", "toString", "()Ljava/lang/String;", "IconConfig", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Rounded implements Type {

            @NotNull
            public static final Parcelable.Creator<Rounded> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f59988b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final IconConfig f59989c;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$Type$Rounded$IconConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class IconConfig implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<IconConfig> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f59990a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Layer f59991b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new IconConfig(parcel.readInt(), (Layer) parcel.readParcelable(IconConfig.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new IconConfig[i];
                    }
                }

                public IconConfig(int i, Layer layer) {
                    Intrinsics.checkNotNullParameter(layer, "layer");
                    this.f59990a = i;
                    this.f59991b = layer;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Layer getF59991b() {
                    return this.f59991b;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final int getF59990a() {
                    return this.f59990a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof IconConfig)) {
                        return false;
                    }
                    IconConfig iconConfig = (IconConfig) obj2;
                    return this.f59990a == iconConfig.f59990a && Intrinsics.f(this.f59991b, iconConfig.f59991b);
                }

                public final int hashCode() {
                    return this.f59991b.hashCode() + (Integer.hashCode(this.f59990a) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f59990a);
                    dest.writeParcelable(this.f59991b, i);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Rounded(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : IconConfig.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Rounded[i];
                }
            }

            public Rounded(int i, int i2, IconConfig iconConfig) {
                this.f59987a = i;
                this.f59988b = i2;
                this.f59989c = iconConfig;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final IconConfig getF59989c() {
                return this.f59989c;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getF59988b() {
                return this.f59988b;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getF59987a() {
                return this.f59987a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Rounded)) {
                    return false;
                }
                Rounded rounded = (Rounded) obj2;
                return this.f59987a == rounded.f59987a && this.f59988b == rounded.f59988b && Intrinsics.f(this.f59989c, rounded.f59989c);
            }

            public final int hashCode() {
                int iB = j6.a.b(this.f59988b, Integer.hashCode(this.f59987a) * 31, 31);
                IconConfig iconConfig = this.f59989c;
                return iB + (iconConfig == null ? 0 : iconConfig.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59987a);
                dest.writeInt(this.f59988b);
                IconConfig iconConfig = this.f59989c;
                if (iconConfig == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    iconConfig.writeToParcel(dest, i);
                }
            }

            public /* synthetic */ Rounded(int i) {
                this(i, 7, (IconConfig) null);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Rounded(int i, int i2, Layer iconLayer) {
                this(i, 7, new IconConfig(i2, iconLayer));
                Intrinsics.checkNotNullParameter(iconLayer, "iconLayer");
            }
        }
    }

    public /* synthetic */ QrCodeAppearance(Type.Rounded rounded, ColorType colorType, ColorType colorType2, Layer layer, int i) {
        this((Type) rounded, (i & 2) != 0 ? new ColorType.ColorAbsolute(-16777216) : colorType, (i & 4) != 0 ? new ColorType.ColorAbsolute(-1) : colorType2, (i & 8) != 0 ? new Layer.ColorAbsolute(-1) : layer, 20.0f);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeAppearance$IconLayer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconLayer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IconLayer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Layer f59975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f59977c;
        public final float d;
        public final float e;
        public final float f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f59978g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IconLayer((Layer) parcel.readParcelable(IconLayer.class.getClassLoader()), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IconLayer[i];
            }
        }

        public IconLayer(Layer layer, int i, float f, float f4, float f5, float f6, float f32) {
            Intrinsics.checkNotNullParameter(layer, "layer");
            this.f59975a = layer;
            this.f59976b = i;
            this.f59977c = f;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.f59978g = f32;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF59976b() {
            return this.f59976b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getF59978g() {
            return this.f59978g;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Layer getF59975a() {
            return this.f59975a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getF59977c() {
            return this.f59977c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IconLayer)) {
                return false;
            }
            IconLayer iconLayer = (IconLayer) obj2;
            return Intrinsics.f(this.f59975a, iconLayer.f59975a) && this.f59976b == iconLayer.f59976b && Float.compare(this.f59977c, iconLayer.f59977c) == 0 && Float.compare(this.d, iconLayer.d) == 0 && Float.compare(this.e, iconLayer.e) == 0 && Float.compare(this.f, iconLayer.f) == 0 && Float.compare(this.f59978g, iconLayer.f59978g) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f59978g) + m72.b.b(this.f, m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f59977c, j6.a.b(this.f59976b, this.f59975a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final float getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f59975a, i);
            dest.writeInt(this.f59976b);
            dest.writeFloat(this.f59977c);
            dest.writeFloat(this.d);
            dest.writeFloat(this.e);
            dest.writeFloat(this.f);
            dest.writeFloat(this.f59978g);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final float getF() {
            return this.f;
        }

        public /* synthetic */ IconLayer(Layer.DrawableResource drawableResource) {
            this(drawableResource, 17, 0.22f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public QrCodeAppearance(IconLayer iconLayer, int i) {
        ColorType.ColorAbsolute dataColor = new ColorType.ColorAbsolute(-16777216);
        ColorType.ColorAbsolute blankColor = new ColorType.ColorAbsolute(-1);
        Layer.ColorAbsolute backgroundLayer = new Layer.ColorAbsolute(-1);
        iconLayer = (i & 8) != 0 ? null : iconLayer;
        float f = (i & 16) != 0 ? 20.0f : 10.0f;
        Intrinsics.checkNotNullParameter(dataColor, "dataColor");
        Intrinsics.checkNotNullParameter(blankColor, "blankColor");
        Intrinsics.checkNotNullParameter(backgroundLayer, "backgroundLayer");
        this(new Type.Classic(iconLayer, f), dataColor, blankColor, backgroundLayer, f);
    }
}
