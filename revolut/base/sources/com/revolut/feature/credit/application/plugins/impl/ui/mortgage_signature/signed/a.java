package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed;

import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yy3.e;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public h1 u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f68046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f68047x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f68047x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f68047x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (c84.t.N2(r0, r11, r10, 2) == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.b r0 = r10.f68047x
            px3.a r1 = r0.f68049q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.f68046w
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L2d
            if (r3 == r6) goto L27
            if (r3 == r5) goto L21
            if (r3 != r4) goto L19
            yhm.o.b(r11)
            goto La0
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            yy3.e r1 = r10.v
            yhm.o.b(r11)
            goto L70
        L27:
            ft3.h1 r3 = r10.u
            yhm.o.b(r11)
            goto L4f
        L2d:
            yhm.o.b(r11)
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlowContract$InputData r11 = r0.f68048p
            ft3.h1 r3 = r11.a9()
            r10.u = r3
            r10.f68046w = r6
            t34.e r11 = r1.f240564a
            r11.getClass()
            t34.b r6 = new t34.b
            r6.<init>(r11, r3, r7, r4)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r6, r10)
            if (r11 != r2) goto L4f
            goto L9f
        L4f:
            yy3.e r11 = (yy3.e) r11
            r10.u = r7
            r10.v = r11
            r10.f68046w = r5
            t34.e r1 = r1.f240564a
            r1.getClass()
            t34.b r6 = new t34.b
            r8 = 0
            r6.<init>(r1, r3, r7, r8)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r6, r10)
            if (r1 != r2) goto L6d
            goto L9f
        L6d:
            r9 = r1
            r1 = r11
            r11 = r9
        L70:
            it3.d r11 = (it3.d) r11
            boolean r3 = r1 instanceof yy3.c
            if (r3 == 0) goto L8d
            r3 = r1
            yki.a r1 = r0.f68050r
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlowContract$Step$Prompt r2 = new com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlowContract$Step$Prompt
            r11 = r3
            yy3.c r11 = (yy3.c) r11
            ht3.g r11 = r11.f317766a
            r2.<init>(r11)
            com.revolut.kompot.navigable.TransitionAnimation$FADE r4 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r5 = 0
            r6 = 8
            r3 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            goto La0
        L8d:
            r3 = r1
            boolean r1 = r3 instanceof yy3.d
            if (r1 == 0) goto La3
            r10.u = r7
            r10.v = r7
            r10.f68046w = r4
            java.lang.Object r11 = c84.t.N2(r0, r11, r10, r5)
            if (r11 != r2) goto La0
        L9f:
            return r2
        La0:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        La3:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
