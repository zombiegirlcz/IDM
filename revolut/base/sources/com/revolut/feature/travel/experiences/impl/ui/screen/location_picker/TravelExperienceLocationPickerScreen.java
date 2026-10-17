package com.revolut.feature.travel.experiences.impl.ui.screen.location_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreen;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import efm.r;
import frl.a;
import grl.k9;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import q2g.b;
import q2g.d;
import q2g.f;
import q2g.g;
import te0.w;
import vc.s;
import w0g.q;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/location_picker/TravelExperienceLocationPickerScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Lq2g/g;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/location_picker/TravelExperienceLocationPickerScreenContract$InputData;", "Lq2g/d;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperienceLocationPickerScreen extends BaseRxRecyclerViewScreen<g, TravelExperienceLocationPickerScreenContract$InputData, d> implements m {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(TravelExperienceLocationPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperienceLocationPickerBinding;", 0))};
    public final AnalyticsProduct.Retail X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final h f93080a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f93081b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f93082d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f93083e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperienceLocationPickerScreen(TravelExperienceLocationPickerScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137510y;
        this.X = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.Y = R$layout.screen_travel_experience_location_picker;
        this.Z = R$id.locationPicker_recyclerView;
        this.f93080a0 = s.t(this, b.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f93081b0 = rowDelegate;
        this.c0 = w.y0(new pt4.d(this, inputData, 16));
        this.f93082d0 = w.y0(new pyc.a(this, 10));
        this.f93083e0 = u.c(rowDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f293733b;
        TextClause textClause = uiState.f241647a;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (z0g.a) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.f93082d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        q qVarH3 = h3();
        final int i = 0;
        BaseRxRecyclerViewScreen.g3(this, qVarH3.f293733b.f59410q, new Function1(this) { // from class: q2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperienceLocationPickerScreen f241641b;

            {
                this.f241641b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                TravelExperienceLocationPickerScreen travelExperienceLocationPickerScreen = this.f241641b;
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = TravelExperienceLocationPickerScreen.f0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        travelExperienceLocationPickerScreen.m2().onBackPressed();
                        break;
                    case 1:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr2 = TravelExperienceLocationPickerScreen.f0;
                        f fVar = (f) travelExperienceLocationPickerScreen.f93082d0.getValue();
                        Intrinsics.h(query);
                        i iVar = (i) fVar;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        iVar.x2(new h(iVar, query, 0));
                        break;
                    default:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr3 = TravelExperienceLocationPickerScreen.f0;
                        Intrinsics.checkNotNullParameter(model, "model");
                        f fVar2 = (f) travelExperienceLocationPickerScreen.f93082d0.getValue();
                        String id10 = model.f53228a;
                        Object obj3 = model.u;
                        i iVar2 = (i) fVar2;
                        iVar2.getClass();
                        Intrinsics.checkNotNullParameter(id10, "id");
                        if (Intrinsics.f(id10, "ADD_MANUALLY_ITEM_ID")) {
                            iVar2.v2(d.a.f241645a);
                        } else {
                            TravelExperienceLocation travelExperienceLocation = obj3 instanceof TravelExperienceLocation ? (TravelExperienceLocation) obj3 : null;
                            if (travelExperienceLocation != null) {
                                iVar2.v2(new e(travelExperienceLocation));
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
        NavBarWithToolbar navBarWithToolbar = qVarH3.f293733b;
        SearchView searchView = navBarWithToolbar.f59409p;
        BaseRxRecyclerViewScreen.g3(this, searchView.f57336l, new q03.h(qVarH3, 12));
        r rVarDistinctUntilChanged = searchView.f57337m.debounce(300L, TimeUnit.MILLISECONDS).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        final int i2 = 1;
        BaseRxRecyclerViewScreen.g3(this, rVarDistinctUntilChanged, new Function1(this) { // from class: q2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperienceLocationPickerScreen f241641b;

            {
                this.f241641b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                TravelExperienceLocationPickerScreen travelExperienceLocationPickerScreen = this.f241641b;
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = TravelExperienceLocationPickerScreen.f0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        travelExperienceLocationPickerScreen.m2().onBackPressed();
                        break;
                    case 1:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr2 = TravelExperienceLocationPickerScreen.f0;
                        f fVar = (f) travelExperienceLocationPickerScreen.f93082d0.getValue();
                        Intrinsics.h(query);
                        i iVar = (i) fVar;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        iVar.x2(new h(iVar, query, 0));
                        break;
                    default:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr3 = TravelExperienceLocationPickerScreen.f0;
                        Intrinsics.checkNotNullParameter(model, "model");
                        f fVar2 = (f) travelExperienceLocationPickerScreen.f93082d0.getValue();
                        String id10 = model.f53228a;
                        Object obj3 = model.u;
                        i iVar2 = (i) fVar2;
                        iVar2.getClass();
                        Intrinsics.checkNotNullParameter(id10, "id");
                        if (Intrinsics.f(id10, "ADD_MANUALLY_ITEM_ID")) {
                            iVar2.v2(d.a.f241645a);
                        } else {
                            TravelExperienceLocation travelExperienceLocation = obj3 instanceof TravelExperienceLocation ? (TravelExperienceLocation) obj3 : null;
                            if (travelExperienceLocation != null) {
                                iVar2.v2(new e(travelExperienceLocation));
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
        navBarWithToolbar.setSearchButtonActive(true);
        final int i3 = 2;
        BaseRxRecyclerViewScreen.g3(this, this.f93081b0.f53218h, new Function1(this) { // from class: q2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperienceLocationPickerScreen f241641b;

            {
                this.f241641b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i3;
                TravelExperienceLocationPickerScreen travelExperienceLocationPickerScreen = this.f241641b;
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = TravelExperienceLocationPickerScreen.f0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        travelExperienceLocationPickerScreen.m2().onBackPressed();
                        break;
                    case 1:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr2 = TravelExperienceLocationPickerScreen.f0;
                        f fVar = (f) travelExperienceLocationPickerScreen.f93082d0.getValue();
                        Intrinsics.h(query);
                        i iVar = (i) fVar;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        iVar.x2(new h(iVar, query, 0));
                        break;
                    default:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr3 = TravelExperienceLocationPickerScreen.f0;
                        Intrinsics.checkNotNullParameter(model, "model");
                        f fVar2 = (f) travelExperienceLocationPickerScreen.f93082d0.getValue();
                        String id10 = model.f53228a;
                        Object obj3 = model.u;
                        i iVar2 = (i) fVar2;
                        iVar2.getClass();
                        Intrinsics.checkNotNullParameter(id10, "id");
                        if (Intrinsics.f(id10, "ADD_MANUALLY_ITEM_ID")) {
                            iVar2.v2(d.a.f241645a);
                        } else {
                            TravelExperienceLocation travelExperienceLocation = obj3 instanceof TravelExperienceLocation ? (TravelExperienceLocation) obj3 : null;
                            if (travelExperienceLocation != null) {
                                iVar2.v2(new e(travelExperienceLocation));
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f293733b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        g uiState = (g) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f293733b;
        TextClause textClause = uiState.f241647a;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF93083e0() {
        return this.f93083e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.Y;
    }

    public final q h3() {
        ViewBinding value = this.f93080a0.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q) value;
    }
}
