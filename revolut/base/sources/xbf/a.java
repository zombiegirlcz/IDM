package xbf;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f304067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductArticleParams f304068x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ProductArticleParams productArticleParams, Continuation continuation) {
        super(2, continuation);
        this.f304067w = dVar;
        this.f304068x = productArticleParams;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f304067w, this.f304068x, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r0.send(r7, r6) == r1) goto L15;
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
            kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r7)
            goto L4f
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L38
        L20:
            yhm.o.b(r7)
            xbf.d r7 = r6.f304067w
            zja.a r7 = r7.f304072b
            r6.v = r0
            r6.u = r4
            kka.h r7 = (kka.h) r7
            com.revolut.feature.product_article.api.models.ProductArticleParams r2 = r6.f304068x
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r5 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r7 = r7.e(r2, r5, r6)
            if (r7 != r1) goto L38
            goto L4e
        L38:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r2 = 0
            r6.v = r2
            r6.u = r3
            java.lang.Object r7 = r0.send(r7, r6)
            if (r7 != r1) goto L4f
        L4e:
            return r1
        L4f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xbf.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
