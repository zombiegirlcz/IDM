package xka;

import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleDetailsControllerContract$InputData f306627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kka.a f306628b;

    public b(ProductArticleDetailsControllerContract$InputData inputData, kka.a interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f306627a = inputData;
        this.f306628b = interactor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xka.a
            if (r0 == 0) goto L13
            r0 = r5
            xka.a r0 = (xka.a) r0
            int r1 = r0.f306625w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306625w = r1
            goto L18
        L13:
            xka.a r0 = new xka.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f306625w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsControllerContract$InputData r5 = r4.f306627a
            com.revolut.analytics.tracking.v3.AnalyticsContext r2 = r5.d
            if (r2 == 0) goto L39
            return r2
        L39:
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = r5.f81288a
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference r5 = r5.f81274a
            r0.f306625w = r3
            kka.a r2 = r4.f306628b
            kka.h r2 = (kka.h) r2
            java.io.Serializable r5 = r2.c(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L5a
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r0 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            com.google.protobuf.w0 r5 = v0.a.b(r5, r0)
            com.revolut.analytics.tracking.v3.AnalyticsContext r0 = new com.revolut.analytics.tracking.v3.AnalyticsContext
            r0.<init>(r5)
            return r0
        L5a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xka.b.a(gim.c):java.lang.Object");
    }
}
