package tk2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import vkm.j2;
import vkm.t1;
import vkm.u1;
import vkm.z1;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ukm.q f271845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vkm.e f271846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f271847c;
    public final t1 d;
    public final ukm.q e;
    public final vkm.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2 f271848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u1 f271849h;
    public final z1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t1 f271850j;
    public final j2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u1 f271851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j2 f271852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j2 f271853n;
    public final u1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u1 f271854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f271855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u1 f271856r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f271857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u1 f271858t;
    public final j2 u;
    public final u1 v;

    public p() {
        ukm.q qVarA = s.a(-2, null, null, 6);
        this.f271845a = qVarA;
        this.f271846b = vkm.q.K(qVarA);
        z1 z1VarB = vkm.q.b(1, 4, null);
        this.f271847c = z1VarB;
        this.d = vkm.q.g(z1VarB);
        ukm.q qVarA2 = s.a(-2, null, null, 6);
        this.e = qVarA2;
        this.f = vkm.q.K(qVarA2);
        j2 j2VarY = m72.b.y(null, null, true, 3, null);
        this.f271848g = j2VarY;
        this.f271849h = vkm.q.h(j2VarY);
        z1 z1VarB2 = vkm.q.b(1, 4, null);
        this.i = z1VarB2;
        this.f271850j = vkm.q.g(z1VarB2);
        j2 j2VarC = vkm.q.c(zv0.b.HIDDEN);
        this.k = j2VarC;
        this.f271851l = vkm.q.h(j2VarC);
        j2 j2VarC2 = vkm.q.c(null);
        this.f271852m = j2VarC2;
        j2 j2VarC3 = vkm.q.c(null);
        this.f271853n = j2VarC3;
        this.o = vkm.q.h(j2VarC2);
        this.f271854p = vkm.q.h(j2VarC3);
        j2 j2VarC4 = vkm.q.c(null);
        this.f271855q = j2VarC4;
        this.f271856r = vkm.q.h(j2VarC4);
        j2 j2VarC5 = vkm.q.c(null);
        this.f271857s = j2VarC5;
        this.f271858t = vkm.q.h(j2VarC5);
        j2 j2VarC6 = vkm.q.c(null);
        this.u = j2VarC6;
        this.v = vkm.q.h(j2VarC6);
    }

    public final void a(g command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (command instanceof f) {
            this.f271847c.k(command);
        } else {
            if (!(command instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.e.mo3647trySendJP2dKIU(command);
        }
    }

    public final void b(n intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f271845a.mo3647trySendJP2dKIU(intent);
    }
}
