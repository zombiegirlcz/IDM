package mc2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f204246w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f204246w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f204246w, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.u
            r3 = 10
            mc2.b r4 = r9.f204246w
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L26
            if (r2 == r6) goto L22
            if (r2 != r5) goto L1a
            yhm.o.b(r10)
            goto L8f
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            yhm.o.b(r10)
            goto L42
        L26:
            yhm.o.b(r10)
            iz1.n r10 = r4.f204247l
            r9.v = r0
            r9.u = r6
            r10.getClass()
            imk.p0 r2 = new imk.p0
            r2.<init>(r10, r7, r3)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r9)
            if (r10 != r1) goto L42
            goto L8e
        L42:
            java.util.List r10 = (java.util.List) r10
            a12.f r2 = new a12.f
            com.revolut.feature.apm.core.api.product.ApmQvik r6 = com.revolut.feature.apm.core.api.product.ApmQvik.f61823c
            r2.<init>(r6, r10)
            a12.h r4 = r4.f204248m
            s12.c r4 = (s12.c) r4
            r4.getClass()
            java.lang.String r8 = "info"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r8)
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = r6.e()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r6 = new java.util.ArrayList
            int r3 = zhm.w.t(r10, r3)
            r6.<init>(r3)
            java.util.Iterator r10 = r10.iterator()
        L6a:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L7e
            java.lang.Object r3 = r10.next()
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft r3 = (com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft) r3
            e12.d r3 = r4.a(r3, r2)
            r6.add(r3)
            goto L6a
        L7e:
            r10 = 0
            r2 = 3
            com.revolut.data.model.Data r10 = zi0.c.P(r6, r10, r7, r2)
            r9.v = r7
            r9.u = r5
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r1) goto L8f
        L8e:
            return r1
        L8f:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mc2.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
