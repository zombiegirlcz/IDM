package com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import joh.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import wa3.d;
import wph.j;
import wph.k;
import wph.l;
import wph.m;
import wph.q;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/edit_screener/EditScreenerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwph/q;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditScreenerScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EditScreenerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EditScreenerScreenContract$Input K;
    public final h L;
    public final Object M;
    public final Object N;
    public final int O;
    public final InputTextDelegate P;
    public final ReferralContactDelegate Q;
    public final GridBoxDelegate R;
    public final Object S;

    public EditScreenerScreen(EditScreenerScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = s.t(this, wph.h.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wph.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditScreenerScreen f299329b;

            {
                this.f299329b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditScreenerScreen editScreenerScreen = this.f299329b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditScreenerScreen.T;
                        qji.b bVarU2 = editScreenerScreen.U2();
                        xph.b bVar = bVarU2 instanceof xph.b ? (xph.b) bVarU2 : null;
                        if (bVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(editScreenerScreen.m2()).a().get(vnh.b.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                            }
                            bVar = (xph.b) aVar2.b();
                        }
                        return bVar.b().b(editScreenerScreen, editScreenerScreen.K);
                    case 1:
                        KProperty[] kPropertyArr2 = EditScreenerScreen.T;
                        y yVar = (y) editScreenerScreen.M.getValue();
                        switch (yVar.f177077a) {
                            case 0:
                                return (m) yVar.d.get();
                            default:
                                return (m) yVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = EditScreenerScreen.T;
                        EditScreenerScreen editScreenerScreen2 = this.f299329b;
                        return tki.g.a(editScreenerScreen2, editScreenerScreen2.d(), v.k(editScreenerScreen2.P, editScreenerScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wph.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditScreenerScreen f299329b;

            {
                this.f299329b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditScreenerScreen editScreenerScreen = this.f299329b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditScreenerScreen.T;
                        qji.b bVarU2 = editScreenerScreen.U2();
                        xph.b bVar = bVarU2 instanceof xph.b ? (xph.b) bVarU2 : null;
                        if (bVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(editScreenerScreen.m2()).a().get(vnh.b.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                            }
                            bVar = (xph.b) aVar2.b();
                        }
                        return bVar.b().b(editScreenerScreen, editScreenerScreen.K);
                    case 1:
                        KProperty[] kPropertyArr2 = EditScreenerScreen.T;
                        y yVar = (y) editScreenerScreen.M.getValue();
                        switch (yVar.f177077a) {
                            case 0:
                                return (m) yVar.d.get();
                            default:
                                return (m) yVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = EditScreenerScreen.T;
                        EditScreenerScreen editScreenerScreen2 = this.f299329b;
                        return tki.g.a(editScreenerScreen2, editScreenerScreen2.d(), v.k(editScreenerScreen2.P, editScreenerScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        this.P = new InputTextDelegate(null);
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.Q = referralContactDelegate;
        this.R = new GridBoxDelegate(u.c(referralContactDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: wph.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditScreenerScreen f299329b;

            {
                this.f299329b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditScreenerScreen editScreenerScreen = this.f299329b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditScreenerScreen.T;
                        qji.b bVarU2 = editScreenerScreen.U2();
                        xph.b bVar = bVarU2 instanceof xph.b ? (xph.b) bVarU2 : null;
                        if (bVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(editScreenerScreen.m2()).a().get(vnh.b.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                            }
                            bVar = (xph.b) aVar2.b();
                        }
                        return bVar.b().b(editScreenerScreen, editScreenerScreen.K);
                    case 1:
                        KProperty[] kPropertyArr2 = EditScreenerScreen.T;
                        y yVar = (y) editScreenerScreen.M.getValue();
                        switch (yVar.f177077a) {
                            case 0:
                                return (m) yVar.d.get();
                            default:
                                return (m) yVar.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = EditScreenerScreen.T;
                        EditScreenerScreen editScreenerScreen2 = this.f299329b;
                        return tki.g.a(editScreenerScreen2, editScreenerScreen2.d(), v.k(editScreenerScreen2.P, editScreenerScreen2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        wph.s uiState = (wph.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f299338a.f299337a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.screener_edit_screen_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("DELETE_COLLECTION_ITEM_ID", new TextLocalisedClause(R$string.screener_edit_screen_delete, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), null, null, 12)));
        d3().f174564b.setText(new TextLocalisedClause(R$string.screener_action_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new j(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.o.f57403b), new k(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.e.f121375b), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new j(this, null, 1), 3);
        d3().f174564b.setLoadingButtonTag("UPDATE_SCREENER_BUTTON_TAG");
        ViewController.P2(this, new d(rd0.e.b(this.Q.q()), 20), new k(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
