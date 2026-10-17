package com.revolut.feature.credit.card.impl.ui.details;

import aee.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import br4.e;
import br4.f;
import br4.t;
import br4.u;
import br4.v;
import br4.x;
import br4.y;
import br4.z;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import efm.r;
import ep4.b;
import jm4.u0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.t3;
import vc.s;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/CreditCardDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbr4/t;", "Ldli/a;", "Lbr4/z;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardDetailsScreen extends ViewController<t> implements dli.a, m {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(CreditCardDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final int U;
    public final boolean V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public CreditCardDetailsScreen(CreditCardDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = s.t(this, f.f);
        this.M = w.y0(new bkd.a(27));
        this.N = w.y0(new bkd.a(28));
        this.O = w.y0(new bkd.a(29));
        this.P = w.y0(new e(0));
        this.Q = w.y0(new e(1));
        this.R = w.y0(new e(2));
        this.S = w.y0(new e(3));
        this.T = w.y0(new e(4));
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = w.y0(new bc1.a(this, inputData, 21));
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: br4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDetailsScreen f17885b;

            {
                this.f17885b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardDetailsScreen.Z;
                        return (u) ((u0) this.f17885b.W.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr2 = CreditCardDetailsScreen.Z;
                        CreditCardDetailsScreen creditCardDetailsScreen = this.f17885b;
                        return dli.f.a(creditCardDetailsScreen, (u) creditCardDetailsScreen.X.getValue(), zhm.v.k((RowDelegate) creditCardDetailsScreen.M.getValue(), new ListSubheaderDelegate(), (LargeActionButtonDelegate) creditCardDetailsScreen.R.getValue(), new RowLoadingDelegate(), (CellDetailsDelegate) creditCardDetailsScreen.N.getValue(), (CellDetailsBarRatingDelegate) creditCardDetailsScreen.O.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) creditCardDetailsScreen.P.getValue(), (CellDetailsChevronDelegate) creditCardDetailsScreen.Q.getValue(), (CellDetailsActionDelegate) creditCardDetailsScreen.T.getValue(), (TextDelegate) creditCardDetailsScreen.S.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: br4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDetailsScreen f17885b;

            {
                this.f17885b = this;
            }

            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardDetailsScreen.Z;
                        return (u) ((u0) this.f17885b.W.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr2 = CreditCardDetailsScreen.Z;
                        CreditCardDetailsScreen creditCardDetailsScreen = this.f17885b;
                        return dli.f.a(creditCardDetailsScreen, (u) creditCardDetailsScreen.X.getValue(), zhm.v.k((RowDelegate) creditCardDetailsScreen.M.getValue(), new ListSubheaderDelegate(), (LargeActionButtonDelegate) creditCardDetailsScreen.R.getValue(), new RowLoadingDelegate(), (CellDetailsDelegate) creditCardDetailsScreen.N.getValue(), (CellDetailsBarRatingDelegate) creditCardDetailsScreen.O.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), (FullScreenStateDelegate) creditCardDetailsScreen.P.getValue(), (CellDetailsChevronDelegate) creditCardDetailsScreen.Q.getValue(), (CellDetailsActionDelegate) creditCardDetailsScreen.T.getValue(), (TextDelegate) creditCardDetailsScreen.S.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        z uiState = (z) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        y yVar = uiState.f17927a;
        if (yVar.equals(x.f17926a)) {
            navBarWithToolbar.H0(false);
            navBarWithToolbar.I0(t3.TWO_LINES, false);
            return;
        }
        if (yVar.equals(br4.w.f17925a)) {
            navBarWithToolbar.l0();
            return;
        }
        if (!(yVar instanceof v)) {
            throw new NoWhenBranchMatchedException();
        }
        v vVar = (v) yVar;
        navBarWithToolbar.setTitle(vVar.f17922a, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(vVar.f17924c);
        f0.t(navBarWithToolbar, vVar.d, false, 6);
        navBarWithToolbar.setToolbarTitle(vVar.f17923b);
        navBarWithToolbar.H0(false);
        navBarWithToolbar.l0();
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u0) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (u) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new bf5.a(this, null, 28), 3);
        r rVarMerge = r.merge(zhm.v.k(((RowDelegate) this.M.getValue()).f53218h, ((CellDetailsDelegate) this.N.getValue()).d, ((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b, ((CellDetailsChevronDelegate) this.Q.getValue()).f51821c, ((LargeActionButtonDelegate) this.R.getValue()).d.f121375b, ((CellDetailsActionDelegate) this.T.getValue()).f51780c, ((TextDelegate) this.S.getValue()).f53530c, d3().f174539b.q0()));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new g(2, (u) this.X.getValue(), u.class, "onItemClicked", "onItemClicked(Ljava/lang/Object;)V", 4, 15), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
