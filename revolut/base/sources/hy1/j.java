package hy1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f156653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f156654x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f156653w = lVar;
        this.f156654x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f156653w, this.f156654x, continuation, 0);
            case 1:
                return new j(this.f156653w, this.f156654x, continuation, 1);
            default:
                return new j(this.f156653w, this.f156654x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        if (r9 == r0) goto L44;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.u
            r1 = 0
            java.lang.String r2 = r8.f156654x
            hy1.l r3 = r8.f156653w
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            switch(r0) {
                case 0: goto L6b;
                case 1: goto L3d;
                default: goto Ld;
            }
        Ld:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            if (r1 == 0) goto L1f
            if (r1 != r5) goto L19
            yhm.o.b(r9)
            goto L31
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r4)
            throw r9
        L1f:
            yhm.o.b(r9)
            tx1.a r9 = r3.f156661b
            efm.d0 r9 = r9.d(r2)
            r8.v = r5
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L31
            goto L3c
        L31:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r0 = tx1.k.b(r9)
        L3c:
            return r0
        L3d:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r6 = r8.v
            if (r6 == 0) goto L4f
            if (r6 != r5) goto L49
            yhm.o.b(r9)
            goto L62
        L49:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r4)
            throw r9
        L4f:
            yhm.o.b(r9)
            tx1.a r9 = r3.f156661b
            efm.k r9 = r9.c(r2)
            r8.v = r5
            java.lang.Object r9 = nim.a.i(r9, r8)
            if (r9 != r0) goto L62
            r1 = r0
            goto L6a
        L62:
            tx1.j r9 = (tx1.j) r9
            if (r9 == 0) goto L6a
            com.revolut.feature.apm.core.models.recipients.BizumContact r1 = tx1.k.a(r9)
        L6a:
            return r1
        L6b:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r6 = r8.v
            r7 = 2
            if (r6 == 0) goto L84
            if (r6 == r5) goto L80
            if (r6 != r7) goto L7a
            yhm.o.b(r9)
            goto La6
        L7a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r4)
            throw r9
        L80:
            yhm.o.b(r9)
            goto L90
        L84:
            yhm.o.b(r9)
            r8.v = r5
            java.lang.Object r9 = r3.c(r2, r8)
            if (r9 != r0) goto L90
            goto La4
        L90:
            com.revolut.feature.apm.core.models.recipients.BizumContact r9 = (com.revolut.feature.apm.core.models.recipients.BizumContact) r9
            if (r9 == 0) goto L96
            r1 = r9
            goto Lb3
        L96:
            com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService r9 = r3.f156660a
            r8.v = r7
            com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService$a r3 = com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService.INSTANCE
            java.lang.String r3 = "true"
            java.lang.Object r9 = r9.getContactById(r2, r3, r8)
            if (r9 != r0) goto La6
        La4:
            r1 = r0
            goto Lb3
        La6:
            qx1.c r9 = (qx1.c) r9
            com.revolut.feature.apm.core.models.recipients.ApmContact r9 = qx1.k.a(r9)
            boolean r0 = r9 instanceof com.revolut.feature.apm.core.models.recipients.BizumContact
            if (r0 == 0) goto Lb3
            r1 = r9
            com.revolut.feature.apm.core.models.recipients.BizumContact r1 = (com.revolut.feature.apm.core.models.recipients.BizumContact) r1
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hy1.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
