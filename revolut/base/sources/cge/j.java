package cge;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import qfe.l;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f23958w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ sfe.a f23959x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f23960y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, sfe.a aVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.f23958w = kVar;
        this.f23959x = aVar;
        this.f23960y = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f23958w, this.f23959x, this.f23960y, continuation);
        jVar.v = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r10 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r10 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        return r3;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            cge.k r0 = r9.f23958w
            rge.b r1 = r0.f23961a
            java.lang.Object r2 = r9.v
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r9.u
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L22
            if (r4 == r6) goto L1d
            if (r4 != r5) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            yhm.o.b(r10)
            goto La4
        L22:
            yhm.o.b(r10)
            com.revolut.feature.tab.accounts.api.mode.TabAccountsMode$Home r10 = com.revolut.feature.tab.accounts.api.mode.TabAccountsMode.Home.f89466a
            hhe.d r10 = r1.b(r10)
            xge.a r10 = r10.g()
            xge.g r10 = (xge.g) r10
            sfe.a r4 = r9.f23959x
            qfe.l r7 = r9.f23960y
            kotlinx.coroutines.flow.Flow r10 = r10.a(r4, r7)
            hhe.d r1 = r1.d()
            r8 = 0
            if (r1 == 0) goto L4d
            xge.a r1 = r1.g()
            if (r1 == 0) goto L4d
            xge.g r1 = (xge.g) r1
            kotlinx.coroutines.flow.Flow r1 = r1.a(r4, r7)
            goto L4e
        L4d:
            r1 = r8
        L4e:
            if (r1 != 0) goto L71
            r9.v = r8
            r9.u = r6
            vkm.q.w(r2)
            ble.e1 r1 = new ble.e1
            r4 = 14
            r1.<init>(r2, r0, r4)
            wkm.g r10 = (wkm.g) r10
            java.lang.Object r10 = r10.collect(r1, r9)
            if (r10 != r3) goto L67
            goto L69
        L67:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L69:
            if (r10 != r3) goto L6c
            goto L6e
        L6c:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L6e:
            if (r10 != r3) goto La4
            goto La3
        L71:
            bwb.n r4 = new bwb.n
            r7 = 10
            r4.<init>(r0, r8, r7)
            r9.v = r8
            r9.u = r5
            vkm.q.w(r2)
            kotlinx.coroutines.flow.Flow[] r0 = new kotlinx.coroutines.flow.Flow[r5]
            r5 = 0
            r0[r5] = r10
            r0[r6] = r1
            vdl.c1 r10 = new vdl.c1
            r1 = 15
            r10.<init>(r4, r8, r1)
            vkm.s1 r1 = vkm.s1.f290118a
            java.lang.Object r10 = mif.e0.g(r9, r1, r10, r2, r0)
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r10 != r0) goto L98
            goto L9a
        L98:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L9a:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r10 != r0) goto L9f
            goto La1
        L9f:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        La1:
            if (r10 != r3) goto La4
        La3:
            return r3
        La4:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cge.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
