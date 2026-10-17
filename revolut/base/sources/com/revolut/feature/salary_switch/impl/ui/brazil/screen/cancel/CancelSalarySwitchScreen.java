package com.revolut.feature.salary_switch.impl.ui.brazil.screen.cancel;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.cancel.CancelSalarySwitchScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rgf.b;
import rm0.k;
import rqc.e;
import rqc.g;
import te0.w;
import vc.s;
import zhm.u;
import zpc.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/screen/cancel/CancelSalarySwitchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrqc/e;", "Ldli/a;", "Lrqc/g;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancelSalarySwitchScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CancelSalarySwitchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;

    public CancelSalarySwitchScreen(CancelSalarySwitchScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_bottom_sheet_list;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: rqc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelSalarySwitchScreen f256513b;

            {
                this.f256513b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CancelSalarySwitchScreen.Q;
                        CancelSalarySwitchScreen cancelSalarySwitchScreen = this.f256513b;
                        return dli.f.a(cancelSalarySwitchScreen, (f) cancelSalarySwitchScreen.N.getValue(), u.c((LargeActionButtonDelegate) cancelSalarySwitchScreen.P.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CancelSalarySwitchScreen.Q;
                        return (f) ((zpc.c) this.f256513b.M.getValue()).f324237b.get();
                }
            }
        });
        this.M = w.y0(new b(this, inputData, 17));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: rqc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelSalarySwitchScreen f256513b;

            {
                this.f256513b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CancelSalarySwitchScreen.Q;
                        CancelSalarySwitchScreen cancelSalarySwitchScreen = this.f256513b;
                        return dli.f.a(cancelSalarySwitchScreen, (f) cancelSalarySwitchScreen.N.getValue(), u.c((LargeActionButtonDelegate) cancelSalarySwitchScreen.P.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CancelSalarySwitchScreen.Q;
                        return (f) ((zpc.c) this.f256513b.M.getValue()).f324237b.get();
                }
            }
        });
        this.O = s.t(this, rqc.b.f);
        this.P = w.y0(new k(26));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((f) value).f174519b.setHeaderModel(uiState.f256517b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (rqc.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.P.getValue()).d.f121375b), null, new rqc.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
