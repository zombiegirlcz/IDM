package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f120846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f120847c;
    public final long d;
    public final Long e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f120848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f120849h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f120850j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f120851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f120852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f120853n;

    public y(String title, x xVar, long j2, long j3, Long l2, int i, t amountType, List infoRanges, String parameterKey, String buttonTitle, String errorMin, String errorMax, String roundingTemplate, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(infoRanges, "infoRanges");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(errorMin, "errorMin");
        Intrinsics.checkNotNullParameter(errorMax, "errorMax");
        Intrinsics.checkNotNullParameter(roundingTemplate, "roundingTemplate");
        this.f120845a = title;
        this.f120846b = xVar;
        this.f120847c = j2;
        this.d = j3;
        this.e = l2;
        this.f = i;
        this.f120848g = amountType;
        this.f120849h = infoRanges;
        this.i = parameterKey;
        this.f120850j = buttonTitle;
        this.k = errorMin;
        this.f120851l = errorMax;
        this.f120852m = roundingTemplate;
        this.f120853n = aVar;
    }

    @Override // dx4.z
    public final long N5() {
        return this.f120847c;
    }

    @Override // dx4.z
    public final List P6() {
        return this.f120849h;
    }

    @Override // dx4.z
    public final Long Q1() {
        return this.e;
    }

    @Override // dx4.z
    public final int S6() {
        return this.f;
    }

    @Override // dx4.z
    public final x V8() {
        return this.f120846b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f120845a, yVar.f120845a) && Intrinsics.f(this.f120846b, yVar.f120846b) && this.f120847c == yVar.f120847c && this.d == yVar.d && Intrinsics.f(this.e, yVar.e) && this.f == yVar.f && Intrinsics.f(this.f120848g, yVar.f120848g) && Intrinsics.f(this.f120849h, yVar.f120849h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f120850j, yVar.f120850j) && Intrinsics.f(this.k, yVar.k) && Intrinsics.f(this.f120851l, yVar.f120851l) && Intrinsics.f(this.f120852m, yVar.f120852m) && Intrinsics.f(this.f120853n, yVar.f120853n);
    }

    @Override // dx4.z
    public final String getTitle() {
        return this.f120845a;
    }

    public final int hashCode() {
        int iHashCode = this.f120845a.hashCode() * 31;
        x xVar = this.f120846b;
        int iC = a0.d.c(a0.d.c((iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.f120847c), 31, this.d);
        Long l2 = this.e;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.d((this.f120848g.hashCode() + j6.a.b(this.f, (iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31)) * 31, 31, this.f120849h), 31, this.i), 31, this.f120850j), 31, this.k), 31, this.f120851l), 31, this.f120852m);
        a aVar = this.f120853n;
        return iC2 + (aVar != null ? aVar.f120542a.hashCode() : 0);
    }

    @Override // dx4.z
    public final t t6() {
        return this.f120848g;
    }

    @Override // dx4.z
    public final long v8() {
        return this.d;
    }
}
