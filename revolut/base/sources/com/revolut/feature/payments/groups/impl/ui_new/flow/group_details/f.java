package com.revolut.feature.payments.groups.impl.ui_new.flow.group_details;

import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mq9.f f79476l;

    public f(mq9.f interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f79476l = interactor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof mt9.f
            if (r0 == 0) goto L13
            r0 = r9
            mt9.f r0 = (mt9.f) r0
            int r1 = r0.f208773x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208773x = r1
            goto L18
        L13:
            mt9.f r0 = new mt9.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f208773x
            mq9.f r3 = r7.f79476l
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r9)
            goto L74
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L5d
        L3b:
            yhm.o.b(r9)
            r0.u = r8
            r0.f208773x = r5
            r9 = r3
            mr9.a r9 = (mr9.a) r9
            er9.f r9 = r9.f208082a
            er9.x r9 = (er9.x) r9
            r9.getClass()
            er9.p r2 = new er9.p
            r5 = 0
            r2.<init>(r9, r8, r6, r5)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)
            if (r9 != r1) goto L5d
            goto L73
        L5d:
            st9.c r9 = (st9.c) r9
            boolean r2 = r9.f265541g
            if (r2 == 0) goto L7c
            r0.u = r6
            r0.f208773x = r4
            mr9.a r3 = (mr9.a) r3
            er9.f r9 = r3.f208082a
            er9.x r9 = (er9.x) r9
            java.lang.Object r9 = r9.d(r8, r0)
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            com.revolut.feature.payments.groups.api.models.PaymentGroup r9 = (com.revolut.feature.payments.groups.api.models.PaymentGroup) r9
            com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$Step$Chat r8 = new com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$Step$Chat
            r8.<init>(r9)
            return r8
        L7c:
            com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$Step$UntrustedGroupPrompt r0 = new com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$Step$UntrustedGroupPrompt
            java.lang.String r9 = r9.f265539b
            r0.<init>(r9, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.f.Z2(java.lang.String, gim.c):java.lang.Object");
    }
}
