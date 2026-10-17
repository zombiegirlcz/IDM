package cw9;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f109570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f109571x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f109570w = dVar;
        this.f109571x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f109570w, this.f109571x, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (vkm.q.u(r0, r7, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            yhm.o.b(r7)
            goto L4f
        L1d:
            yhm.o.b(r7)
            cw9.d r7 = r6.f109570w
            gte.a r2 = r7.f109572a
            com.revolut.feature.payments.social.api.SocialPaymentsApi$Toggles$SocialProductCatalogueMigration r5 = com.revolut.feature.payments.social.api.SocialPaymentsApi$Toggles.SocialProductCatalogueMigration.f79714c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r5)
            r5 = 0
            if (r2 == 0) goto L42
            zjh.f r7 = r7.f109573b
            java.lang.String r2 = r6.f109571x
            ae8.c r7 = r7.A(r2)
            r6.v = r5
            r6.u = r4
            java.lang.Object r7 = vkm.q.u(r0, r7, r6)
            if (r7 != r1) goto L4f
            goto L4e
        L42:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.v = r5
            r6.u = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L4f
        L4e:
            return r1
        L4f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cw9.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
