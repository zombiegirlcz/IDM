package com.revolut.feature.web_sign_in.ui.screen.promo;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.web_sign_in.R$id;
import com.revolut.feature.web_sign_in.R$layout;
import com.revolut.feature.web_sign_in.ui.screen.promo.WebSignInPromoScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rrh.b;
import srh.e;
import te0.w;
import vc.s;
import yrh.d;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/web_sign_in/ui/screen/promo/WebSignInPromoScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_web_sign_in_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebSignInPromoScreen extends BaseRecyclerViewScreen<Object, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96346a0 = {o0.f186429a.j(new h0(WebSignInPromoScreen.class, "binding", "getBinding()Lcom/revolut/feature/web_sign_in/databinding/ScreenWebSignInPromoBinding;", 0))};
    public final int U;
    public final h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final List Z;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/web_sign_in/databinding/ScreenWebSignInPromoBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.webSignInPromoScreen_button;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.webSignInPromoScreen_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.webSignInPromoScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new b(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public WebSignInPromoScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_web_sign_in_promo;
        this.V = s.t(this, a.f);
        this.W = R$id.webSignInPromoScreen_recyclerView;
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: yrh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebSignInPromoScreen f316317b;

            {
                this.f316317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WebSignInPromoScreen webSignInPromoScreen = this.f316317b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WebSignInPromoScreen.f96346a0;
                        qji.b bVarQ2 = webSignInPromoScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.web_sign_in.ui.screen.promo.di.WebSignInPromoScreenInjector");
                        srh.b bVar = ((srh.d) bVarQ2).f265223b;
                        srh.e eVar = new srh.e();
                        eVar.f265225a = e4m.b.b(new ryc.d(bVar, eVar, 1, 27));
                        eVar.f265226b = e4m.b.b(new ryc.d(bVar, eVar, 0, 27));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr2 = WebSignInPromoScreen.f96346a0;
                        return (d) ((srh.e) webSignInPromoScreen.X.getValue()).f265226b.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: yrh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebSignInPromoScreen f316317b;

            {
                this.f316317b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WebSignInPromoScreen webSignInPromoScreen = this.f316317b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WebSignInPromoScreen.f96346a0;
                        qji.b bVarQ2 = webSignInPromoScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.web_sign_in.ui.screen.promo.di.WebSignInPromoScreenInjector");
                        srh.b bVar = ((srh.d) bVarQ2).f265223b;
                        srh.e eVar = new srh.e();
                        eVar.f265225a = e4m.b.b(new ryc.d(bVar, eVar, 1, 27));
                        eVar.f265226b = e4m.b.b(new ryc.d(bVar, eVar, 0, 27));
                        return eVar;
                    default:
                        KProperty[] kPropertyArr2 = WebSignInPromoScreen.f96346a0;
                        return (d) ((srh.e) webSignInPromoScreen.X.getValue()).f265226b.get();
                }
            }
        });
        this.Z = v.k(new RowDelegate(null, null, 7), new SimpleMediaDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        if (mVar != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "uiState");
        super.Z2(null, oVar);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (e) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (d) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        KProperty[] kPropertyArr = f96346a0;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.V;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((b) value).f256844c.f59410q), null, new yrh.b(this, continuation, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((b) value2).f256843b.o), null, new yrh.b(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        if (nVar != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "uiState");
        super.Z2(null, oVar);
        throw null;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }
}
