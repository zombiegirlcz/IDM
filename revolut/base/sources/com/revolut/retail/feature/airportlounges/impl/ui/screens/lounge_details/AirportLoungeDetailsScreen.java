package com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f2;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.airportlounges.impl.R$id;
import com.revolut.retail.feature.airportlounges.impl.R$layout;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.a;
import cwi.a1;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sek.q;
import sq5.j;
import sxi.c;
import sxi.d;
import sxi.f;
import sxi.k;
import sxi.l;
import sxi.m;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/lounge_details/AirportLoungeDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lsxi/m;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/lounge_details/AirportLoungeDetailsScreenContract$InputData;", "Lsxi/k;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungeDetailsScreen extends BaseRecyclerViewScreen<m, AirportLoungeDetailsScreenContract$InputData, k> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f99103d0 = {o0.f186429a.j(new h0(AirportLoungeDetailsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/airportlounges/impl/databinding/ScreenAirportLoungeDetailsBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f99104a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f99105b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirportLoungeDetailsScreen(AirportLoungeDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_airport_lounge_details;
        this.V = R$id.airportLoungeDetails_recyclerView;
        this.W = s.t(this, sxi.b.f);
        this.X = w.y0(new sw6.a(this, inputData, 2));
        this.Y = w.y0(new j(22));
        this.Z = w.y0(new j(23));
        this.f99104a0 = w.y0(new j(24));
        final int i = 0;
        this.f99105b0 = w.y0(new Function0(this) { // from class: sxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungeDetailsScreen f266499b;

            {
                this.f266499b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungeDetailsScreen airportLoungeDetailsScreen = this.f266499b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungeDetailsScreen.f99103d0;
                        return v.k(new TextDelegate(), new ListCellDelegate(), new PlainTextDelegate(), (ListSubheaderDelegate) airportLoungeDetailsScreen.Y.getValue(), (FullScreenStateDelegate) airportLoungeDetailsScreen.Z.getValue(), (CellDetailsNoteDelegate) airportLoungeDetailsScreen.f99104a0.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate());
                    default:
                        KProperty[] kPropertyArr2 = AirportLoungeDetailsScreen.f99103d0;
                        a1 a1Var = (a1) airportLoungeDetailsScreen.X.getValue();
                        switch (a1Var.f109631a) {
                            case 0:
                                return (l) a1Var.f109636j.get();
                            default:
                                return (l) a1Var.f109636j.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: sxi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungeDetailsScreen f266499b;

            {
                this.f266499b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungeDetailsScreen airportLoungeDetailsScreen = this.f266499b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungeDetailsScreen.f99103d0;
                        return v.k(new TextDelegate(), new ListCellDelegate(), new PlainTextDelegate(), (ListSubheaderDelegate) airportLoungeDetailsScreen.Y.getValue(), (FullScreenStateDelegate) airportLoungeDetailsScreen.Z.getValue(), (CellDetailsNoteDelegate) airportLoungeDetailsScreen.f99104a0.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate());
                    default:
                        KProperty[] kPropertyArr2 = AirportLoungeDetailsScreen.f99103d0;
                        a1 a1Var = (a1) airportLoungeDetailsScreen.X.getValue();
                        switch (a1Var.f109631a) {
                            case 0:
                                return (l) a1Var.f109636j.get();
                            default:
                                return (l) a1Var.f109636j.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (a1) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().d.f59357t), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().d.b()), null, new q(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f325686c.o), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f325685b.f58987s), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ListSubheaderDelegate) this.Y.getValue()).f52707c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.Z.getValue()).f52371h.f121375b), null, new sxi.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((CellDetailsNoteDelegate) this.f99104a0.getValue()).d), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().d.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        zvi.b bVarH3 = h3();
        LargeActionButton airportLoungeDetailsGoToButton = bVarH3.f325686c;
        Intrinsics.checkNotNullExpressionValue(airportLoungeDetailsGoToButton, "airportLoungeDetailsGoToButton");
        airportLoungeDetailsGoToButton.setVisibility(8);
        FormsActionButton airportLoungeDetailsFormsActionButton = bVarH3.f325685b;
        Intrinsics.checkNotNullExpressionValue(airportLoungeDetailsFormsActionButton, "airportLoungeDetailsFormsActionButton");
        airportLoungeDetailsFormsActionButton.setVisibility(8);
        a1 a1Var = (a1) this.X.getValue();
        switch (a1Var.f109631a) {
            case 0:
                aVar = (j60.a) a1Var.f.get();
                break;
            default:
                aVar = (j60.a) a1Var.f.get();
                break;
        }
        aVar.d(u.c(new CellDetailsDelegate()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75526d0() {
        return (List) this.f99105b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(m uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        sxi.h hVar = uiState.f266510a;
        NavBarWithBigTile navBarWithBigTile = h3().d;
        Clause clause = hVar.f266501a;
        if (clause != null) {
            navBarWithBigTile.setTitle(clause);
            navBarWithBigTile.setToolbarTitle(clause);
        }
        navBarWithBigTile.setBackgroundImages(hVar.f266502b, f2.LINE_INDICATOR, true);
        navBarWithBigTile.setMenuItems(v.l(hVar.d));
        h3().e.setNestedScrollingEnabled(hVar.f266503c);
        a aVar = uiState.f266511b;
        LargeActionButton airportLoungeDetailsGoToButton = h3().f325686c;
        Intrinsics.checkNotNullExpressionValue(airportLoungeDetailsGoToButton, "airportLoungeDetailsGoToButton");
        FormsActionButton airportLoungeDetailsFormsActionButton = h3().f325685b;
        Intrinsics.checkNotNullExpressionValue(airportLoungeDetailsFormsActionButton, "airportLoungeDetailsFormsActionButton");
        if (Intrinsics.f(aVar, a.c.f99111a)) {
            airportLoungeDetailsGoToButton.setVisibility(8);
            airportLoungeDetailsFormsActionButton.setVisibility(8);
        } else if (Intrinsics.f(aVar, a.b.f99110a)) {
            airportLoungeDetailsGoToButton.setText(new TextLocalisedClause(R$string.airport_lounges_home_get_button, null, null, 14));
            airportLoungeDetailsGoToButton.setVisibility(0);
            airportLoungeDetailsFormsActionButton.setVisibility(8);
        } else {
            if (!Intrinsics.f(aVar, a.C0606a.f99109a)) {
                throw new NoWhenBranchMatchedException();
            }
            airportLoungeDetailsGoToButton.setVisibility(8);
            airportLoungeDetailsFormsActionButton.setImage(new ResourceImage(R$drawable.uikit_icn_24_qr, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
            airportLoungeDetailsFormsActionButton.setVisibility(0);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final zvi.b h3() {
        ViewBinding value = this.W.getValue(this, f99103d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (zvi.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
