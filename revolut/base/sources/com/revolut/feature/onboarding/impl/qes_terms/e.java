package com.revolut.feature.onboarding.impl.qes_terms;

import com.revolut.feature.onboarding.impl.qes_terms.QesTermsFlowContract$Step;
import de9.m;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f78556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f78557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ QesTermsFlowContract$Step.Passcode f78558y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, boolean z, h hVar, QesTermsFlowContract$Step.Passcode passcode, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f78556w = z;
        this.f78557x = hVar;
        this.f78558y = passcode;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f78556w, this.f78557x, this.f78558y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (com.revolut.feature.onboarding.impl.qes_terms.h.J2(r7, r9, r1, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (com.revolut.feature.onboarding.impl.qes_terms.h.J2(r7, r9, r1, r8) == r0) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r9)
            goto L61
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            yhm.o.b(r9)
            goto L4a
        L1c:
            yhm.o.b(r9)
            de9.m r9 = r8.v
            boolean r1 = r9 instanceof de9.j
            r4 = 0
            boolean r5 = r8.f78556w
            com.revolut.feature.onboarding.impl.qes_terms.QesTermsFlowContract$Step$Passcode r6 = r8.f78558y
            com.revolut.feature.onboarding.impl.qes_terms.h r7 = r8.f78557x
            if (r1 == 0) goto L4d
            if (r5 == 0) goto L3c
            com.revolut.feature.onboarding.impl.qes_terms.c r1 = new com.revolut.feature.onboarding.impl.qes_terms.c
            r1.<init>(r6, r7, r4)
            r8.u = r3
            java.lang.Object r9 = com.revolut.feature.onboarding.impl.qes_terms.h.J2(r7, r9, r1, r8)
            if (r9 != r0) goto L4a
            goto L60
        L3c:
            com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$Mode$InitProcessAndPollResult r0 = new com.revolut.feature.onboarding.impl.qes.waiting_qes_result.WaitingForQesResultScreenContract$Mode$InitProcessAndPollResult
            de9.j r9 = (de9.j) r9
            java.lang.String r9 = r9.f113326a
            r0.<init>(r9)
            java.util.List r9 = r6.f78542a
            r7.U2(r9, r0)
        L4a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L4d:
            boolean r1 = r9 instanceof de9.k
            if (r1 == 0) goto L79
            if (r5 == 0) goto L64
            com.revolut.feature.onboarding.impl.qes_terms.d r1 = new com.revolut.feature.onboarding.impl.qes_terms.d
            r1.<init>(r6, r7, r4)
            r8.u = r2
            java.lang.Object r9 = com.revolut.feature.onboarding.impl.qes_terms.h.J2(r7, r9, r1, r8)
            if (r9 != r0) goto L61
        L60:
            return r0
        L61:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Received SuccessBiometric for PASSKEY auth type, which should be disabled."
            r9.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r9, r0)
            skm.a2 r9 = r7.R2()
            return r9
        L79:
            boolean r0 = r9 instanceof de9.i
            if (r0 == 0) goto L90
            oc9.h r9 = new oc9.h
            r0 = 0
            r9.<init>(r7, r4, r0)
            yi5.b r0 = new yi5.b
            r1 = 26
            r0.<init>(r1)
            r7.l2(r9, r0)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L90:
            boolean r9 = r9 instanceof de9.l
            if (r9 == 0) goto L9c
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "UsePassword is not support in QesTerms flow"
            r9.<init>(r0)
            throw r9
        L9c:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.qes_terms.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
