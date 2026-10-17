package qb0;

import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q43.m;
import q9c.v;
import rd0.e;
import yc0.o;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends xa0.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f244077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f244078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qa0.b f244079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WebViewDelegate f244080t;

    public b(j60.a bottomExpandableDialogControllerExtension, o mapper, qa0.b externalNavigationExtension) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        this.f244077q = bottomExpandableDialogControllerExtension;
        this.f244078r = mapper;
        this.f244079s = externalNavigationExtension;
        this.f244080t = new WebViewDelegate();
    }

    @Override // xa0.b
    public final void b3() {
        j60.a.v(this.f244077q, false, null, 3);
    }

    @Override // xa0.b
    public final void c3() {
        WebViewDelegate webViewDelegate = this.f244080t;
        List listC = u.c(webViewDelegate);
        j60.a aVar = this.f244077q;
        aVar.d(listC);
        n.j2(this, e.b(webViewDelegate.f), null, new v(2, this, b.class, "onLinkUrlClick", "onLinkUrlClick$core_backend_flow_impl_release(Ljava/lang/String;)V", 4, 1), 3);
        n.j2(this, e.b(aVar.E()), null, new m(this, null, 15), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xa0.b
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qb0.a
            if (r0 == 0) goto L13
            r0 = r7
            qb0.a r0 = (qb0.a) r0
            int r1 = r0.f244076x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244076x = r1
            goto L18
        L13:
            qb0.a r0 = new qb0.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f244076x
            j60.a r3 = r5.f244077q
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen r6 = r0.u
            yhm.o.b(r7)
            goto L41
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            r0.u = r6
            r0.f244076x = r4
            java.lang.Object r7 = x5d.b.k(r3, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            yc0.o r7 = r5.f244078r
            rp0.y r6 = r7.a(r6)
            r3.x(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qb0.b.d3(com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen, gim.c):java.lang.Object");
    }
}
