package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2;

import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function1 {
    public cv3.c u;
    public SkipShownArticleBehaviour.SkipIfWasAlreadyShown v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f68148w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f68149x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(1, continuation);
        this.f68149x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f68149x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        if (r9 == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
