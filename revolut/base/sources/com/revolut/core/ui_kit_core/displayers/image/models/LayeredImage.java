package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "Companion", "Layer", "a", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LayeredImage implements Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f59938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f59939c;
    public final Clause d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<LayeredImage> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static LayeredImage a(Companion companion, int i, Color color, Color backgroundColor, float f, Float f4, int i2) {
            if ((i2 & 16) != 0) {
                f4 = null;
            }
            companion.getClass();
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return m(i, color, backgroundColor, f, f, f, f, f4, null);
        }

        public static LayeredImage b(Companion companion, int i, Integer num, int i2, float f, Float f4, TextLocalisedClause textLocalisedClause, int i3) {
            Float f5 = (i3 & 16) != 0 ? null : f4;
            TextLocalisedClause textLocalisedClause2 = (i3 & 32) != 0 ? null : textLocalisedClause;
            companion.getClass();
            Color.Solid solid = num != null ? new Color.Solid(num.intValue()) : null;
            Color.Solid backgroundColor = new Color.Solid(i2);
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return m(i, solid, backgroundColor, f, f, f, f, f5, textLocalisedClause2);
        }

        public static LayeredImage c(Companion companion, int i, Integer num, Color backgroundColor, float f, Float f4, int i2) {
            Float f5 = (i2 & 16) != 0 ? null : f4;
            companion.getClass();
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Color.Solid solid = num != null ? new Color.Solid(num.intValue()) : null;
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return m(i, solid, backgroundColor, f, f, f, f, f5, null);
        }

        public static LayeredImage e(int i, Color color, Color borderColor, Color.Solid solid, Integer num, float f, float f4, float f5, Float f6) {
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Float fValueOf = f6 != null ? Float.valueOf(((f4 + f + f5) * 2) + f6.floatValue()) : null;
            int iIntValue = R$drawable.uikit_icn_circle_background;
            Layer.Drawable drawable = new Layer.Drawable(iIntValue, borderColor, f5, f5, f5, f5, (c) null, 64);
            if (num != null) {
                iIntValue = num.intValue();
            }
            float f32 = f4 + f5;
            float f35 = f + f4 + f5;
            return new LayeredImage(v.k(drawable, new Layer.Drawable(iIntValue, color, f32, f32, f32, f32, (c) null, 64), new Layer.Drawable(i, solid == null ? borderColor : solid, f35, f35, f35, f35, (c) null, 64)), fValueOf, fValueOf, 8);
        }

        public static /* synthetic */ LayeredImage f(Companion companion, int i, int i2, int i3, Integer num, float f, float f4, Float f5, int i5) {
            if ((i5 & 8) != 0) {
                num = null;
            }
            if ((i5 & 16) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if ((i5 & 32) != 0) {
                f4 = 2.0f;
            }
            if ((i5 & 64) != 0) {
                f5 = null;
            }
            return companion.d(i, i2, i3, num, f, f4, f5);
        }

        public static /* synthetic */ LayeredImage g(Companion companion, int i, Color.Solid solid, Color color, Color.Solid solid2, Integer num, float f, float f4, Float f5, int i2) {
            if ((i2 & 2) != 0) {
                solid = null;
            }
            if ((i2 & 16) != 0) {
                num = null;
            }
            if ((i2 & 32) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if ((i2 & 64) != 0) {
                f4 = 2.0f;
            }
            if ((i2 & 256) != 0) {
                f5 = null;
            }
            companion.getClass();
            return e(i, solid, color, solid2, num, f, f4, BitmapDescriptorFactory.HUE_RED, f5);
        }

        public static LayeredImage m(int i, Color color, Color backgroundColor, float f, float f4, float f5, float f6, Float f32, Clause clause) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new LayeredImage(v.k(new Layer.Drawable(R$drawable.uikit_icn_circle_background, backgroundColor, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (c) null, 124), new Layer.Drawable(i, color, f, f5, f4, f6, (c) null, 64)), f32 != null ? Float.valueOf(f32.floatValue() + f + f5) : null, f32 != null ? Float.valueOf(f32.floatValue() + f4 + f6) : null, clause);
        }

        public static LayeredImage n(int i, Color.Solid solid, Color backgroundColor, float f, float f4) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            float f5 = (2 * f) + f4;
            return new LayeredImage(v.k(new Layer.Drawable(R$drawable.uikit_icn_rounded_background, backgroundColor, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (c) null, 124), new Layer.Drawable(i, solid, f, f, f, f, (c) null, 64)), Float.valueOf(f5), Float.valueOf(f5), (Clause) null);
        }

        public static /* synthetic */ LayeredImage o(Companion companion, int i, Color.Solid solid, Color color) {
            companion.getClass();
            return n(i, solid, color, 8.0f, 24.0f);
        }

        public static LayeredImage p(Companion companion, int i, Integer num, int i2, float f, float f4) {
            companion.getClass();
            return n(i, new Color.Solid(num.intValue()), new Color.Solid(i2), f, f4);
        }

        public final LayeredImage d(int i, int i2, int i3, Integer num, float f, float f4, Float f5) {
            return g(this, i, new Color.Solid(i2), new Color.Solid(i3), num != null ? new Color.Solid(num.intValue()) : null, null, f, f4, f5, SyslogConstants.LOG_LOCAL2);
        }

        public final LayeredImage h(int i, int i2, int i3) {
            Color.Solid drawableColor = new Color.Solid(i2);
            Color.Solid backgroundColor = new Color.Solid(i3);
            Intrinsics.checkNotNullParameter(drawableColor, "drawableColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return a(this, i, drawableColor, backgroundColor, 4.0f, Float.valueOf(12.0f), 32);
        }

        public final LayeredImage i(int i, int i2, int i3) {
            return j(i, new Color.Solid(i2), new Color.Solid(i3));
        }

        public final LayeredImage j(int i, Color drawableColor, Color backgroundColor) {
            Intrinsics.checkNotNullParameter(drawableColor, "drawableColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return a(this, i, drawableColor, backgroundColor, 8.0f, Float.valueOf(24.0f), 32);
        }

        public final LayeredImage k(int i, int i2, int i3) {
            return l(i, new Color.Solid(i2), new Color.Solid(i3));
        }

        public final LayeredImage l(int i, Color.Solid drawableColor, Color backgroundColor) {
            Intrinsics.checkNotNullParameter(drawableColor, "drawableColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return a(this, i, drawableColor, backgroundColor, 11.0f, Float.valueOf(34.0f), 32);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(LayeredImage.class, parcel, arrayList, iE, 1);
            }
            return new LayeredImage(arrayList, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, (Clause) parcel.readParcelable(LayeredImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LayeredImage[i];
        }
    }

    public LayeredImage(List drawablesList, Float f, Float f4, Clause clause) {
        Intrinsics.checkNotNullParameter(drawablesList, "drawablesList");
        this.f59937a = drawablesList;
        this.f59938b = f;
        this.f59939c = f4;
        this.d = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LayeredImage)) {
            return false;
        }
        LayeredImage layeredImage = (LayeredImage) obj2;
        return Intrinsics.f(this.f59937a, layeredImage.f59937a) && Intrinsics.f(this.f59938b, layeredImage.f59938b) && Intrinsics.f(this.f59939c, layeredImage.f59939c) && Intrinsics.f(this.d, layeredImage.d);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59238c() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.f59937a.hashCode() * 31;
        Float f = this.f59938b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.f59939c;
        int iHashCode3 = (iHashCode2 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Clause clause = this.d;
        return iHashCode3 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f59937a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Float f = this.f59938b;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
        Float f4 = this.f59939c;
        if (f4 == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f4);
        }
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ LayeredImage(List list, Float f, Float f4, int i) {
        this(list, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f4, (Clause) null);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer;", "Landroid/os/Parcelable;", "<init>", "()V", "com/revolut/core/ui_kit_core/displayers/image/models/c", "Drawable", "InvertedDrawable", "GrayedOutDrawable", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer$Drawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer$GrayedOutDrawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer$InvertedDrawable;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Layer implements Parcelable {

        /* JADX INFO: loaded from: classes20.dex */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer$GrayedOutDrawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GrayedOutDrawable extends Layer implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<GrayedOutDrawable> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59944a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f59945b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f59946c;
            public final float d;
            public final float e;
            public final c f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new GrayedOutDrawable(parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GrayedOutDrawable[i];
                }
            }

            public GrayedOutDrawable(int i, float f, float f4, float f5, float f6, c cVar) {
                this.f59944a = i;
                this.f59945b = f;
                this.f59946c = f4;
                this.d = f5;
                this.e = f6;
                this.f = cVar;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getF59951h() {
                return this.e;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getE() {
                return this.f59945b;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getF() {
                return this.f59946c;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: d, reason: from getter */
            public final c getI() {
                return this.f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: e, reason: from getter */
            public final float getF59950g() {
                return this.d;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof GrayedOutDrawable)) {
                    return false;
                }
                GrayedOutDrawable grayedOutDrawable = (GrayedOutDrawable) obj2;
                return this.f59944a == grayedOutDrawable.f59944a && Float.compare(this.f59945b, grayedOutDrawable.f59945b) == 0 && Float.compare(this.f59946c, grayedOutDrawable.f59946c) == 0 && Float.compare(this.d, grayedOutDrawable.d) == 0 && Float.compare(this.e, grayedOutDrawable.e) == 0 && this.f == grayedOutDrawable.f;
            }

            public final int hashCode() {
                int iB = m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f59946c, m72.b.b(this.f59945b, Integer.hashCode(this.f59944a) * 31, 31), 31), 31), 31);
                c cVar = this.f;
                return iB + (cVar == null ? 0 : cVar.hashCode());
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final int getF59944a() {
                return this.f59944a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59944a);
                dest.writeFloat(this.f59945b);
                dest.writeFloat(this.f59946c);
                dest.writeFloat(this.d);
                dest.writeFloat(this.e);
                c cVar = this.f;
                if (cVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(cVar.name());
                }
            }
        }

        /* JADX INFO: loaded from: classes20.dex */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer$InvertedDrawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InvertedDrawable extends Layer implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<InvertedDrawable> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59947a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f59948b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f59949c;
            public final Color d;
            public final float e;
            public final float f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final float f59950g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final float f59951h;
            public final c i;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InvertedDrawable(parcel.readInt(), parcel.readInt(), parcel.readFloat(), (Color) parcel.readParcelable(InvertedDrawable.class.getClassLoader()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InvertedDrawable[i];
                }
            }

            public InvertedDrawable(int i, int i2, float f, Color color, float f4, float f5, float f6, float f32, c cVar) {
                this.f59947a = i;
                this.f59948b = i2;
                this.f59949c = f;
                this.d = color;
                this.e = f4;
                this.f = f5;
                this.f59950g = f6;
                this.f59951h = f32;
                this.i = cVar;
            }

            /* JADX INFO: renamed from: J, reason: from getter */
            public final float getF59949c() {
                return this.f59949c;
            }

            /* JADX INFO: renamed from: T, reason: from getter */
            public final Color getD() {
                return this.d;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getF59951h() {
                return this.f59951h;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getE() {
                return this.e;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getF() {
                return this.f;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: d, reason: from getter */
            public final c getI() {
                return this.i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: e, reason: from getter */
            public final float getF59950g() {
                return this.f59950g;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InvertedDrawable)) {
                    return false;
                }
                InvertedDrawable invertedDrawable = (InvertedDrawable) obj2;
                return this.f59947a == invertedDrawable.f59947a && this.f59948b == invertedDrawable.f59948b && Float.compare(this.f59949c, invertedDrawable.f59949c) == 0 && Intrinsics.f(this.d, invertedDrawable.d) && Float.compare(this.e, invertedDrawable.e) == 0 && Float.compare(this.f, invertedDrawable.f) == 0 && Float.compare(this.f59950g, invertedDrawable.f59950g) == 0 && Float.compare(this.f59951h, invertedDrawable.f59951h) == 0 && this.i == invertedDrawable.i;
            }

            public final int hashCode() {
                int iB = m72.b.b(this.f59949c, j6.a.b(this.f59948b, Integer.hashCode(this.f59947a) * 31, 31), 31);
                Color color = this.d;
                int iB2 = m72.b.b(this.f59951h, m72.b.b(this.f59950g, m72.b.b(this.f, m72.b.b(this.e, (iB + (color == null ? 0 : color.hashCode())) * 31, 31), 31), 31), 31);
                c cVar = this.i;
                return iB2 + (cVar != null ? cVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final int getF59948b() {
                return this.f59948b;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59947a);
                dest.writeInt(this.f59948b);
                dest.writeFloat(this.f59949c);
                dest.writeParcelable(this.d, i);
                dest.writeFloat(this.e);
                dest.writeFloat(this.f);
                dest.writeFloat(this.f59950g);
                dest.writeFloat(this.f59951h);
                c cVar = this.i;
                if (cVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(cVar.name());
                }
            }

            /* JADX INFO: renamed from: z, reason: from getter */
            public final int getF59947a() {
                return this.f59947a;
            }
        }

        private Layer() {
        }

        /* JADX INFO: renamed from: a */
        public abstract float getF59951h();

        /* JADX INFO: renamed from: b */
        public abstract float getE();

        /* JADX INFO: renamed from: c */
        public abstract float getF();

        /* JADX INFO: renamed from: d */
        public abstract c getI();

        /* JADX INFO: renamed from: e */
        public abstract float getF59950g();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer$Drawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LayeredImage$Layer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Drawable extends Layer implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Drawable> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Color f59941b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f59942c;
            public final float d;
            public final float e;
            public final float f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final c f59943g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Drawable(parcel.readInt(), (Color) parcel.readParcelable(Drawable.class.getClassLoader()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Drawable[i];
                }
            }

            public Drawable(int i, Color color, float f, float f4, float f5, float f6, c cVar) {
                this.f59940a = i;
                this.f59941b = color;
                this.f59942c = f;
                this.d = f4;
                this.e = f5;
                this.f = f6;
                this.f59943g = cVar;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getF59951h() {
                return this.f;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: b, reason: from getter */
            public final float getE() {
                return this.f59942c;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getF() {
                return this.d;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: d, reason: from getter */
            public final c getI() {
                return this.f59943g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage.Layer
            /* JADX INFO: renamed from: e, reason: from getter */
            public final float getF59950g() {
                return this.e;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Drawable)) {
                    return false;
                }
                Drawable drawable = (Drawable) obj2;
                return this.f59940a == drawable.f59940a && Intrinsics.f(this.f59941b, drawable.f59941b) && Float.compare(this.f59942c, drawable.f59942c) == 0 && Float.compare(this.d, drawable.d) == 0 && Float.compare(this.e, drawable.e) == 0 && Float.compare(this.f, drawable.f) == 0 && this.f59943g == drawable.f59943g;
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f59940a) * 31;
                Color color = this.f59941b;
                int iB = m72.b.b(this.f, m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f59942c, (iHashCode + (color == null ? 0 : color.hashCode())) * 31, 31), 31), 31), 31);
                c cVar = this.f59943g;
                return iB + (cVar != null ? cVar.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59940a);
                dest.writeParcelable(this.f59941b, i);
                dest.writeFloat(this.f59942c);
                dest.writeFloat(this.d);
                dest.writeFloat(this.e);
                dest.writeFloat(this.f);
                c cVar = this.f59943g;
                if (cVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(cVar.name());
                }
            }

            public /* synthetic */ Drawable(int i, Color color, float f, float f4, float f5, float f6, c cVar, int i2) {
                this(i, color, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0.0f : f5, (i2 & 32) != 0 ? 0.0f : f6, (i2 & 64) != 0 ? null : cVar);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Drawable(int i, Integer num, float f, float f4, float f5, float f6, c cVar, int i2) {
                num = (i2 & 2) != 0 ? null : num;
                this(i, num != null ? new Color.Solid(num.intValue()) : null, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0.0f : f5, (i2 & 32) != 0 ? 0.0f : f6, (i2 & 64) != 0 ? null : cVar);
            }
        }
    }
}
