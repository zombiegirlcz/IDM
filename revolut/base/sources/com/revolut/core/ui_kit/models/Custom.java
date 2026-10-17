package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.db;
import aw0.ga;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/Custom;", "Lcom/revolut/core/ui_kit/models/Style;", "", "toString", "()Ljava/lang/String;", "LinkifyMode", "Color", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Custom extends Style {

    @NotNull
    public static final Parcelable.Creator<Custom> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color f57757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final db f57759c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkifyMode f57760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f57761h;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/models/Custom$LinkifyMode;", "Landroid/os/Parcelable;", "<init>", "()V", "Enabled", "Disabled", "Lcom/revolut/core/ui_kit/models/Custom$LinkifyMode$Disabled;", "Lcom/revolut/core/ui_kit/models/Custom$LinkifyMode$Enabled;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class LinkifyMode implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/Custom$LinkifyMode$Disabled;", "Lcom/revolut/core/ui_kit/models/Custom$LinkifyMode;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Disabled extends LinkifyMode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Disabled f57769a = new Disabled();

            @NotNull
            public static final Parcelable.Creator<Disabled> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Disabled.f57769a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Disabled[i];
                }
            }

            private Disabled() {
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/Custom$LinkifyMode$Enabled;", "Lcom/revolut/core/ui_kit/models/Custom$LinkifyMode;", "Law0/ga;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Enabled extends LinkifyMode implements ga {

            @NotNull
            public static final Parcelable.Creator<Enabled> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57770a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f57771b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f57772c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Enabled(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Enabled[i];
                }
            }

            public Enabled(int i, boolean z, Integer num) {
                this.f57770a = i;
                this.f57771b = z;
                this.f57772c = num;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF57770a() {
                return this.f57770a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getF57771b() {
                return this.f57771b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Enabled)) {
                    return false;
                }
                Enabled enabled = (Enabled) obj2;
                return this.f57770a == enabled.f57770a && this.f57771b == enabled.f57771b && Intrinsics.f(this.f57772c, enabled.f57772c);
            }

            public final int hashCode() {
                int iC = j6.a.c(Integer.hashCode(this.f57770a) * 31, 31, this.f57771b);
                Integer num = this.f57772c;
                return iC + (num == null ? 0 : num.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57770a);
                dest.writeInt(this.f57771b ? 1 : 0);
                Integer num = this.f57772c;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }
        }

        private LinkifyMode() {
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            db dbVar;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Color color = (Color) parcel.readParcelable(Custom.class.getClassLoader());
            boolean z6 = true;
            boolean z11 = parcel.readInt() != 0;
            db dbVarValueOf = parcel.readInt() == 0 ? null : db.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = false;
                dbVar = dbVarValueOf;
                z4 = z;
            } else {
                z3 = false;
                dbVar = dbVarValueOf;
                z4 = false;
            }
            if (parcel.readInt() == 0) {
                z = z3;
            }
            return new Custom(color, z11, dbVar, z6, z4, z, (LinkifyMode) parcel.readParcelable(Custom.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Custom[i];
        }
    }

    public Custom(Color color, boolean z, db dbVar, boolean z3, boolean z4, boolean z6, LinkifyMode linkifyMode, String str) {
        Intrinsics.checkNotNullParameter(linkifyMode, "linkifyMode");
        this.f57757a = color;
        this.f57758b = z;
        this.f57759c = dbVar;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f57760g = linkifyMode;
        this.f57761h = str;
    }

    public static Custom a(Custom custom, Color color, db dbVar, int i) {
        if ((i & 1) != 0) {
            color = custom.f57757a;
        }
        Color color2 = color;
        boolean z = (i & 2) != 0 ? custom.f57758b : true;
        if ((i & 4) != 0) {
            dbVar = custom.f57759c;
        }
        boolean z3 = custom.d;
        boolean z4 = custom.e;
        boolean z6 = custom.f;
        LinkifyMode linkifyMode = custom.f57760g;
        String str = custom.f57761h;
        Intrinsics.checkNotNullParameter(linkifyMode, "linkifyMode");
        return new Custom(color2, z, dbVar, z3, z4, z6, linkifyMode, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Custom)) {
            return false;
        }
        Custom custom = (Custom) obj2;
        return Intrinsics.f(this.f57757a, custom.f57757a) && this.f57758b == custom.f57758b && this.f57759c == custom.f57759c && this.d == custom.d && this.e == custom.e && this.f == custom.f && Intrinsics.f(this.f57760g, custom.f57760g) && Intrinsics.f(this.f57761h, custom.f57761h);
    }

    public final int hashCode() {
        Color color = this.f57757a;
        int iC = j6.a.c((color == null ? 0 : color.hashCode()) * 31, 31, this.f57758b);
        db dbVar = this.f57759c;
        int iHashCode = (this.f57760g.hashCode() + j6.a.c(j6.a.c(j6.a.c((iC + (dbVar == null ? 0 : dbVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31;
        String str = this.f57761h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57757a, i);
        dest.writeInt(this.f57758b ? 1 : 0);
        db dbVar = this.f57759c;
        if (dbVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dbVar.name());
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeParcelable(this.f57760g, i);
        dest.writeString(this.f57761h);
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/models/Custom$Color;", "Landroid/os/Parcelable;", "<init>", "()V", "Solid", "SolidInt", "Highlight", "Gradient", "Lcom/revolut/core/ui_kit/models/Custom$Color$Gradient;", "Lcom/revolut/core/ui_kit/models/Custom$Color$Highlight;", "Lcom/revolut/core/ui_kit/models/Custom$Color$Solid;", "Lcom/revolut/core/ui_kit/models/Custom$Color$SolidInt;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Color implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/Custom$Color$Highlight;", "Lcom/revolut/core/ui_kit/models/Custom$Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Highlight extends Color {

            @NotNull
            public static final Parcelable.Creator<Highlight> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57765a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f57766b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Highlight(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Highlight[i];
                }
            }

            public Highlight(int i, Integer num) {
                this.f57765a = i;
                this.f57766b = num;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF57765a() {
                return this.f57765a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Integer getF57766b() {
                return this.f57766b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Highlight)) {
                    return false;
                }
                Highlight highlight = (Highlight) obj2;
                return this.f57765a == highlight.f57765a && Intrinsics.f(this.f57766b, highlight.f57766b);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f57765a) * 31;
                Integer num = this.f57766b;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57765a);
                Integer num = this.f57766b;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/Custom$Color$Solid;", "Lcom/revolut/core/ui_kit/models/Custom$Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Solid extends Color {

            @NotNull
            public static final Parcelable.Creator<Solid> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57767a;

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
                this.f57767a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF57767a() {
                return this.f57767a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Solid) && this.f57767a == ((Solid) obj2).f57767a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f57767a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57767a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/Custom$Color$SolidInt;", "Lcom/revolut/core/ui_kit/models/Custom$Color;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SolidInt extends Color {

            @NotNull
            public static final Parcelable.Creator<SolidInt> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57768a;

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
                this.f57768a = i;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF57768a() {
                return this.f57768a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SolidInt) && this.f57768a == ((SolidInt) obj2).f57768a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f57768a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57768a);
            }
        }

        private Color() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/Custom$Color$Gradient;", "Lcom/revolut/core/ui_kit/models/Custom$Color;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/c", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Gradient extends Color {

            @NotNull
            public static final Parcelable.Creator<Gradient> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57762a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f57763b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f57764c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Gradient(parcel.readInt(), parcel.readInt(), parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Gradient[i];
                }
            }

            public Gradient(int i, int i2, double d) {
                this.f57762a = i;
                this.f57763b = i2;
                this.f57764c = d;
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
                return this.f57762a == gradient.f57762a && this.f57763b == gradient.f57763b && Double.compare(this.f57764c, gradient.f57764c) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.f57764c) + j6.a.b(this.f57763b, Integer.hashCode(this.f57762a) * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57762a);
                dest.writeInt(this.f57763b);
                dest.writeDouble(this.f57764c);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Gradient(int i, int i2, c orientation) {
                double d;
                Intrinsics.checkNotNullParameter(orientation, "orientation");
                switch (d.f58072a[orientation.ordinal()]) {
                    case 1:
                        d = 315.0d;
                        break;
                    case 2:
                        d = 270.0d;
                        break;
                    case 3:
                        d = 225.0d;
                        break;
                    case 4:
                        d = 180.0d;
                        break;
                    case 5:
                        d = 135.0d;
                        break;
                    case 6:
                        d = 90.0d;
                        break;
                    case 7:
                        d = 45.0d;
                        break;
                    case 8:
                        d = 0.0d;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                this(i, i2, d);
            }
        }
    }

    public /* synthetic */ Custom(Color color, boolean z, boolean z3, int i) {
        this(color, (i & 2) != 0 ? false : z, null, (i & 8) != 0 ? false : z3, false, false, LinkifyMode.Disabled.f57769a, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Custom(Integer num, boolean z, db dbVar, boolean z3, LinkifyMode.Enabled enabled, int i) {
        num = (i & 1) != 0 ? null : num;
        boolean z4 = (i & 2) != 0 ? false : z;
        db dbVar2 = (i & 4) != 0 ? null : dbVar;
        boolean z6 = (i & 8) != 0 ? false : z3;
        boolean z11 = (i & 16) == 0;
        LinkifyMode linkifyMode = (i & 32) != 0 ? LinkifyMode.Disabled.f57769a : enabled;
        Intrinsics.checkNotNullParameter(linkifyMode, "linkifyMode");
        this(num != null ? new Color.Solid(num.intValue()) : null, z4, dbVar2, z6, z11, false, linkifyMode, null);
    }
}
