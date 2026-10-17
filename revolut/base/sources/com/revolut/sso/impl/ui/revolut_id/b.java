package com.revolut.sso.impl.ui.revolut_id;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xpl.h;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f106710w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f106710w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f106710w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            r2 = 0
            com.revolut.sso.impl.ui.revolut_id.c r3 = r10.v
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            yhm.o.b(r11)
            goto L40
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            yhm.o.b(r11)
            goto L31
        L1f:
            yhm.o.b(r11)
            apl.f r11 = new apl.f
            r1 = 0
            r11.<init>(r3, r2, r1)
            r10.u = r5
            java.lang.Object r11 = r3.p2(r10, r11)
            if (r11 != r0) goto L31
            goto L3f
        L31:
            apl.f r11 = new apl.f
            r1 = 1
            r11.<init>(r3, r2, r1)
            r10.u = r4
            java.lang.Object r11 = r3.p2(r10, r11)
            if (r11 != r0) goto L40
        L3f:
            return r0
        L40:
            com.revolut.sso.api.models.UserInfoFromApp r11 = (com.revolut.sso.api.models.UserInfoFromApp) r11
            xpl.h r0 = r10.f106710w
            xpl.d r0 = (xpl.d) r0
            com.revolut.sso.impl.domain.models.UserInfoAccount r1 = r0.f308013a
            java.lang.String r1 = r1.f106203a
            java.lang.String r11 = r11.f105997b
            r2 = 0
            if (r11 != 0) goto L51
            r11 = r2
            goto L55
        L51:
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r1, r11)
        L55:
            com.revolut.sso.impl.domain.models.UserInfoAccount r1 = r0.f308013a
            gkl.r1 r1 = r1.e
            int[] r6 = apl.g.f8201a
            int r1 = r1.ordinal()
            r1 = r6[r1]
            if (r1 == r5) goto L70
            if (r1 == r4) goto L70
            r4 = 3
            if (r1 != r4) goto L6a
            r5 = r2
            goto L70
        L6a:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L70:
            yki.a r4 = r3.v
            r2 = r5
            com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$Step$AccountDetails r5 = new com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$Step$AccountDetails
            com.revolut.sso.impl.domain.models.UserInfoAccount r0 = r0.f308013a
            r5.<init>(r0, r11, r2)
            r8 = 0
            r9 = 12
            r6 = 1
            r7 = 0
            oki.h.t2(r3, r4, r5, r6, r7, r8, r9)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.revolut_id.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
