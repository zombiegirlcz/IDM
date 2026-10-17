package q2e;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends gim.i implements Function2 {
    public com.revolut.feature.store.impl.ui.brand_detail.flow.c u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f241614y;
    public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar, Continuation continuation) {
        super(2, continuation);
        this.z = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q0 q0Var = new q0(this.z, continuation);
        q0Var.f241614y = obj2;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.store.impl.ui.brand_detail.flow.c r0 = r8.z
            cli.y r1 = r0.T
            java.lang.Object r2 = r8.f241614y
            com.revolut.data.model.Data r2 = (com.revolut.data.model.Data) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r8.f241613x
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L24
            if (r4 != r6) goto L1c
            boolean r2 = r8.v
            int r3 = r8.f241612w
            com.revolut.feature.store.impl.ui.brand_detail.flow.c r4 = r8.u
            yhm.o.b(r9)
            goto L72
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            yhm.o.b(r9)
            boolean r9 = r0.K
            if (r9 != 0) goto L38
            q2a.a r9 = new q2a.a
            r2 = 15
            r9.<init>(r2)
            r0.H2(r1, r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L38:
            java.lang.Object r9 = r2.getContent()
            m1c.r0 r9 = (m1c.r0) r9
            if (r9 != 0) goto L43
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L43:
            m1c.x0 r2 = r9.f201447a
            m1c.x0 r4 = m1c.x0.OPTED_IN
            if (r2 != r4) goto L4b
            r2 = r6
            goto L4c
        L4b:
            r2 = r5
        L4c:
            boolean r9 = qk.d.l(r9)
            java.lang.Boolean r4 = r0.L
            if (r4 != 0) goto L78
            eub.i r4 = r0.u
            nyb.o r4 = (nyb.o) r4
            efm.d0 r4 = r4.d()
            r7 = 0
            r8.f241614y = r7
            r8.u = r0
            r8.f241612w = r2
            r8.v = r9
            r8.f241613x = r6
            java.lang.Object r4 = nim.a.b(r4, r8)
            if (r4 != r3) goto L6e
            return r3
        L6e:
            r3 = r2
            r2 = r9
            r9 = r4
            r4 = r0
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r4.L = r9
            r9 = r2
            r2 = r3
        L78:
            if (r2 == 0) goto L7b
            r5 = r6
        L7b:
            ay2.k r2 = new ay2.k
            r3 = 5
            r2.<init>(r0, r5, r9, r3)
            r0.H2(r1, r2)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q2e.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
