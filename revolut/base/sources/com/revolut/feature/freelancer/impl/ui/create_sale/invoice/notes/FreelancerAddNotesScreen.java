package com.revolut.feature.freelancer.impl.ui.create_sale.invoice.notes;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import buf.u;
import bw6.b;
import bw6.c;
import bw6.d;
import bw6.f;
import bw6.h;
import bw6.i;
import bw6.l;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.notes.FreelancerAddNotesScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.p;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/create_sale/invoice/notes/FreelancerAddNotesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbw6/h;", "Ldli/a;", "Lbw6/i;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAddNotesScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(FreelancerAddNotesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ao.h K;
    public final FullScreenStateDelegate L;
    public final InputTextDelegate M;
    public final InputChecklistDelegate N;
    public final boolean O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public FreelancerAddNotesScreen(FreelancerAddNotesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new FullScreenStateDelegate();
        this.M = new InputTextDelegate(null);
        this.N = new InputChecklistDelegate();
        this.O = true;
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAddNotesScreen f19244b;

            {
                this.f19244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAddNotesScreen.T;
                        return (l) ((p) this.f19244b.S.getValue()).f282656c.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerAddNotesScreen.T;
                        FreelancerAddNotesScreen freelancerAddNotesScreen = this.f19244b;
                        return dli.f.a(freelancerAddNotesScreen, freelancerAddNotesScreen.R2(), v.k(new RowLoadingDelegate(), freelancerAddNotesScreen.M, freelancerAddNotesScreen.N, freelancerAddNotesScreen.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAddNotesScreen f19244b;

            {
                this.f19244b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAddNotesScreen.T;
                        return (l) ((p) this.f19244b.S.getValue()).f282656c.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerAddNotesScreen.T;
                        FreelancerAddNotesScreen freelancerAddNotesScreen = this.f19244b;
                        return dli.f.a(freelancerAddNotesScreen, freelancerAddNotesScreen.R2(), v.k(new RowLoadingDelegate(), freelancerAddNotesScreen.M, freelancerAddNotesScreen.N, freelancerAddNotesScreen.L), 0, null, null, null, 60);
                }
            }
        });
        this.S = w.y0(new u(this, inputData, 4));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.freelancer_sale_invoice_note_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.freelancer_sale_invoice_note_header_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.freelancer_sale_invoice_note_header_caption, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(R$string.freelancer_common_action_save, null, null, 14));
        d3().f174564b.setLoadingButtonTag("ADD_NOTES_SUBMIT_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.e.f121375b), null, new bw6.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52518c), null, new f(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
