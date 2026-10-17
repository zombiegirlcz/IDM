package com.revolut.feature.credit.card.impl.ui.revpoints_locked;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.revpoints_locked.CreditCardRevPointsLockedBottomDialogScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ep4.b;
import jm4.f2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xu4.e;
import xu4.f;
import xu4.g;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/revpoints_locked/CreditCardRevPointsLockedBottomDialogScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxu4/e;", "Ldli/a;", "Lxu4/f;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardRevPointsLockedBottomDialogScreen extends ViewController<e> implements a, m {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CreditCardRevPointsLockedBottomDialogScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final h L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;

    public CreditCardRevPointsLockedBottomDialogScreen(CreditCardRevPointsLockedBottomDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = s.t(this, xu4.b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRevPointsLockedBottomDialogScreen f308955b;

            {
                this.f308955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRevPointsLockedBottomDialogScreen.Q;
                        CreditCardRevPointsLockedBottomDialogScreen creditCardRevPointsLockedBottomDialogScreen = this.f308955b;
                        return dli.f.a(creditCardRevPointsLockedBottomDialogScreen, (g) creditCardRevPointsLockedBottomDialogScreen.P.getValue(), v.k(new RowDelegate(null, null, 7), new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardRevPointsLockedBottomDialogScreen.Q;
                        return (g) ((f2) this.f308955b.O.getValue()).f176074c.get();
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.O = w.y0(new xfj.a(this, inputData, 18));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRevPointsLockedBottomDialogScreen f308955b;

            {
                this.f308955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRevPointsLockedBottomDialogScreen.Q;
                        CreditCardRevPointsLockedBottomDialogScreen creditCardRevPointsLockedBottomDialogScreen = this.f308955b;
                        return dli.f.a(creditCardRevPointsLockedBottomDialogScreen, (g) creditCardRevPointsLockedBottomDialogScreen.P.getValue(), v.k(new RowDelegate(null, null, 7), new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardRevPointsLockedBottomDialogScreen.Q;
                        return (g) ((f2) this.f308955b.O.getValue()).f176074c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174545b.setText(uiState.f308959b);
        d3().f174546c.setHeaderModel(uiState.f308958a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f2) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new xni.h(this, null, 10), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
