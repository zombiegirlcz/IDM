package com.revolut.feature.credit.loan.impl.ui.rev10.documents.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import u1.g;
import u65.b;
import u65.f;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/list/LoanDocumentsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu65/f;", "Ldli/a;", "Lu65/h;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanDocumentsController extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(LoanDocumentsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;

    public LoanDocumentsController(LoanDocumentsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = w.y0(new ty.a(26));
        this.M = w.y0(new ty.a(27));
        this.N = w.y0(new g(this, inputData, 15));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: u65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanDocumentsController f277483b;

            {
                this.f277483b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = LoanDocumentsController.R;
                        return (g) ((u45.f) this.f277483b.N.getValue()).f277113c.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanDocumentsController.R;
                        LoanDocumentsController loanDocumentsController = this.f277483b;
                        return dli.f.a(loanDocumentsController, (g) loanDocumentsController.O.getValue(), v.k((RowDelegate) loanDocumentsController.L.getValue(), (FullScreenStateDelegate) loanDocumentsController.M.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: u65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanDocumentsController f277483b;

            {
                this.f277483b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanDocumentsController.R;
                        return (g) ((u45.f) this.f277483b.N.getValue()).f277113c.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanDocumentsController.R;
                        LoanDocumentsController loanDocumentsController = this.f277483b;
                        return dli.f.a(loanDocumentsController, (g) loanDocumentsController.O.getValue(), v.k((RowDelegate) loanDocumentsController.L.getValue(), (FullScreenStateDelegate) loanDocumentsController.M.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((u65.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u45.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (u65.g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.loan_management_documents_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.loan_management_documents_title, null, null, 14));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new u07.b(this, null, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(((RowDelegate) this.L.getValue()).f53218h), rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b)), null, new tz6.e(this, (Continuation) null, 23), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
