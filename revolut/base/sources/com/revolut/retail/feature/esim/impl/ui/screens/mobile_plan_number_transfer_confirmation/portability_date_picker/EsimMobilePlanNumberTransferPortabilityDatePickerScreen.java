package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker;

import afj.u2;
import afj.v2;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.c;
import h30.l;
import jii.u;
import kl7.w0;
import klj.b;
import klj.f;
import klj.g;
import klj.j;
import klj.k;
import klj.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/portability_date_picker/EsimMobilePlanNumberTransferPortabilityDatePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lklj/k;", "Ldli/a;", "Lklj/m;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanNumberTransferPortabilityDatePickerScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EsimMobilePlanNumberTransferPortabilityDatePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public EsimMobilePlanNumberTransferPortabilityDatePickerScreen(EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new w0(4));
        this.O = w.y0(new w0(5));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: klj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferPortabilityDatePickerScreen f185632b;

            {
                this.f185632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen = this.f185632b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                        EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen2 = this.f185632b;
                        return dli.f.a(esimMobilePlanNumberTransferPortabilityDatePickerScreen2, esimMobilePlanNumberTransferPortabilityDatePickerScreen2.d(), v.k((InputChecklistDelegate) esimMobilePlanNumberTransferPortabilityDatePickerScreen2.N.getValue(), (InputTextDelegate) esimMobilePlanNumberTransferPortabilityDatePickerScreen2.O.getValue(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                        qji.b bVarU2 = esimMobilePlanNumberTransferPortabilityDatePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.di.EsimMobilePlanNumberTransferPortabilityDatePickerScreenInjector");
                        u2 u2Var = (u2) ((llj.a) bVarU2).j().mo3808a(esimMobilePlanNumberTransferPortabilityDatePickerScreen);
                        EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData = esimMobilePlanNumberTransferPortabilityDatePickerScreen.K;
                        switch (u2Var.f4470a) {
                            case 0:
                                esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.getClass();
                                u2Var.d = esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.getClass();
                                u2Var.d = esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.getClass();
                                u2Var.d = esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
                                break;
                        }
                        return (v2) u2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                        v2 v2Var = (v2) esimMobilePlanNumberTransferPortabilityDatePickerScreen.Q.getValue();
                        switch (v2Var.f4496a) {
                            case 0:
                                return (l) v2Var.d.get();
                            case 1:
                                return (l) v2Var.d.get();
                            default:
                                return (l) v2Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: klj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferPortabilityDatePickerScreen f185632b;

            {
                this.f185632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen = this.f185632b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                        EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen2 = this.f185632b;
                        return dli.f.a(esimMobilePlanNumberTransferPortabilityDatePickerScreen2, esimMobilePlanNumberTransferPortabilityDatePickerScreen2.d(), v.k((InputChecklistDelegate) esimMobilePlanNumberTransferPortabilityDatePickerScreen2.N.getValue(), (InputTextDelegate) esimMobilePlanNumberTransferPortabilityDatePickerScreen2.O.getValue(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                        qji.b bVarU2 = esimMobilePlanNumberTransferPortabilityDatePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.di.EsimMobilePlanNumberTransferPortabilityDatePickerScreenInjector");
                        u2 u2Var = (u2) ((llj.a) bVarU2).j().mo3808a(esimMobilePlanNumberTransferPortabilityDatePickerScreen);
                        EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData = esimMobilePlanNumberTransferPortabilityDatePickerScreen.K;
                        switch (u2Var.f4470a) {
                            case 0:
                                esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.getClass();
                                u2Var.d = esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.getClass();
                                u2Var.d = esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.getClass();
                                u2Var.d = esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
                                break;
                        }
                        return (v2) u2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                        v2 v2Var = (v2) esimMobilePlanNumberTransferPortabilityDatePickerScreen.Q.getValue();
                        switch (v2Var.f4496a) {
                            case 0:
                                return (l) v2Var.d.get();
                            case 1:
                                return (l) v2Var.d.get();
                            default:
                                return (l) v2Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: klj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferPortabilityDatePickerScreen f185632b;

            {
                this.f185632b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen = this.f185632b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                        EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen2 = this.f185632b;
                        return dli.f.a(esimMobilePlanNumberTransferPortabilityDatePickerScreen2, esimMobilePlanNumberTransferPortabilityDatePickerScreen2.d(), v.k((InputChecklistDelegate) esimMobilePlanNumberTransferPortabilityDatePickerScreen2.N.getValue(), (InputTextDelegate) esimMobilePlanNumberTransferPortabilityDatePickerScreen2.O.getValue(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                        qji.b bVarU2 = esimMobilePlanNumberTransferPortabilityDatePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.di.EsimMobilePlanNumberTransferPortabilityDatePickerScreenInjector");
                        u2 u2Var = (u2) ((llj.a) bVarU2).j().mo3808a(esimMobilePlanNumberTransferPortabilityDatePickerScreen);
                        EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData = esimMobilePlanNumberTransferPortabilityDatePickerScreen.K;
                        switch (u2Var.f4470a) {
                            case 0:
                                esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.getClass();
                                u2Var.d = esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.getClass();
                                u2Var.d = esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.getClass();
                                u2Var.d = esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
                                break;
                        }
                        return (v2) u2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferPortabilityDatePickerScreen.S;
                        v2 v2Var = (v2) esimMobilePlanNumberTransferPortabilityDatePickerScreen.Q.getValue();
                        switch (v2Var.f4496a) {
                            case 0:
                                return (l) v2Var.d.get();
                            case 1:
                                return (l) v2Var.d.get();
                            default:
                                return (l) v2Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        j jVar = uiState.f185644b;
        Clause clause = jVar.f185639a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setDescriptionText(jVar.f185640b);
        d3().f174564b.setEnabled(uiState.f185645c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v2) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGrey50);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new kge.b(rd0.e.b(((InputChecklistDelegate) this.N.getValue()).f52518c), 14), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new kge.b(rd0.e.b(((InputTextDelegate) this.O.getValue()).f52575g.f121375b), 15), null, new klj.h(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final klj.l d() {
        return (klj.l) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
