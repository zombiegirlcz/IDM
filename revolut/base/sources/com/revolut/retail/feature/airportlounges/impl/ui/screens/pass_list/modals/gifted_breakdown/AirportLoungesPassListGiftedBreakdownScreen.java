package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.gifted_breakdown;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.airportlounges.impl.R$plurals;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import java.util.List;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kyi.a;
import kyi.b;
import svi.m;
import te0.w;
import vc.s;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_list/modals/gifted_breakdown/AirportLoungesPassListGiftedBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesPassListGiftedBreakdownScreen extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AirportLoungesPassListGiftedBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final m N;
    public final a O;
    public final h P;
    public final Object Q;
    public final int R;

    public AirportLoungesPassListGiftedBreakdownScreen(m gifted) {
        Intrinsics.checkNotNullParameter(gifted, "gifted");
        this.N = gifted;
        this.O = new a();
        this.P = s.t(this, b.f);
        this.Q = w.y0(new kw4.b(5));
        this.R = R$layout.screen_bottom_sheet_list;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = S;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.P;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((f) value).f174519b;
        this.O.getClass();
        navBarBottomSheet.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.airport_lounges_passes_gifted_passes_breakdown_title, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_passes_gifted_passes_breakdown_subtitle, null, null, 14), null, null, false, 28));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView screenContentRecyclerView = ((f) value2).f174520c;
        ?? r3 = this.Q;
        screenContentRecyclerView.setAdapter((j) r3.getValue());
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        screenContentRecyclerView.addItemDecoration(new o31.b());
        j jVar = (j) r3.getValue();
        m gifted = this.N;
        Intrinsics.checkNotNullParameter(gifted, "gifted");
        List listK = v.k(new CellDetailsDelegate.Model("gifted_pass_description", new t0((Clause) new TextLocalisedClause(R$string.airport_lounges_home_gifted_passes_breakdown_entry_reward_title, u.c(gifted.f265944a), null, 12), (Image) null, 0, false, 30), new TextLocalisedQuantityClause(R$plurals.airport_lounges_home_gifted_passes_breakdown_entry_reward_value, (Number) 1, u.c(1), (Style) null, 24), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("gifted_pass_expiration", new t0((Clause) new TextLocalisedClause(R$string.airport_lounges_home_gifted_passes_breakdown_entry_expiration_title, null, null, 14), (Image) null, 0, false, 30), new TimeClause(gifted.f265945b.toEpochMilli(), new TimeClause.Format.DateMedium(0), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        int i = R$attr.uikit_dp8;
        yp0.b.k(listK, i, i, 0, 0, 28);
        jVar.c(listK);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.R;
    }
}
