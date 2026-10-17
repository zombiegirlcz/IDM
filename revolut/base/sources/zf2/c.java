package zf2;

import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zja.a f321856l;

    public c(zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.f321856l = productArticleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof zf2.b
            if (r0 == 0) goto L13
            r0 = r12
            zf2.b r0 = (zf2.b) r0
            int r1 = r0.f321855w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f321855w = r1
            goto L18
        L13:
            zf2.b r0 = new zf2.b
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f321855w
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r5 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            com.revolut.feature.apm.upi.api.product_article.UpiIntroArticleKey r3 = com.revolut.feature.apm.upi.api.product_article.UpiIntroArticleKey.f62955a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r12)
            goto L47
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L33:
            yhm.o.b(r12)
            com.revolut.feature.product_article.api.models.ProductArticleParams r12 = r3.a()
            r0.f321855w = r4
            zja.a r2 = r11.f321856l
            kka.h r2 = (kka.h) r2
            java.lang.Object r12 = r2.e(r12, r5, r0)
            if (r12 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L6a
            r12 = r3
            com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor r3 = new com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor
            com.revolut.feature.product_article.api.models.ProductArticleParams r4 = r12.a()
            r9 = 0
            r10 = 60
            r6 = 0
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.revolut.kompot.navigable.vc.ViewController r12 = r11.o2(r3)
            r0 = 0
            r1 = 2
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r2 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            yji.n.P2(r11, r12, r2, r0, r1)
        L6a:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zf2.c.Z2(gim.c):java.lang.Object");
    }
}
