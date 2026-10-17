package z6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f319800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MoneyRequest f319801x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, MoneyRequest moneyRequest, Continuation continuation) {
        super(2, continuation);
        this.f319800w = oVar;
        this.f319801x = moneyRequest;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.f319800w, this.f319801x, continuation);
        nVar.v = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (vkm.q.u(r0, r10, r9) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.u
            r3 = 2
            r4 = 3
            r5 = 1
            if (r2 == 0) goto L29
            if (r2 == r5) goto L25
            if (r2 == r3) goto L20
            if (r2 != r4) goto L18
            yhm.o.b(r10)
            goto L9f
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            yhm.o.b(r10)
            goto Lb6
        L25:
            yhm.o.b(r10)
            goto L4f
        L29:
            yhm.o.b(r10)
            z6k.o r10 = r9.f319800w
            gte.a r2 = r10.f319804c
            com.revolut.feature.payments.api.PaymentsToggles$ScanBill r6 = com.revolut.feature.payments.api.PaymentsToggles$ScanBill.f79163c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r6)
            r6 = 0
            if (r2 != 0) goto L52
            w0a.d r10 = w0a.e.Companion
            r10.getClass()
            w0a.e r10 = w0a.d.a()
            r9.v = r6
            r9.u = r5
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r1) goto L4f
            goto Lb5
        L4f:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L52:
            com.revolut.domain.models.moneyrequest.MoneyRequest r2 = r9.f319801x
            java.lang.String r5 = r2.o
            com.revolut.domain.models.moneyrequest.MoneyRequestState r7 = r2.f60315b
            com.revolut.domain.models.moneyrequest.MoneyRequestState r8 = com.revolut.domain.models.moneyrequest.MoneyRequestState.ACTIVE
            if (r7 != r8) goto La2
            if (r5 != 0) goto L5f
            goto La2
        L5f:
            vv9.c r3 = r10.f319802a
            java.lang.String r7 = r2.f60314a
            com.revolut.domain.models.moneyrequest.MoneyRequestDirection r8 = r2.f60322n
            u6k.h r3 = (u6k.h) r3
            efm.r r3 = r3.b(r5, r7, r8)
            vkm.d r3 = rd0.e.b(r3)
            yi5.f r7 = new yi5.f
            r7.<init>(r3, r10, r2, r5)
            w0a.d r10 = w0a.e.Companion
            r10.getClass()
            w0a.e r10 = w0a.d.a()
            z6k.k r2 = z6k.o.Companion
            r2.getClass()
            long r2 = z6k.o.d
            vkm.f r10 = zi0.c.M(r7, r10, r2, r6)
            z6k.l r2 = new z6k.l
            r3 = 0
            r2.<init>(r4, r3, r6)
            zhm.h0 r3 = zhm.h0.f322473a
            vkm.y r10 = rd0.e.e(r10, r3, r2)
            r9.v = r6
            r9.u = r4
            java.lang.Object r10 = vkm.q.u(r0, r10, r9)
            if (r10 != r1) goto L9f
            goto Lb5
        L9f:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        La2:
            w0a.d r10 = w0a.e.Companion
            r10.getClass()
            w0a.e r10 = w0a.d.a()
            r9.v = r6
            r9.u = r3
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z6k.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
