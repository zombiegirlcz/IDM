package com.revolut.feature.card_management.impl.ui.kompot.settings;

import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsController;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pyc.p;
import q03.c;
import q03.d;
import q03.f;
import q03.g;
import q03.m0;
import q03.p0;
import te0.w;
import tz2.n;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/settings/RevolutCardSettingsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lq03/m0;", "Ldli/a;", "Lq03/p0;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutCardSettingsController extends ViewController<m0> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(RevolutCardSettingsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RevolutCardSettingsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final boolean O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public RevolutCardSettingsController(RevolutCardSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: q03.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutCardSettingsController f241058b;

            {
                this.f241058b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                switch (i) {
                    case 0:
                        RevolutCardSettingsController revolutCardSettingsController = this.f241058b;
                        RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData = revolutCardSettingsController.K;
                        if (revolutCardSettingsScreenContract$InputData.f64902c == wy2.a.JUNIOR) {
                            qji.b bVarU2 = revolutCardSettingsController.U2();
                            if (bVarU2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.settings.di.junior.JuniorCardSettingsControllerInjector");
                            }
                            tz2.o oVar = (tz2.o) bVarU2;
                            return new tz2.n(oVar.f275814b, oVar.f275815c, revolutCardSettingsController, revolutCardSettingsScreenContract$InputData, 0);
                        }
                        qji.b bVarU22 = revolutCardSettingsController.U2();
                        if (bVarU22 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.settings.di.retail.RevolutCardSettingsControllerInjector");
                        }
                        tz2.o oVar2 = (tz2.o) bVarU22;
                        return new tz2.n(oVar2.f275814b, oVar2.f275815c, revolutCardSettingsController, revolutCardSettingsScreenContract$InputData, 1);
                    case 1:
                        KProperty[] kPropertyArr = RevolutCardSettingsController.X;
                        tz2.n nVar = (tz2.n) this.f241058b.L.getValue();
                        switch (nVar.f275801a) {
                            case 0:
                                return (o0) nVar.f275812r.get();
                            default:
                                return (o0) nVar.f275812r.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = RevolutCardSettingsController.X;
                        RevolutCardSettingsController revolutCardSettingsController2 = this.f241058b;
                        o0 o0VarR2 = revolutCardSettingsController2.R2();
                        List listK = zhm.v.k((RowDelegate) revolutCardSettingsController2.Q.getValue(), new RowLoadingDelegate(), new TextDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate());
                        tz2.n nVar2 = (tz2.n) revolutCardSettingsController2.L.getValue();
                        switch (nVar2.f275801a) {
                            case 0:
                                aVar = (fd6.a) nVar2.i.get();
                                break;
                            default:
                                aVar = (fd6.a) nVar2.i.get();
                                break;
                        }
                        return dli.f.a(revolutCardSettingsController2, o0VarR2, zhm.d0.E0(aVar.e, listK), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: q03.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutCardSettingsController f241058b;

            {
                this.f241058b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                switch (i2) {
                    case 0:
                        RevolutCardSettingsController revolutCardSettingsController = this.f241058b;
                        RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData = revolutCardSettingsController.K;
                        if (revolutCardSettingsScreenContract$InputData.f64902c == wy2.a.JUNIOR) {
                            qji.b bVarU2 = revolutCardSettingsController.U2();
                            if (bVarU2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.settings.di.junior.JuniorCardSettingsControllerInjector");
                            }
                            tz2.o oVar = (tz2.o) bVarU2;
                            return new tz2.n(oVar.f275814b, oVar.f275815c, revolutCardSettingsController, revolutCardSettingsScreenContract$InputData, 0);
                        }
                        qji.b bVarU22 = revolutCardSettingsController.U2();
                        if (bVarU22 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.settings.di.retail.RevolutCardSettingsControllerInjector");
                        }
                        tz2.o oVar2 = (tz2.o) bVarU22;
                        return new tz2.n(oVar2.f275814b, oVar2.f275815c, revolutCardSettingsController, revolutCardSettingsScreenContract$InputData, 1);
                    case 1:
                        KProperty[] kPropertyArr = RevolutCardSettingsController.X;
                        tz2.n nVar = (tz2.n) this.f241058b.L.getValue();
                        switch (nVar.f275801a) {
                            case 0:
                                return (o0) nVar.f275812r.get();
                            default:
                                return (o0) nVar.f275812r.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = RevolutCardSettingsController.X;
                        RevolutCardSettingsController revolutCardSettingsController2 = this.f241058b;
                        o0 o0VarR2 = revolutCardSettingsController2.R2();
                        List listK = zhm.v.k((RowDelegate) revolutCardSettingsController2.Q.getValue(), new RowLoadingDelegate(), new TextDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate());
                        tz2.n nVar2 = (tz2.n) revolutCardSettingsController2.L.getValue();
                        switch (nVar2.f275801a) {
                            case 0:
                                aVar = (fd6.a) nVar2.i.get();
                                break;
                            default:
                                aVar = (fd6.a) nVar2.i.get();
                                break;
                        }
                        return dli.f.a(revolutCardSettingsController2, o0VarR2, zhm.d0.E0(aVar.e, listK), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = true;
        this.P = s.t(this, q03.b.f);
        this.Q = w.y0(new pni.a(22));
        this.R = w.y0(new pni.a(23));
        this.S = w.y0(new pni.a(24));
        this.T = w.y0(new pni.a(25));
        this.U = w.y0(new pni.a(26));
        this.V = w.y0(new pni.a(27));
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: q03.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutCardSettingsController f241058b;

            {
                this.f241058b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fd6.a aVar;
                switch (i3) {
                    case 0:
                        RevolutCardSettingsController revolutCardSettingsController = this.f241058b;
                        RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData = revolutCardSettingsController.K;
                        if (revolutCardSettingsScreenContract$InputData.f64902c == wy2.a.JUNIOR) {
                            qji.b bVarU2 = revolutCardSettingsController.U2();
                            if (bVarU2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.settings.di.junior.JuniorCardSettingsControllerInjector");
                            }
                            tz2.o oVar = (tz2.o) bVarU2;
                            return new tz2.n(oVar.f275814b, oVar.f275815c, revolutCardSettingsController, revolutCardSettingsScreenContract$InputData, 0);
                        }
                        qji.b bVarU22 = revolutCardSettingsController.U2();
                        if (bVarU22 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.kompot.settings.di.retail.RevolutCardSettingsControllerInjector");
                        }
                        tz2.o oVar2 = (tz2.o) bVarU22;
                        return new tz2.n(oVar2.f275814b, oVar2.f275815c, revolutCardSettingsController, revolutCardSettingsScreenContract$InputData, 1);
                    case 1:
                        KProperty[] kPropertyArr = RevolutCardSettingsController.X;
                        tz2.n nVar = (tz2.n) this.f241058b.L.getValue();
                        switch (nVar.f275801a) {
                            case 0:
                                return (o0) nVar.f275812r.get();
                            default:
                                return (o0) nVar.f275812r.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = RevolutCardSettingsController.X;
                        RevolutCardSettingsController revolutCardSettingsController2 = this.f241058b;
                        o0 o0VarR2 = revolutCardSettingsController2.R2();
                        List listK = zhm.v.k((RowDelegate) revolutCardSettingsController2.Q.getValue(), new RowLoadingDelegate(), new TextDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate());
                        tz2.n nVar2 = (tz2.n) revolutCardSettingsController2.L.getValue();
                        switch (nVar2.f275801a) {
                            case 0:
                                aVar = (fd6.a) nVar2.i.get();
                                break;
                            default:
                                aVar = (fd6.a) nVar2.i.get();
                                break;
                        }
                        return dli.f.a(revolutCardSettingsController2, o0VarR2, zhm.d0.E0(aVar.e, listK), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p0 uiState = (p0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.P.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f241097b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        b bVar = (b) R2();
        bVar.getClass();
        if (i2 != -1) {
            return;
        }
        bVar.l2(new q03.o(i, bVar, null), new yi5.b(26));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        n nVar = (n) this.L.getValue();
        switch (nVar.f275801a) {
            case 0:
                aVar = (j60.a) nVar.f.get();
                break;
            default:
                aVar = (j60.a) nVar.f.get();
                break;
        }
        aVar.d(v.k((LargeActionButtonDelegate) this.R.getValue(), (TextDelegate) this.T.getValue(), (RowDelegate) this.U.getValue(), (PermissionDelegate) this.V.getValue()));
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new pnb.b(this, null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PermissionDelegate) this.V.getValue()).d.f121375b), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.U.getValue()).f53218h), null, new d(this, null), 3);
        ?? r62 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53220l), null, new q03.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53225r), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53226s), null, new c(this, continuation, 1), 3);
        r map = ((LargeActionButtonDelegate) this.R.getValue()).d.f121375b.map(new pz4.a(22, new p(23)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new c(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final q03.o0 R2() {
        return (q03.o0) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
