package com.revolut.feature_move_money.impl.review.edit_note;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature_move_money.impl.review.edit_note.MoveMoneyEditNoteScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import j8i.b;
import j8i.c;
import j8i.d;
import j8i.g;
import j8i.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u7i.k;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/review/edit_note/MoveMoneyEditNoteScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj8i/g;", "Ldli/a;", "Lj8i/h;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveMoneyEditNoteScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(MoveMoneyEditNoteScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final InputTextDelegate O;
    public final Object P;

    public MoveMoneyEditNoteScreen(MoveMoneyEditNoteScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        this.M = w.y0(new j68.a(this, inputData, 5));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j8i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyEditNoteScreen f172216b;

            {
                this.f172216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyEditNoteScreen.Q;
                        return (i) ((k) this.f172216b.M.getValue()).f277819b.get();
                    default:
                        KProperty[] kPropertyArr2 = MoveMoneyEditNoteScreen.Q;
                        MoveMoneyEditNoteScreen moveMoneyEditNoteScreen = this.f172216b;
                        return dli.f.a(moveMoneyEditNoteScreen, (i) moveMoneyEditNoteScreen.N.getValue(), u.c(moveMoneyEditNoteScreen.O), 0, null, null, null, 60);
                }
            }
        });
        this.O = new InputTextDelegate(null);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: j8i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyEditNoteScreen f172216b;

            {
                this.f172216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MoveMoneyEditNoteScreen.Q;
                        return (i) ((k) this.f172216b.M.getValue()).f277819b.get();
                    default:
                        KProperty[] kPropertyArr2 = MoveMoneyEditNoteScreen.Q;
                        MoveMoneyEditNoteScreen moveMoneyEditNoteScreen = this.f172216b;
                        return dli.f.a(moveMoneyEditNoteScreen, (i) moveMoneyEditNoteScreen.N.getValue(), u.c(moveMoneyEditNoteScreen.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j8i.h uiState = (j8i.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f172220b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174564b.setEnabled(uiState.f172221c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_update, null, null, 14, d3().f174564b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
