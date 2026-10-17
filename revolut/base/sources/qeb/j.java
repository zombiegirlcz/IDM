package qeb;

import au0.u0;
import au0.z0;
import aw0.o9;
import aw0.s8;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.R$string;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pv7.t;
import xdb.r;
import xdb.v;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        aw0.k kVar;
        v vVar;
        String str;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        r rVar = (r) domainState.f245106a.getContent();
        Data data = domainState.f245106a;
        List list = (List) iii.c.f(data, new qc7.c(this, 22), new qc8.a(this, 13), new t(this, 28));
        List listA = null;
        TextClause textClause = rVar != null ? new TextClause(rVar.f304406b.f304411c.f82806c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        boolean z = false;
        u0 u0Var = new u0((rVar == null || (vVar = rVar.f304406b) == null || (str = vVar.f304412g) == null) ? NavBarWithContainerBackground.TransparentBackground.f57882a : new NavBarWithContainerBackground.ImageBackground(new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), new z0(rVar != null ? new TextClause(rVar.f304406b.f304411c.f82806c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, false), null, null);
        if (rVar != null) {
            kVar = new aw0.k(6, new TextLocalisedClause(k.f245111a[rVar.f304405a.f82810b.ordinal()] == 1 ? R$string.retail_restaurants_common_reservation_cancelled : R$string.retail_restaurants_common_reservation_confirmed, null, null, 14), null, false);
        } else {
            kVar = null;
        }
        if (rVar != null) {
            Reservation reservation = rVar.f304405a;
            aim.e eVarB = u.b();
            mx0.d dVar = mx0.d.CONTEXTUAL;
            eVarB.add(new ActionsView.Item("reservation_details_calendar", dVar, false, null, null, new TextLocalisedClause(R$string.retail_restaurants_reservation_details_actions_save, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668));
            if (reservation.f82810b != xdb.a.CANCELLED) {
                ActionsView.Item item = new ActionsView.Item("reservation_details_modify", dVar, false, null, null, new TextLocalisedClause(R$string.retail_restaurants_reservation_details_actions_modify, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
                dVar = dVar;
                eVarB.add(item);
            }
            Intrinsics.checkNotNullParameter(reservation, "<this>");
            xdb.a[] elements = {xdb.a.CONFIRMED, xdb.a.CREATED};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (kotlin.collections.d.y0(elements).contains(reservation.f82810b)) {
                eVarB.add(new ActionsView.Item("reservation_details_cancel", dVar, false, null, null, new TextLocalisedClause(R$string.retail_restaurants_reservation_details_actions_cancel, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668));
            }
            listA = u.a(eVarB);
        }
        if (listA == null) {
            listA = f0.f322471a;
        }
        List list2 = listA;
        if (data.getLoading() && rVar == null) {
            z = true;
        }
        return new i(list, textClause, u0Var, kVar, list2, z);
    }
}
