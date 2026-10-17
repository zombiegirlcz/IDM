package hcm;

import com.google.common.base.Preconditions;
import ecm.m1;
import ecm.p1;
import gcm.e6;
import gcm.k6;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends gcm.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final mmm.h f151300r = new mmm.h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1 f151301j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e6 f151302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f151303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f151304n;
    public final ecm.q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ecm.b f151305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f151306q;

    public p(p1 p1Var, m1 m1Var, f fVar, t tVar, g0 g0Var, Object obj2, int i, int i2, String str, String str2, e6 e6Var, k6 k6Var, ecm.d dVar) {
        super(new c0(), e6Var, k6Var, m1Var, dVar, false);
        this.o = new ecm.q(this, 12);
        this.f151306q = false;
        this.f151302l = (e6) Preconditions.checkNotNull(e6Var, "statsTraceCtx");
        this.f151301j = p1Var;
        this.f151303m = str;
        this.k = str2;
        this.f151305p = tVar.u;
        String str3 = p1Var.f124857b;
        this.f151304n = new o(this, i, e6Var, obj2, fVar, g0Var, tVar, i2, dVar);
    }
}
