package kkf;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class g7 extends gim.i implements oim.o {
    public /* synthetic */ Data u;
    public /* synthetic */ qua.p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ kr2.h f184703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ tof.a3 f184704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i7 f184705y;
    public final /* synthetic */ nof.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(i7 i7Var, nof.i iVar, Continuation continuation) {
        super(5, continuation);
        this.f184705y = i7Var;
        this.z = iVar;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        g7 g7Var = new g7(this.f184705y, this.z, (Continuation) obj6);
        g7Var.u = (Data) obj2;
        g7Var.v = (qua.p) obj3;
        g7Var.f184703w = (kr2.h) obj4;
        g7Var.f184704x = (tof.a3) obj5;
        return g7Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            com.revolut.data.model.Data r0 = r11.u
            qua.p r1 = r11.v
            kr2.h r2 = r11.f184703w
            tof.a3 r3 = r11.f184704x
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r12)
            boolean r12 = k71.k.q0(r3)
            if (r12 != 0) goto L90
            boolean r12 = k71.k.T(r3)
            if (r12 == 0) goto L1b
            goto L90
        L1b:
            aim.e r12 = zhm.u.b()
            klf.t2 r3 = klf.z2.Companion
            r3.getClass()
            boolean r1 = klf.t2.a(r1)
            if (r1 == 0) goto L37
            klf.a r1 = klf.c.Companion
            r1.getClass()
            if (r2 == 0) goto L37
            boolean r1 = r2 instanceof kr2.g
            if (r1 == 0) goto L37
            r1 = 0
            goto L38
        L37:
            r1 = 1
        L38:
            nof.i r2 = r11.z
            nof.m r2 = (nof.m) r2
            r2.getClass()
            java.lang.String r3 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.Object r3 = r0.getContent()
            nof.g r3 = (nof.g) r3
            if (r3 == 0) goto L53
            nof.h r0 = r2.f218040a
            java.util.List r0 = r0.d(r3, r1)
            goto L86
        L53:
            boolean r0 = r0.getLoading()
            if (r0 == 0) goto L84
            ip0.s7 r1 = new ip0.s7
            r8 = 0
            r9 = 126(0x7e, float:1.77E-43)
            java.lang.String r2 = "ID_STATS_LOADING_1"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            ip0.s7 r2 = new ip0.s7
            r9 = 0
            r10 = 126(0x7e, float:1.77E-43)
            java.lang.String r3 = "ID_STATS_LOADING_2"
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            ip0.s7[] r0 = new ip0.s7[]{r1, r2}
            java.util.List r1 = zhm.v.k(r0)
            r6 = 31
            r2 = 0
            r3 = 0
            yp0.b.k(r1, r2, r3, r4, r5, r6)
            r0 = r1
            goto L86
        L84:
            zhm.f0 r0 = zhm.f0.f322471a
        L86:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            zhm.a0.x(r0, r12)
            aim.e r12 = zhm.u.a(r12)
            return r12
        L90:
            zhm.f0 r12 = zhm.f0.f322471a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.g7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
