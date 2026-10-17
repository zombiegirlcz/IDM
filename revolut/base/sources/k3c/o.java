package k3c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function3 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f180678w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation continuation) {
        super(3, continuation);
        this.f180678w = pVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        return new o(this.f180678w, (Continuation) obj4).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        if (r9 == r1) goto L38;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            k3c.p r0 = r8.f180678w
            com.revolut.feature.revolut_shop.data.service.IppShopService r0 = r0.f180680a
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L25
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            yhm.o.b(r9)
            goto L75
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            int r2 = r8.u
            yhm.o.b(r9)
            goto L6a
        L25:
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L29
            goto L37
        L29:
            r9 = move-exception
            goto L3e
        L2b:
            yhm.o.b(r9)
            r8.v = r5     // Catch: java.lang.Exception -> L29
            java.lang.Object r9 = r0.getUserCart(r8)     // Catch: java.lang.Exception -> L29
            if (r9 != r1) goto L37
            goto L74
        L37:
            j3c.x r9 = (j3c.x) r9     // Catch: java.lang.Exception -> L29
            d3c.b0 r9 = ksj.b.A(r9)     // Catch: java.lang.Exception -> L29
            return r9
        L3e:
            boolean r2 = r9 instanceof retrofit2.HttpException
            r6 = 404(0x194, float:5.66E-43)
            r7 = 0
            if (r2 == 0) goto L51
            r2 = r9
            retrofit2.HttpException r2 = (retrofit2.HttpException) r2
            int r2 = r2.code()
            if (r2 != r6) goto L4f
            goto L5c
        L4f:
            r5 = r7
            goto L5c
        L51:
            boolean r2 = r9 instanceof com.revolut.core.error.data.model.ServerErrorException
            if (r2 == 0) goto L4f
            r2 = r9
            com.revolut.core.error.data.model.ServerErrorException r2 = (com.revolut.core.error.data.model.ServerErrorException) r2
            int r2 = r2.e
            if (r2 != r6) goto L4f
        L5c:
            if (r5 == 0) goto L7c
            r8.u = r5
            r8.v = r4
            java.lang.Object r9 = r0.addCart(r8)
            if (r9 != r1) goto L69
            goto L74
        L69:
            r2 = r5
        L6a:
            r8.u = r2
            r8.v = r3
            java.lang.Object r9 = r0.getUserCart(r8)
            if (r9 != r1) goto L75
        L74:
            return r1
        L75:
            j3c.x r9 = (j3c.x) r9
            d3c.b0 r9 = ksj.b.A(r9)
            return r9
        L7c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k3c.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
