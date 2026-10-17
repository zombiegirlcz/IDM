package com.revolut.sso.impl.ui.external_entry.external_entry.choose_account;

import akl.e0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import anl.e;
import anl.f;
import anl.g;
import anl.i;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.external_entry.external_entry.choose_account.ChooseAccountScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/external_entry/choose_account/ChooseAccountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lanl/g;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lanl/e;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChooseAccountScreen extends BaseRecyclerViewScreen<g, IOData$EmptyInput, e> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106554b0 = {o0.f186429a.j(new h0(ChooseAccountScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenChooseAccountBinding;", 0))};
    public final RowDelegate U;
    public final h V;
    public final int W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f106555a0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, dkl.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/sso/impl/databinding/ScreenChooseAccountBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.chooseAccountScreen_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.chooseAccountScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new dkl.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ChooseAccountScreen() {
        super(IOData$EmptyInput.f98299a);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        this.V = s.t(this, a.f);
        this.W = R$layout.screen_choose_account;
        this.X = R$id.chooseAccountScreen_recyclerView;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: anl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseAccountScreen f7807b;

            {
                this.f7807b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChooseAccountScreen chooseAccountScreen = this.f7807b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChooseAccountScreen.f106554b0;
                        qji.b bVarQ2 = chooseAccountScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.external_entry.external_entry.choose_account.di.ChooseAccountScreenInjector");
                        kjl.c cVar = ((kjl.b) bVarQ2).f184485c;
                        kjl.a aVar = new kjl.a();
                        int i3 = 21;
                        aVar.f184480a = e4m.b.b(new jqa.h(cVar, aVar, 2, i3));
                        aVar.f184481b = e4m.b.b(new jqa.h(cVar, aVar, 1, i3));
                        aVar.f184482c = e4m.b.b(new jqa.h(cVar, aVar, 0, i3));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr2 = ChooseAccountScreen.f106554b0;
                        return (f) ((kjl.a) chooseAccountScreen.Y.getValue()).f184482c.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: anl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseAccountScreen f7807b;

            {
                this.f7807b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChooseAccountScreen chooseAccountScreen = this.f7807b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChooseAccountScreen.f106554b0;
                        qji.b bVarQ2 = chooseAccountScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.external_entry.external_entry.choose_account.di.ChooseAccountScreenInjector");
                        kjl.c cVar = ((kjl.b) bVarQ2).f184485c;
                        kjl.a aVar = new kjl.a();
                        int i3 = 21;
                        aVar.f184480a = e4m.b.b(new jqa.h(cVar, aVar, 2, i3));
                        aVar.f184481b = e4m.b.b(new jqa.h(cVar, aVar, 1, i3));
                        aVar.f184482c = e4m.b.b(new jqa.h(cVar, aVar, 0, i3));
                        return aVar;
                    default:
                        KProperty[] kPropertyArr2 = ChooseAccountScreen.f106554b0;
                        return (f) ((kjl.a) chooseAccountScreen.Y.getValue()).f184482c.get();
                }
            }
        });
        this.f106555a0 = v.k(new RowLoadingDelegate(), rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((i) ((f) this.Z.getValue())).v2(e.a.f7810a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (kjl.a) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f115635b.f59410q), null, new e0(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f53218h), null, new anl.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f115635b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78936d0() {
        return this.f106555a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f115635b;
        TextLocalisedClause textLocalisedClause = uiState.f7812a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f7813b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    public final dkl.a h3() {
        ViewBinding value = this.V.getValue(this, f106554b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.a) value;
    }
}
