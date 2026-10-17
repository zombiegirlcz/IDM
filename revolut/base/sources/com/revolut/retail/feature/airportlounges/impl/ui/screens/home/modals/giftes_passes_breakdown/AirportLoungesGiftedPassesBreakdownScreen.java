package com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.giftes_passes_breakdown;

import a0.d;
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
import java.util.ArrayList;
import java.util.List;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nxi.a;
import nxi.b;
import svi.e;
import svi.q0;
import te0.w;
import vc.s;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/modals/giftes_passes_breakdown/AirportLoungesGiftedPassesBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesGiftedPassesBreakdownScreen extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AirportLoungesGiftedPassesBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final e N;
    public final int O;
    public final b P;
    public final h Q;
    public final Object R;

    public AirportLoungesGiftedPassesBreakdownScreen(e giftedPasses) {
        Intrinsics.checkNotNullParameter(giftedPasses, "giftedPasses");
        this.N = giftedPasses;
        this.O = R$layout.screen_bottom_sheet_list;
        this.P = new b();
        this.Q = s.t(this, a.f);
        this.R = w.y0(new nwf.b(7));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarBottomSheet navBarBottomSheet = d3().f174519b;
        this.P.getClass();
        navBarBottomSheet.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.airport_lounges_home_gifted_passes_breakdown_title, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_home_gifted_passes_breakdown_subtitle, null, null, 14), null, null, false, 28));
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174520c;
        ?? r2 = this.R;
        screenContentRecyclerView.setAdapter((j) r2.getValue());
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        d3().f174520c.addItemDecoration(new o31.b());
        j jVar = (j) r2.getValue();
        e giftPasses = this.N;
        Intrinsics.checkNotNullParameter(giftPasses, "giftPasses");
        ArrayList arrayList = giftPasses.f265897b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            q0 q0Var = (q0) obj2;
            String strN = d.n("giftedPassRewardDescriptionItemId_", i);
            t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.airport_lounges_home_gifted_passes_breakdown_entry_reward_title, u.c(q0Var.f265966b), null, 12), (Image) null, 0, false, 30);
            int i3 = R$plurals.airport_lounges_home_gifted_passes_breakdown_entry_reward_value;
            int i5 = q0Var.f265965a;
            List listK = v.k(new CellDetailsDelegate.Model(strN, t0Var, new TextLocalisedQuantityClause(i3, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), (Style) null, 24), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model(d.n("giftedPassRewardExpiresOnItemId_", i), new t0((Clause) new TextLocalisedClause(R$string.airport_lounges_home_gifted_passes_breakdown_entry_expiration_title, null, null, 14), (Image) null, 0, false, 30), new TimeClause(q0Var.f265967c.toEpochMilli(), new TimeClause.Format.DateMedium(0), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
            int i6 = R$attr.uikit_dp8;
            yp0.b.k(listK, i6, i6, 0, 0, 28);
            arrayList2.add(listK);
            i = i2;
        }
        jVar.c(zhm.w.u(arrayList2));
    }

    public final f d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }
}
