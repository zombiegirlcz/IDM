package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.r0;
import au0.s0;
import au0.z0;
import b6b.u;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.d0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r0e.c;
import r7b.b;
import r7b.f;
import r7b.g;
import r7b.i;
import r7b.j;
import r7b.k;
import te0.w;
import tx0.p2;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/transactions/details/CobrandedCardsPlanHubTransactionDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lr7b/k;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsPlanHubTransactionDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CobrandedCardsPlanHubTransactionDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CobrandedCardsPlanHubTransactionDetailsScreen(CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbarwithbigtile;
        this.L = s.t(this, b.f);
        this.M = w.y0(new r4k.a(12));
        this.N = w.y0(new r4k.a(13));
        this.O = w.y0(new r4k.a(14));
        this.P = w.y0(new r4k.a(15));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: r7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubTransactionDetailsScreen f252060b;

            {
                this.f252060b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubTransactionDetailsScreen.T;
                        CobrandedCardsPlanHubTransactionDetailsScreen cobrandedCardsPlanHubTransactionDetailsScreen = this.f252060b;
                        return dli.f.a(cobrandedCardsPlanHubTransactionDetailsScreen, cobrandedCardsPlanHubTransactionDetailsScreen.d(), v.k(new CellDetailsNoteDelegate(), new CellDetailsDelegate(), new SwipeToActionDelegate((RowDelegate) cobrandedCardsPlanHubTransactionDetailsScreen.M.getValue(), false), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubTransactionDetailsScreen.N.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubTransactionDetailsScreen.O.getValue(), (HighlightTileDelegate) cobrandedCardsPlanHubTransactionDetailsScreen.P.getValue()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubTransactionDetailsScreen.T;
                        return (i) ((u) this.f252060b.R.getValue()).d.get();
                }
            }
        });
        this.R = w.y0(new qvf.a(this, inputData, 19));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: r7b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubTransactionDetailsScreen f252060b;

            {
                this.f252060b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubTransactionDetailsScreen.T;
                        CobrandedCardsPlanHubTransactionDetailsScreen cobrandedCardsPlanHubTransactionDetailsScreen = this.f252060b;
                        return dli.f.a(cobrandedCardsPlanHubTransactionDetailsScreen, cobrandedCardsPlanHubTransactionDetailsScreen.d(), v.k(new CellDetailsNoteDelegate(), new CellDetailsDelegate(), new SwipeToActionDelegate((RowDelegate) cobrandedCardsPlanHubTransactionDetailsScreen.M.getValue(), false), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubTransactionDetailsScreen.N.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubTransactionDetailsScreen.O.getValue(), (HighlightTileDelegate) cobrandedCardsPlanHubTransactionDetailsScreen.P.getValue()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubTransactionDetailsScreen.T;
                        return (i) ((u) this.f252060b.R.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        j jVar = uiState.f252071a;
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        navBarWithBigTile.setAvatar(new AvatarModel.Default(jVar.d, null, null, null, null, null, 126), r0.BLURRED_BACKGROUND);
        navBarWithBigTile.setTitle(new z0(jVar.f252068a, false));
        TextClause textClause = jVar.f252069b;
        navBarWithBigTile.setToolbarTitle(textClause);
        navBarWithBigTile.setActionStatusLabel(new aw0.k(6, textClause, null, false));
        navBarWithBigTile.setDescription(new au0.o0(jVar.f252070c));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        navBarWithBigTile.setLayoutType(s0.CENTERED);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setIconClickable(false);
        navBarWithBigTile.setTitleStyle(b1.LARGE);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174510b.f59357t), new c(this, continuation, 11), 3);
        int i = 0;
        ViewController.P2(this, new q97.b1(rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), 29), new f(this, continuation, i), 3);
        ViewController.P2(this, new r7b.e(rd0.e.b(((HighlightTileDelegate) this.P.getValue()).f52437c), i), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((InputDisclosureDelegate) this.N.getValue()).f52538c), new g(this, null), 3);
    }

    public final d0 d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
