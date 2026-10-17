package com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsController;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import fyh.k;
import g03.d;
import g03.f;
import g03.i;
import g03.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tz2.m;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/placeholder_settings/DisposableCardSettingsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg03/d;", "Ltki/c;", "Lg03/f;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DisposableCardSettingsController extends ViewController<d> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(DisposableCardSettingsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final DisposableCardSettingsContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final boolean P;
    public final h Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public DisposableCardSettingsController(DisposableCardSettingsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: g03.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisposableCardSettingsController f139267b;

            {
                this.f139267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DisposableCardSettingsController disposableCardSettingsController = this.f139267b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DisposableCardSettingsController.U;
                        qji.b bVarU2 = disposableCardSettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.di.DisposableCardSettingsControllerInjector");
                        tz2.o oVar = (tz2.o) bVarU2;
                        tz2.e eVar = oVar.f275814b;
                        tz2.o oVar2 = oVar.f275815c;
                        DisposableCardSettingsContract$InputData disposableCardSettingsContract$InputData = disposableCardSettingsController.K;
                        disposableCardSettingsContract$InputData.getClass();
                        return new tz2.m(eVar, oVar2, disposableCardSettingsController, disposableCardSettingsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DisposableCardSettingsController.U;
                        return (e) ((tz2.m) disposableCardSettingsController.L.getValue()).f275800p.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DisposableCardSettingsController.U;
                        return (j60.a) ((tz2.m) disposableCardSettingsController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr4 = DisposableCardSettingsController.U;
                        DisposableCardSettingsController disposableCardSettingsController2 = this.f139267b;
                        return tki.g.a(disposableCardSettingsController2, disposableCardSettingsController2.d(), d0.E0(((fd6.a) ((tz2.m) disposableCardSettingsController2.L.getValue()).f275795h.get()).e, zhm.v.k((RowDelegate) disposableCardSettingsController2.R.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateDelegate())), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: g03.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisposableCardSettingsController f139267b;

            {
                this.f139267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DisposableCardSettingsController disposableCardSettingsController = this.f139267b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DisposableCardSettingsController.U;
                        qji.b bVarU2 = disposableCardSettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.di.DisposableCardSettingsControllerInjector");
                        tz2.o oVar = (tz2.o) bVarU2;
                        tz2.e eVar = oVar.f275814b;
                        tz2.o oVar2 = oVar.f275815c;
                        DisposableCardSettingsContract$InputData disposableCardSettingsContract$InputData = disposableCardSettingsController.K;
                        disposableCardSettingsContract$InputData.getClass();
                        return new tz2.m(eVar, oVar2, disposableCardSettingsController, disposableCardSettingsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DisposableCardSettingsController.U;
                        return (e) ((tz2.m) disposableCardSettingsController.L.getValue()).f275800p.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DisposableCardSettingsController.U;
                        return (j60.a) ((tz2.m) disposableCardSettingsController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr4 = DisposableCardSettingsController.U;
                        DisposableCardSettingsController disposableCardSettingsController2 = this.f139267b;
                        return tki.g.a(disposableCardSettingsController2, disposableCardSettingsController2.d(), d0.E0(((fd6.a) ((tz2.m) disposableCardSettingsController2.L.getValue()).f275795h.get()).e, zhm.v.k((RowDelegate) disposableCardSettingsController2.R.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateDelegate())), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: g03.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisposableCardSettingsController f139267b;

            {
                this.f139267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DisposableCardSettingsController disposableCardSettingsController = this.f139267b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DisposableCardSettingsController.U;
                        qji.b bVarU2 = disposableCardSettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.di.DisposableCardSettingsControllerInjector");
                        tz2.o oVar = (tz2.o) bVarU2;
                        tz2.e eVar = oVar.f275814b;
                        tz2.o oVar2 = oVar.f275815c;
                        DisposableCardSettingsContract$InputData disposableCardSettingsContract$InputData = disposableCardSettingsController.K;
                        disposableCardSettingsContract$InputData.getClass();
                        return new tz2.m(eVar, oVar2, disposableCardSettingsController, disposableCardSettingsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DisposableCardSettingsController.U;
                        return (e) ((tz2.m) disposableCardSettingsController.L.getValue()).f275800p.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DisposableCardSettingsController.U;
                        return (j60.a) ((tz2.m) disposableCardSettingsController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr4 = DisposableCardSettingsController.U;
                        DisposableCardSettingsController disposableCardSettingsController2 = this.f139267b;
                        return tki.g.a(disposableCardSettingsController2, disposableCardSettingsController2.d(), d0.E0(((fd6.a) ((tz2.m) disposableCardSettingsController2.L.getValue()).f275795h.get()).e, zhm.v.k((RowDelegate) disposableCardSettingsController2.R.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateDelegate())), 0, null, null, null, 60);
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar;
        this.P = true;
        this.Q = s.t(this, g03.h.f);
        this.R = w.y0(new k(18));
        this.S = w.y0(new k(19));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: g03.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisposableCardSettingsController f139267b;

            {
                this.f139267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DisposableCardSettingsController disposableCardSettingsController = this.f139267b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DisposableCardSettingsController.U;
                        qji.b bVarU2 = disposableCardSettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.di.DisposableCardSettingsControllerInjector");
                        tz2.o oVar = (tz2.o) bVarU2;
                        tz2.e eVar = oVar.f275814b;
                        tz2.o oVar2 = oVar.f275815c;
                        DisposableCardSettingsContract$InputData disposableCardSettingsContract$InputData = disposableCardSettingsController.K;
                        disposableCardSettingsContract$InputData.getClass();
                        return new tz2.m(eVar, oVar2, disposableCardSettingsController, disposableCardSettingsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DisposableCardSettingsController.U;
                        return (e) ((tz2.m) disposableCardSettingsController.L.getValue()).f275800p.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DisposableCardSettingsController.U;
                        return (j60.a) ((tz2.m) disposableCardSettingsController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr4 = DisposableCardSettingsController.U;
                        DisposableCardSettingsController disposableCardSettingsController2 = this.f139267b;
                        return tki.g.a(disposableCardSettingsController2, disposableCardSettingsController2.d(), d0.E0(((fd6.a) ((tz2.m) disposableCardSettingsController2.L.getValue()).f275795h.get()).e, zhm.v.k((RowDelegate) disposableCardSettingsController2.R.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateDelegate())), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 10013) {
            b bVar = (b) d();
            bVar.getClass();
            bVar.X1(new mii.k("CARD_RENAMED_TOAST_ID", new TextLocalisedClause(R$string.card_label_success_text, null, null, 14), null, null, null, 28));
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R.string.common_action_settings, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R.string.common_action_settings, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) this.N.getValue()).d(u.c((LargeActionButtonDelegate) this.S.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new ft.d(this, continuation, 14), 3);
        ?? r56 = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53225r), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53226s), null, new fna.f(this, continuation, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.S.getValue()).d.f121375b), null, new g03.k(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g03.e d() {
        return (g03.e) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
