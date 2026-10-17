package com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.breakdown;

import aii.q;
import aim.e;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import cp5.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import jii.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mxi.a;
import mxi.b;
import svi.k;
import svi.l;
import svi.p0;
import svi.q0;
import te0.w;
import vc.s;
import z4l.j;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/modals/breakdown/AirportLoungesPassBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesPassBreakdownScreen extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AirportLoungesPassBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final k N;
    public final int O;
    public final b P;
    public final h Q;
    public final Object R;

    public AirportLoungesPassBreakdownScreen(k pass) {
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.N = pass;
        this.O = R$layout.screen_bottom_sheet_list;
        this.P = new b();
        this.Q = s.t(this, a.f);
        this.R = w.y0(new mw1.a(18));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        RandomAccess randomAccess;
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarBottomSheet navBarBottomSheet = d3().f174519b;
        this.P.getClass();
        k pass = this.N;
        Intrinsics.checkNotNullParameter(pass, "pass");
        navBarBottomSheet.setHeaderModel(new lw0.a(new TextLocalisedClause(pass instanceof l ? R$string.airport_lounges_breakdown_guest_title : R$string.airport_lounges_breakdown_title, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_breakdown_subtitle, null, null, 14), null, null, false, 28));
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174520c;
        ?? r4 = this.R;
        screenContentRecyclerView.setAdapter((j) r4.getValue());
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        d3().f174520c.addItemDecoration(new o31.b());
        j jVar = (j) r4.getValue();
        Intrinsics.checkNotNullParameter(pass, "pass");
        e eVarB = u.b();
        p0 p0VarV = d.v(pass);
        eVarB.addAll(p0VarV == null ? f0.f322471a : u.c(new RowDelegate.Model("list_id_recurring_pass", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_premium, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(pass instanceof l ? R$string.airport_lounges_breakdown_guest_recurring : R$string.airport_lounges_breakdown_recurring, null, null, 14), null, 0, new TextLocalisedClause(R$string.airport_lounges_breakdown_renews_on, u.c(new TimeClause(p0VarV.f265963c.toEpochMilli(), new TimeClause.Format.DateMedium(0), null, null, 12)), null, 12), null, null, 0, new RowDelegate.Model.c.b(new TextClause(a0.d.i(p0VarV.f265961a, "/", p0VarV.f265962b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800)));
        svi.e eVarS = d.s(pass);
        if (eVarS == null) {
            randomAccess = f0.f322471a;
        } else {
            ArrayList arrayList = eVarS.f265897b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            int i2 = 0;
            for (Object obj2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                q0 q0Var = (q0) obj2;
                arrayList2.add(new RowDelegate.Model(a0.d.n("list_id_gifted_pass_", i2), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_gift_legacy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.airport_lounges_home_gifted_passes_breakdown_entry_reward_title, u.c(q0Var.f265966b), null, 12), null, 0, new TextLocalisedClause(R$string.airport_lounges_breakdown_expires_on, u.c(new TimeClause(q0Var.f265967c.toEpochMilli(), new TimeClause.Format.DateMedium(0), null, null, 12)), null, 12), null, null, 0, new RowDelegate.Model.c.b(new NumberClause(q0Var.f265965a, (NumberClause.Format.Compact) null, (Custom) null, 6), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800));
                i2 = i3;
            }
            randomAccess = arrayList2;
        }
        eVarB.addAll((Collection) randomAccess);
        Intrinsics.checkNotNullParameter(pass, "<this>");
        if (pass instanceof svi.j) {
            i = ((svi.j) pass).f265925b;
        } else if (pass instanceof l) {
            i = ((l) pass).f265936b;
        } else {
            if (!(pass instanceof k.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        eVarB.add(new RowDelegate.Model("list_id_purchased_pass", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(pass instanceof l ? R$string.airport_lounges_breakdown_guest_purchased : R$string.airport_lounges_breakdown_purchased, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new NumberClause(i, (NumberClause.Format.Compact) null, (Custom) null, 6), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832));
        e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        jVar.c(eVarA);
    }

    public final f d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }
}
