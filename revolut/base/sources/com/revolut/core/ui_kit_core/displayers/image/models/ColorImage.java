package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "Companion", "Color", "ColorResource", "ColorInteger", "ColorAttr", "a", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ColorImage implements Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color f59874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f59875b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    @NotNull
    public static final Parcelable.Creator<ColorImage> CREATOR = new b();

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$Color;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$ColorAttr;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$ColorInteger;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$ColorResource;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Color implements Parcelable {
        private Color() {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$ColorAttr;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ColorAttr extends Color {

        @NotNull
        public static final Parcelable.Creator<ColorAttr> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59876a;

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
            this.f59876a = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF59876a() {
            return this.f59876a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ColorAttr) && this.f59876a == ((ColorAttr) obj2).f59876a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f59876a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f59876a);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$ColorInteger;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ColorInteger extends Color {

        @NotNull
        public static final Parcelable.Creator<ColorInteger> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59877a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ColorInteger(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ColorInteger[i];
            }
        }

        public ColorInteger(int i) {
            this.f59877a = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF59877a() {
            return this.f59877a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ColorInteger) && this.f59877a == ((ColorInteger) obj2).f59877a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f59877a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f59877a);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$ColorResource;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/ColorImage$Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ColorResource extends Color {

        @NotNull
        public static final Parcelable.Creator<ColorResource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59878a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ColorResource(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ColorResource[i];
            }
        }

        public ColorResource(int i) {
            this.f59878a = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF59878a() {
            return this.f59878a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ColorResource) && this.f59878a == ((ColorResource) obj2).f59878a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f59878a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f59878a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit_core.displayers.image.models.ColorImage$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class Companion {
        private Companion() {
        }

        public static ColorImage a() {
            return new ColorImage(new ColorAttr(R$attr.uikit_colorTransparent), null);
        }

        public Companion(int i) {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ColorImage((Color) parcel.readParcelable(ColorImage.class.getClassLoader()), (Clause) parcel.readParcelable(ColorImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ColorImage[i];
        }
    }

    public ColorImage(Color color, Clause clause) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f59874a = color;
        this.f59875b = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ColorImage)) {
            return false;
        }
        ColorImage colorImage = (ColorImage) obj2;
        return Intrinsics.f(this.f59874a, colorImage.f59874a) && Intrinsics.f(this.f59875b, colorImage.f59875b);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59999h() {
        return this.f59875b;
    }

    public final int hashCode() {
        int iHashCode = this.f59874a.hashCode() * 31;
        Clause clause = this.f59875b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f59874a, i);
        dest.writeParcelable(this.f59875b, i);
    }
}
