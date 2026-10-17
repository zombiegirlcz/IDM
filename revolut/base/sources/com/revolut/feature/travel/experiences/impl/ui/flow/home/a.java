package com.revolut.feature.travel.experiences.impl.ui.flow.home;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public TravelExperiencesHomeFlowContract$Step u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f92996w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f92996w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f92996w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            com.revolut.feature.travel.experiences.impl.ui.flow.home.b r5 = r0.f92996w
            if (r2 == 0) goto L26
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step r1 = r0.u
            yhm.o.b(r22)
            r3 = r22
            goto L44
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            yhm.o.b(r22)
            r2 = r22
            goto L32
        L26:
            yhm.o.b(r22)
            r0.v = r4
            java.lang.Object r2 = com.revolut.feature.travel.experiences.impl.ui.flow.home.b.I2(r5, r0)
            if (r2 != r1) goto L32
            goto L42
        L32:
            com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step r2 = (com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step) r2
            eub.e r4 = r5.f93000s
            r0.u = r2
            r0.v = r3
            nyb.f r4 = (nyb.f) r4
            java.lang.Object r3 = r4.a(r0)
            if (r3 != r1) goto L43
        L42:
            return r1
        L43:
            r1 = r2
        L44:
            eub.d r3 = (eub.d) r3
            boolean r2 = r3 instanceof eub.d.a
            if (r2 == 0) goto L4b
            goto L55
        L4b:
            boolean r2 = r3 instanceof eub.c
            if (r2 == 0) goto L6a
            eub.c r3 = (eub.c) r3
            boolean r2 = r3.f129540a
            if (r2 == 0) goto L57
        L55:
            r7 = r1
            goto L5d
        L57:
            com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step$OptIn r2 = new com.revolut.feature.travel.experiences.impl.ui.flow.home.TravelExperiencesHomeFlowContract$Step$OptIn
            r2.<init>(r1)
            r7 = r2
        L5d:
            yki.i r6 = r5.u
            r10 = 0
            r11 = 12
            r8 = 0
            r9 = 0
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L6a:
            boolean r1 = r3 instanceof eub.b
            if (r1 == 0) goto Lbd
            eub.b r3 = (eub.b) r3
            java.lang.Exception r1 = r3.f129539a
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            r4 = 0
            rd0.d.a(r3, r4, r4, r1, r2)
            nii.y0 r1 = new nii.y0
            nii.z r6 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.kompot.common.R$string.common_error_state_title
            r3 = 14
            r7.<init>(r2, r4, r4, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.kompot.common.R$string.common_error_state_description
            r8.<init>(r2, r4, r4, r3)
            r19 = 0
            r20 = 32764(0x7ffc, float:4.5912E-41)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2 = 0
            r3 = 5
            r1.<init>(r4, r6, r2, r3)
            kotlinx.coroutines.flow.Flow r6 = r5.X1(r1)
            iaf.d r9 = new iaf.d
            r1 = 27
            r9.<init>(r5, r4, r1)
            r10 = 3
            r7 = 0
            r8 = 0
            yji.l.a1(r5, r6, r7, r8, r9, r10)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        Lbd:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.experiences.impl.ui.flow.home.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
