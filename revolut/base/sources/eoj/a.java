package eoj;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import dej.j3;
import dej.l;
import dej.m;
import dej.n3;
import dej.o1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f127987c;
    public final l d;
    public final j3 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o1 f127988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f127989h;
    public final EsimCoverage i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f127990j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n3 f127991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f127992m;

    public a(String id10, String subscriptionId, m mVar, l lVar, j3 subscriptionState, String str, o1 profileState, boolean z, EsimCoverage coverage, boolean z3, Long l2, n3 n3Var, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
        Intrinsics.checkNotNullParameter(profileState, "profileState");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f127985a = id10;
        this.f127986b = subscriptionId;
        this.f127987c = mVar;
        this.d = lVar;
        this.e = subscriptionState;
        this.f = str;
        this.f127988g = profileState;
        this.f127989h = z;
        this.i = coverage;
        this.f127990j = z3;
        this.k = l2;
        this.f127991l = n3Var;
        this.f127992m = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f127985a, aVar.f127985a) && Intrinsics.f(this.f127986b, aVar.f127986b) && this.f127987c == aVar.f127987c && this.d == aVar.d && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && this.f127988g == aVar.f127988g && this.f127989h == aVar.f127989h && Intrinsics.f(this.i, aVar.i) && this.f127990j == aVar.f127990j && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f127991l, aVar.f127991l) && this.f127992m == aVar.f127992m;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f127985a.hashCode() * 31, 31, this.f127986b);
        m mVar = this.f127987c;
        int iHashCode = (iC + (mVar == null ? 0 : mVar.hashCode())) * 31;
        l lVar = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31;
        String str = this.f;
        int iC2 = j6.a.c((this.i.hashCode() + j6.a.c((this.f127988g.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f127989h)) * 31, 31, this.f127990j);
        Long l2 = this.k;
        int iHashCode3 = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        n3 n3Var = this.f127991l;
        return Long.hashCode(this.f127992m) + ((iHashCode3 + (n3Var != null ? n3Var.hashCode() : 0)) * 31);
    }
}
