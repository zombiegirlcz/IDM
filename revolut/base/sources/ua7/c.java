package ua7;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f278553w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f278553w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f278553w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r14 == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.u
            r2 = 1
            r3 = 2
            ua7.f r4 = r13.v
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r14)
            goto L46
        L12:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1a:
            yhm.o.b(r14)
            goto L2a
        L1e:
            yhm.o.b(r14)
            r13.u = r2
            java.lang.Object r14 = ua7.f.b3(r4, r13)
            if (r14 != r0) goto L2a
            goto L45
        L2a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            java.lang.String r1 = r13.f278553w
            if (r14 == 0) goto L51
            wa7.m r14 = r4.f278556l
            r13.u = r3
            java.lang.String r2 = "HIDDEN_ACCOUNTS"
            java.lang.Object r14 = r14.a(r1, r2, r13)
            if (r14 != r0) goto L41
            goto L43
        L41:
            kotlin.Unit r14 = kotlin.Unit.f186387a
        L43:
            if (r14 != r0) goto L46
        L45:
            return r0
        L46:
            za7.b r14 = r4.f278557m
            mii.k r14 = r14.b()
            kotlinx.coroutines.flow.Flow r14 = r4.L2(r14)
            return r14
        L51:
            com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor r5 = new com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r14 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey r0 = com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey.HIDDEN_ACCOUNTS
            r14.<init>(r0)
            r6.<init>(r14)
            grl.k9 r14 = grl.k9.SecurityHub
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r0 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r0 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r9 = com.google.android.gms.internal.mlkit_vision_face.a.h(r14, r0, r14)
            r11 = 0
            r12 = 52
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$AlwaysShow r7 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.AlwaysShow.f81285a
            r8 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            com.revolut.kompot.navigable.vc.ViewController r14 = r4.o2(r5)
            ua7.a r0 = new ua7.a
            r0.<init>(r4, r1, r3)
            r1 = 0
            yji.n.P2(r4, r14, r1, r0, r2)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ua7.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
