package com.revolut.feature.crypto.strategies.impl.ui.crypto_strategies;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.strategies.api.R$string;
import com.revolut.feature.crypto.strategies.impl.ui.crypto_strategies.CryptoStrategiesController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ff4.z;
import fm5.c;
import fm5.e;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/strategies/impl/ui/crypto_strategies/CryptoStrategiesController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfm5/e;", "<init>", "()V", "feature_crypto_strategies_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoStrategiesController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CryptoStrategiesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object N;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar;
    public final h M = s.t(this, a.f);
    public final RowDelegate O = new RowDelegate(null, null, 7);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public CryptoStrategiesController() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: fm5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoStrategiesController f136023b;

            {
                this.f136023b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoStrategiesController cryptoStrategiesController = this.f136023b;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoStrategiesController.Q;
                        return (c) ((dm5.e) cryptoStrategiesController.N.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoStrategiesController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoStrategiesController.m2()).a().get(dm5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dm5.d.class, " is not found"));
                        }
                        dm5.d dVar = ((dm5.d) aVar2.b()).f;
                        dm5.e eVar = new dm5.e();
                        int i21 = 15;
                        eVar.f115867a = e4m.b.b(new db1.f(dVar, eVar, i5, i21));
                        eVar.f115868b = e4m.b.b(new db1.f(dVar, eVar, i3, i21));
                        eVar.f115869c = e4m.b.b(new db1.f(dVar, eVar, 3, i21));
                        eVar.d = e4m.b.b(new db1.f(dVar, eVar, i6, i21));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = CryptoStrategiesController.Q;
                        CryptoStrategiesController cryptoStrategiesController2 = this.f136023b;
                        return dli.f.a(cryptoStrategiesController2, (c) cryptoStrategiesController2.L.getValue(), v.k(cryptoStrategiesController2.O, new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: fm5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoStrategiesController f136023b;

            {
                this.f136023b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoStrategiesController cryptoStrategiesController = this.f136023b;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoStrategiesController.Q;
                        return (c) ((dm5.e) cryptoStrategiesController.N.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoStrategiesController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoStrategiesController.m2()).a().get(dm5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dm5.d.class, " is not found"));
                        }
                        dm5.d dVar = ((dm5.d) aVar2.b()).f;
                        dm5.e eVar = new dm5.e();
                        int i21 = 15;
                        eVar.f115867a = e4m.b.b(new db1.f(dVar, eVar, i5, i21));
                        eVar.f115868b = e4m.b.b(new db1.f(dVar, eVar, i3, i21));
                        eVar.f115869c = e4m.b.b(new db1.f(dVar, eVar, 3, i21));
                        eVar.d = e4m.b.b(new db1.f(dVar, eVar, i6, i21));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = CryptoStrategiesController.Q;
                        CryptoStrategiesController cryptoStrategiesController2 = this.f136023b;
                        return dli.f.a(cryptoStrategiesController2, (c) cryptoStrategiesController2.L.getValue(), v.k(cryptoStrategiesController2.O, new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: fm5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoStrategiesController f136023b;

            {
                this.f136023b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoStrategiesController cryptoStrategiesController = this.f136023b;
                int i32 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoStrategiesController.Q;
                        return (c) ((dm5.e) cryptoStrategiesController.N.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoStrategiesController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoStrategiesController.m2()).a().get(dm5.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dm5.d.class, " is not found"));
                        }
                        dm5.d dVar = ((dm5.d) aVar2.b()).f;
                        dm5.e eVar = new dm5.e();
                        int i21 = 15;
                        eVar.f115867a = e4m.b.b(new db1.f(dVar, eVar, i5, i21));
                        eVar.f115868b = e4m.b.b(new db1.f(dVar, eVar, i32, i21));
                        eVar.f115869c = e4m.b.b(new db1.f(dVar, eVar, 3, i21));
                        eVar.d = e4m.b.b(new db1.f(dVar, eVar, i6, i21));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr3 = CryptoStrategiesController.Q;
                        CryptoStrategiesController cryptoStrategiesController2 = this.f136023b;
                        return dli.f.a(cryptoStrategiesController2, (c) cryptoStrategiesController2.L.getValue(), v.k(cryptoStrategiesController2.O, new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (dm5.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (c) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_strategies_header_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new z(this, null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new fm5.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
