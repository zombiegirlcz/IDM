package com.revolut.feature.subaccount.impl.ui.create.flow.group;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import l71.d;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function1 {
    public wi0.b u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f89008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f89009x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.f89009x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f89009x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.f89008w
            r2 = 3
            r3 = 1
            com.revolut.feature.subaccount.impl.ui.create.flow.group.c r4 = r12.f89009x
            r5 = 2
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L28
            if (r1 == r5) goto L22
            if (r1 != r2) goto L1a
            l71.d r0 = r12.v
            wi0.b r1 = r12.u
            yhm.o.b(r13)
            goto L82
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            wi0.b r1 = r12.u
            yhm.o.b(r13)
            goto L5e
        L28:
            yhm.o.b(r13)
            goto L3f
        L2c:
            yhm.o.b(r13)
            ang.f r13 = r4.f89011q
            r1 = 0
            efm.d0 r13 = r13.f(r1)
            r12.f89008w = r3
            java.lang.Object r13 = nim.a.b(r13, r12)
            if (r13 != r0) goto L3f
            goto L7f
        L3f:
            do3.n r13 = (do3.n) r13
            kotlin.jvm.internal.Intrinsics.h(r13)
            wi0.b r13 = do3.q.y(r13)
            l61.a r1 = r4.f89013s
            ang.b r1 = (ang.b) r1
            efm.d0 r1 = r1.a()
            r12.u = r13
            r12.f89008w = r5
            java.lang.Object r1 = nim.a.b(r1, r12)
            if (r1 != r0) goto L5b
            goto L7f
        L5b:
            r11 = r1
            r1 = r13
            r13 = r11
        L5e:
            l71.d r13 = (l71.d) r13
            boolean r3 = com.bumptech.glide.d.r(r1)
            if (r3 == 0) goto L85
            mre.c r3 = r4.f89012r
            com.revolut.feature.terms.api.model.TermsScope$a r5 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r5.getClass()
            com.revolut.feature.terms.api.model.TermsScope r5 = com.revolut.feature.terms.api.model.TermsScope.f90360a0
            ufm.i r3 = mre.c.a(r3, r5)
            r12.u = r1
            r12.v = r13
            r12.f89008w = r2
            java.lang.Object r2 = nim.a.b(r3, r12)
            if (r2 != r0) goto L80
        L7f:
            return r0
        L80:
            r0 = r13
            r13 = r2
        L82:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13
            goto L89
        L85:
            r0 = 0
            r11 = r0
            r0 = r13
            r13 = r11
        L89:
            yki.i r5 = r4.f89014t
            com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlowContract$Step$Contacts r6 = new com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlowContract$Step$Contacts
            kotlin.jvm.internal.Intrinsics.h(r0)
            boolean r0 = v04.b.c(r0)
            r6.<init>(r1, r0, r13)
            r9 = 0
            r10 = 12
            r7 = 0
            r8 = 0
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subaccount.impl.ui.create.flow.group.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
