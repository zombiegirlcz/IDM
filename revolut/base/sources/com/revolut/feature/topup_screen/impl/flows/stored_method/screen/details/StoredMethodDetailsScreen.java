package com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import in0.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qve.p;
import te0.w;
import tx0.t3;
import vc.s;
import wvl.b;
import wxe.a0;
import wxe.b0;
import wxe.c;
import wxe.c0;
import wxe.d0;
import wxe.e0;
import wxe.i;
import wxe.j;
import wxe.k;
import wxe.l;
import wxe.m;
import wxe.n;
import wxe.y;
import wxe.z;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/details/StoredMethodDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwxe/y;", "Ldli/a;", "Lwxe/e0;", "Lin0/g;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoredMethodDetailsScreen extends ViewController<y> implements a, g {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(StoredMethodDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final StoredMethodDetailsScreenContract$InputData K;
    public final int L;
    public final CellDetailsActionDelegate M;
    public final CellDetailsChevronDelegate N;
    public final ListSubheaderDelegate O;
    public final RowDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public StoredMethodDetailsScreen(StoredMethodDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new CellDetailsActionDelegate();
        this.N = new CellDetailsChevronDelegate();
        this.O = new ListSubheaderDelegate();
        this.P = new RowDelegate(null, null, 7);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: wxe.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoredMethodDetailsScreen f300897b;

            {
                this.f300897b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoredMethodDetailsScreen storedMethodDetailsScreen = this.f300897b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StoredMethodDetailsScreen.U;
                        StoredMethodDetailsScreen storedMethodDetailsScreen2 = this.f300897b;
                        return dli.f.a(storedMethodDetailsScreen2, storedMethodDetailsScreen2.d(), zhm.v.k(storedMethodDetailsScreen2.O, new ListSubheaderLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), storedMethodDetailsScreen2.M, storedMethodDetailsScreen2.P, storedMethodDetailsScreen2.N, new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = StoredMethodDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(storedMethodDetailsScreen.m2()).a().get(qve.z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qve.z.class, " is not found"));
                        }
                        qve.k kVar = ((qve.k) aVar2.b()).X;
                        StoredMethodDetailsScreenContract$InputData storedMethodDetailsScreenContract$InputData = storedMethodDetailsScreen.K;
                        storedMethodDetailsScreenContract$InputData.getClass();
                        return new qve.p(kVar, storedMethodDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StoredMethodDetailsScreen.U;
                        return (z) ((qve.p) storedMethodDetailsScreen.S.getValue()).f249647c.get();
                }
            }
        });
        this.R = s.t(this, c.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: wxe.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoredMethodDetailsScreen f300897b;

            {
                this.f300897b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoredMethodDetailsScreen storedMethodDetailsScreen = this.f300897b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoredMethodDetailsScreen.U;
                        StoredMethodDetailsScreen storedMethodDetailsScreen2 = this.f300897b;
                        return dli.f.a(storedMethodDetailsScreen2, storedMethodDetailsScreen2.d(), zhm.v.k(storedMethodDetailsScreen2.O, new ListSubheaderLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), storedMethodDetailsScreen2.M, storedMethodDetailsScreen2.P, storedMethodDetailsScreen2.N, new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = StoredMethodDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(storedMethodDetailsScreen.m2()).a().get(qve.z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qve.z.class, " is not found"));
                        }
                        qve.k kVar = ((qve.k) aVar2.b()).X;
                        StoredMethodDetailsScreenContract$InputData storedMethodDetailsScreenContract$InputData = storedMethodDetailsScreen.K;
                        storedMethodDetailsScreenContract$InputData.getClass();
                        return new qve.p(kVar, storedMethodDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StoredMethodDetailsScreen.U;
                        return (z) ((qve.p) storedMethodDetailsScreen.S.getValue()).f249647c.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: wxe.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoredMethodDetailsScreen f300897b;

            {
                this.f300897b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoredMethodDetailsScreen storedMethodDetailsScreen = this.f300897b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoredMethodDetailsScreen.U;
                        StoredMethodDetailsScreen storedMethodDetailsScreen2 = this.f300897b;
                        return dli.f.a(storedMethodDetailsScreen2, storedMethodDetailsScreen2.d(), zhm.v.k(storedMethodDetailsScreen2.O, new ListSubheaderLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), storedMethodDetailsScreen2.M, storedMethodDetailsScreen2.P, storedMethodDetailsScreen2.N, new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = StoredMethodDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(storedMethodDetailsScreen.m2()).a().get(qve.z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qve.z.class, " is not found"));
                        }
                        qve.k kVar = ((qve.k) aVar2.b()).X;
                        StoredMethodDetailsScreenContract$InputData storedMethodDetailsScreenContract$InputData = storedMethodDetailsScreen.K;
                        storedMethodDetailsScreenContract$InputData.getClass();
                        return new qve.p(kVar, storedMethodDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StoredMethodDetailsScreen.U;
                        return (z) ((qve.p) storedMethodDetailsScreen.S.getValue()).f249647c.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e0 uiState = (e0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d0 d0Var = uiState.f300902a;
        if (d0Var instanceof c0) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        if (d0Var instanceof b0) {
            d3().f174539b.l0();
            return;
        }
        if (!(d0Var instanceof a0)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        a0 a0Var = (a0) d0Var;
        TextClause textClause = a0Var.f300893a;
        navBarWithToolbar2.setToolbarTitle(textClause);
        navBarWithToolbar2.setTitle(textClause, null);
        navBarWithToolbar2.setEndIconImage(a0Var.f300895c);
        navBarWithToolbar2.setDescriptionVisible(true);
        navBarWithToolbar2.setDescriptionText(a0Var.f300894b);
        navBarWithToolbar2.setDescriptionColor(a0Var.f);
        navBarWithToolbar2.setDescriptionClickable(a0Var.e);
        navBarWithToolbar2.setNavigationButtonIcon(Integer.valueOf(a0Var.d));
        navBarWithToolbar2.l0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new k(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.q0()), new k(this, null, 1), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.O;
        ViewController.P2(this, new b(rd0.e.b(listSubheaderDelegate.f52707c), 3), new l(this, null), 3);
        CellDetailsActionDelegate cellDetailsActionDelegate = this.M;
        ViewController.P2(this, new b(rd0.e.b(cellDetailsActionDelegate.d), 4), new m(this, null), 3);
        ViewController.P2(this, new b(rd0.e.b(listSubheaderDelegate.f52707c), 5), new n(this, null), 3);
        ViewController.P2(this, new b(rd0.e.b(cellDetailsActionDelegate.d), 6), new wxe.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51821c), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new j(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final z d() {
        return (z) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
