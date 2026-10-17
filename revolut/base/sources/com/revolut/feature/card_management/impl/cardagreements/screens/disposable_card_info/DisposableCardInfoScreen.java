package com.revolut.feature.card_management.impl.cardagreements.screens.disposable_card_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.card_management.impl.R$id;
import com.revolut.feature.card_management.impl.R$layout;
import com.revolut.feature.card_management.impl.cardagreements.screens.disposable_card_info.DisposableCardInfoScreen;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.f;
import dw3.p3;
import dz2.d;
import fz2.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rz2.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_management/impl/cardagreements/screens/disposable_card_info/DisposableCardInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfz2/a;", "<init>", "()V", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DisposableCardInfoScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(DisposableCardInfoScreen.class, "binding", "getBinding()Lcom/revolut/feature/card_management/impl/databinding/ScreenDisposableCardInfoBottomSheetBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object N;
    public final int M = R$layout.screen_disposable_card_info_bottom_sheet;
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_management/impl/databinding/ScreenDisposableCardInfoBottomSheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.navBarWithToolbar;
            NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(p0, i);
            if (navBarBottomSheet != null) {
                i = R$id.recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new b(controllerContainerCoordinatorLayout, navBarBottomSheet);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public DisposableCardInfoScreen() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: fz2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisposableCardInfoScreen f139080b;

            {
                this.f139080b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DisposableCardInfoScreen disposableCardInfoScreen = this.f139080b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DisposableCardInfoScreen.P;
                        qji.b bVarU2 = disposableCardInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardagreements.screens.disposable_card_info.di.DisposableCardInfoInjector");
                        dz2.d dVar = new dz2.d();
                        dVar.f121224a = e4m.b.b(new p3(4));
                        return dVar;
                    case 1:
                        KProperty[] kPropertyArr2 = DisposableCardInfoScreen.P;
                        return (c) ((dz2.d) disposableCardInfoScreen.K.getValue()).f121224a.get();
                    default:
                        KProperty[] kPropertyArr3 = DisposableCardInfoScreen.P;
                        DisposableCardInfoScreen disposableCardInfoScreen2 = this.f139080b;
                        return f.a(disposableCardInfoScreen2, (c) disposableCardInfoScreen2.L.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), com.revolut.kompot.common.R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: fz2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisposableCardInfoScreen f139080b;

            {
                this.f139080b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DisposableCardInfoScreen disposableCardInfoScreen = this.f139080b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DisposableCardInfoScreen.P;
                        qji.b bVarU2 = disposableCardInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardagreements.screens.disposable_card_info.di.DisposableCardInfoInjector");
                        dz2.d dVar = new dz2.d();
                        dVar.f121224a = e4m.b.b(new p3(4));
                        return dVar;
                    case 1:
                        KProperty[] kPropertyArr2 = DisposableCardInfoScreen.P;
                        return (c) ((dz2.d) disposableCardInfoScreen.K.getValue()).f121224a.get();
                    default:
                        KProperty[] kPropertyArr3 = DisposableCardInfoScreen.P;
                        DisposableCardInfoScreen disposableCardInfoScreen2 = this.f139080b;
                        return f.a(disposableCardInfoScreen2, (c) disposableCardInfoScreen2.L.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), com.revolut.kompot.common.R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: fz2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisposableCardInfoScreen f139080b;

            {
                this.f139080b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DisposableCardInfoScreen disposableCardInfoScreen = this.f139080b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DisposableCardInfoScreen.P;
                        qji.b bVarU2 = disposableCardInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.cardagreements.screens.disposable_card_info.di.DisposableCardInfoInjector");
                        dz2.d dVar = new dz2.d();
                        dVar.f121224a = e4m.b.b(new p3(4));
                        return dVar;
                    case 1:
                        KProperty[] kPropertyArr2 = DisposableCardInfoScreen.P;
                        return (c) ((dz2.d) disposableCardInfoScreen.K.getValue()).f121224a.get();
                    default:
                        KProperty[] kPropertyArr3 = DisposableCardInfoScreen.P;
                        DisposableCardInfoScreen disposableCardInfoScreen2 = this.f139080b;
                        return f.a(disposableCardInfoScreen2, (c) disposableCardInfoScreen2.L.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), com.revolut.kompot.common.R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((fz2.a) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((b) value).f258499b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.cards_home_widget_help_disposable_header, null, null, 14), null, null, null, false, 30));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
