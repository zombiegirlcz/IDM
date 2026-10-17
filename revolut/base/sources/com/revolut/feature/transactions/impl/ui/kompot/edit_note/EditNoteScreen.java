package com.revolut.feature.transactions.impl.ui.kompot.edit_note;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreen;
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
import pki.b;
import te0.w;
import vc.s;
import vmf.c;
import vmf.d;
import vmf.l;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/kompot/edit_note/EditNoteScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvmf/h;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditNoteScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EditNoteScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final InputTextDelegate O;
    public final Object P;

    public EditNoteScreen(EditNoteScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, c.f);
        this.M = w.y0(new vd1.a(this, inputData, 20));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: vmf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditNoteScreen f290565b;

            {
                this.f290565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = EditNoteScreen.Q;
                        return (l) ((mlf.a) this.f290565b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = EditNoteScreen.Q;
                        EditNoteScreen editNoteScreen = this.f290565b;
                        return dli.f.a(editNoteScreen, (l) editNoteScreen.N.getValue(), u.c(editNoteScreen.O), 0, null, null, null, 60);
                }
            }
        });
        this.O = new InputTextDelegate(null);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vmf.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditNoteScreen f290565b;

            {
                this.f290565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditNoteScreen.Q;
                        return (l) ((mlf.a) this.f290565b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = EditNoteScreen.Q;
                        EditNoteScreen editNoteScreen = this.f290565b;
                        return dli.f.a(editNoteScreen, (l) editNoteScreen.N.getValue(), u.c(editNoteScreen.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        vmf.h uiState = (vmf.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f290569b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mlf.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (l) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_details_add_note_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.e.f121375b), new vmf.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, continuation, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
