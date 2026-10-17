package com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public b u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f84270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f84271x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f84271x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f84271x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r9 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r9.b3(true, r8) == r2) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b r0 = r8.f84271x
            yki.i r1 = r0.f84275s
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.f84270w
            r4 = 2
            r5 = 3
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L2c
            if (r3 == r6) goto L28
            if (r3 == r4) goto L24
            if (r3 != r5) goto L1c
            yki.i r1 = r8.v
            com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b r0 = r8.u
            yhm.o.b(r9)
            goto L6b
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            yhm.o.b(r9)
            goto L82
        L28:
            yhm.o.b(r9)
            goto L42
        L2c:
            yhm.o.b(r9)
            o5c.a r9 = r0.o
            vkm.d r9 = r9.a()
            jhi.b r9 = mo3.a.g(r9, r7, r7, r5)
            r8.f84270w = r6
            java.lang.Object r9 = vkm.q.x(r9, r8)
            if (r9 != r2) goto L42
            goto L81
        L42:
            k5c.a r9 = (k5c.a) r9
            k5c.b r9 = r9.f181472a
            int[] r3 = x5c.c.f302934a
            int r9 = r9.ordinal()
            r9 = r3[r9]
            if (r9 == r6) goto L77
            if (r9 == r4) goto L5e
            if (r9 != r5) goto L58
            oki.h.D2(r1)
            goto L85
        L58:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L5e:
            r8.u = r0
            r8.v = r1
            r8.f84270w = r5
            java.lang.Object r9 = com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.b.I2(r0, r8)
            if (r9 != r2) goto L6b
            goto L81
        L6b:
            com.revolut.feature.product_article.api.models.ProductArticleKey r9 = (com.revolut.feature.product_article.api.models.ProductArticleKey) r9
            com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.RevolutXLauncherFlowContract$Step$Article r2 = new com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.RevolutXLauncherFlowContract$Step$Article
            r2.<init>(r9)
            r9 = 6
            oki.h.u2(r0, r1, r2, r7, r9)
            goto L85
        L77:
            j5c.a r9 = r0.f84272p
            r8.f84270w = r4
            java.lang.Object r9 = r9.b3(r6, r8)
            if (r9 != r2) goto L82
        L81:
            return r2
        L82:
            oki.h.D2(r1)
        L85:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolut_x_promo.impl.ui.revolut_x_launcher.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
