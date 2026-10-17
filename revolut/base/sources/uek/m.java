package uek;

import cli.y;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.PodNomineesPercentageScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import ueg.p0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends oki.h implements dli.b {
    public final PodNomineesPercentageScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lek.b f279480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wek.b f279481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wek.a f279482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qek.a f279483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f279484t;

    public m(PodNomineesPercentageScreenContract$InputData inputData, lek.b podNomineesInteractor, wek.b percentageInteractor, wek.a buttonsDelegate, qek.a dialogMapper, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(podNomineesInteractor, "podNomineesInteractor");
        Intrinsics.checkNotNullParameter(percentageInteractor, "percentageInteractor");
        Intrinsics.checkNotNullParameter(buttonsDelegate, "buttonsDelegate");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f279480p = podNomineesInteractor;
        this.f279481q = percentageInteractor;
        this.f279482r = buttonsDelegate;
        this.f279483s = dialogMapper;
        this.f279484t = mra.d.b(this, new f(null, new d(null, f0.f322471a, false)), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(uek.m r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof uek.j
            if (r0 == 0) goto L13
            r0 = r7
            uek.j r0 = (uek.j) r0
            int r1 = r0.f279476w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279476w = r1
            goto L18
        L13:
            uek.j r0 = new uek.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f279476w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L67
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            lek.b r7 = r6.f279480p
            lek.m r7 = (lek.m) r7
            r7.getClass()
            w4l.j r2 = w4l.j.f294644c
            java.lang.String r4 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            bek.g r7 = r7.f194586a
            r7.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            w4l.f r7 = r7.f14870c
            kotlin.Unit r4 = kotlin.Unit.f186387a
            efm.r r7 = r7.e(r4, r2)
            vkm.d r7 = rd0.e.b(r7)
            zfd.e r7 = zi0.c.w(r7)
            r2 = 3
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r4, r2)
            r0.f279476w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L67
            return r1
        L67:
            java.util.List r7 = (java.util.List) r7
            wek.b r0 = r6.f279481q
            r0.getClass()
            java.lang.String r0 = "nominees"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L84:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r7.next()
            com.revolut.retail.feature.pod_nominees.impl.model.PodNominee r1 = (com.revolut.retail.feature.pod_nominees.impl.model.PodNominee) r1
            uek.e r2 = new uek.e
            int r3 = r1.f102621h
            long r3 = (long) r3
            r5 = 0
            r2.<init>(r1, r3, r5)
            r0.add(r2)
            goto L84
        L9d:
            uek.g r7 = new uek.g
            ap9.b$a r1 = ap9.b.a.f8121a
            r7.<init>(r1, r0)
            cli.y r0 = r6.f279484t
            ud3.n r1 = new ud3.n
            r2 = 16
            r1.<init>(r7, r2)
            r6.H2(r0, r1)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uek.m.I2(uek.m, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null, 0), new yi5.b(26));
        yji.l.a1(this, this.f279484t.B(new p0(5)), null, null, new u7k.f0(this, null, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f279484t;
    }
}
