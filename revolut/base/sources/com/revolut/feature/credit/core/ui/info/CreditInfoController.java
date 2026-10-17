package com.revolut.feature.credit.core.ui.info;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import ax4.g;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.credit.core.ui.info.CreditInfoController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fy4.b;
import fy4.c;
import fy4.d;
import fy4.p;
import fy4.t;
import fy4.w;
import grl.k9;
import java.util.List;
import kji.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/core/ui/info/CreditInfoController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfy4/w;", "Ldli/a;", "Lfy4/p;", "Lno/m;", "Lkji/f;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditInfoController extends ViewController<w> implements dli.a, m, f {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CreditInfoController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final t K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final h N;
    public final PlainTextDelegate O;
    public final TextDelegate P;
    public final CellDetailsDelegate Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CreditInfoController(t inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_bottom_sheet_base;
        this.N = s.t(this, b.f);
        this.O = new PlainTextDelegate();
        this.P = new TextDelegate();
        this.Q = new CellDetailsDelegate();
        this.R = new RowDelegate(null, null, 7);
        final int i = 0;
        this.S = te0.w.y0(new Function0(this) { // from class: fy4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditInfoController f138890b;

            {
                this.f138890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditInfoController creditInfoController = this.f138890b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditInfoController.V;
                        CreditInfoController creditInfoController2 = this.f138890b;
                        return dli.f.a(creditInfoController2, creditInfoController2.d(), zhm.v.k(creditInfoController2.R, new ListCellDelegate(), creditInfoController2.Q, new LightPromptDelegate(null), creditInfoController2.P, creditInfoController2.O), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditInfoController.V;
                        phm.a aVar = (phm.a) ue0.e.j(creditInfoController.m2()).a().get(ax4.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ax4.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.CreditConstructorComponent");
                        ax4.e eVar = ((ax4.e) objB).e;
                        t tVar = creditInfoController.K;
                        tVar.getClass();
                        return new ax4.g(eVar, tVar);
                    default:
                        KProperty[] kPropertyArr3 = CreditInfoController.V;
                        return (g) ((ax4.g) creditInfoController.T.getValue()).f10875c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = te0.w.y0(new Function0(this) { // from class: fy4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditInfoController f138890b;

            {
                this.f138890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditInfoController creditInfoController = this.f138890b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditInfoController.V;
                        CreditInfoController creditInfoController2 = this.f138890b;
                        return dli.f.a(creditInfoController2, creditInfoController2.d(), zhm.v.k(creditInfoController2.R, new ListCellDelegate(), creditInfoController2.Q, new LightPromptDelegate(null), creditInfoController2.P, creditInfoController2.O), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditInfoController.V;
                        phm.a aVar = (phm.a) ue0.e.j(creditInfoController.m2()).a().get(ax4.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ax4.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.CreditConstructorComponent");
                        ax4.e eVar = ((ax4.e) objB).e;
                        t tVar = creditInfoController.K;
                        tVar.getClass();
                        return new ax4.g(eVar, tVar);
                    default:
                        KProperty[] kPropertyArr3 = CreditInfoController.V;
                        return (g) ((ax4.g) creditInfoController.T.getValue()).f10875c.get();
                }
            }
        });
        final int i3 = 2;
        this.U = te0.w.y0(new Function0(this) { // from class: fy4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditInfoController f138890b;

            {
                this.f138890b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditInfoController creditInfoController = this.f138890b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditInfoController.V;
                        CreditInfoController creditInfoController2 = this.f138890b;
                        return dli.f.a(creditInfoController2, creditInfoController2.d(), zhm.v.k(creditInfoController2.R, new ListCellDelegate(), creditInfoController2.Q, new LightPromptDelegate(null), creditInfoController2.P, creditInfoController2.O), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditInfoController.V;
                        phm.a aVar = (phm.a) ue0.e.j(creditInfoController.m2()).a().get(ax4.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ax4.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.CreditConstructorComponent");
                        ax4.e eVar = ((ax4.e) objB).e;
                        t tVar = creditInfoController.K;
                        tVar.getClass();
                        return new ax4.g(eVar, tVar);
                    default:
                        KProperty[] kPropertyArr3 = CreditInfoController.V;
                        return (g) ((ax4.g) creditInfoController.T.getValue()).f10875c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        List list = uiState.f138899a;
        i iVar = uiState.f138901c;
        bottomSheetControllerBaseRecyclerView.setVisibility(!list.isEmpty() ? 0 : 8);
        d3().f174514c.setHeaderModel(uiState.f138900b);
        ActionFooterView bottomSheetControllerBaseFooterView = d3().f174513b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
        bottomSheetControllerBaseFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f174513b.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174514c.F), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174513b.f), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174513b.f58955g), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174513b.e), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new c(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new fy4.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new fy4.f(this, null), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final fy4.g d() {
        return (fy4.g) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
