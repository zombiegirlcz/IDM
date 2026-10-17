package com.revolut.feature.junior_savings.impl.ui.screen.savings_list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_savings.impl.ui.screen.savings_list.JuniorSavingsListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ea4.d;
import en8.b;
import en8.f;
import en8.i;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;
import zm8.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_savings/impl/ui/screen/savings_list/JuniorSavingsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Len8/i;", "feature_junior_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorSavingsListScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(JuniorSavingsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final f K;
    public final int L;
    public final h M;
    public final boolean N;
    public final Object O;
    public final ProductSelectionDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final Object S;

    public JuniorSavingsListScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = true;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: en8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSavingsListScreen f127762b;

            {
                this.f127762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorSavingsListScreen juniorSavingsListScreen = this.f127762b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSavingsListScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSavingsListScreen.m2()).a().get(zm8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zm8.b.class, " is not found"));
                        }
                        zm8.b bVar = ((zm8.b) aVar2.b()).f323394j;
                        f fVar = juniorSavingsListScreen.K;
                        fVar.getClass();
                        return new zm8.c(bVar, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSavingsListScreen.T;
                        JuniorSavingsListScreen juniorSavingsListScreen2 = this.f127762b;
                        return dli.f.a(juniorSavingsListScreen2, (h) juniorSavingsListScreen2.S.getValue(), v.k(juniorSavingsListScreen2.P, juniorSavingsListScreen2.Q, new TextDelegate(), new ProductSelectionLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = JuniorSavingsListScreen.T;
                        return (h) ((zm8.c) juniorSavingsListScreen.O.getValue()).f323399c.get();
                }
            }
        });
        this.P = new ProductSelectionDelegate();
        this.Q = new FullScreenStateDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: en8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSavingsListScreen f127762b;

            {
                this.f127762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorSavingsListScreen juniorSavingsListScreen = this.f127762b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSavingsListScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSavingsListScreen.m2()).a().get(zm8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zm8.b.class, " is not found"));
                        }
                        zm8.b bVar = ((zm8.b) aVar2.b()).f323394j;
                        f fVar = juniorSavingsListScreen.K;
                        fVar.getClass();
                        return new zm8.c(bVar, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSavingsListScreen.T;
                        JuniorSavingsListScreen juniorSavingsListScreen2 = this.f127762b;
                        return dli.f.a(juniorSavingsListScreen2, (h) juniorSavingsListScreen2.S.getValue(), v.k(juniorSavingsListScreen2.P, juniorSavingsListScreen2.Q, new TextDelegate(), new ProductSelectionLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = JuniorSavingsListScreen.T;
                        return (h) ((zm8.c) juniorSavingsListScreen.O.getValue()).f323399c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: en8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSavingsListScreen f127762b;

            {
                this.f127762b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorSavingsListScreen juniorSavingsListScreen = this.f127762b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSavingsListScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSavingsListScreen.m2()).a().get(zm8.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zm8.b.class, " is not found"));
                        }
                        zm8.b bVar = ((zm8.b) aVar2.b()).f323394j;
                        f fVar = juniorSavingsListScreen.K;
                        fVar.getClass();
                        return new zm8.c(bVar, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSavingsListScreen.T;
                        JuniorSavingsListScreen juniorSavingsListScreen2 = this.f127762b;
                        return dli.f.a(juniorSavingsListScreen2, (h) juniorSavingsListScreen2.S.getValue(), v.k(juniorSavingsListScreen2.P, juniorSavingsListScreen2.Q, new TextDelegate(), new ProductSelectionLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = JuniorSavingsListScreen.T;
                        return (h) ((zm8.c) juniorSavingsListScreen.O.getValue()).f323399c.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ?? r06 = uiState.f127771b;
        navBarWithToolbar.setTitle(r06, null);
        navBarWithToolbar.setToolbarTitle(r06);
        Clause clause = uiState.f127772c;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setMenuItems(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (en8.h) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new ec8.c(this, continuation, 15), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new d(this, continuation, 29), 3);
        ViewController.P2(this, rd0.e.b(this.P.p()), new en8.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new en8.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
