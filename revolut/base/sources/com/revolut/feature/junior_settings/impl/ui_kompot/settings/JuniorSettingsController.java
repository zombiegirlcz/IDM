package com.revolut.feature.junior_settings.impl.ui_kompot.settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.l;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsController;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsControllerContract$Input;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.y;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.q1;
import tx0.u1;
import vc.s;
import xki.e;
import xo8.b;
import xo8.c;
import xo8.d;
import xo8.f;
import xo8.g;
import xo8.m;
import xo8.n;
import xo8.p;
import xo8.r;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/settings/JuniorSettingsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxo8/m;", "Ldli/a;", "Lxo8/s;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorSettingsController extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(JuniorSettingsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarlargecentredBinding;", 0))};
    public final JuniorSettingsControllerContract$Input K;
    public final int L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final LargeActionButtonDelegate Q;
    public final RowDelegate R;
    public final RowDelegate S;
    public final TextDelegate T;
    public final Object U;

    public JuniorSettingsController(JuniorSettingsControllerContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = R$layout.screen_recycler_navbarlargecentred;
        this.M = R$style.UiKitTheme_TransparentSlider;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xo8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSettingsController f307689b;

            {
                this.f307689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorSettingsController juniorSettingsController = this.f307689b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSettingsController.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSettingsController.m2()).a().get(mn8.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                        }
                        mn8.o oVar = ((mn8.o) ((yo8.b) aVar2.b())).f207476w;
                        JuniorSettingsControllerContract$Input juniorSettingsControllerContract$Input = juniorSettingsController.K;
                        juniorSettingsControllerContract$Input.getClass();
                        return new mn8.l(oVar, juniorSettingsController, juniorSettingsControllerContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSettingsController.V;
                        return (n) ((mn8.l) ((yo8.a) juniorSettingsController.O.getValue())).o.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorSettingsController.V;
                        JuniorSettingsController juniorSettingsController2 = this.f307689b;
                        return dli.f.a(juniorSettingsController2, juniorSettingsController2.d(), zhm.v.k(juniorSettingsController2.S, juniorSettingsController2.T, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xo8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSettingsController f307689b;

            {
                this.f307689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorSettingsController juniorSettingsController = this.f307689b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSettingsController.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSettingsController.m2()).a().get(mn8.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                        }
                        mn8.o oVar = ((mn8.o) ((yo8.b) aVar2.b())).f207476w;
                        JuniorSettingsControllerContract$Input juniorSettingsControllerContract$Input = juniorSettingsController.K;
                        juniorSettingsControllerContract$Input.getClass();
                        return new mn8.l(oVar, juniorSettingsController, juniorSettingsControllerContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSettingsController.V;
                        return (n) ((mn8.l) ((yo8.a) juniorSettingsController.O.getValue())).o.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorSettingsController.V;
                        JuniorSettingsController juniorSettingsController2 = this.f307689b;
                        return dli.f.a(juniorSettingsController2, juniorSettingsController2.d(), zhm.v.k(juniorSettingsController2.S, juniorSettingsController2.T, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new LargeActionButtonDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new RowDelegate(null, null, 7);
        this.T = new TextDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: xo8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSettingsController f307689b;

            {
                this.f307689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorSettingsController juniorSettingsController = this.f307689b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSettingsController.V;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSettingsController.m2()).a().get(mn8.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mn8.o.class, " is not found"));
                        }
                        mn8.o oVar = ((mn8.o) ((yo8.b) aVar2.b())).f207476w;
                        JuniorSettingsControllerContract$Input juniorSettingsControllerContract$Input = juniorSettingsController.K;
                        juniorSettingsControllerContract$Input.getClass();
                        return new mn8.l(oVar, juniorSettingsController, juniorSettingsControllerContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSettingsController.V;
                        return (n) ((mn8.l) ((yo8.a) juniorSettingsController.O.getValue())).o.get();
                    default:
                        KProperty[] kPropertyArr3 = JuniorSettingsController.V;
                        JuniorSettingsController juniorSettingsController2 = this.f307689b;
                        return dli.f.a(juniorSettingsController2, juniorSettingsController2.d(), zhm.v.k(juniorSettingsController2.S, juniorSettingsController2.T, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        xo8.s uiState = (xo8.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        r rVar = uiState.f307726a;
        if (rVar instanceof xo8.o) {
            NavBarLargeCentred navBarLargeCentred = d3().f174576b;
            xo8.o oVar2 = (xo8.o) rVar;
            TextLocalisedClause textLocalisedClause = oVar2.f307721a;
            navBarLargeCentred.setModel(new NavBarLargeCentred.Model(new l(textLocalisedClause), textLocalisedClause, oVar2.f307722b, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 984));
            navBarLargeCentred.B();
            NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, new AvatarModel.Default(oVar2.f307723c, null, null, null, null, null, 126), (q1) null, 2, (Object) null);
            navBarLargeCentred.setMenuItems(oVar2.d);
        } else if (Intrinsics.f(rVar, p.f307724a)) {
            NavBarLargeCentred navBarLargeCentred2 = d3().f174576b;
            navBarLargeCentred2.setModel(new NavBarLargeCentred.Model(new l(new TextLocalisedClause(R$string.junior_account_settings_title, null, null, 14)), new TextLocalisedClause(R$string.junior_account_settings_title, null, null, 14), null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 988));
            navBarLargeCentred2.B();
        } else {
            if (!Intrinsics.f(rVar, xo8.q.f307725a)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f174576b.H(u1.TITLE_AND_SUBTITLE);
        }
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yo8.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((mn8.l) ((yo8.a) this.O.getValue())).e.get()).d(v.k(this.Q, this.R));
        d3().f174576b.setModel(new NavBarLargeCentred.Model(new l(new TextLocalisedClause(R$string.junior_account_settings_title, null, null, 14)), new TextLocalisedClause(R$string.junior_account_settings_title, null, null, 14), null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 988));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174576b.f59292m), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174576b.F()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174576b.f59291l.f57403b), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new xo8.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d), new d(this, null, 1), 3);
    }

    public final y d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
