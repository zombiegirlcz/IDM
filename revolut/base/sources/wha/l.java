package wha;

import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import gr6.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import uha.a0;
import uha.t;
import uha.w;
import uha.x;
import vge.f1;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountType f297472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.a f297473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f297474c;
    public final g6e.d d;

    public l(SubaccountType type, gr6.a freelancerAccountDetailsInteractor, p freelancerProductArticleInteractor, g6e.d subaccountInteractor) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor, "freelancerProductArticleInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        this.f297472a = type;
        this.f297473b = freelancerAccountDetailsInteractor;
        this.f297474c = freelancerProductArticleInteractor;
        this.d = subaccountInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(wha.l r10, java.util.List r11, gim.c r12) {
        /*
            gr6.p r0 = r10.f297474c
            boolean r1 = r12 instanceof wha.f
            if (r1 == 0) goto L15
            r1 = r12
            wha.f r1 = (wha.f) r1
            int r2 = r1.D
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.D = r2
            goto L1a
        L15:
            wha.f r1 = new wha.f
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.B
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.D
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L56
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L35
            com.revolut.feature.product_article.api.models.ProductArticleParams r10 = r1.f297455x
            java.lang.String r11 = r1.f297454w
            wha.l r0 = r1.v
            com.revolut.feature.subaccount.api.models.SubaccountType r1 = r1.u
            yhm.o.b(r12)
            goto La5
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            int r10 = r1.A
            int r11 = r1.z
            boolean r3 = r1.f297456y
            java.lang.String r5 = r1.f297454w
            wha.l r6 = r1.v
            com.revolut.feature.subaccount.api.models.SubaccountType r7 = r1.u
            yhm.o.b(r12)
            r9 = r7
            r7 = r10
            r10 = r6
            r6 = r3
            r3 = r9
            r9 = r12
            r12 = r11
            r11 = r5
            r5 = r9
            goto L85
        L56:
            yhm.o.b(r12)
            com.revolut.feature.subaccount.api.models.SubaccountType$Pro r12 = com.revolut.feature.subaccount.api.models.SubaccountType.Pro.f88964a
            boolean r3 = r11.contains(r12)
            if (r3 == 0) goto Lb4
            qf1.f r11 = qf1.f.PRO_POCKET
            java.lang.String r11 = r11.getId()
            ir6.e r6 = ir6.e.PRO_REGULAR
            r1.u = r12
            r1.v = r10
            r1.f297454w = r11
            r1.f297456y = r3
            r7 = 0
            r1.z = r7
            r1.A = r7
            r1.D = r5
            r5 = r0
            et6.x2 r5 = (et6.x2) r5
            java.lang.Object r5 = r5.g(r6, r1)
            if (r5 != r2) goto L82
            goto La1
        L82:
            r6 = r3
            r3 = r12
            r12 = r7
        L85:
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r5
            ir6.e r8 = ir6.e.PRO_REGULAR
            r1.u = r3
            r1.v = r10
            r1.f297454w = r11
            r1.f297455x = r5
            r1.f297456y = r6
            r1.z = r12
            r1.A = r7
            r1.D = r4
            et6.x2 r0 = (et6.x2) r0
            java.lang.Object r12 = r0.f(r8, r1)
            if (r12 != r2) goto La2
        La1:
            return r2
        La2:
            r0 = r10
            r1 = r3
            r10 = r5
        La5:
            ir6.a r12 = (ir6.a) r12
            r0.getClass()
            uha.a0 r10 = e(r1, r10, r12)
            uha.b0 r12 = new uha.b0
            r12.<init>(r11, r10)
            return r12
        Lb4:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wha.l.c(wha.l, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(wha.l r10, java.util.List r11, java.util.List r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wha.l.d(wha.l, java.util.List, java.util.List, gim.c):java.lang.Object");
    }

    public static a0 e(SubaccountType subaccountType, ProductArticleParams productArticleParams, ir6.a aVar) {
        x wVar;
        ExtendedSubaccountType extendedSubaccountTypeB = com.revolut.feature.subaccount.api.models.a.b(subaccountType);
        ProductArticleParams.ArticleReference articleReference = productArticleParams.f81274a;
        if (articleReference instanceof ProductArticleParams.ArticleReference.Id) {
            wVar = new t(((ProductArticleParams.ArticleReference.Id) articleReference).f81276a);
        } else {
            if (!(articleReference instanceof ProductArticleParams.ArticleReference.Key)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductArticleKey productArticleKey = ((ProductArticleParams.ArticleReference.Key) articleReference).f81277a;
            wVar = new w(productArticleKey.getProductName(), productArticleKey.getArticleName(), productArticleKey.getArticleVariant());
        }
        return new a0(extendedSubaccountTypeB, new uha.p(wVar, productArticleParams.f81275b, aVar.f168009a));
    }

    @Override // mf1.a
    public final Flow a() {
        Continuation continuation = null;
        return rd0.e.e(q.Q(zi0.c.w(((et6.g) this.f297473b).d(w4l.h.f294642c)), new w2a.q(continuation, this, 13)), h0.f322473a, new f1(3, 22, continuation));
    }

    @Override // mf1.a
    public final String b() {
        return null;
    }
}
