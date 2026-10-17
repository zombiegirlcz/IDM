package com.revolut.feature.junior.isa.impl.ui.trading_account_picker.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.trading_account_picker.screen.JuniorTradingAccountPickerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import x98.o;
import x98.p;
import xki.e;
import za8.f;
import za8.g;
import za8.i;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/trading_account_picker/screen/JuniorTradingAccountPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lza8/f;", "Ldli/a;", "Lza8/i;", "<init>", "()V", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorTradingAccountPickerScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(JuniorTradingAccountPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    public JuniorTradingAccountPickerScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: za8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTradingAccountPickerScreen f320574b;

            {
                this.f320574b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                JuniorTradingAccountPickerScreen juniorTradingAccountPickerScreen = this.f320574b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorTradingAccountPickerScreen.Q;
                        JuniorTradingAccountPickerScreen juniorTradingAccountPickerScreen2 = this.f320574b;
                        return dli.f.a(juniorTradingAccountPickerScreen2, (g) juniorTradingAccountPickerScreen2.P.getValue(), v.k(juniorTradingAccountPickerScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorTradingAccountPickerScreen.Q;
                        qji.b bVarU2 = juniorTradingAccountPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior.isa.impl.ui.trading_account_picker.screen.di.JuniorTradingAccountPickerScreenInjector");
                        o oVar = ((p) bVarU2).f303639a;
                        x98.q qVar = new x98.q();
                        qVar.f303641a = e4m.b.b(new x98.i(oVar, i3));
                        return qVar;
                    default:
                        KProperty[] kPropertyArr3 = JuniorTradingAccountPickerScreen.Q;
                        return (g) ((x98.q) juniorTradingAccountPickerScreen.O.getValue()).f303641a.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: za8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTradingAccountPickerScreen f320574b;

            {
                this.f320574b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                JuniorTradingAccountPickerScreen juniorTradingAccountPickerScreen = this.f320574b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorTradingAccountPickerScreen.Q;
                        JuniorTradingAccountPickerScreen juniorTradingAccountPickerScreen2 = this.f320574b;
                        return dli.f.a(juniorTradingAccountPickerScreen2, (g) juniorTradingAccountPickerScreen2.P.getValue(), v.k(juniorTradingAccountPickerScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorTradingAccountPickerScreen.Q;
                        qji.b bVarU2 = juniorTradingAccountPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior.isa.impl.ui.trading_account_picker.screen.di.JuniorTradingAccountPickerScreenInjector");
                        o oVar = ((p) bVarU2).f303639a;
                        x98.q qVar = new x98.q();
                        qVar.f303641a = e4m.b.b(new x98.i(oVar, i3));
                        return qVar;
                    default:
                        KProperty[] kPropertyArr3 = JuniorTradingAccountPickerScreen.Q;
                        return (g) ((x98.q) juniorTradingAccountPickerScreen.O.getValue()).f303641a.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: za8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorTradingAccountPickerScreen f320574b;

            {
                this.f320574b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                JuniorTradingAccountPickerScreen juniorTradingAccountPickerScreen = this.f320574b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorTradingAccountPickerScreen.Q;
                        JuniorTradingAccountPickerScreen juniorTradingAccountPickerScreen2 = this.f320574b;
                        return dli.f.a(juniorTradingAccountPickerScreen2, (g) juniorTradingAccountPickerScreen2.P.getValue(), v.k(juniorTradingAccountPickerScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorTradingAccountPickerScreen.Q;
                        qji.b bVarU2 = juniorTradingAccountPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior.isa.impl.ui.trading_account_picker.screen.di.JuniorTradingAccountPickerScreenInjector");
                        o oVar = ((p) bVarU2).f303639a;
                        x98.q qVar = new x98.q();
                        qVar.f303641a = e4m.b.b(new x98.i(oVar, i32));
                        return qVar;
                    default:
                        KProperty[] kPropertyArr3 = JuniorTradingAccountPickerScreen.Q;
                        return (g) ((x98.q) juniorTradingAccountPickerScreen.O.getValue()).f303641a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x98.q) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.junior_trading_child_selector_title, null, null, 14), new TextLocalisedClause(R$string.junior_trading_child_selector_subtitle, null, null, 14), null, null, false, 28));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new za8.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
