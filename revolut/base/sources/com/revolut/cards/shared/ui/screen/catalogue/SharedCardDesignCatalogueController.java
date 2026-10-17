package com.revolut.cards.shared.ui.screen.catalogue;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.cards.shared.ui.R$id;
import com.revolut.cards.shared.ui.R$layout;
import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueController;
import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueScreenContract$InputData;
import com.revolut.core.ui_kit.delegates.CardDesignCatalogueDelegate;
import com.revolut.core.ui_kit.delegates.CardDesignCatalogueLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import gy2.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l10.b;
import l10.c;
import l10.d;
import l10.f;
import l10.s;
import l10.u;
import l10.v;
import no.m;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/cards/shared/ui/screen/catalogue/SharedCardDesignCatalogueController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll10/s;", "Ldli/a;", "Ll10/v;", "Lno/m;", "cards_shared_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedCardDesignCatalogueController extends ViewController<s> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SharedCardDesignCatalogueController.class, "binding", "getBinding()Lcom/revolut/cards/shared/ui/databinding/ScreenCardDesignCatalogueBinding;", 0))};
    public final SharedCardDesignCatalogueScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final AnalyticsProduct O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public SharedCardDesignCatalogueController(SharedCardDesignCatalogueScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: l10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedCardDesignCatalogueController f191359b;

            {
                this.f191359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SharedCardDesignCatalogueController sharedCardDesignCatalogueController = this.f191359b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SharedCardDesignCatalogueController.U;
                        qji.b bVarU2 = sharedCardDesignCatalogueController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.cards.shared.ui.screen.catalogue.di.SharedCardDesignCatalogueScreenInjector");
                        gy2.e eVar = (gy2.e) bVarU2;
                        gy2.d dVar = eVar.f147798b;
                        gy2.e eVar2 = eVar.f147799c;
                        SharedCardDesignCatalogueScreenContract$InputData sharedCardDesignCatalogueScreenContract$InputData = sharedCardDesignCatalogueController.K;
                        sharedCardDesignCatalogueScreenContract$InputData.getClass();
                        return new gy2.k(dVar, eVar2, sharedCardDesignCatalogueScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedCardDesignCatalogueController.U;
                        return (o) ((gy2.k) sharedCardDesignCatalogueController.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SharedCardDesignCatalogueController.U;
                        return new ScrollerDelegate(zhm.v.k(new CardDesignCatalogueLoadingDelegate(), (CardDesignCatalogueDelegate) sharedCardDesignCatalogueController.Q.getValue()), false);
                    default:
                        KProperty[] kPropertyArr4 = SharedCardDesignCatalogueController.U;
                        SharedCardDesignCatalogueController sharedCardDesignCatalogueController2 = this.f191359b;
                        return dli.f.a(sharedCardDesignCatalogueController2, sharedCardDesignCatalogueController2.k3(), zhm.v.k((ScrollerDelegate) sharedCardDesignCatalogueController2.S.getValue(), (RowDelegate) sharedCardDesignCatalogueController2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateDelegate(), new FullScreenStateLoadingDelegate(), new TextDelegate()), R$id.screenCardDesignCatalogue_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: l10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedCardDesignCatalogueController f191359b;

            {
                this.f191359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SharedCardDesignCatalogueController sharedCardDesignCatalogueController = this.f191359b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedCardDesignCatalogueController.U;
                        qji.b bVarU2 = sharedCardDesignCatalogueController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.cards.shared.ui.screen.catalogue.di.SharedCardDesignCatalogueScreenInjector");
                        gy2.e eVar = (gy2.e) bVarU2;
                        gy2.d dVar = eVar.f147798b;
                        gy2.e eVar2 = eVar.f147799c;
                        SharedCardDesignCatalogueScreenContract$InputData sharedCardDesignCatalogueScreenContract$InputData = sharedCardDesignCatalogueController.K;
                        sharedCardDesignCatalogueScreenContract$InputData.getClass();
                        return new gy2.k(dVar, eVar2, sharedCardDesignCatalogueScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedCardDesignCatalogueController.U;
                        return (o) ((gy2.k) sharedCardDesignCatalogueController.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SharedCardDesignCatalogueController.U;
                        return new ScrollerDelegate(zhm.v.k(new CardDesignCatalogueLoadingDelegate(), (CardDesignCatalogueDelegate) sharedCardDesignCatalogueController.Q.getValue()), false);
                    default:
                        KProperty[] kPropertyArr4 = SharedCardDesignCatalogueController.U;
                        SharedCardDesignCatalogueController sharedCardDesignCatalogueController2 = this.f191359b;
                        return dli.f.a(sharedCardDesignCatalogueController2, sharedCardDesignCatalogueController2.k3(), zhm.v.k((ScrollerDelegate) sharedCardDesignCatalogueController2.S.getValue(), (RowDelegate) sharedCardDesignCatalogueController2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateDelegate(), new FullScreenStateLoadingDelegate(), new TextDelegate()), R$id.screenCardDesignCatalogue_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_card_design_catalogue;
        this.O = inputData.f;
        this.P = vc.s.t(this, b.f);
        this.Q = w.y0(new kw4.b(9));
        this.R = w.y0(new kw4.b(10));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: l10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedCardDesignCatalogueController f191359b;

            {
                this.f191359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SharedCardDesignCatalogueController sharedCardDesignCatalogueController = this.f191359b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedCardDesignCatalogueController.U;
                        qji.b bVarU2 = sharedCardDesignCatalogueController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.cards.shared.ui.screen.catalogue.di.SharedCardDesignCatalogueScreenInjector");
                        gy2.e eVar = (gy2.e) bVarU2;
                        gy2.d dVar = eVar.f147798b;
                        gy2.e eVar2 = eVar.f147799c;
                        SharedCardDesignCatalogueScreenContract$InputData sharedCardDesignCatalogueScreenContract$InputData = sharedCardDesignCatalogueController.K;
                        sharedCardDesignCatalogueScreenContract$InputData.getClass();
                        return new gy2.k(dVar, eVar2, sharedCardDesignCatalogueScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedCardDesignCatalogueController.U;
                        return (o) ((gy2.k) sharedCardDesignCatalogueController.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SharedCardDesignCatalogueController.U;
                        return new ScrollerDelegate(zhm.v.k(new CardDesignCatalogueLoadingDelegate(), (CardDesignCatalogueDelegate) sharedCardDesignCatalogueController.Q.getValue()), false);
                    default:
                        KProperty[] kPropertyArr4 = SharedCardDesignCatalogueController.U;
                        SharedCardDesignCatalogueController sharedCardDesignCatalogueController2 = this.f191359b;
                        return dli.f.a(sharedCardDesignCatalogueController2, sharedCardDesignCatalogueController2.k3(), zhm.v.k((ScrollerDelegate) sharedCardDesignCatalogueController2.S.getValue(), (RowDelegate) sharedCardDesignCatalogueController2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateDelegate(), new FullScreenStateLoadingDelegate(), new TextDelegate()), R$id.screenCardDesignCatalogue_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: l10.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedCardDesignCatalogueController f191359b;

            {
                this.f191359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SharedCardDesignCatalogueController sharedCardDesignCatalogueController = this.f191359b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedCardDesignCatalogueController.U;
                        qji.b bVarU2 = sharedCardDesignCatalogueController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.cards.shared.ui.screen.catalogue.di.SharedCardDesignCatalogueScreenInjector");
                        gy2.e eVar = (gy2.e) bVarU2;
                        gy2.d dVar = eVar.f147798b;
                        gy2.e eVar2 = eVar.f147799c;
                        SharedCardDesignCatalogueScreenContract$InputData sharedCardDesignCatalogueScreenContract$InputData = sharedCardDesignCatalogueController.K;
                        sharedCardDesignCatalogueScreenContract$InputData.getClass();
                        return new gy2.k(dVar, eVar2, sharedCardDesignCatalogueScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SharedCardDesignCatalogueController.U;
                        return (o) ((gy2.k) sharedCardDesignCatalogueController.L.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SharedCardDesignCatalogueController.U;
                        return new ScrollerDelegate(zhm.v.k(new CardDesignCatalogueLoadingDelegate(), (CardDesignCatalogueDelegate) sharedCardDesignCatalogueController.Q.getValue()), false);
                    default:
                        KProperty[] kPropertyArr4 = SharedCardDesignCatalogueController.U;
                        SharedCardDesignCatalogueController sharedCardDesignCatalogueController2 = this.f191359b;
                        return dli.f.a(sharedCardDesignCatalogueController2, sharedCardDesignCatalogueController2.k3(), zhm.v.k((ScrollerDelegate) sharedCardDesignCatalogueController2.S.getValue(), (RowDelegate) sharedCardDesignCatalogueController2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateDelegate(), new FullScreenStateLoadingDelegate(), new TextDelegate()), R$id.screenCardDesignCatalogue_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        u uVar = qVar instanceof u ? (u) qVar : null;
        a.z0(uiState);
        if (pd.b.k(uVar != null ? Boolean.valueOf(uVar.f191400a) : null)) {
            d3().f148442b.setTagContent(uiState.f191404b);
        }
        if (pd.b.k(uVar != null ? Boolean.valueOf(uVar.f191402c) : null)) {
            d3().f148442b.setMenuItems(uiState.d);
        }
        if (pd.b.j(uVar != null ? Boolean.valueOf(uVar.f191401b) : null)) {
            d3().f148443c.scrollToPosition(0);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f148442b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f148442b.f59211b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CardDesignCatalogueDelegate) this.Q.getValue()).f51768c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), null, new l10.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f148442b.f59210a.f57403b), null, new f(this, null), 3);
    }

    public final h10.a d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (h10.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l10.o k3() {
        return (l10.o) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
