package com.revolut.core.ui_kit.internal.views.tag;

import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import j6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;
import wwk.d;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Glowing", "TagBackground", "TagOutline", "CollapseState", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TagViewData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f57640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f57641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TagBackground f57642c;
    public final Integer d;
    public final TagOutline e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CollapseState f57643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Glowing f57644h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f57645j;
    public final Object k;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<TagViewData> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$Glowing;", "Landroid/os/Parcelable;", "Static", "Animated", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$Glowing$Animated;", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$Glowing$Static;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Glowing extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$Glowing$Animated;", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$Glowing;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Animated implements Glowing {

            @NotNull
            public static final Parcelable.Creator<Animated> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AnimationRequest f57648a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Animated(parcel.readInt() == 0 ? null : AnimationRequest.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Animated[i];
                }
            }

            public Animated(AnimationRequest animationRequest) {
                this.f57648a = animationRequest;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AnimationRequest getF57648a() {
                return this.f57648a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Animated) && Intrinsics.f(this.f57648a, ((Animated) obj2).f57648a);
            }

            public final int hashCode() {
                AnimationRequest animationRequest = this.f57648a;
                if (animationRequest == null) {
                    return 0;
                }
                return animationRequest.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                AnimationRequest animationRequest = this.f57648a;
                if (animationRequest == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    animationRequest.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$Glowing$Static;", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$Glowing;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Static implements Glowing {

            @NotNull
            public static final Parcelable.Creator<Static> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57649a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Static(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Static[i];
                }
            }

            public Static(int i) {
                this.f57649a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF57649a() {
                return this.f57649a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Static) && this.f57649a == ((Static) obj2).f57649a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f57649a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57649a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagBackground;", "Landroid/os/Parcelable;", "<init>", "()V", "Solid", "Gradient", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagBackground$Gradient;", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagBackground$Solid;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class TagBackground implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagBackground$Gradient;", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagBackground;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Gradient extends TagBackground {

            @NotNull
            public static final Parcelable.Creator<Gradient> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f57650a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final GradientDrawable.Orientation f57651b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(Gradient.class, parcel, arrayList, iE, 1);
                    }
                    return new Gradient(arrayList, GradientDrawable.Orientation.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Gradient[i];
                }
            }

            public Gradient(List colors, GradientDrawable.Orientation orientation) {
                Intrinsics.checkNotNullParameter(colors, "colors");
                Intrinsics.checkNotNullParameter(orientation, "orientation");
                this.f57650a = colors;
                this.f57651b = orientation;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getF57650a() {
                return this.f57650a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final GradientDrawable.Orientation getF57651b() {
                return this.f57651b;
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
                return Intrinsics.f(this.f57650a, gradient.f57650a) && this.f57651b == gradient.f57651b;
            }

            public final int hashCode() {
                return this.f57651b.hashCode() + (this.f57650a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f57650a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
                dest.writeString(this.f57651b.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagBackground$Solid;", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagBackground;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Solid extends TagBackground {

            @NotNull
            public static final Parcelable.Creator<Solid> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Color f57652a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Solid((Color) parcel.readParcelable(Solid.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Solid[i];
                }
            }

            public Solid(Color color) {
                Intrinsics.checkNotNullParameter(color, "color");
                this.f57652a = color;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Color getF57652a() {
                return this.f57652a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Solid) && Intrinsics.f(this.f57652a, ((Solid) obj2).f57652a);
            }

            public final int hashCode() {
                return this.f57652a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57652a, i);
            }
        }

        private TagBackground() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagOutline;", "Landroid/os/Parcelable;", "Solid", "Gradient", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagOutline$Gradient;", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagOutline$Solid;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface TagOutline extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagOutline$Gradient;", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagOutline;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Gradient implements TagOutline {

            @NotNull
            public static final Parcelable.Creator<Gradient> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UiKitGradient f57653a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Gradient(UiKitGradient.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Gradient[i];
                }
            }

            public Gradient(UiKitGradient gradient) {
                Intrinsics.checkNotNullParameter(gradient, "gradient");
                this.f57653a = gradient;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final UiKitGradient getF57653a() {
                return this.f57653a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Gradient) && Intrinsics.f(this.f57653a, ((Gradient) obj2).f57653a);
            }

            public final int hashCode() {
                return this.f57653a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f57653a.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagOutline$Solid;", "Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$TagOutline;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Solid implements TagOutline {

            @NotNull
            public static final Parcelable.Creator<Solid> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57654a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Solid(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Solid[i];
                }
            }

            public Solid(int i) {
                this.f57654a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF57654a() {
                return this.f57654a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Solid) && this.f57654a == ((Solid) obj2).f57654a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f57654a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57654a);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.tag.TagViewData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static TagViewData a(ResourceImage icon, Clause label, int i, CollapseState collapseState, d dVar) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(collapseState, "collapseState");
            return new TagViewData(icon, label, new TagBackground.Solid(new Color.Solid(i)), null, new TagOutline.Solid(i), false, collapseState, null, null, 0, dVar, 776);
        }

        public static TagViewData b(int i, int i2, Clause label, Integer num) {
            ResourceImage resourceImage;
            Intrinsics.checkNotNullParameter(label, "label");
            if (num != null) {
                resourceImage = new ResourceImage(num.intValue(), (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246);
            } else {
                resourceImage = null;
            }
            return new TagViewData(resourceImage, label, new TagBackground.Solid(new Color.Solid(i)), null, new TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, i2, null, 1512);
        }

        public static TagViewData c(String str, int i, int i2, Integer num) {
            return new TagViewData(num != null ? new ResourceImage(num.intValue(), (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TagBackground.Solid(new Color.Solid(i)), null, new TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, i2, null, 1512);
        }

        public static /* synthetic */ TagViewData d(Companion companion, String str, int i, int i2) {
            companion.getClass();
            return c(str, i, i2, null);
        }

        public static TagViewData e(Companion companion, Clause clause, boolean z, AnimationRequest animationRequest, int i) {
            boolean z3 = (i & 2) != 0 ? false : z;
            AnimationRequest animationRequest2 = (i & 4) != 0 ? null : animationRequest;
            companion.getClass();
            ResourceImage resourceImage = new ResourceImage(z3 ? R$drawable.uikit_icn_16_revpoints : R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
            TagOutline.Solid solid = new TagOutline.Solid(R$attr.uikit_colorTransparent);
            List listK = v.k(Integer.valueOf(R$attr.uikit_colorPurple), Integer.valueOf(R$attr.uikit_colorIndigo));
            ArrayList arrayList = new ArrayList(w.t(listK, 10));
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                arrayList.add(new Color.Solid(((Number) it8.next()).intValue()));
            }
            return new TagViewData(resourceImage, clause, new TagBackground.Gradient(arrayList, GradientDrawable.Orientation.TL_BR), null, solid, false, null, animationRequest2 != null ? new Glowing.Animated(animationRequest2) : null, null, 0, null, 872);
        }

        public static TagViewData f(Companion companion, String str, int i) {
            boolean z = (i & 2) == 0;
            companion.getClass();
            return e(companion, str != null ? new TextClause(str, (Style) null, Integer.valueOf(R$attr.uikit_colorWhite), false, (o9) null, (List) null, 122) : null, z, null, 4);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TagViewData((Image) parcel.readParcelable(TagViewData.class.getClassLoader()), (Clause) parcel.readParcelable(TagViewData.class.getClassLoader()), (TagBackground) parcel.readParcelable(TagViewData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (TagOutline) parcel.readParcelable(TagViewData.class.getClassLoader()), parcel.readInt() != 0, CollapseState.CREATOR.createFromParcel(parcel), (Glowing) parcel.readParcelable(TagViewData.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt(), null, 1024);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TagViewData[i];
        }
    }

    public TagViewData(Image image, Clause clause, TagBackground background, Integer num, TagOutline outline, boolean z, CollapseState collapseState, Glowing glowing, Integer num2, int i, Object obj2) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(collapseState, "collapseState");
        this.f57640a = image;
        this.f57641b = clause;
        this.f57642c = background;
        this.d = num;
        this.e = outline;
        this.f = z;
        this.f57643g = collapseState;
        this.f57644h = glowing;
        this.i = num2;
        this.f57645j = i;
        this.k = obj2;
    }

    public static TagViewData a(TagViewData tagViewData, Image image) {
        Clause clause = tagViewData.f57641b;
        TagBackground background = tagViewData.f57642c;
        Integer num = tagViewData.d;
        TagOutline outline = tagViewData.e;
        boolean z = tagViewData.f;
        CollapseState collapseState = tagViewData.f57643g;
        Glowing glowing = tagViewData.f57644h;
        Integer num2 = tagViewData.i;
        int i = tagViewData.f57645j;
        Object obj2 = tagViewData.k;
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(collapseState, "collapseState");
        return new TagViewData(image, clause, background, num, outline, z, collapseState, glowing, num2, i, obj2);
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final int getF57645j() {
        return this.f57645j;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TagBackground getF57642c() {
        return this.f57642c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CollapseState getF57643g() {
        return this.f57643g;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Glowing getF57644h() {
        return this.f57644h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getI() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TagViewData)) {
            return false;
        }
        TagViewData tagViewData = (TagViewData) obj2;
        return Intrinsics.f(this.f57640a, tagViewData.f57640a) && Intrinsics.f(this.f57641b, tagViewData.f57641b) && Intrinsics.f(this.f57642c, tagViewData.f57642c) && Intrinsics.f(this.d, tagViewData.d) && Intrinsics.f(this.e, tagViewData.e) && this.f == tagViewData.f && Intrinsics.f(this.f57643g, tagViewData.f57643g) && Intrinsics.f(this.f57644h, tagViewData.f57644h) && Intrinsics.f(this.i, tagViewData.i) && this.f57645j == tagViewData.f57645j && Intrinsics.f(this.k, tagViewData.k);
    }

    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public final Image getF57640a() {
        return this.f57640a;
    }

    /* JADX INFO: renamed from: getText, reason: from getter */
    public final Clause getF57641b() {
        return this.f57641b;
    }

    public final int hashCode() {
        Image image = this.f57640a;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Clause clause = this.f57641b;
        int iHashCode2 = (this.f57642c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int iHashCode3 = (this.f57643g.hashCode() + a.c((this.e.hashCode() + ((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.f)) * 31;
        Glowing glowing = this.f57644h;
        int iHashCode4 = (iHashCode3 + (glowing == null ? 0 : glowing.hashCode())) * 31;
        Integer num2 = this.i;
        int iB = a.b(this.f57645j, (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Object obj2 = this.k;
        return iB + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TagOutline getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57640a, i);
        dest.writeParcelable(this.f57641b, i);
        dest.writeParcelable(this.f57642c, i);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        this.f57643g.writeToParcel(dest, i);
        dest.writeParcelable(this.f57644h, i);
        Integer num2 = this.i;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeInt(this.f57645j);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Integer getD() {
        return this.d;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData$CollapseState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollapseState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CollapseState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f57646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimationRequest f57647b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CollapseState(parcel.readInt() != 0, parcel.readInt() == 0 ? null : AnimationRequest.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollapseState[i];
            }
        }

        public CollapseState(boolean z, AnimationRequest animationRequest) {
            this.f57646a = z;
            this.f57647b = animationRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AnimationRequest getF57647b() {
            return this.f57647b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF57646a() {
            return this.f57646a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CollapseState)) {
                return false;
            }
            CollapseState collapseState = (CollapseState) obj2;
            return this.f57646a == collapseState.f57646a && Intrinsics.f(this.f57647b, collapseState.f57647b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f57646a) * 31;
            AnimationRequest animationRequest = this.f57647b;
            return iHashCode + (animationRequest == null ? 0 : animationRequest.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f57646a ? 1 : 0);
            AnimationRequest animationRequest = this.f57647b;
            if (animationRequest == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                animationRequest.writeToParcel(dest, i);
            }
        }

        public /* synthetic */ CollapseState() {
            this(false, null);
        }
    }

    public /* synthetic */ TagViewData(Image image, Clause clause, TagBackground tagBackground, Integer num, TagOutline tagOutline, boolean z, CollapseState collapseState, Glowing glowing, Integer num2, int i, Object obj2, int i2) {
        this(image, clause, (i2 & 4) != 0 ? new TagBackground.Solid(new Color.Solid(R$attr.uikit_colorTransparent)) : tagBackground, (i2 & 8) != 0 ? null : num, tagOutline, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? new CollapseState() : collapseState, (i2 & 128) != 0 ? null : glowing, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? R$attr.uikit_colorWhite : i, (i2 & 1024) != 0 ? null : obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TagViewData(ResourceImage resourceImage, Clause text, Color color, int i, n nVar, int i2) {
        Color background = (i2 & 4) != 0 ? new Color.Solid(R$attr.uikit_colorTransparent) : color;
        int i3 = R$attr.uikit_colorWhite;
        n nVar2 = (i2 & 512) != 0 ? null : nVar;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(background, "background");
        this(resourceImage, text, new TagBackground.Solid(background), null, new TagOutline.Solid(i), false, null, null, null, i3, nVar2, 64);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TagViewData(Image image, Clause text, int i, Integer num, int i2, Object obj2, int i3) {
        Integer num2 = (i3 & 8) != 0 ? null : num;
        boolean z = (i3 & 32) == 0;
        int i5 = R$attr.uikit_colorWhite;
        Object obj3 = (i3 & 512) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(text, "text");
        this(image, text, new TagBackground.Solid(new Color.Solid(i)), num2, new TagOutline.Solid(i2), z, null, null, null, i5, obj3, 64);
    }
}
