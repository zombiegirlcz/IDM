package i4h;

import ael.q0;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.hi;
import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 extends e3h.k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e3h.d f158468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b4h.e f158469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ryc.a f158470n;
    public final zhl.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f158471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zhl.n f158472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ael.d0 f158473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.k f158474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kpj.f f158475t;
    public final ybl.l u;
    public final yhl.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fxk.a f158476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f158477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vki.a f158478y;
    public final od0.i z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p0(e3h.d r36, b4h.e r37, ryc.a r38, zhl.k r39, ybl.b r40, zhl.n r41, ael.d0 r42, ybl.k r43, kpj.f r44, ybl.l r45, yhl.h r46, fxk.a r47, gte.a r48) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4h.p0.<init>(e3h.d, b4h.e, ryc.a, zhl.k, ybl.b, zhl.n, ael.d0, ybl.k, kpj.f, ybl.l, yhl.h, fxk.a, gte.a):void");
    }

    public static final eel.l b3(p0 p0Var, TrendViewDelegate.a aVar, Data data) {
        eel.k kVar;
        List list;
        List list2;
        if (aVar instanceof mi) {
            eel.k kVar2 = (eel.k) data.getContent();
            if (kVar2 == null || (list2 = kVar2.f125232a) == null) {
                return null;
            }
            return (eel.l) zhm.d0.e0(((mi) aVar).f54485b, list2);
        }
        if (!(aVar instanceof hi) || (kVar = (eel.k) data.getContent()) == null || (list = kVar.f125232a) == null) {
            return null;
        }
        return (eel.l) zhm.d0.e0(((hi) aVar).d, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final e3h.h c3(i4h.p0 r11, o4l.b r12, eel.c r13, java.lang.Long r14, nel.p0 r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4h.p0.c3(i4h.p0, o4l.b, eel.c, java.lang.Long, nel.p0):e3h.h");
    }

    @Override // yji.n
    public final void D2() {
        T2(new x(this, null), new yi5.b(27));
    }

    @Override // yji.n
    public final void H2() {
        i3k.h hVar = new i3k.h(27);
        vki.a aVar = this.f158478y;
        Continuation continuation = null;
        yji.n.l2(this, vkm.q.Q(aVar.B(hVar), new u(2, this, continuation)), null, new z(this, null), 3);
        yji.n.l2(this, vkm.q.Q(new t0(aVar.B(new i3k.h(26)), 1), new u(3, this, continuation)), null, new d0(this, null), 3);
        yji.n.l2(this, e3(new o(this, 1)), null, new c0(this, null), 3);
        yji.n.l2(this, e3(new o(this, 8)), null, new b0(this, null), 3);
        yji.n.l2(this, e3(new o(this, 0)), null, new a0(this, null), 3);
        yji.n.l2(this, ybl.l.d(this.u), null, new e0(this, null), 3);
        yji.n.l2(this, vkm.q.Q(new t0(aVar.B(new i3k.h(25)), 1), new u(1, this, continuation)), null, new y(this, null), 3);
        yji.n.l2(this, vkm.q.Q(aVar.B(new i3k.h(24)), new u(0, this, continuation)), null, new v(this, null), 3);
        e3h.d dVar = this.f158468l;
        if (dVar.e) {
            yji.n.l2(this, vkm.q.H(new f0(this, null), yh5.b.i(aVar.B(new q(3)), aVar.B(new q(4)), aVar.B(new q(5)), aVar.B(new q(6)), nim.a.v(aVar.B(new i3k.h(29)), new q(2)), vkm.q.Q(e3(new o(this, 7)), new u(4, this, continuation)))), null, new g0(this, null), 3);
        } else {
            X2(aVar, new i3k.h(23));
        }
        yji.n.l2(this, vkm.q.q(new g48.r(mo3.a.g(((q0) this.f158474s).n(dVar.d, w4l.h.f294642c, cfl.m.f23746a), null, null, 3), 11)), new e31.i(2, 27, continuation), new i44.a(this, continuation, 3), 2);
    }

    @Override // e3h.k
    public final void Z2(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        X2(this.f158478y, new ho6.n(ref2, 14));
    }

    public final void d3() {
        V2(new m0(0, this, null), new yi5.b(29));
    }

    public final wkm.l e3(Function1 function1) {
        return vkm.q.Q(this.f158478y.B(new i3k.h(28)), new o0(0, null, function1));
    }

    public final void f3() {
        nel.z zVar;
        i4l.a aVar;
        eel.i iVar;
        vki.a aVar2 = this.f158478y;
        j2 j2Var = (j2) aVar2.f22677a;
        j2 j2Var2 = (j2) aVar2.f22677a;
        nel.n nVar = ((e3h.c) j2Var.getValue()).d;
        if (nVar == null || (zVar = nVar.f214597c) == null) {
            return;
        }
        Continuation continuation = null;
        if (io3.h.i(zVar)) {
            int i = r.f158482c[((e3h.c) j2Var2.getValue()).f122279m.ordinal()];
            if (i == 1) {
                iVar = eel.i.YTM;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar = eel.i.PRICE;
            }
            V2(new hsd.c(this, zVar, iVar, continuation, 13), new yi5.b(29));
            return;
        }
        int i2 = r.f158481b[((e3h.c) j2Var2.getValue()).f122273b.ordinal()];
        if (i2 == 1) {
            aVar = i4l.a.CANDLESTICK;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = i4l.a.LINE;
        }
        V2(new hsd.c(this, zVar, aVar, continuation, 14), new yi5.b(29));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f158478y;
    }
}
