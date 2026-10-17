package com.revolut.feature.security_hub.impl.ui.linked_wallet_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_details.LinkedWalletDetailsScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_details.LinkedWalletDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tk5.c;
import tuc.b;
import tuc.d;
import tuc.j;
import tuc.l;
import tuc.n;
import vc.s;
import vtc.t;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallet_details/LinkedWalletDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltuc/j;", "Ldli/a;", "Ltuc/n;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkedWalletDetailsScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(LinkedWalletDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final LinkedWalletDetailsScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final LargeActionButtonDelegate N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Object R;

    public LinkedWalletDetailsScreen(LinkedWalletDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new LargeActionButtonDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletDetailsScreen f274572b;

            {
                this.f274572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LinkedWalletDetailsScreen linkedWalletDetailsScreen = this.f274572b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedWalletDetailsScreen.S;
                        return (l) ((vtc.j) linkedWalletDetailsScreen.P.getValue()).f291995c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedWalletDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(linkedWalletDetailsScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        LinkedWalletDetailsScreenContract$InputData linkedWalletDetailsScreenContract$InputData = linkedWalletDetailsScreen.K;
                        linkedWalletDetailsScreenContract$InputData.getClass();
                        return new vtc.j(tVar, linkedWalletDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LinkedWalletDetailsScreen.S;
                        int i3 = R$id.recyclerView;
                        LinkedWalletDetailsScreen linkedWalletDetailsScreen2 = this.f274572b;
                        return dli.f.a(linkedWalletDetailsScreen2, linkedWalletDetailsScreen2.R2(), v.k(linkedWalletDetailsScreen2.M, new CellDetailsDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate(), linkedWalletDetailsScreen2.N), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: tuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletDetailsScreen f274572b;

            {
                this.f274572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LinkedWalletDetailsScreen linkedWalletDetailsScreen = this.f274572b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedWalletDetailsScreen.S;
                        return (l) ((vtc.j) linkedWalletDetailsScreen.P.getValue()).f291995c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedWalletDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(linkedWalletDetailsScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        LinkedWalletDetailsScreenContract$InputData linkedWalletDetailsScreenContract$InputData = linkedWalletDetailsScreen.K;
                        linkedWalletDetailsScreenContract$InputData.getClass();
                        return new vtc.j(tVar, linkedWalletDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LinkedWalletDetailsScreen.S;
                        int i3 = R$id.recyclerView;
                        LinkedWalletDetailsScreen linkedWalletDetailsScreen2 = this.f274572b;
                        return dli.f.a(linkedWalletDetailsScreen2, linkedWalletDetailsScreen2.R2(), v.k(linkedWalletDetailsScreen2.M, new CellDetailsDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate(), linkedWalletDetailsScreen2.N), i3, null, null, null, 56);
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar;
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: tuc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletDetailsScreen f274572b;

            {
                this.f274572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LinkedWalletDetailsScreen linkedWalletDetailsScreen = this.f274572b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedWalletDetailsScreen.S;
                        return (l) ((vtc.j) linkedWalletDetailsScreen.P.getValue()).f291995c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedWalletDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(linkedWalletDetailsScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).M;
                        LinkedWalletDetailsScreenContract$InputData linkedWalletDetailsScreenContract$InputData = linkedWalletDetailsScreen.K;
                        linkedWalletDetailsScreenContract$InputData.getClass();
                        return new vtc.j(tVar, linkedWalletDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LinkedWalletDetailsScreen.S;
                        int i32 = R$id.recyclerView;
                        LinkedWalletDetailsScreen linkedWalletDetailsScreen2 = this.f274572b;
                        return dli.f.a(linkedWalletDetailsScreen2, linkedWalletDetailsScreen2.R2(), v.k(linkedWalletDetailsScreen2.M, new CellDetailsDelegate(), new RowLoadingDelegate(), new PlaceholderRowDelegate(), linkedWalletDetailsScreen2.N), i32, null, null, null, 56);
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
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        List<ActionsView.Item> list = uiState.f274581b;
        ?? r06 = uiState.f274582c;
        if (list != null) {
            d3().f174539b.setFilters(list);
        }
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(r06);
        navBarWithToolbar.setTitle(r06, null);
        navBarWithToolbar.setEndImage(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vtc.j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        F2();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 17), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new tuc.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new tuc.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
