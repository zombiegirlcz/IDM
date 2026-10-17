package com.revolut.feature.payees.impl.ui.payees_overview_info_bottom_sheet;

import aii.q;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.feature.payees.impl.R$id;
import com.revolut.feature.payees.impl.R$layout;
import com.revolut.feature.payees.impl.ui.payees_overview_info_bottom_sheet.PayeesOverviewInfoBottomSheetScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import gm9.c;
import hm9.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import ym9.b;
import ym9.e;
import ym9.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_overview_info_bottom_sheet/PayeesOverviewInfoBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lym9/e;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayeesOverviewInfoBottomSheetScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(PayeesOverviewInfoBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/feature/payees/impl/databinding/ScreenOverviewInfoBottomSheetBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public PayeesOverviewInfoBottomSheetScreen(PayeesOverviewInfoBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_overview_info_bottom_sheet;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ym9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesOverviewInfoBottomSheetScreen f314884b;

            {
                this.f314884b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesOverviewInfoBottomSheetScreen.P;
                        PayeesOverviewInfoBottomSheetScreen payeesOverviewInfoBottomSheetScreen = this.f314884b;
                        return dli.f.a(payeesOverviewInfoBottomSheetScreen, (f) payeesOverviewInfoBottomSheetScreen.O.getValue(), m72.b.v(null, null, 7), R$id.overviewInfoBottomSheetScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PayeesOverviewInfoBottomSheetScreen.P;
                        j jVar = (j) this.f314884b.N.getValue();
                        switch (jVar.f153571a) {
                            case 0:
                                return (f) jVar.f153573c.get();
                            default:
                                return (f) jVar.f153573c.get();
                        }
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = w.y0(new yff.b(this, inputData, 9));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ym9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesOverviewInfoBottomSheetScreen f314884b;

            {
                this.f314884b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesOverviewInfoBottomSheetScreen.P;
                        PayeesOverviewInfoBottomSheetScreen payeesOverviewInfoBottomSheetScreen = this.f314884b;
                        return dli.f.a(payeesOverviewInfoBottomSheetScreen, (f) payeesOverviewInfoBottomSheetScreen.O.getValue(), m72.b.v(null, null, 7), R$id.overviewInfoBottomSheetScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PayeesOverviewInfoBottomSheetScreen.P;
                        j jVar = (j) this.f314884b.N.getValue();
                        switch (jVar.f153571a) {
                            case 0:
                                return (f) jVar.f153573c.get();
                            default:
                                return (f) jVar.f153573c.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((c) value).f144800b.setHeaderModel(new lw0.a(uiState.f314887b, uiState.f314888c, null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
