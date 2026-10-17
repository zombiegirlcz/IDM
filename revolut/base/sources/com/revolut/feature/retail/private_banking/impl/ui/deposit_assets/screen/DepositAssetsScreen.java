package com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.screen;

import a07.d;
import adb.b;
import adb.c;
import adb.j;
import adb.k;
import adb.l;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.private_banking.impl.R$string;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.screen.DepositAssetsScreen;
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
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/private_banking/impl/ui/deposit_assets/screen/DepositAssetsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ladb/j;", "Ldli/a;", "Ladb/l;", "feature_retail_private_banking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DepositAssetsScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(DepositAssetsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RowDelegate K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public DepositAssetsScreen(DepositAssetsScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = new RowDelegate(null, null, 7);
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: adb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DepositAssetsScreen f3312b;

            {
                this.f3312b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DepositAssetsScreen.P;
                        DepositAssetsScreen depositAssetsScreen = this.f3312b;
                        return dli.f.a(depositAssetsScreen, (k) depositAssetsScreen.O.getValue(), u.c(depositAssetsScreen.K), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = DepositAssetsScreen.P;
                        return (k) ((wcb.b) this.f3312b.N.getValue()).f296386c.get();
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = w.y0(new a07.b(this, input, 22));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: adb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DepositAssetsScreen f3312b;

            {
                this.f3312b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DepositAssetsScreen.P;
                        DepositAssetsScreen depositAssetsScreen = this.f3312b;
                        return dli.f.a(depositAssetsScreen, (k) depositAssetsScreen.O.getValue(), u.c(depositAssetsScreen.K), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = DepositAssetsScreen.P;
                        return (k) ((wcb.b) this.f3312b.N.getValue()).f296386c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wcb.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.private_banking_deposit_assets_header_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.private_banking_deposit_assets_header_description, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.K.f53218h), new c(this, null), 3);
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new d(this, null, 18), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getM() {
        return R$layout.screen_recycler_navbar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
