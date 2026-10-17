package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/PeriodClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "", "toString", "()Ljava/lang/String;", "PeriodComponents", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeriodClause implements Clause, fa {

    @NotNull
    public static final Parcelable.Creator<PeriodClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeriodComponents f57912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Style f57913b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/PeriodClause$PeriodComponents;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeriodComponents implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PeriodComponents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f57915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f57916c;
        public final int d;
        public final int e;
        public final int f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeriodComponents(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeriodComponents[i];
            }
        }

        public PeriodComponents() {
            this(0, 0, 0, 0, 0, 0, 63);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF57915b() {
            return this.f57915b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getF57914a() {
            return this.f57914a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PeriodComponents)) {
                return false;
            }
            PeriodComponents periodComponents = (PeriodComponents) obj2;
            return this.f57914a == periodComponents.f57914a && this.f57915b == periodComponents.f57915b && this.f57916c == periodComponents.f57916c && this.d == periodComponents.d && this.e == periodComponents.e && this.f == periodComponents.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f57916c, j6.a.b(this.f57915b, Integer.hashCode(this.f57914a) * 31, 31), 31), 31), 31);
        }

        /* JADX INFO: renamed from: q7, reason: from getter */
        public final int getF57916c() {
            return this.f57916c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f57914a);
            dest.writeInt(this.f57915b);
            dest.writeInt(this.f57916c);
            dest.writeInt(this.d);
            dest.writeInt(this.e);
            dest.writeInt(this.f);
        }

        public PeriodComponents(int i, int i2, int i3, int i5, int i6, int i21) {
            this.f57914a = i;
            this.f57915b = i2;
            this.f57916c = i3;
            this.d = i5;
            this.e = i6;
            this.f = i21;
        }

        public /* synthetic */ PeriodComponents(int i, int i2, int i3, int i5, int i6, int i21, int i22) {
            this((i22 & 1) != 0 ? 0 : i, (i22 & 2) != 0 ? 0 : i2, (i22 & 4) != 0 ? 0 : i3, (i22 & 8) != 0 ? 0 : i5, (i22 & 16) != 0 ? 0 : i6, (i22 & 32) != 0 ? 0 : i21);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PeriodClause(PeriodComponents.CREATOR.createFromParcel(parcel), (Style) parcel.readParcelable(PeriodClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeriodClause[i];
        }
    }

    public PeriodClause(PeriodComponents period, Style style) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f57912a = period;
        this.f57913b = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PeriodComponents getF57912a() {
        return this.f57912a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PeriodClause)) {
            return false;
        }
        PeriodClause periodClause = (PeriodClause) obj2;
        return Intrinsics.f(this.f57912a, periodClause.f57912a) && Intrinsics.f(this.f57913b, periodClause.f57913b);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57913b() {
        return this.f57913b;
    }

    public final int hashCode() {
        int iHashCode = this.f57912a.hashCode() * 31;
        Style style = this.f57913b;
        return iHashCode + (style == null ? 0 : style.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f57912a.writeToParcel(dest, i);
        dest.writeParcelable(this.f57913b, i);
    }
}
