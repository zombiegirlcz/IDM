package com.revolut.feature.profile.impl.ui.profile.screens.public_experiments;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.profile.screens.public_experiments.PublicExperimentsScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import fma.c0;
import fma.e0;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import loa.c;
import loa.f;
import loa.g;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/public_experiments/PublicExperimentsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lloa/g;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PublicExperimentsScreen extends BaseRecyclerViewScreen<g, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f81477b0 = {o0.f186429a.j(new h0(PublicExperimentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f81478a0;

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

    public PublicExperimentsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        final int i = 1;
        this.V = true;
        this.W = s.t(this, a.f);
        final int i2 = 0;
        this.X = w.y0(new Function0(this) { // from class: loa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PublicExperimentsScreen f197429b;

            {
                this.f197429b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PublicExperimentsScreen publicExperimentsScreen = this.f197429b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = PublicExperimentsScreen.f81477b0;
                        phm.a aVar = (phm.a) ue0.e.j(publicExperimentsScreen.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        e0 e0Var = new e0();
                        int i5 = 25;
                        e0Var.f136091a = e4m.b.b(new fa0.q(c0Var, e0Var, 1, i5));
                        e0Var.f136092b = e4m.b.b(new fa0.q(c0Var, e0Var, 0, i5));
                        return e0Var;
                    default:
                        KProperty[] kPropertyArr2 = PublicExperimentsScreen.f81477b0;
                        return (f) ((e0) publicExperimentsScreen.X.getValue()).f136092b.get();
                }
            }
        });
        this.Y = w.y0(new Function0(this) { // from class: loa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PublicExperimentsScreen f197429b;

            {
                this.f197429b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                PublicExperimentsScreen publicExperimentsScreen = this.f197429b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = PublicExperimentsScreen.f81477b0;
                        phm.a aVar = (phm.a) ue0.e.j(publicExperimentsScreen.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        e0 e0Var = new e0();
                        int i5 = 25;
                        e0Var.f136091a = e4m.b.b(new fa0.q(c0Var, e0Var, 1, i5));
                        e0Var.f136092b = e4m.b.b(new fa0.q(c0Var, e0Var, 0, i5));
                        return e0Var;
                    default:
                        KProperty[] kPropertyArr2 = PublicExperimentsScreen.f81477b0;
                        return (f) ((e0) publicExperimentsScreen.X.getValue()).f136092b.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        this.f81478a0 = v.k(rowDelegate, new RowLoadingDelegate(), new FullScreenStateDelegate(), new TextDelegate(), new CellDetailsChevronDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (e0) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f81477b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new la8.h(this, null, 28), 3);
        RowDelegate rowDelegate = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new loa.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53225r), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f81477b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.profile_new_features_screen_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.profile_new_features_screen_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF81478a0() {
        return this.f81478a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
