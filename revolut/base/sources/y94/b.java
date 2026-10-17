package y94;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerContract$Configuration;
import com.revolut.revolut.feature_fourthline_impl.R;
import iqi.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import te0.w;
import vfg.p;
import x94.e;
import x94.k;
import xy7.n;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends pri.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CreditApplicationDocumentViewerContract$Configuration f311750h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f311751j;
    public final e k;

    public b(CreditApplicationDocumentViewerContract$Configuration configuration, k presentationModel, h twinVerticalButtonView, e router) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f311750h = configuration;
        this.i = presentationModel;
        this.f311751j = twinVerticalButtonView;
        this.k = router;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        x94.h view = (x94.h) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        boolean z = this.f311750h.f67565a.f66360c != ju3.b.INVISIBLE;
        iqi.b bVar = (iqi.b) this.f311751j;
        bVar.setVisible(z);
        bVar.e0(false);
        bVar.a0(new TextLocalisedClause(R.string.button_action_done, null, null, 14));
        r0 r0VarD = w.D(bVar.O(), new y8a.h(this, 1));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new p(new n(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        a function = a.f311749a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar2.w(new wl3.e(5, function1K), new a1l.c(25));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
