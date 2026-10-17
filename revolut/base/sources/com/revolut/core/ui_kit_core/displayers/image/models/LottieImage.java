package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.youTransactor.uCube.rpc.Constants;
import ez0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "Companion", "ColorOverride", "a", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LottieImage implements Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieSource f59955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f59956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59957c;
    public final Integer d;
    public final ImageView.ScaleType e;
    public final ColorOverride f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f59958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Image f59959h;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    @NotNull
    public static final Parcelable.Creator<LottieImage> CREATOR = new b();

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride;", "Landroid/os/Parcelable;", "<init>", "()V", "TintedWithAttr", "Explicit", "TintedConfetti", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride$Explicit;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride$TintedConfetti;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride$TintedWithAttr;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ColorOverride implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride$Explicit;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Explicit extends ColorOverride {

            @NotNull
            public static final Parcelable.Creator<Explicit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f59960a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(LottieColorOverride.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new Explicit(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Explicit[i];
                }
            }

            public Explicit(List colorOverrides) {
                Intrinsics.checkNotNullParameter(colorOverrides, "colorOverrides");
                this.f59960a = colorOverrides;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getF59960a() {
                return this.f59960a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Explicit) && Intrinsics.f(this.f59960a, ((Explicit) obj2).f59960a);
            }

            public final int hashCode() {
                return this.f59960a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f59960a, dest);
                while (itV.hasNext()) {
                    ((LottieColorOverride) itV.next()).writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride$TintedConfetti;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TintedConfetti extends ColorOverride {

            @NotNull
            public static final Parcelable.Creator<TintedConfetti> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f59961a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(LottieColorOverride.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new TintedConfetti(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TintedConfetti[i];
                }
            }

            public TintedConfetti() {
                this(0);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getF59961a() {
                return this.f59961a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof TintedConfetti) && Intrinsics.f(this.f59961a, ((TintedConfetti) obj2).f59961a);
            }

            public final int hashCode() {
                return this.f59961a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f59961a, dest);
                while (itV.hasNext()) {
                    ((LottieColorOverride) itV.next()).writeToParcel(dest, i);
                }
            }

            public TintedConfetti(List extraOverrides) {
                Intrinsics.checkNotNullParameter(extraOverrides, "extraOverrides");
                this.f59961a = extraOverrides;
            }

            public TintedConfetti(int i) {
                this(f0.f322471a);
            }
        }

        private ColorOverride() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride$TintedWithAttr;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage$ColorOverride;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TintedWithAttr extends ColorOverride {

            @NotNull
            public static final Parcelable.Creator<TintedWithAttr> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59962a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f f59963b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TintedWithAttr(parcel.readInt(), f.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TintedWithAttr[i];
                }
            }

            public TintedWithAttr(int i, f colorMode) {
                Intrinsics.checkNotNullParameter(colorMode, "colorMode");
                this.f59962a = i;
                this.f59963b = colorMode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF59962a() {
                return this.f59962a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final f getF59963b() {
                return this.f59963b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TintedWithAttr)) {
                    return false;
                }
                TintedWithAttr tintedWithAttr = (TintedWithAttr) obj2;
                return this.f59962a == tintedWithAttr.f59962a && this.f59963b == tintedWithAttr.f59963b;
            }

            public final int hashCode() {
                return this.f59963b.hashCode() + (Integer.hashCode(this.f59962a) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59962a);
                dest.writeString(this.f59963b.name());
            }

            public /* synthetic */ TintedWithAttr(int i) {
                this(i, f.SIMPLE);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit_core.displayers.image.models.LottieImage$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class Companion {
        private Companion() {
        }

        public static LottieImage a(Companion companion, LottieSource src2, boolean z, boolean z3, ColorOverride colorOverride, Image image, int i) {
            Integer numValueOf = Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            boolean z4 = (i & 2) != 0 ? true : z;
            boolean z6 = (i & 4) != 0 ? true : z3;
            Integer num = (i & 8) != 0 ? null : numValueOf;
            ImageView.ScaleType scaleType2 = (i & 16) != 0 ? null : scaleType;
            ColorOverride colorOverride2 = (i & 32) != 0 ? null : colorOverride;
            Image image2 = (i & 128) != 0 ? null : image;
            companion.getClass();
            Intrinsics.checkNotNullParameter(src2, "src");
            return new LottieImage(src2, z4, z6, num, scaleType2, colorOverride2, null, image2);
        }

        public Companion(int i) {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LottieImage((LottieSource) parcel.readParcelable(LottieImage.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ImageView.ScaleType.valueOf(parcel.readString()) : null, (ColorOverride) parcel.readParcelable(LottieImage.class.getClassLoader()), (Clause) parcel.readParcelable(LottieImage.class.getClassLoader()), (Image) parcel.readParcelable(LottieImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LottieImage[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LottieImage(SourceUrl src2, int i, int i2) {
        boolean z = (i2 & 4) != 0;
        Intrinsics.checkNotNullParameter(src2, "src");
        this(src2, true, z, null, null, new ColorOverride.TintedWithAttr(i), null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LottieImage)) {
            return false;
        }
        LottieImage lottieImage = (LottieImage) obj2;
        return Intrinsics.f(this.f59955a, lottieImage.f59955a) && this.f59956b == lottieImage.f59956b && this.f59957c == lottieImage.f59957c && Intrinsics.f(this.d, lottieImage.d) && this.e == lottieImage.e && Intrinsics.f(this.f, lottieImage.f) && Intrinsics.f(this.f59958g, lottieImage.f59958g) && Intrinsics.f(this.f59959h, lottieImage.f59959h);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.f59958g;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f59955a.hashCode() * 31, 31, this.f59956b), 31, this.f59957c);
        Integer num = this.d;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        ImageView.ScaleType scaleType = this.e;
        int iHashCode2 = (iHashCode + (scaleType == null ? 0 : scaleType.hashCode())) * 31;
        ColorOverride colorOverride = this.f;
        int iHashCode3 = (iHashCode2 + (colorOverride == null ? 0 : colorOverride.hashCode())) * 31;
        Clause clause = this.f59958g;
        int iHashCode4 = (iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f59959h;
        return iHashCode4 + (image != null ? image.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f59955a, i);
        dest.writeInt(this.f59956b ? 1 : 0);
        dest.writeInt(this.f59957c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        ImageView.ScaleType scaleType = this.e;
        if (scaleType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(scaleType.name());
        }
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f59958g, i);
        dest.writeParcelable(this.f59959h, i);
    }

    public LottieImage(LottieSource lottieSource, boolean z, boolean z3, Integer num, ImageView.ScaleType scaleType, ColorOverride colorOverride, Clause clause, Image image) {
        this.f59955a = lottieSource;
        this.f59956b = z;
        this.f59957c = z3;
        this.d = num;
        this.e = scaleType;
        this.f = colorOverride;
        this.f59958g = clause;
        this.f59959h = image;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LottieImage(LottieSource src2, List list, int i) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        boolean z = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        Integer num = (i & 8) != 0 ? null : 300;
        ImageView.ScaleType scaleType2 = (i & 16) != 0 ? null : scaleType;
        List colorOverrides = (i & 32) != 0 ? f0.f322471a : list;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(colorOverrides, "colorOverrides");
        this(src2, z, z3, num, scaleType2, new ColorOverride.Explicit(colorOverrides), null, null);
    }
}
