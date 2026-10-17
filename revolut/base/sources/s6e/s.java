package s6e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f260307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f260308x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f260307w = zVar;
        this.f260308x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.f260307w, this.f260308x, continuation);
        sVar.v = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (r10.collect(r0, r9) == r3) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            s6e.z r0 = r9.f260307w
            l93.f r1 = r0.f260324c
            java.lang.Object r2 = r9.v
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r9.u
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L26
            if (r4 == r6) goto L22
            if (r4 != r5) goto L1a
            yhm.o.b(r10)
            goto L9a
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            yhm.o.b(r10)
            goto L48
        L26:
            yhm.o.b(r10)
            r9.v = r2
            r9.u = r6
            java.lang.String r10 = r9.f260308x
            vkm.d r10 = r0.u(r10)
            zfd.e r10 = zi0.c.w(r10)
            s6d.r r4 = new s6d.r
            r8 = 3
            r4.<init>(r8)
            jhi.b r10 = mo3.a.g(r10, r7, r4, r6)
            java.lang.Object r10 = vkm.q.x(r10, r9)
            if (r10 != r3) goto L48
            goto L99
        L48:
            com.revolut.feature.subaccount.api.models.Subaccount r10 = (com.revolut.feature.subaccount.api.models.Subaccount) r10
            java.lang.String r4 = r10.getPocketId()
            if (r4 == 0) goto L9d
            com.revolut.feature.subaccount.api.models.SubaccountType r10 = r10.c()
            com.revolut.feature.subaccount.api.models.SubaccountType$Joint r6 = com.revolut.feature.subaccount.api.models.SubaccountType.Joint.f88961a
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L7c
            ha3.x r1 = (ha3.x) r1
            ghk.a0 r10 = r1.u(r4)
            s6e.q r1 = new s6e.q
            r6 = 0
            r1.<init>(r10, r6)
            akg.n r10 = s6e.z.c(r0)
            t38.e r10 = zh9.u0.m(r1, r10)
            rvc.k r0 = new rvc.k
            r1 = 14
            r0.<init>(r4, r1)
            akg.n r10 = nim.a.v(r10, r0)
            goto L89
        L7c:
            ha3.x r1 = (ha3.x) r1
            ghk.a0 r10 = r1.u(r4)
            s6e.q r0 = new s6e.q
            r1 = 1
            r0.<init>(r10, r1)
            r10 = r0
        L89:
            cie.i1 r0 = new cie.i1
            r1 = 3
            r0.<init>(r2, r1)
            r9.v = r7
            r9.u = r5
            java.lang.Object r10 = r10.collect(r0, r9)
            if (r10 != r3) goto L9a
        L99:
            return r3
        L9a:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L9d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
