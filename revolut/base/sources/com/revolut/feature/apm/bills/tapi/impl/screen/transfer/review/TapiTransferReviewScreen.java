package com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import as1.b;
import as1.c;
import as1.d;
import as1.h;
import as1.l;
import as1.m;
import as1.n;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bills.tapi.impl.R$string;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review.TapiTransferReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import rr1.f;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/impl/screen/transfer/review/TapiTransferReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Las1/l;", "Ldli/a;", "Las1/n;", "Lno/d1;", "Companion", "a", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TapiTransferReviewScreen extends ViewController<l> implements a, d1 {
    public final h K;
    public final boolean L;
    public final int M;
    public final Object N;
    public final ao.h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(TapiTransferReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review.TapiTransferReviewScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TapiTransferReviewScreen(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: as1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferReviewScreen f8753b;

            {
                this.f8753b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TapiTransferReviewScreen tapiTransferReviewScreen = this.f8753b;
                switch (i2) {
                    case 0:
                        TapiTransferReviewScreen.Companion companion = TapiTransferReviewScreen.INSTANCE;
                        return (m) ((rr1.f) tapiTransferReviewScreen.Y.getValue()).f256656h.get();
                    case 1:
                        TapiTransferReviewScreen.Companion companion2 = TapiTransferReviewScreen.INSTANCE;
                        TapiTransferReviewScreen tapiTransferReviewScreen2 = this.f8753b;
                        return dli.f.a(tapiTransferReviewScreen2, tapiTransferReviewScreen2.R2(), zhm.v.k((CounterTextDelegate) tapiTransferReviewScreen2.P.getValue(), (CellDetailsDelegate) tapiTransferReviewScreen2.Q.getValue(), (CellDetailsActionDelegate) tapiTransferReviewScreen2.R.getValue(), (CellDetailsNoteDelegate) tapiTransferReviewScreen2.S.getValue(), (InputTextDelegate) tapiTransferReviewScreen2.T.getValue(), (ListSubheaderDelegate) tapiTransferReviewScreen2.U.getValue(), (LargeActionButtonDelegate) tapiTransferReviewScreen2.W.getValue(), (RowDelegate) tapiTransferReviewScreen2.V.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        TapiTransferReviewScreen.Companion companion3 = TapiTransferReviewScreen.INSTANCE;
                        qji.b bVarU2 = tapiTransferReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review.di.TapiTransferReviewScreenInjector");
                        rr1.e eVar = (rr1.e) bVarU2;
                        rr1.a aVar = eVar.f256650b;
                        rr1.e eVar2 = eVar.f256651c;
                        h hVar = tapiTransferReviewScreen.K;
                        hVar.getClass();
                        return new rr1.f(aVar, eVar2, tapiTransferReviewScreen, hVar);
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = w.y0(new ar0.b(2));
        this.Q = w.y0(new ar0.b(3));
        this.R = w.y0(new ar0.b(4));
        this.S = w.y0(new ar0.b(5));
        this.T = w.y0(new ar0.b(6));
        this.U = w.y0(new ar0.b(7));
        this.V = w.y0(new ar0.b(8));
        this.W = w.y0(new ar0.b(9));
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: as1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferReviewScreen f8753b;

            {
                this.f8753b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TapiTransferReviewScreen tapiTransferReviewScreen = this.f8753b;
                switch (i22) {
                    case 0:
                        TapiTransferReviewScreen.Companion companion = TapiTransferReviewScreen.INSTANCE;
                        return (m) ((rr1.f) tapiTransferReviewScreen.Y.getValue()).f256656h.get();
                    case 1:
                        TapiTransferReviewScreen.Companion companion2 = TapiTransferReviewScreen.INSTANCE;
                        TapiTransferReviewScreen tapiTransferReviewScreen2 = this.f8753b;
                        return dli.f.a(tapiTransferReviewScreen2, tapiTransferReviewScreen2.R2(), zhm.v.k((CounterTextDelegate) tapiTransferReviewScreen2.P.getValue(), (CellDetailsDelegate) tapiTransferReviewScreen2.Q.getValue(), (CellDetailsActionDelegate) tapiTransferReviewScreen2.R.getValue(), (CellDetailsNoteDelegate) tapiTransferReviewScreen2.S.getValue(), (InputTextDelegate) tapiTransferReviewScreen2.T.getValue(), (ListSubheaderDelegate) tapiTransferReviewScreen2.U.getValue(), (LargeActionButtonDelegate) tapiTransferReviewScreen2.W.getValue(), (RowDelegate) tapiTransferReviewScreen2.V.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        TapiTransferReviewScreen.Companion companion3 = TapiTransferReviewScreen.INSTANCE;
                        qji.b bVarU2 = tapiTransferReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review.di.TapiTransferReviewScreenInjector");
                        rr1.e eVar = (rr1.e) bVarU2;
                        rr1.a aVar = eVar.f256650b;
                        rr1.e eVar2 = eVar.f256651c;
                        h hVar = tapiTransferReviewScreen.K;
                        hVar.getClass();
                        return new rr1.f(aVar, eVar2, tapiTransferReviewScreen, hVar);
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: as1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TapiTransferReviewScreen f8753b;

            {
                this.f8753b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TapiTransferReviewScreen tapiTransferReviewScreen = this.f8753b;
                switch (i22) {
                    case 0:
                        TapiTransferReviewScreen.Companion companion = TapiTransferReviewScreen.INSTANCE;
                        return (m) ((rr1.f) tapiTransferReviewScreen.Y.getValue()).f256656h.get();
                    case 1:
                        TapiTransferReviewScreen.Companion companion2 = TapiTransferReviewScreen.INSTANCE;
                        TapiTransferReviewScreen tapiTransferReviewScreen2 = this.f8753b;
                        return dli.f.a(tapiTransferReviewScreen2, tapiTransferReviewScreen2.R2(), zhm.v.k((CounterTextDelegate) tapiTransferReviewScreen2.P.getValue(), (CellDetailsDelegate) tapiTransferReviewScreen2.Q.getValue(), (CellDetailsActionDelegate) tapiTransferReviewScreen2.R.getValue(), (CellDetailsNoteDelegate) tapiTransferReviewScreen2.S.getValue(), (InputTextDelegate) tapiTransferReviewScreen2.T.getValue(), (ListSubheaderDelegate) tapiTransferReviewScreen2.U.getValue(), (LargeActionButtonDelegate) tapiTransferReviewScreen2.W.getValue(), (RowDelegate) tapiTransferReviewScreen2.V.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        TapiTransferReviewScreen.Companion companion3 = TapiTransferReviewScreen.INSTANCE;
                        qji.b bVarU2 = tapiTransferReviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review.di.TapiTransferReviewScreenInjector");
                        rr1.e eVar = (rr1.e) bVarU2;
                        rr1.a aVar = eVar.f256650b;
                        rr1.e eVar2 = eVar.f256651c;
                        h hVar = tapiTransferReviewScreen.K;
                        hVar.getClass();
                        return new rr1.f(aVar, eVar2, tapiTransferReviewScreen, hVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f8770b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setLoadingButtonTag("SUBMIT_BUTTON_TAG");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsNoteDelegate) this.S.getValue()).d), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.W.getValue()).d.f121375b), null, new as1.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.R.getValue()).d), null, new as1.f(this, null), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.tapi_transfer_review_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.tapi_transfer_review_title, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(R$string.tapi_transfer_review_cta_button_submit, null, null, 14));
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
