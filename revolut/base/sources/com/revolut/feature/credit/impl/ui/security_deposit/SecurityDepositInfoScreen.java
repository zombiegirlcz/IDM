package com.revolut.feature.credit.impl.ui.security_deposit;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.impl.ui.security_deposit.SecurityDepositInfoScreen;
import com.revolut.feature.credit.impl.ui.security_deposit.SecurityDepositInfoScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import hwi.l0;
import i35.b;
import i35.d;
import i35.e;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t15.f;
import te0.w;
import vc.s;
import yy0.i;
import yy0.l;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/security_deposit/SecurityDepositInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li35/e;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecurityDepositInfoScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(SecurityDepositInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SecurityDepositInfoScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final boolean Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public SecurityDepositInfoScreen(SecurityDepositInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new hzl.a(19));
        this.N = w.y0(new hzl.a(20));
        this.O = w.y0(new hzl.a(21));
        this.P = R$layout.screen_recycler_navbar;
        this.Q = true;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: i35.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecurityDepositInfoScreen f158096b;

            {
                this.f158096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SecurityDepositInfoScreen securityDepositInfoScreen = this.f158096b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SecurityDepositInfoScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(securityDepositInfoScreen.m2()).a().get(lp3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lp3.a.class, " is not found"));
                        }
                        t15.d dVar = ((t15.d) ((t15.a) aVar2.b())).A;
                        SecurityDepositInfoScreenContract$InputData securityDepositInfoScreenContract$InputData = securityDepositInfoScreen.K;
                        securityDepositInfoScreenContract$InputData.getClass();
                        return new t15.f(dVar, securityDepositInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SecurityDepositInfoScreen.V;
                        return (d) ((t15.f) securityDepositInfoScreen.R.getValue()).f267179c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SecurityDepositInfoScreen.V;
                        return v.k((RowDelegate) securityDepositInfoScreen.M.getValue(), new ListSubheaderDelegate(), new LargeActionButtonDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsDelegate) securityDepositInfoScreen.N.getValue(), (CellDetailsChevronDelegate) securityDepositInfoScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr4 = SecurityDepositInfoScreen.V;
                        SecurityDepositInfoScreen securityDepositInfoScreen2 = this.f158096b;
                        return dli.f.a(securityDepositInfoScreen2, (d) securityDepositInfoScreen2.S.getValue(), (List) securityDepositInfoScreen2.T.getValue(), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: i35.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecurityDepositInfoScreen f158096b;

            {
                this.f158096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SecurityDepositInfoScreen securityDepositInfoScreen = this.f158096b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecurityDepositInfoScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(securityDepositInfoScreen.m2()).a().get(lp3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lp3.a.class, " is not found"));
                        }
                        t15.d dVar = ((t15.d) ((t15.a) aVar2.b())).A;
                        SecurityDepositInfoScreenContract$InputData securityDepositInfoScreenContract$InputData = securityDepositInfoScreen.K;
                        securityDepositInfoScreenContract$InputData.getClass();
                        return new t15.f(dVar, securityDepositInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SecurityDepositInfoScreen.V;
                        return (d) ((t15.f) securityDepositInfoScreen.R.getValue()).f267179c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SecurityDepositInfoScreen.V;
                        return v.k((RowDelegate) securityDepositInfoScreen.M.getValue(), new ListSubheaderDelegate(), new LargeActionButtonDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsDelegate) securityDepositInfoScreen.N.getValue(), (CellDetailsChevronDelegate) securityDepositInfoScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr4 = SecurityDepositInfoScreen.V;
                        SecurityDepositInfoScreen securityDepositInfoScreen2 = this.f158096b;
                        return dli.f.a(securityDepositInfoScreen2, (d) securityDepositInfoScreen2.S.getValue(), (List) securityDepositInfoScreen2.T.getValue(), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: i35.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecurityDepositInfoScreen f158096b;

            {
                this.f158096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SecurityDepositInfoScreen securityDepositInfoScreen = this.f158096b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecurityDepositInfoScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(securityDepositInfoScreen.m2()).a().get(lp3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lp3.a.class, " is not found"));
                        }
                        t15.d dVar = ((t15.d) ((t15.a) aVar2.b())).A;
                        SecurityDepositInfoScreenContract$InputData securityDepositInfoScreenContract$InputData = securityDepositInfoScreen.K;
                        securityDepositInfoScreenContract$InputData.getClass();
                        return new t15.f(dVar, securityDepositInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SecurityDepositInfoScreen.V;
                        return (d) ((t15.f) securityDepositInfoScreen.R.getValue()).f267179c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SecurityDepositInfoScreen.V;
                        return v.k((RowDelegate) securityDepositInfoScreen.M.getValue(), new ListSubheaderDelegate(), new LargeActionButtonDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsDelegate) securityDepositInfoScreen.N.getValue(), (CellDetailsChevronDelegate) securityDepositInfoScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr4 = SecurityDepositInfoScreen.V;
                        SecurityDepositInfoScreen securityDepositInfoScreen2 = this.f158096b;
                        return dli.f.a(securityDepositInfoScreen2, (d) securityDepositInfoScreen2.S.getValue(), (List) securityDepositInfoScreen2.T.getValue(), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: i35.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecurityDepositInfoScreen f158096b;

            {
                this.f158096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SecurityDepositInfoScreen securityDepositInfoScreen = this.f158096b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecurityDepositInfoScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(securityDepositInfoScreen.m2()).a().get(lp3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lp3.a.class, " is not found"));
                        }
                        t15.d dVar = ((t15.d) ((t15.a) aVar2.b())).A;
                        SecurityDepositInfoScreenContract$InputData securityDepositInfoScreenContract$InputData = securityDepositInfoScreen.K;
                        securityDepositInfoScreenContract$InputData.getClass();
                        return new t15.f(dVar, securityDepositInfoScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SecurityDepositInfoScreen.V;
                        return (d) ((t15.f) securityDepositInfoScreen.R.getValue()).f267179c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SecurityDepositInfoScreen.V;
                        return v.k((RowDelegate) securityDepositInfoScreen.M.getValue(), new ListSubheaderDelegate(), new LargeActionButtonDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (CellDetailsDelegate) securityDepositInfoScreen.N.getValue(), (CellDetailsChevronDelegate) securityDepositInfoScreen.O.getValue());
                    default:
                        KProperty[] kPropertyArr4 = SecurityDepositInfoScreen.V;
                        SecurityDepositInfoScreen securityDepositInfoScreen2 = this.f158096b;
                        return dli.f.a(securityDepositInfoScreen2, (d) securityDepositInfoScreen2.S.getValue(), (List) securityDepositInfoScreen2.T.getValue(), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        i iVar = l.Companion;
        LayeredImage layeredImage = uiState.f158100c;
        iVar.getClass();
        navBarWithToolbar.setEndImage(i.a(layeredImage));
        ?? r110 = uiState.f158098a;
        navBarWithToolbar.setTitle(r110, null);
        TextLocalisedClause textLocalisedClause = uiState.f158099b;
        navBarWithToolbar.setDescriptionText(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, r110, textLocalisedClause, null, 4, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new l0(this, null, 12), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), rd0.e.b(((CellDetailsDelegate) this.N.getValue()).f), rd0.e.b(((CellDetailsChevronDelegate) this.O.getValue()).f51821c)), new hp4.e(2, (d) this.S.getValue(), d.class, "onItemClicked", "onItemClicked(Lcom/revolut/recyclerkit/delegates/ListItem;)V", 4, 8), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }
}
