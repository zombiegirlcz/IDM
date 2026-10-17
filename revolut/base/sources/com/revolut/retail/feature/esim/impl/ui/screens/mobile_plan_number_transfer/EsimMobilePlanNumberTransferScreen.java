package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer;

import afj.g2;
import afj.h2;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreenContract$InputData;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pka.c;
import pkj.b;
import pkj.d;
import pkj.f;
import pkj.h;
import pkj.i;
import pkj.k;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer/EsimMobilePlanNumberTransferScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpkj/h;", "Ldli/a;", "Lpkj/i;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanNumberTransferScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EsimMobilePlanNumberTransferScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimMobilePlanNumberTransferScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public EsimMobilePlanNumberTransferScreen(EsimMobilePlanNumberTransferScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new c(15));
        this.O = w.y0(new c(16));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: pkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferScreen f237196b;

            {
                this.f237196b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen = this.f237196b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferScreen.S;
                        EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen2 = this.f237196b;
                        return dli.f.a(esimMobilePlanNumberTransferScreen2, (k) esimMobilePlanNumberTransferScreen2.R.getValue(), v.k((PhoneEditorDelegate) esimMobilePlanNumberTransferScreen2.N.getValue(), (RowDelegate) esimMobilePlanNumberTransferScreen2.O.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferScreen.S;
                        qji.b bVarU2 = esimMobilePlanNumberTransferScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.di.EsimMobilePlanNumberTransferScreenInjector");
                        g2 g2Var = (g2) ((qkj.a) bVarU2).B().mo3808a(esimMobilePlanNumberTransferScreen);
                        EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData = esimMobilePlanNumberTransferScreen.K;
                        switch (g2Var.f4257a) {
                            case 0:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            case 2:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            case 3:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                        }
                        return (h2) g2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferScreen.S;
                        h2 h2Var = (h2) esimMobilePlanNumberTransferScreen.Q.getValue();
                        switch (h2Var.f4272a) {
                            case 0:
                                return (k) h2Var.e.get();
                            case 1:
                                return (k) h2Var.e.get();
                            case 2:
                                return (k) h2Var.e.get();
                            case 3:
                                return (k) h2Var.e.get();
                            default:
                                return (k) h2Var.e.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: pkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferScreen f237196b;

            {
                this.f237196b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen = this.f237196b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferScreen.S;
                        EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen2 = this.f237196b;
                        return dli.f.a(esimMobilePlanNumberTransferScreen2, (k) esimMobilePlanNumberTransferScreen2.R.getValue(), v.k((PhoneEditorDelegate) esimMobilePlanNumberTransferScreen2.N.getValue(), (RowDelegate) esimMobilePlanNumberTransferScreen2.O.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferScreen.S;
                        qji.b bVarU2 = esimMobilePlanNumberTransferScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.di.EsimMobilePlanNumberTransferScreenInjector");
                        g2 g2Var = (g2) ((qkj.a) bVarU2).B().mo3808a(esimMobilePlanNumberTransferScreen);
                        EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData = esimMobilePlanNumberTransferScreen.K;
                        switch (g2Var.f4257a) {
                            case 0:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            case 2:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            case 3:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                        }
                        return (h2) g2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferScreen.S;
                        h2 h2Var = (h2) esimMobilePlanNumberTransferScreen.Q.getValue();
                        switch (h2Var.f4272a) {
                            case 0:
                                return (k) h2Var.e.get();
                            case 1:
                                return (k) h2Var.e.get();
                            case 2:
                                return (k) h2Var.e.get();
                            case 3:
                                return (k) h2Var.e.get();
                            default:
                                return (k) h2Var.e.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: pkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferScreen f237196b;

            {
                this.f237196b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen = this.f237196b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferScreen.S;
                        EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen2 = this.f237196b;
                        return dli.f.a(esimMobilePlanNumberTransferScreen2, (k) esimMobilePlanNumberTransferScreen2.R.getValue(), v.k((PhoneEditorDelegate) esimMobilePlanNumberTransferScreen2.N.getValue(), (RowDelegate) esimMobilePlanNumberTransferScreen2.O.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferScreen.S;
                        qji.b bVarU2 = esimMobilePlanNumberTransferScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.di.EsimMobilePlanNumberTransferScreenInjector");
                        g2 g2Var = (g2) ((qkj.a) bVarU2).B().mo3808a(esimMobilePlanNumberTransferScreen);
                        EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData = esimMobilePlanNumberTransferScreen.K;
                        switch (g2Var.f4257a) {
                            case 0:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            case 2:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            case 3:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferScreenContract$InputData.getClass();
                                g2Var.d = esimMobilePlanNumberTransferScreenContract$InputData;
                                break;
                        }
                        return (h2) g2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferScreen.S;
                        h2 h2Var = (h2) esimMobilePlanNumberTransferScreen.Q.getValue();
                        switch (h2Var.f4272a) {
                            case 0:
                                return (k) h2Var.e.get();
                            case 1:
                                return (k) h2Var.e.get();
                            case 2:
                                return (k) h2Var.e.get();
                            case 3:
                                return (k) h2Var.e.get();
                            default:
                                return (k) h2Var.e.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        f fVar = uiState.f237205c;
        navBarWithToolbar.setTitle(fVar.f237199a, null);
        navBarWithToolbar.setDescriptionText(fVar.f237200b);
        d3().f174564b.setEnabled(uiState.f237204b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h2) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new pkj.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new pkj.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PhoneEditorDelegate) this.N.getValue()).e.f121375b), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF60605a0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
