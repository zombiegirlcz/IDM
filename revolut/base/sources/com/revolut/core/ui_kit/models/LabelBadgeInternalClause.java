package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "", "toString", "()Ljava/lang/String;", "Type", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LabelBadgeInternalClause implements Clause {

    @NotNull
    public static final Parcelable.Creator<LabelBadgeInternalClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f57794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f57795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f57796c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type;", "Landroid/os/Parcelable;", "<init>", "()V", "Gif", "Quantity", "Inline", "Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type$Gif;", "Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type$Inline;", "Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type$Quantity;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Type implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type$Gif;", "Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Gif extends Type {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Gif f57797a = new Gif();

            @NotNull
            public static final Parcelable.Creator<Gif> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Gif.f57797a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Gif[i];
                }
            }

            private Gif() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type$Inline;", "Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/i", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Inline extends Type {

            @NotNull
            public static final Parcelable.Creator<Inline> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f57798a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final i f57799b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Inline((Clause) parcel.readParcelable(Inline.class.getClassLoader()), i.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Inline[i];
                }
            }

            public Inline(Clause clause, i widthMode) {
                Intrinsics.checkNotNullParameter(clause, "clause");
                Intrinsics.checkNotNullParameter(widthMode, "widthMode");
                this.f57798a = clause;
                this.f57799b = widthMode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Clause getF57798a() {
                return this.f57798a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final i getF57799b() {
                return this.f57799b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Inline)) {
                    return false;
                }
                Inline inline = (Inline) obj2;
                return Intrinsics.f(this.f57798a, inline.f57798a) && this.f57799b == inline.f57799b;
            }

            public final int hashCode() {
                return this.f57799b.hashCode() + (this.f57798a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57798a, i);
                dest.writeString(this.f57799b.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type$Quantity;", "Lcom/revolut/core/ui_kit/models/LabelBadgeInternalClause$Type;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Quantity extends Type {

            @NotNull
            public static final Parcelable.Creator<Quantity> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f57800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f57801b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Quantity(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Quantity[i];
                }
            }

            public Quantity(int i, int i2) {
                this.f57800a = i;
                this.f57801b = i2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF57800a() {
                return this.f57800a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getF57801b() {
                return this.f57801b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Quantity)) {
                    return false;
                }
                Quantity quantity = (Quantity) obj2;
                return this.f57800a == quantity.f57800a && this.f57801b == quantity.f57801b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f57801b) + (Integer.hashCode(this.f57800a) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57800a);
                dest.writeInt(this.f57801b);
            }
        }

        private Type() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LabelBadgeInternalClause((Type) parcel.readParcelable(LabelBadgeInternalClause.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LabelBadgeInternalClause[i];
        }
    }

    public LabelBadgeInternalClause(Type type, Float f, Float f4) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f57794a = type;
        this.f57795b = f;
        this.f57796c = f4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getF57796c() {
        return this.f57796c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getF57795b() {
        return this.f57795b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Type getF57794a() {
        return this.f57794a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LabelBadgeInternalClause)) {
            return false;
        }
        LabelBadgeInternalClause labelBadgeInternalClause = (LabelBadgeInternalClause) obj2;
        return Intrinsics.f(this.f57794a, labelBadgeInternalClause.f57794a) && Intrinsics.f(this.f57795b, labelBadgeInternalClause.f57795b) && Intrinsics.f(this.f57796c, labelBadgeInternalClause.f57796c);
    }

    public final int hashCode() {
        int iHashCode = this.f57794a.hashCode() * 31;
        Float f = this.f57795b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.f57796c;
        return iHashCode2 + (f4 != null ? f4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57794a, i);
        Float f = this.f57795b;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
        Float f4 = this.f57796c;
        if (f4 == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f4);
        }
    }

    public /* synthetic */ LabelBadgeInternalClause(Type.Inline inline) {
        this(inline, null, null);
    }
}
