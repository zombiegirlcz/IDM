package com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.payid.api.R$string;
import com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.AddPayIdScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.v7;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ma2.b;
import ma2.c;
import ma2.d;
import ma2.f;
import ma2.n;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/createpayid/addpayid/AddPayIdScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lma2/f;", "Ldli/a;", "Lma2/n;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddPayIdScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AddPayIdScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final CellDetailsActionDelegate M = new CellDetailsActionDelegate();
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final Object O;
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public AddPayIdScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ma2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddPayIdScreen f203921b;

            {
                this.f203921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddPayIdScreen addPayIdScreen = this.f203921b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddPayIdScreen.R;
                        return (h) ((ea2.a) addPayIdScreen.P.getValue()).f124053b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddPayIdScreen.R;
                        qji.b bVarU2 = addPayIdScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.di.AddPayIdScreenInjector");
                        ea2.h hVar = ((ea2.f) bVarU2).f124065a;
                        ea2.a aVar = new ea2.a();
                        int i6 = 22;
                        aVar.f124052a = e4m.b.b(new v7(hVar, aVar, i3, i6));
                        aVar.f124053b = e4m.b.b(new v7(hVar, aVar, i5, i6));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr3 = AddPayIdScreen.R;
                        AddPayIdScreen addPayIdScreen2 = this.f203921b;
                        return dli.f.a(addPayIdScreen2, addPayIdScreen2.R2(), zhm.v.k(new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), addPayIdScreen2.M, addPayIdScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ma2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddPayIdScreen f203921b;

            {
                this.f203921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddPayIdScreen addPayIdScreen = this.f203921b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddPayIdScreen.R;
                        return (h) ((ea2.a) addPayIdScreen.P.getValue()).f124053b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddPayIdScreen.R;
                        qji.b bVarU2 = addPayIdScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.di.AddPayIdScreenInjector");
                        ea2.h hVar = ((ea2.f) bVarU2).f124065a;
                        ea2.a aVar = new ea2.a();
                        int i6 = 22;
                        aVar.f124052a = e4m.b.b(new v7(hVar, aVar, i3, i6));
                        aVar.f124053b = e4m.b.b(new v7(hVar, aVar, i5, i6));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr3 = AddPayIdScreen.R;
                        AddPayIdScreen addPayIdScreen2 = this.f203921b;
                        return dli.f.a(addPayIdScreen2, addPayIdScreen2.R2(), zhm.v.k(new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), addPayIdScreen2.M, addPayIdScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ma2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddPayIdScreen f203921b;

            {
                this.f203921b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddPayIdScreen addPayIdScreen = this.f203921b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddPayIdScreen.R;
                        return (h) ((ea2.a) addPayIdScreen.P.getValue()).f124053b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddPayIdScreen.R;
                        qji.b bVarU2 = addPayIdScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.di.AddPayIdScreenInjector");
                        ea2.h hVar = ((ea2.f) bVarU2).f124065a;
                        ea2.a aVar = new ea2.a();
                        int i6 = 22;
                        aVar.f124052a = e4m.b.b(new v7(hVar, aVar, i32, i6));
                        aVar.f124053b = e4m.b.b(new v7(hVar, aVar, i5, i6));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr3 = AddPayIdScreen.R;
                        AddPayIdScreen addPayIdScreen2 = this.f203921b;
                        return dli.f.a(addPayIdScreen2, addPayIdScreen2.R2(), zhm.v.k(new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), addPayIdScreen2.M, addPayIdScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f203931b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ea2.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.add_payid_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.add_payid_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.add_payid_button_continue, null, null, 14));
        largeActionButton.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d), null, new b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ma2.h R2() {
        return (ma2.h) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
