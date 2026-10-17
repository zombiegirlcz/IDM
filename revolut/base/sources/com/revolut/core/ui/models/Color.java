package com.revolut.core.ui.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui/models/Color;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Solid", "SolidInt", "SolidRes", "Composite", "ModifiedColor", "Opaque", "a", "Lcom/revolut/core/ui/models/Color$Composite;", "Lcom/revolut/core/ui/models/Color$ModifiedColor;", "Lcom/revolut/core/ui/models/Color$Opaque;", "Lcom/revolut/core/ui/models/Color$Solid;", "Lcom/revolut/core/ui/models/Color$SolidInt;", "Lcom/revolut/core/ui/models/Color$SolidRes;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Color implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f51457a = new float[3];

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui/models/Color$Composite;", "Lcom/revolut/core/ui/models/Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Composite extends Color {

        @NotNull
        public static final Parcelable.Creator<Composite> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51459c;
        public final ho0.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Composite(parcel.readInt(), parcel.readInt(), ho0.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Composite[i];
            }
        }

        public Composite(int i, int i2, ho0.a blendMode) {
            Intrinsics.checkNotNullParameter(blendMode, "blendMode");
            this.f51458b = i;
            this.f51459c = i2;
            this.d = blendMode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF51458b() {
            return this.f51458b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ho0.a getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getF51459c() {
            return this.f51459c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Composite)) {
                return false;
            }
            Composite composite = (Composite) obj2;
            return this.f51458b == composite.f51458b && this.f51459c == composite.f51459c && this.d == composite.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.b(this.f51459c, Integer.hashCode(this.f51458b) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f51458b);
            dest.writeInt(this.f51459c);
            dest.writeString(this.d.name());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui/models/Color$ModifiedColor;", "Lcom/revolut/core/ui/models/Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ModifiedColor extends Color {

        @NotNull
        public static final Parcelable.Creator<ModifiedColor> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Color f51460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f51461c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ModifiedColor((Color) parcel.readParcelable(ModifiedColor.class.getClassLoader()), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ModifiedColor[i];
            }
        }

        public ModifiedColor(Color color, float f) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.f51460b = color;
            this.f51461c = f;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getF51461c() {
            return this.f51461c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Color getF51460b() {
            return this.f51460b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ModifiedColor)) {
                return false;
            }
            ModifiedColor modifiedColor = (ModifiedColor) obj2;
            return Intrinsics.f(this.f51460b, modifiedColor.f51460b) && Float.compare(this.f51461c, modifiedColor.f51461c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f51461c) + (this.f51460b.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51460b, i);
            dest.writeFloat(this.f51461c);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui/models/Color$Opaque;", "Lcom/revolut/core/ui/models/Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Opaque extends Color {

        @NotNull
        public static final Parcelable.Creator<Opaque> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f51463c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Opaque(parcel.readInt(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Opaque[i];
            }
        }

        public Opaque(int i, float f) {
            this.f51462b = i;
            this.f51463c = f;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF51462b() {
            return this.f51462b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getF51463c() {
            return this.f51463c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Opaque)) {
                return false;
            }
            Opaque opaque = (Opaque) obj2;
            return this.f51462b == opaque.f51462b && Float.compare(this.f51463c, opaque.f51463c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f51463c) + (Integer.hashCode(this.f51462b) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f51462b);
            dest.writeFloat(this.f51463c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui/models/Color$Solid;", "Lcom/revolut/core/ui/models/Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Solid extends Color {

        @NotNull
        public static final Parcelable.Creator<Solid> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51464b;

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
            this.f51464b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Solid) && this.f51464b == ((Solid) obj2).f51464b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f51464b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f51464b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui/models/Color$SolidInt;", "Lcom/revolut/core/ui/models/Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SolidInt extends Color {

        @NotNull
        public static final Parcelable.Creator<SolidInt> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51465b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SolidInt(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SolidInt[i];
            }
        }

        public SolidInt(int i) {
            this.f51465b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SolidInt) && this.f51465b == ((SolidInt) obj2).f51465b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f51465b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f51465b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui/models/Color$SolidRes;", "Lcom/revolut/core/ui/models/Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SolidRes extends Color {

        @NotNull
        public static final Parcelable.Creator<SolidRes> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51466b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SolidRes(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SolidRes[i];
            }
        }

        public SolidRes(int i) {
            this.f51466b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SolidRes) && this.f51466b == ((SolidRes) obj2).f51466b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f51466b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f51466b);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui.models.Color$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static int a(int i) {
            float[] fArr = Color.f51457a;
            android.graphics.Color.colorToHSV(i, fArr);
            float f = fArr[1];
            if (f > 0.08f) {
                f = 0.08f;
            }
            fArr[1] = f;
            fArr[2] = 1.0f;
            return android.graphics.Color.HSVToColor(android.graphics.Color.alpha(i), fArr);
        }
    }

    private Color() {
    }

    public final String a() {
        if (this instanceof Solid) {
            return d.n("solid_attr:", ((Solid) this).f51464b);
        }
        if (this instanceof SolidInt) {
            return d.n("solid_int:", ((SolidInt) this).f51465b);
        }
        if (this instanceof SolidRes) {
            return d.n("solid_res:", ((SolidRes) this).f51466b);
        }
        if (this instanceof Composite) {
            Composite composite = (Composite) this;
            int f51458b = composite.getF51458b();
            int f51459c = composite.getF51459c();
            String strName = composite.getD().name();
            StringBuilder sbW = a.w("composite:", f51458b, f51459c, ":", ":");
            sbW.append(strName);
            return sbW.toString();
        }
        if (this instanceof ModifiedColor) {
            ModifiedColor modifiedColor = (ModifiedColor) this;
            return "modified:" + modifiedColor.getF51460b().a() + ":" + modifiedColor.getF51461c();
        }
        if (!(this instanceof Opaque)) {
            throw new NoWhenBranchMatchedException();
        }
        Opaque opaque = (Opaque) this;
        return "opaque:" + opaque.getF51462b() + ":" + opaque.getF51463c();
    }
}
