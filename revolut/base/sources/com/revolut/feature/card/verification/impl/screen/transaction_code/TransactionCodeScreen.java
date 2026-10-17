package com.revolut.feature.card.verification.impl.screen.transaction_code;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card.verification.impl.screen.transaction_code.TransactionCodeScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ev2.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mc9.n;
import mta.c;
import mv2.b;
import mv2.d;
import mv2.e;
import mv2.g;
import mv2.i;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card/verification/impl/screen/transaction_code/TransactionCodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmv2/e;", "Ldli/a;", "Lmv2/i;", "feature_card_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionCodeScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TransactionCodeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final CodeEditorDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TransactionCodeScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = new CodeEditorDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionCodeScreen f209092b;

            {
                this.f209092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionCodeScreen.Q;
                        TransactionCodeScreen transactionCodeScreen = this.f209092b;
                        return dli.f.a(transactionCodeScreen, (g) transactionCodeScreen.P.getValue(), u.c(transactionCodeScreen.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TransactionCodeScreen.Q;
                        return (g) ((ev2.f) this.f209092b.O.getValue()).f129698c.get();
                }
            }
        });
        this.O = w.y0(new mhd.b(this, inputData, 23));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: mv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionCodeScreen f209092b;

            {
                this.f209092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransactionCodeScreen.Q;
                        TransactionCodeScreen transactionCodeScreen = this.f209092b;
                        return dli.f.a(transactionCodeScreen, (g) transactionCodeScreen.P.getValue(), u.c(transactionCodeScreen.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TransactionCodeScreen.Q;
                        return (g) ((ev2.f) this.f209092b.O.getValue()).f129698c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        mv2.h hVar = uiState.f209104b;
        if (hVar != null) {
            TextLocalisedClause textLocalisedClause = hVar.f209100a;
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setDescriptionText(hVar.f209101b);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(hVar.f209102c);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setEndImage(hVar.d);
            navBarWithToolbar.setMenuItems(hVar.e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 4), 3);
        vkm.d dVarB = rd0.e.b(d3().f174539b.o.f57403b);
        ?? r06 = this.P;
        int i = 4;
        int i2 = 2;
        ViewController.P2(this, dVarB, new n(i2, (g) r06.getValue(), g.class, "onMenuItemClicked", "onMenuItemClicked(Ljava/lang/String;)V", i, 14), 3);
        ViewController.P2(this, rd0.e.b(this.M.d.f121375b), new n(i2, (g) r06.getValue(), g.class, "updateConfirmationCode", "updateConfirmationCode(Ljava/lang/String;)V", i, 15), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
