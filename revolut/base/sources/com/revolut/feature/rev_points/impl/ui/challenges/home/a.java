package com.revolut.feature.rev_points.impl.ui.challenges.home;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m1c.m0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((m0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.u
            m1c.m0 r0 = (m1c.m0) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            com.revolut.feature.rev_points.impl.ui.challenges.home.b r8 = r7.v
            com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$InputData r1 = r8.o
            com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$Action r1 = r1.f83782a
            com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$Action$OpenChallengeDetails r1 = (com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$Action.OpenChallengeDetails) r1
            com.revolut.feature.rev_points.models.ChallengeId r1 = r1.f83781a
            java.util.ArrayList r2 = r0.f201408a
            java.util.ArrayList r3 = r0.f201409b
            java.util.List r4 = r0.f201410c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r2 = zhm.d0.E0(r4, r2)
            boolean r5 = r2.isEmpty()
            r6 = 0
            if (r5 == 0) goto L27
            goto L40
        L27:
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L40
            java.lang.Object r5 = r2.next()
            m1c.l0 r5 = (m1c.l0) r5
            boolean r5 = com.revolut.feature.rev_points.impl.ui.challenges.home.b.I2(r5, r1)
            if (r5 == 0) goto L2b
            ezb.i r2 = ezb.i.ACTIVE
            goto L61
        L40:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L47
            goto L60
        L47:
            java.util.Iterator r2 = r3.iterator()
        L4b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L60
            java.lang.Object r5 = r2.next()
            m1c.l0 r5 = (m1c.l0) r5
            boolean r5 = com.revolut.feature.rev_points.impl.ui.challenges.home.b.I2(r5, r1)
            if (r5 == 0) goto L4b
            ezb.i r2 = ezb.i.COMPLETED
            goto L61
        L60:
            r2 = r6
        L61:
            java.util.ArrayList r0 = r0.f201408a
            java.util.ArrayList r0 = zhm.d0.E0(r3, r0)
            java.util.ArrayList r0 = zhm.d0.E0(r4, r0)
            java.util.Iterator r0 = r0.iterator()
        L6f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L83
            java.lang.Object r3 = r0.next()
            r4 = r3
            m1c.l0 r4 = (m1c.l0) r4
            boolean r4 = com.revolut.feature.rev_points.impl.ui.challenges.home.b.I2(r4, r1)
            if (r4 == 0) goto L6f
            goto L84
        L83:
            r3 = r6
        L84:
            m1c.l0 r3 = (m1c.l0) r3
            if (r2 == 0) goto Lb2
            if (r3 == 0) goto Lb2
            cli.y r0 = r8.v
            eu7.c r1 = new eu7.c
            r4 = 20
            r1.<init>(r2, r4)
            r8.H2(r0, r1)
            m1c.i0 r0 = r3.f201389j
            m1c.i0 r1 = m1c.i0.COMPLETED
            if (r0 != r1) goto Lad
            ew1.d r0 = new ew1.d
            r1 = 15
            r0.<init>(r8, r3, r6, r1)
            whi.b r1 = new whi.b
            r2 = 6
            r1.<init>(r2)
            r8.n2(r0, r1)
            goto Lb2
        Lad:
            java.lang.String r0 = r3.f201384a
            r8.J2(r0)
        Lb2:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.impl.ui.challenges.home.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
