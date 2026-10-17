package hha;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f152311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f152312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f152313c;
    public final dj0.d d;
    public final o e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f152314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f152315h;

    public i0(Period period, Long l2, Long l3, dj0.d fee2, o oVar, String str, p postDiscountOption, h0 h0Var) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(postDiscountOption, "postDiscountOption");
        this.f152311a = period;
        this.f152312b = l2;
        this.f152313c = l3;
        this.d = fee2;
        this.e = oVar;
        this.f = str;
        this.f152314g = postDiscountOption;
        this.f152315h = h0Var;
    }

    @Override // hha.q
    public final dj0.d A0() {
        return this.d;
    }

    @Override // hha.q
    public final p c6() {
        return this.f152314g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f152311a, i0Var.f152311a) && Intrinsics.f(this.f152312b, i0Var.f152312b) && Intrinsics.f(this.f152313c, i0Var.f152313c) && Intrinsics.f(this.d, i0Var.d) && Intrinsics.f(this.e, i0Var.e) && Intrinsics.f(this.f, i0Var.f) && this.f152314g == i0Var.f152314g && this.f152315h == i0Var.f152315h;
    }

    public final int hashCode() {
        Period period = this.f152311a;
        int iHashCode = (period == null ? 0 : period.hashCode()) * 31;
        Long l2 = this.f152312b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f152313c;
        int iC = v7.c((iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.d);
        o oVar = this.e;
        int iHashCode3 = (iC + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str = this.f;
        int iHashCode4 = (this.f152314g.hashCode() + ((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        h0 h0Var = this.f152315h;
        return iHashCode4 + (h0Var != null ? h0Var.hashCode() : 0);
    }
}
