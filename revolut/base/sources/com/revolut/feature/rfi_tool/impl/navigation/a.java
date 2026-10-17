package com.revolut.feature.rfi_tool.impl.navigation;

import com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ RfiToolFlowContract$Step.Form v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f85015w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RfiToolFlowContract$Step.Form form, b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = form;
        this.f85015w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f85015w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (com.revolut.feature.rfi_tool.impl.navigation.b.I2(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r1.L2(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            yhm.o.b(r5)
            goto L36
        L19:
            yhm.o.b(r5)
            com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlowContract$Step$Form r5 = r4.v
            boolean r5 = r5.e
            com.revolut.feature.rfi_tool.impl.navigation.b r1 = r4.f85015w
            if (r5 == 0) goto L2d
            r4.u = r3
            java.lang.Object r5 = com.revolut.feature.rfi_tool.impl.navigation.b.I2(r1, r4)
            if (r5 != r0) goto L36
            goto L35
        L2d:
            r4.u = r2
            java.lang.Object r5 = r1.L2(r4)
            if (r5 != r0) goto L36
        L35:
            return r0
        L36:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rfi_tool.impl.navigation.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
