package dej;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import ip0.v7;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f113521c;
    public final l d;
    public final Period e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimCoverage f113522g;

    public d1(String id10, String name, dj0.d price, l lVar, Period duration, long j2, EsimCoverage coverage) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f113519a = id10;
        this.f113520b = name;
        this.f113521c = price;
        this.d = lVar;
        this.e = duration;
        this.f = j2;
        this.f113522g = coverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f113519a, d1Var.f113519a) && Intrinsics.f(this.f113520b, d1Var.f113520b) && Intrinsics.f(this.f113521c, d1Var.f113521c) && this.d == d1Var.d && Intrinsics.f(this.e, d1Var.e) && this.f == d1Var.f && Intrinsics.f(this.f113522g, d1Var.f113522g);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(this.f113519a.hashCode() * 31, 31, this.f113520b), 31, this.f113521c);
        l lVar = this.d;
        return this.f113522g.hashCode() + a0.d.c((this.e.hashCode() + ((iC + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31, 31, this.f);
    }
}
