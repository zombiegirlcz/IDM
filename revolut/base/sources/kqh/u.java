package kqh;

import cli.y;
import com.revolut.data.model.Data;
import kl.t1;
import klf.a3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends oki.h implements e {
    public final kgm.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f188424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x8h.m f188425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.c f188426r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f188427s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f188428t;

    public u(kgm.c countProvider, t1 groupProvider, x8h.m etpProductAvailabilityInteractor, r stateMapper, h inputData) {
        Intrinsics.checkNotNullParameter(countProvider, "countProvider");
        Intrinsics.checkNotNullParameter(groupProvider, "groupProvider");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = countProvider;
        this.f188424p = groupProvider;
        this.f188425q = etpProductAvailabilityInteractor;
        this.f188426r = new vii.c();
        this.f188428t = mra.d.b(this, new f(inputData.f188412a, new Data(null, null, true, 3, null), r0.g(), true), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(kqh.u r8, zel.f r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof kqh.t
            if (r0 == 0) goto L13
            r0 = r10
            kqh.t r0 = (kqh.t) r0
            int r1 = r0.f188423w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188423w = r1
            goto L18
        L13:
            kqh.t r0 = new kqh.t
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f188423w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L67
        L26:
            r3 = r10
            goto L5b
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            yhm.o.b(r10)
            kgm.c r8 = r8.o     // Catch: java.lang.Exception -> L67
            r0.f188423w = r3     // Catch: java.lang.Exception -> L67
            java.lang.Object r8 = r8.f184018b     // Catch: java.lang.Exception -> L67
            fkg.a r8 = (fkg.a) r8     // Catch: java.lang.Exception -> L67
            zhm.f0 r5 = zhm.f0.f322471a     // Catch: java.lang.Exception -> L67
            java.lang.Object r8 = r8.f135824b     // Catch: java.lang.Exception -> L67
            ugl.c r8 = (ugl.c) r8     // Catch: java.lang.Exception -> L67
            java.util.List r4 = sph.o.a(r9)     // Catch: java.lang.Exception -> L67
            yhl.f r8 = (yhl.f) r8     // Catch: java.lang.Exception -> L67
            prl.e r3 = r8.f314178a     // Catch: java.lang.Exception -> L67
            rhl.b r2 = new rhl.b     // Catch: java.lang.Exception -> L67
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L67
            skm.p0 r8 = skm.p0.f264001a     // Catch: java.lang.Exception -> L67
            elm.f r8 = elm.f.f127540b     // Catch: java.lang.Exception -> L67
            java.lang.Object r10 = skm.e0.J(r8, r2, r0)     // Catch: java.lang.Exception -> L67
            if (r10 != r1) goto L26
            return r1
        L5b:
            com.revolut.data.model.Data r2 = new com.revolut.data.model.Data     // Catch: java.lang.Exception -> L67
            r5 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L67
            return r2
        L65:
            r2 = r8
            goto L6a
        L67:
            r0 = move-exception
            r8 = r0
            goto L65
        L6a:
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 5
            r5 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kqh.u.I2(kqh.u, zel.f, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f188425q.a(), null, null, new jkh.g(this, (Continuation) null, 5), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f188426r.a(Unit.f186387a, w4l.h.f294642c), new a3(continuation, this, 4)), null, new kae.d(this, continuation, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f188428t;
    }
}
