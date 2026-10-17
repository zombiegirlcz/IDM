package com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ComparisonCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.defi.settings.impl.R$string;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreen;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import k66.b;
import k66.d;
import k66.f;
import k66.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/ui/recovery_phrase/screen/DeFiRecoveryPhraseScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lk66/j;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiRecoveryPhraseScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(DeFiRecoveryPhraseScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final DeFiRecoveryPhraseScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final RowsWidgetDelegate P;
    public final ComparisonCellDelegate Q;
    public final SmallActionButtonDelegate R;
    public final RowDelegate S;
    public final ListSubheaderDelegate T;
    public final Object U;

    public DeFiRecoveryPhraseScreen(DeFiRecoveryPhraseScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: k66.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiRecoveryPhraseScreen f181647b;

            {
                this.f181647b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiRecoveryPhraseScreen deFiRecoveryPhraseScreen = this.f181647b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiRecoveryPhraseScreen.V;
                        return (f) ((e66.b) deFiRecoveryPhraseScreen.M.getValue()).f122925b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiRecoveryPhraseScreen.V;
                        qji.b bVarU2 = deFiRecoveryPhraseScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.di.DeFiRecoveryPhraseScreenComponentInjector");
                        e66.a aVar = (e66.a) bVarU2;
                        e66.d dVar = aVar.f122922b;
                        e66.a aVar2 = aVar.f122923c;
                        DeFiRecoveryPhraseScreenContract$InputData deFiRecoveryPhraseScreenContract$InputData = deFiRecoveryPhraseScreen.K;
                        deFiRecoveryPhraseScreenContract$InputData.getClass();
                        return new e66.b(dVar, aVar2, deFiRecoveryPhraseScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiRecoveryPhraseScreen.V;
                        DeFiRecoveryPhraseScreen deFiRecoveryPhraseScreen2 = this.f181647b;
                        return tki.g.a(deFiRecoveryPhraseScreen2, (f) deFiRecoveryPhraseScreen2.L.getValue(), v.k(deFiRecoveryPhraseScreen2.P, deFiRecoveryPhraseScreen2.Q, deFiRecoveryPhraseScreen2.R, deFiRecoveryPhraseScreen2.S, deFiRecoveryPhraseScreen2.T), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: k66.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiRecoveryPhraseScreen f181647b;

            {
                this.f181647b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiRecoveryPhraseScreen deFiRecoveryPhraseScreen = this.f181647b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiRecoveryPhraseScreen.V;
                        return (f) ((e66.b) deFiRecoveryPhraseScreen.M.getValue()).f122925b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiRecoveryPhraseScreen.V;
                        qji.b bVarU2 = deFiRecoveryPhraseScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.di.DeFiRecoveryPhraseScreenComponentInjector");
                        e66.a aVar = (e66.a) bVarU2;
                        e66.d dVar = aVar.f122922b;
                        e66.a aVar2 = aVar.f122923c;
                        DeFiRecoveryPhraseScreenContract$InputData deFiRecoveryPhraseScreenContract$InputData = deFiRecoveryPhraseScreen.K;
                        deFiRecoveryPhraseScreenContract$InputData.getClass();
                        return new e66.b(dVar, aVar2, deFiRecoveryPhraseScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiRecoveryPhraseScreen.V;
                        DeFiRecoveryPhraseScreen deFiRecoveryPhraseScreen2 = this.f181647b;
                        return tki.g.a(deFiRecoveryPhraseScreen2, (f) deFiRecoveryPhraseScreen2.L.getValue(), v.k(deFiRecoveryPhraseScreen2.P, deFiRecoveryPhraseScreen2.Q, deFiRecoveryPhraseScreen2.R, deFiRecoveryPhraseScreen2.S, deFiRecoveryPhraseScreen2.T), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, b.f);
        this.P = new RowsWidgetDelegate();
        this.Q = new ComparisonCellDelegate();
        this.R = new SmallActionButtonDelegate();
        this.S = new RowDelegate(null, null, 7);
        this.T = new ListSubheaderDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: k66.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiRecoveryPhraseScreen f181647b;

            {
                this.f181647b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiRecoveryPhraseScreen deFiRecoveryPhraseScreen = this.f181647b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiRecoveryPhraseScreen.V;
                        return (f) ((e66.b) deFiRecoveryPhraseScreen.M.getValue()).f122925b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiRecoveryPhraseScreen.V;
                        qji.b bVarU2 = deFiRecoveryPhraseScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.di.DeFiRecoveryPhraseScreenComponentInjector");
                        e66.a aVar = (e66.a) bVarU2;
                        e66.d dVar = aVar.f122922b;
                        e66.a aVar2 = aVar.f122923c;
                        DeFiRecoveryPhraseScreenContract$InputData deFiRecoveryPhraseScreenContract$InputData = deFiRecoveryPhraseScreen.K;
                        deFiRecoveryPhraseScreenContract$InputData.getClass();
                        return new e66.b(dVar, aVar2, deFiRecoveryPhraseScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiRecoveryPhraseScreen.V;
                        DeFiRecoveryPhraseScreen deFiRecoveryPhraseScreen2 = this.f181647b;
                        return tki.g.a(deFiRecoveryPhraseScreen2, (f) deFiRecoveryPhraseScreen2.L.getValue(), v.k(deFiRecoveryPhraseScreen2.P, deFiRecoveryPhraseScreen2.Q, deFiRecoveryPhraseScreen2.R, deFiRecoveryPhraseScreen2.S, deFiRecoveryPhraseScreen2.T), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e66.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.crypto_defi_recovery_phrase_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new k22.c(this, null, 8), 3);
        ViewController.P2(this, rd0.e.b(this.P.f), new k66.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53336c.f121375b), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
