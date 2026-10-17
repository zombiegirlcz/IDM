package com.revolut.feature.card_management.impl.ui.kompot.replace.expectations;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.CardReplaceExpectationsContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.CardReplaceExpectationsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kw4.b;
import l03.c;
import l03.d;
import l03.f;
import l03.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/replace/expectations/CardReplaceExpectationsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll03/c;", "Ltki/c;", "Ll03/d;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReplaceExpectationsController extends ViewController<c> implements tki.c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CardReplaceExpectationsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CardReplaceExpectationsContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CardReplaceExpectationsController(CardReplaceExpectationsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, f.f);
        this.N = w.y0(new b(6));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: l03.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceExpectationsController f191151b;

            {
                this.f191151b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardReplaceExpectationsController cardReplaceExpectationsController = this.f191151b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardReplaceExpectationsController.R;
                        CardReplaceExpectationsController cardReplaceExpectationsController2 = this.f191151b;
                        return tki.g.a(cardReplaceExpectationsController2, (a) cardReplaceExpectationsController2.Q.getValue(), u.c((RowDelegate) cardReplaceExpectationsController2.N.getValue()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CardReplaceExpectationsController.R;
                        qji.b bVarU2 = cardReplaceExpectationsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.di.CardReplaceExpectationsControllerInjector");
                        tz2.g gVar = (tz2.g) bVarU2;
                        tz2.e eVar = gVar.f275776b;
                        tz2.g gVar2 = gVar.f275777c;
                        CardReplaceExpectationsContract$InputData cardReplaceExpectationsContract$InputData = cardReplaceExpectationsController.K;
                        cardReplaceExpectationsContract$InputData.getClass();
                        return new tz2.f(eVar, gVar2, cardReplaceExpectationsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardReplaceExpectationsController.R;
                        return (a) ((tz2.f) cardReplaceExpectationsController.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: l03.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceExpectationsController f191151b;

            {
                this.f191151b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardReplaceExpectationsController cardReplaceExpectationsController = this.f191151b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReplaceExpectationsController.R;
                        CardReplaceExpectationsController cardReplaceExpectationsController2 = this.f191151b;
                        return tki.g.a(cardReplaceExpectationsController2, (a) cardReplaceExpectationsController2.Q.getValue(), u.c((RowDelegate) cardReplaceExpectationsController2.N.getValue()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CardReplaceExpectationsController.R;
                        qji.b bVarU2 = cardReplaceExpectationsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.di.CardReplaceExpectationsControllerInjector");
                        tz2.g gVar = (tz2.g) bVarU2;
                        tz2.e eVar = gVar.f275776b;
                        tz2.g gVar2 = gVar.f275777c;
                        CardReplaceExpectationsContract$InputData cardReplaceExpectationsContract$InputData = cardReplaceExpectationsController.K;
                        cardReplaceExpectationsContract$InputData.getClass();
                        return new tz2.f(eVar, gVar2, cardReplaceExpectationsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardReplaceExpectationsController.R;
                        return (a) ((tz2.f) cardReplaceExpectationsController.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: l03.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReplaceExpectationsController f191151b;

            {
                this.f191151b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardReplaceExpectationsController cardReplaceExpectationsController = this.f191151b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReplaceExpectationsController.R;
                        CardReplaceExpectationsController cardReplaceExpectationsController2 = this.f191151b;
                        return tki.g.a(cardReplaceExpectationsController2, (a) cardReplaceExpectationsController2.Q.getValue(), u.c((RowDelegate) cardReplaceExpectationsController2.N.getValue()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = CardReplaceExpectationsController.R;
                        qji.b bVarU2 = cardReplaceExpectationsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.di.CardReplaceExpectationsControllerInjector");
                        tz2.g gVar = (tz2.g) bVarU2;
                        tz2.e eVar = gVar.f275776b;
                        tz2.g gVar2 = gVar.f275777c;
                        CardReplaceExpectationsContract$InputData cardReplaceExpectationsContract$InputData = cardReplaceExpectationsController.K;
                        cardReplaceExpectationsContract$InputData.getClass();
                        return new tz2.f(eVar, gVar2, cardReplaceExpectationsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CardReplaceExpectationsController.R;
                        return (a) ((tz2.f) cardReplaceExpectationsController.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f191148b, null);
        navBarWithToolbar.setDescriptionText(uiState.f191149c);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (tz2.f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l03.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new g(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
