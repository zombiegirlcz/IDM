package com.revolut.feature.rev_points.params;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lk0.f;
import m1c.f1;
import m1c.s1;
import m1c.t1;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/params/RevPointsTransactionPageParams;", "Llk0/f;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsTransactionPageParams extends f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f84105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f84106c;
    public final String d;
    public final f1 e;
    public final s1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1 f84107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f84108h;
    public final List i;

    @NotNull
    public static final Parcelable.Creator<RevPointsTransactionPageParams> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsTransactionPageParams(parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : f1.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : s1.valueOf(parcel.readString()), parcel.readInt() != 0 ? t1.valueOf(parcel.readString()) : null, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsTransactionPageParams[i];
        }
    }

    public RevPointsTransactionPageParams() {
        this(0, null, null, null, null, null, null, null, null, 511);
    }

    public static RevPointsTransactionPageParams b(RevPointsTransactionPageParams revPointsTransactionPageParams, Long l2, int i) {
        int i2 = (i & 1) != 0 ? revPointsTransactionPageParams.f84104a : 100;
        if ((i & 2) != 0) {
            l2 = revPointsTransactionPageParams.f84105b;
        }
        Long l3 = l2;
        Long l4 = (i & 4) != 0 ? revPointsTransactionPageParams.f84106c : null;
        String str = revPointsTransactionPageParams.d;
        f1 f1Var = revPointsTransactionPageParams.e;
        s1 s1Var = revPointsTransactionPageParams.f;
        t1 t1Var = revPointsTransactionPageParams.f84107g;
        List originIds = revPointsTransactionPageParams.f84108h;
        List pointsTransactionIds = revPointsTransactionPageParams.i;
        revPointsTransactionPageParams.getClass();
        Intrinsics.checkNotNullParameter(originIds, "originIds");
        Intrinsics.checkNotNullParameter(pointsTransactionIds, "pointsTransactionIds");
        return new RevPointsTransactionPageParams(i2, l3, l4, str, f1Var, s1Var, t1Var, originIds, pointsTransactionIds);
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF84104a() {
        return this.f84104a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!RevPointsTransactionPageParams.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.rev_points.params.RevPointsTransactionPageParams");
        RevPointsTransactionPageParams revPointsTransactionPageParams = (RevPointsTransactionPageParams) obj2;
        return this.f84104a == revPointsTransactionPageParams.f84104a && Intrinsics.f(this.f84105b, revPointsTransactionPageParams.f84105b) && Intrinsics.f(this.f84106c, revPointsTransactionPageParams.f84106c) && Intrinsics.f(this.d, revPointsTransactionPageParams.d) && this.e == revPointsTransactionPageParams.e && this.f == revPointsTransactionPageParams.f && this.f84107g == revPointsTransactionPageParams.f84107g && Intrinsics.f(this.f84108h, revPointsTransactionPageParams.f84108h) && Intrinsics.f(this.i, revPointsTransactionPageParams.i);
    }

    public final int hashCode() {
        int i = this.f84104a * 31;
        Long l2 = this.f84105b;
        int iHashCode = (i + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31;
        Long l3 = this.f84106c;
        int iHashCode2 = (iHashCode + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        f1 f1Var = this.e;
        int iHashCode4 = (iHashCode3 + (f1Var != null ? f1Var.hashCode() : 0)) * 31;
        s1 s1Var = this.f;
        int iHashCode5 = (iHashCode4 + (s1Var != null ? s1Var.hashCode() : 0)) * 31;
        t1 t1Var = this.f84107g;
        return this.i.hashCode() + a.d((iHashCode5 + (t1Var != null ? t1Var.hashCode() : 0)) * 31, 31, this.f84108h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f84104a);
        Long l2 = this.f84105b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        Long l3 = this.f84106c;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l3);
        }
        dest.writeString(this.d);
        f1 f1Var = this.e;
        if (f1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(f1Var.name());
        }
        s1 s1Var = this.f;
        if (s1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(s1Var.name());
        }
        t1 t1Var = this.f84107g;
        if (t1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(t1Var.name());
        }
        dest.writeStringList(this.f84108h);
        dest.writeStringList(this.i);
    }

    public RevPointsTransactionPageParams(int i, Long l2, Long l3, String str, f1 f1Var, s1 s1Var, t1 t1Var, List originIds, List pointsTransactionIds) {
        Intrinsics.checkNotNullParameter(originIds, "originIds");
        Intrinsics.checkNotNullParameter(pointsTransactionIds, "pointsTransactionIds");
        this.f84104a = i;
        this.f84105b = l2;
        this.f84106c = l3;
        this.d = str;
        this.e = f1Var;
        this.f = s1Var;
        this.f84107g = t1Var;
        this.f84108h = originIds;
        this.i = pointsTransactionIds;
    }

    public RevPointsTransactionPageParams(int i, Long l2, Long l3, String str, f1 f1Var, s1 s1Var, t1 t1Var, List list, List list2, int i2) {
        this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? null : l2, (i2 & 4) != 0 ? null : l3, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : f1Var, (i2 & 32) != 0 ? null : s1Var, (i2 & 64) == 0 ? t1Var : null, (i2 & 128) != 0 ? f0.f322471a : list, (i2 & 256) != 0 ? f0.f322471a : list2);
    }
}
