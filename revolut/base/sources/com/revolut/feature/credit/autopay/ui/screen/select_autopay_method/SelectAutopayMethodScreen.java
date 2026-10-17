package com.revolut.feature.credit.autopay.ui.screen.select_autopay_method;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.SelectAutopayMethodContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.SelectAutopayMethodScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dw3.a6;
import dw3.z5;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import qk4.b;
import qk4.c;
import qk4.d;
import qk4.f;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/select_autopay_method/SelectAutopayMethodScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lqk4/d;", "Lcom/revolut/feature/credit/autopay/ui/screen/select_autopay_method/SelectAutopayMethodContract$InputData;", "Lqk4/b;", "Lno/k;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectAutopayMethodScreen extends BaseRecyclerViewScreen<d, SelectAutopayMethodContract$InputData, b> implements k {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f68649d0 = {o0.f186429a.j(new h0(SelectAutopayMethodScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SelectAutopayMethodContract$InputData U;
    public final h V;
    public final int W;
    public AnalyticsContext X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f68650a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f68651b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectAutopayMethodScreen(SelectAutopayMethodContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = input;
        this.V = s.t(this, f.f);
        this.W = R$layout.screen_recycler_navbar;
        this.X = input.f68648b;
        Lazy lazyY0 = w.y0(new qh0.d(26));
        this.Y = lazyY0;
        Lazy lazyY02 = w.y0(new qh0.d(27));
        this.Z = lazyY02;
        final int i = 0;
        final int i2 = 1;
        this.f68650a0 = v.k((RowDelegate) lazyY02.getValue(), (PlainTextWarningDelegate) lazyY0.getValue());
        this.f68651b0 = w.y0(new Function0(this) { // from class: qk4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAutopayMethodScreen f246967b;

            {
                this.f246967b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                SelectAutopayMethodScreen selectAutopayMethodScreen = this.f246967b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAutopayMethodScreen.f68649d0;
                        qji.b bVarQ2 = selectAutopayMethodScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.di.SelectAutopayMethodScreenInjector");
                        z5 z5Var = (z5) ((rk4.a) bVarQ2).c().S(selectAutopayMethodScreen);
                        SelectAutopayMethodContract$InputData selectAutopayMethodContract$InputData = selectAutopayMethodScreen.U;
                        switch (z5Var.f120299a) {
                            case 0:
                                selectAutopayMethodContract$InputData.getClass();
                                z5Var.f120301c = selectAutopayMethodContract$InputData;
                                break;
                            case 1:
                                selectAutopayMethodContract$InputData.getClass();
                                z5Var.f120301c = selectAutopayMethodContract$InputData;
                                break;
                            default:
                                selectAutopayMethodContract$InputData.getClass();
                                z5Var.f120301c = selectAutopayMethodContract$InputData;
                                break;
                        }
                        return (a6) z5Var.mo3800build();
                    default:
                        KProperty[] kPropertyArr2 = SelectAutopayMethodScreen.f68649d0;
                        a6 a6Var = (a6) selectAutopayMethodScreen.f68651b0.getValue();
                        switch (a6Var.f118277a) {
                            case 0:
                                return (c) a6Var.d.get();
                            case 1:
                                return (c) a6Var.d.get();
                            default:
                                return (c) a6Var.d.get();
                        }
                }
            }
        });
        this.c0 = w.y0(new Function0(this) { // from class: qk4.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAutopayMethodScreen f246967b;

            {
                this.f246967b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SelectAutopayMethodScreen selectAutopayMethodScreen = this.f246967b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAutopayMethodScreen.f68649d0;
                        qji.b bVarQ2 = selectAutopayMethodScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.di.SelectAutopayMethodScreenInjector");
                        z5 z5Var = (z5) ((rk4.a) bVarQ2).c().S(selectAutopayMethodScreen);
                        SelectAutopayMethodContract$InputData selectAutopayMethodContract$InputData = selectAutopayMethodScreen.U;
                        switch (z5Var.f120299a) {
                            case 0:
                                selectAutopayMethodContract$InputData.getClass();
                                z5Var.f120301c = selectAutopayMethodContract$InputData;
                                break;
                            case 1:
                                selectAutopayMethodContract$InputData.getClass();
                                z5Var.f120301c = selectAutopayMethodContract$InputData;
                                break;
                            default:
                                selectAutopayMethodContract$InputData.getClass();
                                z5Var.f120301c = selectAutopayMethodContract$InputData;
                                break;
                        }
                        return (a6) z5Var.mo3800build();
                    default:
                        KProperty[] kPropertyArr2 = SelectAutopayMethodScreen.f68649d0;
                        a6 a6Var = (a6) selectAutopayMethodScreen.f68651b0.getValue();
                        switch (a6Var.f118277a) {
                            case 0:
                                return (c) a6Var.d.get();
                            case 1:
                                return (c) a6Var.d.get();
                            default:
                                return (c) a6Var.d.get();
                        }
                }
            }
        });
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.X = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getC0() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (a6) this.f68651b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (c) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.V.getValue(this, f68649d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        a.g2(this, e.b(((m) value).f174539b.f59410q), null, new qg4.d(this, continuation, 9), 3);
        a.g2(this, e.b(((PlainTextWarningDelegate) this.Y.getValue()).d.f121375b), null, new qc3.c(this, continuation, 20), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.V.getValue(this, f68649d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.autopay_select_repayment_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.autopay_select_repayment_title, null, null, 14));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.autopay_select_payment_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78908e0() {
        return this.f68650a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }
}
