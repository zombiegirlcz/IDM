package com.revolut.feature.retail.restaurants.impl.ui.cancelreservation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.retail.restaurants.impl.ui.cancelreservation.CancelReservationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zdb.b;
import zdb.c;
import zdb.e;
import zdb.f;
import zdb.i;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/cancelreservation/CancelReservationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzdb/f;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancelReservationScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CancelReservationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetTwinVerticalButtonBinding;", 0))};
    public final e K;
    public final int L;
    public final h M;
    public final CellDetailsDelegate N;
    public final PlainTextWarningDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CancelReservationScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_twin_vertical_button;
        this.M = s.t(this, b.f);
        this.N = new CellDetailsDelegate();
        this.O = new PlainTextWarningDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: zdb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelReservationScreen f321433b;

            {
                this.f321433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CancelReservationScreen cancelReservationScreen = this.f321433b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CancelReservationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cancelReservationScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        e eVar = cancelReservationScreen.K;
                        eVar.getClass();
                        return new vdb.a(jVar, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CancelReservationScreen.S;
                        return (i) ((vdb.a) cancelReservationScreen.P.getValue()).f287835b.get();
                    default:
                        KProperty[] kPropertyArr3 = CancelReservationScreen.S;
                        CancelReservationScreen cancelReservationScreen2 = this.f321433b;
                        return dli.f.a(cancelReservationScreen2, (i) cancelReservationScreen2.Q.getValue(), v.k(cancelReservationScreen2.N, cancelReservationScreen2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zdb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelReservationScreen f321433b;

            {
                this.f321433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CancelReservationScreen cancelReservationScreen = this.f321433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancelReservationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cancelReservationScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        e eVar = cancelReservationScreen.K;
                        eVar.getClass();
                        return new vdb.a(jVar, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CancelReservationScreen.S;
                        return (i) ((vdb.a) cancelReservationScreen.P.getValue()).f287835b.get();
                    default:
                        KProperty[] kPropertyArr3 = CancelReservationScreen.S;
                        CancelReservationScreen cancelReservationScreen2 = this.f321433b;
                        return dli.f.a(cancelReservationScreen2, (i) cancelReservationScreen2.Q.getValue(), v.k(cancelReservationScreen2.N, cancelReservationScreen2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: zdb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelReservationScreen f321433b;

            {
                this.f321433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CancelReservationScreen cancelReservationScreen = this.f321433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancelReservationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(cancelReservationScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        e eVar = cancelReservationScreen.K;
                        eVar.getClass();
                        return new vdb.a(jVar, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CancelReservationScreen.S;
                        return (i) ((vdb.a) cancelReservationScreen.P.getValue()).f287835b.get();
                    default:
                        KProperty[] kPropertyArr3 = CancelReservationScreen.S;
                        CancelReservationScreen cancelReservationScreen2 = this.f321433b;
                        return dli.f.a(cancelReservationScreen2, (i) cancelReservationScreen2.Q.getValue(), v.k(cancelReservationScreen2.N, cancelReservationScreen2.O), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174548b.setHeaderModel(uiState.f321437b);
        TwinVerticalButton twinVerticalButton = d3().d;
        aw0.h hVar = uiState.f321438c;
        n6 n6Var = hVar.f10330b;
        n6 n6Var2 = hVar.f10331c;
        twinVerticalButton.setMainButtonText(n6Var.f10433a);
        twinVerticalButton.setMainButtonStyle(n6Var.f10434b);
        twinVerticalButton.setMainButtonEnabled(n6Var.f10436g);
        String str = n6Var.f;
        if (str != null) {
            twinVerticalButton.setMainButtonLoadingTag(str);
        }
        twinVerticalButton.setSecondaryButtonText(n6Var2.f10433a);
        twinVerticalButton.setSecondaryButtonStyle(n6Var2.f10434b);
        twinVerticalButton.setSecondaryButtonEnabled(n6Var2.f10436g);
        twinVerticalButton.setSecondaryButtonVisible(true);
        String str2 = n6Var2.f;
        if (str2 != null) {
            twinVerticalButton.setSecondaryButtonLoadingTag(str2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vdb.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.p0()), new c(this, null, 1), 3);
    }

    public final p d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
