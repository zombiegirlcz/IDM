package com.revolut.feature.apm.multibanco.impl.ui.withdrawal.list;

import a0l.k;
import a32.g;
import a82.l;
import a92.b;
import a92.c;
import a92.d;
import a92.f;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.list.WithdrawalCodeListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import i72.c0;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/list/WithdrawalCodeListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "La92/b;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WithdrawalCodeListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(WithdrawalCodeListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new g(29));
    public final Object O = w.y0(new d(0));
    public final Object P = w.y0(new d(1));
    public final Object Q = w.y0(new d(2));
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

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

    public WithdrawalCodeListScreen() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: a92.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalCodeListScreen f2301b;

            {
                this.f2301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WithdrawalCodeListScreen withdrawalCodeListScreen = this.f2301b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalCodeListScreen.V;
                        return (my0.e) ((c0) withdrawalCodeListScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalCodeListScreen.V;
                        WithdrawalCodeListScreen withdrawalCodeListScreen2 = this.f2301b;
                        c cVar = (c) withdrawalCodeListScreen2.U.getValue();
                        aim.e eVarB = u.b();
                        eVarB.addAll((List) ((my0.e) withdrawalCodeListScreen2.R.getValue()).f210285a.e.getValue());
                        eVarB.add((RowDelegate) withdrawalCodeListScreen2.N.getValue());
                        eVarB.add((ActionsDelegate) withdrawalCodeListScreen2.O.getValue());
                        eVarB.add((CellDetailsChevronDelegate) withdrawalCodeListScreen2.P.getValue());
                        eVarB.add((FullScreenStateDelegate) withdrawalCodeListScreen2.Q.getValue());
                        eVarB.add(new ListSubheaderDelegate());
                        eVarB.add(new RowLoadingDelegate());
                        Unit unit = Unit.f186387a;
                        return dli.f.a(withdrawalCodeListScreen2, cVar, u.a(eVarB), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalCodeListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(withdrawalCodeListScreen.m2()).a().get(i72.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c0(((i72.m) aVar2.b()).A, new ari.b());
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = WithdrawalCodeListScreen.V;
                        return (c) ((c0) withdrawalCodeListScreen.T.getValue()).f159068g.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: a92.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalCodeListScreen f2301b;

            {
                this.f2301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WithdrawalCodeListScreen withdrawalCodeListScreen = this.f2301b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalCodeListScreen.V;
                        return (my0.e) ((c0) withdrawalCodeListScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalCodeListScreen.V;
                        WithdrawalCodeListScreen withdrawalCodeListScreen2 = this.f2301b;
                        c cVar = (c) withdrawalCodeListScreen2.U.getValue();
                        aim.e eVarB = u.b();
                        eVarB.addAll((List) ((my0.e) withdrawalCodeListScreen2.R.getValue()).f210285a.e.getValue());
                        eVarB.add((RowDelegate) withdrawalCodeListScreen2.N.getValue());
                        eVarB.add((ActionsDelegate) withdrawalCodeListScreen2.O.getValue());
                        eVarB.add((CellDetailsChevronDelegate) withdrawalCodeListScreen2.P.getValue());
                        eVarB.add((FullScreenStateDelegate) withdrawalCodeListScreen2.Q.getValue());
                        eVarB.add(new ListSubheaderDelegate());
                        eVarB.add(new RowLoadingDelegate());
                        Unit unit = Unit.f186387a;
                        return dli.f.a(withdrawalCodeListScreen2, cVar, u.a(eVarB), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalCodeListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(withdrawalCodeListScreen.m2()).a().get(i72.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c0(((i72.m) aVar2.b()).A, new ari.b());
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = WithdrawalCodeListScreen.V;
                        return (c) ((c0) withdrawalCodeListScreen.T.getValue()).f159068g.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: a92.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalCodeListScreen f2301b;

            {
                this.f2301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WithdrawalCodeListScreen withdrawalCodeListScreen = this.f2301b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalCodeListScreen.V;
                        return (my0.e) ((c0) withdrawalCodeListScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalCodeListScreen.V;
                        WithdrawalCodeListScreen withdrawalCodeListScreen2 = this.f2301b;
                        c cVar = (c) withdrawalCodeListScreen2.U.getValue();
                        aim.e eVarB = u.b();
                        eVarB.addAll((List) ((my0.e) withdrawalCodeListScreen2.R.getValue()).f210285a.e.getValue());
                        eVarB.add((RowDelegate) withdrawalCodeListScreen2.N.getValue());
                        eVarB.add((ActionsDelegate) withdrawalCodeListScreen2.O.getValue());
                        eVarB.add((CellDetailsChevronDelegate) withdrawalCodeListScreen2.P.getValue());
                        eVarB.add((FullScreenStateDelegate) withdrawalCodeListScreen2.Q.getValue());
                        eVarB.add(new ListSubheaderDelegate());
                        eVarB.add(new RowLoadingDelegate());
                        Unit unit = Unit.f186387a;
                        return dli.f.a(withdrawalCodeListScreen2, cVar, u.a(eVarB), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalCodeListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(withdrawalCodeListScreen.m2()).a().get(i72.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c0(((i72.m) aVar2.b()).A, new ari.b());
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = WithdrawalCodeListScreen.V;
                        return (c) ((c0) withdrawalCodeListScreen.T.getValue()).f159068g.get();
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: a92.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalCodeListScreen f2301b;

            {
                this.f2301b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                WithdrawalCodeListScreen withdrawalCodeListScreen = this.f2301b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalCodeListScreen.V;
                        return (my0.e) ((c0) withdrawalCodeListScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalCodeListScreen.V;
                        WithdrawalCodeListScreen withdrawalCodeListScreen2 = this.f2301b;
                        c cVar = (c) withdrawalCodeListScreen2.U.getValue();
                        aim.e eVarB = u.b();
                        eVarB.addAll((List) ((my0.e) withdrawalCodeListScreen2.R.getValue()).f210285a.e.getValue());
                        eVarB.add((RowDelegate) withdrawalCodeListScreen2.N.getValue());
                        eVarB.add((ActionsDelegate) withdrawalCodeListScreen2.O.getValue());
                        eVarB.add((CellDetailsChevronDelegate) withdrawalCodeListScreen2.P.getValue());
                        eVarB.add((FullScreenStateDelegate) withdrawalCodeListScreen2.Q.getValue());
                        eVarB.add(new ListSubheaderDelegate());
                        eVarB.add(new RowLoadingDelegate());
                        Unit unit = Unit.f186387a;
                        return dli.f.a(withdrawalCodeListScreen2, cVar, u.a(eVarB), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalCodeListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(withdrawalCodeListScreen.m2()).a().get(i72.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c0(((i72.m) aVar2.b()).A, new ari.b());
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i72.m.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = WithdrawalCodeListScreen.V;
                        return (c) ((c0) withdrawalCodeListScreen.T.getValue()).f159068g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.multibanco_back, null, null, 14), 126));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.multibanco_withdrawal_list_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.multibanco_withdrawal_list_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), null, new a92.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.O.getValue()).f51611c.f121375b), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.N.getValue()).f53218h, new l(16))), null, new k(this, null, 17), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
