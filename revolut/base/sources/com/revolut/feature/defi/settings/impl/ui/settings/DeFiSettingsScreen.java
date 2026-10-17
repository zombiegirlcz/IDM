package com.revolut.feature.defi.settings.impl.ui.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.defi.settings.impl.R$string;
import com.revolut.feature.defi.settings.impl.ui.settings.DeFiSettingsScreen;
import com.revolut.feature.defi.settings.impl.ui.settings.DeFiSettingsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpl.c;
import m66.b;
import m66.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/settings/impl/ui/settings/DeFiSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm66/f;", "feature_defi_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiSettingsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DeFiSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final DeFiSettingsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final RowDelegate P;
    public final Object Q;

    public DeFiSettingsScreen(DeFiSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: m66.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSettingsScreen f203019b;

            {
                this.f203019b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiSettingsScreen deFiSettingsScreen = this.f203019b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSettingsScreen.R;
                        return (e) ((e66.e) deFiSettingsScreen.M.getValue()).f122933b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSettingsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(deFiSettingsScreen.m2()).a().get(e66.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e66.d.class, " is not found"));
                        }
                        e66.d dVar = ((e66.d) aVar2.b()).d;
                        DeFiSettingsScreenContract$InputData deFiSettingsScreenContract$InputData = deFiSettingsScreen.K;
                        deFiSettingsScreenContract$InputData.getClass();
                        return new e66.e(dVar, deFiSettingsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiSettingsScreen.R;
                        DeFiSettingsScreen deFiSettingsScreen2 = this.f203019b;
                        return dli.f.a(deFiSettingsScreen2, (e) deFiSettingsScreen2.L.getValue(), u.c(deFiSettingsScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: m66.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSettingsScreen f203019b;

            {
                this.f203019b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiSettingsScreen deFiSettingsScreen = this.f203019b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSettingsScreen.R;
                        return (e) ((e66.e) deFiSettingsScreen.M.getValue()).f122933b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSettingsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(deFiSettingsScreen.m2()).a().get(e66.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e66.d.class, " is not found"));
                        }
                        e66.d dVar = ((e66.d) aVar2.b()).d;
                        DeFiSettingsScreenContract$InputData deFiSettingsScreenContract$InputData = deFiSettingsScreen.K;
                        deFiSettingsScreenContract$InputData.getClass();
                        return new e66.e(dVar, deFiSettingsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiSettingsScreen.R;
                        DeFiSettingsScreen deFiSettingsScreen2 = this.f203019b;
                        return dli.f.a(deFiSettingsScreen2, (e) deFiSettingsScreen2.L.getValue(), u.c(deFiSettingsScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, b.f);
        this.P = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: m66.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSettingsScreen f203019b;

            {
                this.f203019b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiSettingsScreen deFiSettingsScreen = this.f203019b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSettingsScreen.R;
                        return (e) ((e66.e) deFiSettingsScreen.M.getValue()).f122933b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSettingsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(deFiSettingsScreen.m2()).a().get(e66.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e66.d.class, " is not found"));
                        }
                        e66.d dVar = ((e66.d) aVar2.b()).d;
                        DeFiSettingsScreenContract$InputData deFiSettingsScreenContract$InputData = deFiSettingsScreen.K;
                        deFiSettingsScreenContract$InputData.getClass();
                        return new e66.e(dVar, deFiSettingsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiSettingsScreen.R;
                        DeFiSettingsScreen deFiSettingsScreen2 = this.f203019b;
                        return dli.f.a(deFiSettingsScreen2, (e) deFiSettingsScreen2.L.getValue(), u.c(deFiSettingsScreen2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e66.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m66.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_defi_settings_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_defi_settings_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new c(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new m66.c(2, 4, m66.e.class, (m66.e) this.L.getValue(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
