package com.revolut.feature.credit.card.impl.ui.revpoints;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.credit.card.impl.ui.revpoints.CreditCardRevPointsMigrationBottomDialogScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ep4.b;
import jm4.g2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import vge.z1;
import vu4.d;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/revpoints/CreditCardRevPointsMigrationBottomDialogScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvu4/d;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardRevPointsMigrationBottomDialogScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CreditCardRevPointsMigrationBottomDialogScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final Object L;
    public final Object M;
    public final h N;
    public final int O;
    public final Object P;

    public CreditCardRevPointsMigrationBottomDialogScreen(CreditCardRevPointsMigrationBottomDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRevPointsMigrationBottomDialogScreen f292249b;

            {
                this.f292249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRevPointsMigrationBottomDialogScreen.Q;
                        CreditCardRevPointsMigrationBottomDialogScreen creditCardRevPointsMigrationBottomDialogScreen = this.f292249b;
                        return dli.f.a(creditCardRevPointsMigrationBottomDialogScreen, (e) creditCardRevPointsMigrationBottomDialogScreen.P.getValue(), m72.b.v(null, null, 7), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardRevPointsMigrationBottomDialogScreen.Q;
                        return (e) ((g2) this.f292249b.M.getValue()).f176090c.get();
                }
            }
        });
        this.M = w.y0(new vqd.b(this, inputData, 9));
        this.N = s.t(this, vu4.b.f);
        this.O = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRevPointsMigrationBottomDialogScreen f292249b;

            {
                this.f292249b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRevPointsMigrationBottomDialogScreen.Q;
                        CreditCardRevPointsMigrationBottomDialogScreen creditCardRevPointsMigrationBottomDialogScreen = this.f292249b;
                        return dli.f.a(creditCardRevPointsMigrationBottomDialogScreen, (e) creditCardRevPointsMigrationBottomDialogScreen.P.getValue(), m72.b.v(null, null, 7), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardRevPointsMigrationBottomDialogScreen.Q;
                        return (e) ((g2) this.f292249b.M.getValue()).f176090c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174545b.setText(uiState.f292253b);
        d3().f174546c.setHeaderModel(uiState.f292252a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g2) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vu4.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new z1(this, null, 16), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.L.getValue();
    }
}
