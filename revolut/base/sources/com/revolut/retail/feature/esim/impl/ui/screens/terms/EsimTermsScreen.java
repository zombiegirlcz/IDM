package com.revolut.retail.feature.esim.impl.ui.screens.terms;

import afj.q3;
import afj.r3;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.terms.EsimTermsScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pnj.c;
import pnj.e;
import pnj.f;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/terms/EsimTermsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpnj/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimTermsScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, q> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(EsimTermsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final RowDelegate X;
    public final FullScreenStateDelegate Y;
    public final List Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f101476a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f101477b0;

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

    public EsimTermsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        final int i = 1;
        this.V = true;
        this.W = s.t(this, a.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.X = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Y = fullScreenStateDelegate;
        final int i2 = 0;
        this.Z = v.k(rowDelegate, new RowLoadingDelegate(), fullScreenStateDelegate);
        this.f101476a0 = w.y0(new Function0(this) { // from class: pnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimTermsScreen f237831b;

            {
                this.f237831b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                EsimTermsScreen esimTermsScreen = this.f237831b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = EsimTermsScreen.c0;
                        qji.b bVarQ2 = esimTermsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.terms.di.EsimTermsScreenInjector");
                        return (r3) ((q3) ((qnj.a) bVarQ2).J().S(esimTermsScreen)).mo3800build();
                    default:
                        KProperty[] kPropertyArr2 = EsimTermsScreen.c0;
                        r3 r3Var = (r3) esimTermsScreen.f101476a0.getValue();
                        switch (r3Var.f4425a) {
                            case 0:
                                return (e) r3Var.f4427c.get();
                            case 1:
                                return (e) r3Var.f4427c.get();
                            case 2:
                                return (e) r3Var.f4427c.get();
                            case 3:
                                return (e) r3Var.f4427c.get();
                            case 4:
                                return (e) r3Var.f4427c.get();
                            case 5:
                                return (e) r3Var.f4427c.get();
                            default:
                                return (e) r3Var.f4427c.get();
                        }
                }
            }
        });
        this.f101477b0 = w.y0(new Function0(this) { // from class: pnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimTermsScreen f237831b;

            {
                this.f237831b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                EsimTermsScreen esimTermsScreen = this.f237831b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = EsimTermsScreen.c0;
                        qji.b bVarQ2 = esimTermsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.terms.di.EsimTermsScreenInjector");
                        return (r3) ((q3) ((qnj.a) bVarQ2).J().S(esimTermsScreen)).mo3800build();
                    default:
                        KProperty[] kPropertyArr2 = EsimTermsScreen.c0;
                        r3 r3Var = (r3) esimTermsScreen.f101476a0.getValue();
                        switch (r3Var.f4425a) {
                            case 0:
                                return (e) r3Var.f4427c.get();
                            case 1:
                                return (e) r3Var.f4427c.get();
                            case 2:
                                return (e) r3Var.f4427c.get();
                            case 3:
                                return (e) r3Var.f4427c.get();
                            case 4:
                                return (e) r3Var.f4427c.get();
                            case 5:
                                return (e) r3Var.f4427c.get();
                            default:
                                return (e) r3Var.f4427c.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (r3) this.f101476a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.f101477b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new pnb.b(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f52371h.f121375b), null, new pnj.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f53218h), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_help_terms_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_help_terms_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF101865a0() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
