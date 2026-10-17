package ieb;

import au0.u0;
import au0.z0;
import aw0.c7;
import aw0.d7;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.l0;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.p0;
import com.revolut.core.ui_kit.delegates.s0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.R$plurals;
import com.revolut.feature.retail.restaurants.impl.R$string;
import com.revolut.feature.retail.restaurants.impl.domain.model.TimeSlot;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreenContract$SlotSelection;
import ip0.t1;
import ip0.v7;
import ip0.xk;
import ip0.zj;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import xdb.x;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aim.e a(g gVar, boolean z) {
        aim.e eVarB = u.b();
        eVarB.addAll(b(gVar, z));
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("reservation_creation_error", new TextLocalisedClause(R$string.retail_restaurants_common_error_generic_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), null, new l6(12, new TextLocalisedClause(R$string.retail_restaurants_common_actions_try_again, null, null, 14), null, h4.ACCENT), zj.SMALL, false, null, null, null, 1864);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return u.a(eVarB);
    }

    public static List b(g gVar, boolean z) {
        Collection collection;
        Float fValueOf = Float.valueOf(8.0f);
        i iVar = gVar.f160687g;
        Data data = gVar.d;
        boolean z3 = false;
        boolean z4 = (gVar.f160684a.getContent() == null || iVar == null) ? false : true;
        boolean z6 = z || iVar == null;
        if (z4 && !z && data.getError() == null && (collection = (Collection) data.getContent()) != null && !collection.isEmpty()) {
            z3 = true;
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("reservation_creation_date", iVar != null ? com.revolut.core.ui_kit.models.j.b(c7.Companion, iVar.f160690a, LocalDateClause$DateFormat.DateLong.f57804a) : null, null, null, false, null, false, null, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, null, false, z4, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, z6, null, null, null, null, 0, 0, 0, 0, -33824772, 65463);
        boolean z11 = z6;
        List listK = v.k(new InputTextDelegate.Model("reservation_creation_time", iVar != null ? com.revolut.core.ui_kit.models.k.a(d7.Companion, iVar.f160691b) : null, null, null, false, null, false, null, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, null, false, z3, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, z11, null, null, null, null, 0, 0, 0, 0, -33824772, 65463), new InputTextDelegate.Model("reservation_creation_party_size", iVar != null ? new TextLocalisedQuantityClause(R$plurals.retail_restaurants_confirm_reservation_cells_party_size_accessory, Integer.valueOf(iVar.f160692c), (List) null, (Style) null, 28) : null, null, null, false, null, false, null, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, null, false, z4, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, z11, null, null, null, null, 0, 0, 0, 0, -33824772, 65463));
        List listC = u.c(model);
        int i = R$attr.uikit_dp0;
        xk xkVar = new xk("reservation_creation_date", listC, 1, null, null, 0, i, i, i, 63704);
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp0;
        return v.k(xkVar, new xk("reservation_creation_fields", listK, 2, fValueOf, fValueOf, i2, 0, i3, i3, 63808));
    }

    public static aim.e d(g gVar) {
        aim.e eVarB = u.b();
        eVarB.addAll(b(gVar, true));
        v7.C("reservation_creation_available_times_loading", 0, 0, 30, eVarB);
        Float fValueOf = Float.valueOf(8.0f);
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            t1 t1Var = new t1(a0.d.n("loading_slot_", i), null, 6);
            yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(t1Var);
        }
        eVarB.add(new xk("reservation_creation_loading_slots", arrayList, 3, fValueOf, fValueOf, R$attr.uikit_dp0, 0, 0, 0, 65344));
        return u.a(eVarB);
    }

    public static ArrayList e(String str, x xVar, ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection) {
        List<TimeSlot> list = xVar.f304413a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TimeSlot timeSlot : list) {
            ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection2 = new ReservationCreationScreenContract$SlotSelection(timeSlot, xVar.f304414b);
            LocalTime localTime = timeSlot.f82830b;
            String str2 = str + ":" + timeSlot.f82829a + ":" + localTime;
            l0 l0Var = null;
            p0 p0Var = new p0(com.revolut.core.ui_kit.models.k.a(d7.Companion, localTime), null);
            s0 s0Var = timeSlot.d ? s0.NORMAL : s0.DISABLED;
            if (Intrinsics.f(reservationCreationScreenContract$SlotSelection, reservationCreationScreenContract$SlotSelection2)) {
                l0Var = l0.f54408b;
            }
            AttributeSelectorSmallDelegate.Model model = new AttributeSelectorSmallDelegate.Model(str2, p0Var, l0Var, s0Var, reservationCreationScreenContract$SlotSelection2, null, 208);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        String str;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f160684a, new n(this, domainState, 0), new o(this, domainState, 0), new hb4.n(this, domainState, 29));
        Data data = domainState.f160684a;
        xdb.v vVar = (xdb.v) data.getContent();
        TextClause textClause = vVar != null ? new TextClause(vVar.f304410b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        xdb.v vVar2 = (xdb.v) data.getContent();
        u0 u0Var = new u0((vVar2 == null || (str = vVar2.f304412g) == null) ? NavBarWithContainerBackground.TransparentBackground.f57882a : new NavBarWithContainerBackground.ImageBackground(new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), new z0(textClause, false), null, null);
        boolean z = data.getContent() == null;
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.retail_restaurants_create_reservation_actions_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "RESERVATION_CREATION_CONTINUE", (domainState.f160688h == null || data.getContent() == null || domainState.e.getContent() == null || domainState.f160687g == null) ? false : true, null, null, null, 972), null, null, 55);
        boolean z3 = data.getContent() != null;
        xdb.v vVar3 = (xdb.v) data.getContent();
        return new k(list, vVar3 != null ? new TextClause(vVar3.f304410b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, u0Var, z, eVar, z3);
    }
}
