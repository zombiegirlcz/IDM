package uzb;

import aw0.e;
import aw0.ka;
import aw0.n6;
import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.ui.points_expiry.details.RevPointsExpiryDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.models.IssuedPoints;
import dj0.d;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m1c.y0;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsExpiryDetailsScreenContract$InputData f284657a;

    public c(RevPointsExpiryDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f284657a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.rev_points_points_expiry_details_bought_points, null, null, 14), (Image) null, 0, false, 30);
        RevPointsExpiryDetailsScreenContract$InputData revPointsExpiryDetailsScreenContract$InputData = this.f284657a;
        ArrayList arrayList = revPointsExpiryDetailsScreenContract$InputData.f83828a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((IssuedPoints) obj2).f83950g.f83958b == y0.PURCHASE) {
                arrayList2.add(obj2);
            }
        }
        d.Companion.getClass();
        d dVarO = d.e;
        int i = 0;
        for (Object obj3 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarO = i == 0 ? ((IssuedPoints) obj3).e : pyd.c.O(dVarO, ((IssuedPoints) obj3).e);
            i = i2;
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("CELL_DELEGATE_POINTS_BOUGHT_ITEM_ID", t0Var, nub.a.q(nub.a.a(dVarO), null, null, null, 7), null, null, null, null, 0, null, false, false, null, null, 32760);
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.rev_points_points_expiry_details_earned_points, null, null, 14), (Image) null, 0, false, 30);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((IssuedPoints) obj4).f83950g.f83958b == y0.REWARD) {
                arrayList3.add(obj4);
            }
        }
        d.Companion.getClass();
        d dVarO2 = d.e;
        int i3 = 0;
        for (Object obj5 : arrayList3) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            dVarO2 = i3 == 0 ? ((IssuedPoints) obj5).e : pyd.c.O(dVarO2, ((IssuedPoints) obj5).e);
            i3 = i5;
        }
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("CELL_DELEGATE_POINTS_EARNED_ITEM_ID", t0Var2, nub.a.q(nub.a.a(dVarO2), null, null, null, 7), null, null, null, null, 0, null, false, false, null, null, 32760);
        t0 t0Var3 = new t0((Clause) new TextLocalisedClause(R$string.rev_points_points_expiry_details_total_points, null, null, 14), (Image) null, 0, false, 30);
        d.Companion.getClass();
        d dVarO3 = d.e;
        int i6 = 0;
        for (Object obj6 : arrayList) {
            int i21 = i6 + 1;
            if (i6 < 0) {
                v.s();
                throw null;
            }
            dVarO3 = i6 == 0 ? ((IssuedPoints) obj6).e : pyd.c.O(dVarO3, ((IssuedPoints) obj6).e);
            i6 = i21;
        }
        List listK = v.k(model, model2, new CellDetailsDelegate.Model("CELL_DELEGATE_POINTS_TOTAL_ITEM_ID", t0Var3, nub.a.q(nub.a.a(dVarO3), null, null, null, 7), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        boolean z = revPointsExpiryDetailsScreenContract$InputData.f83829b;
        LocalDate localDateA = ((IssuedPoints) d0.b0(arrayList)).a();
        ZoneId zoneId = g0m.a.f139502a;
        long jE = oc.c.E(localDateA, zoneId);
        TextLocalisedClause textLocalisedClause2 = z ? new TextLocalisedClause(R$string.rev_points_points_expiry_details_expiring_soon_title, null, null, 14) : new TextLocalisedClause(R$string.rev_points_points_expiry_details_expiring_title, u.c(new TimeClause(jE, new TimeClause.Format.DayAndMonth(ka.SHORT), null, zoneId, 4)), null, 12);
        if (z) {
            int i22 = R$string.rev_points_points_expiry_details_expiring_soon_description;
            d.Companion.getClass();
            d dVarO4 = d.e;
            int i32 = 0;
            for (Object obj7 : arrayList) {
                int i33 = i32 + 1;
                if (i32 < 0) {
                    v.s();
                    throw null;
                }
                dVarO4 = i32 == 0 ? ((IssuedPoints) obj7).e : pyd.c.O(dVarO4, ((IssuedPoints) obj7).e);
                i32 = i33;
            }
            textLocalisedClause = new TextLocalisedClause(i22, v.k(nub.a.q(nub.a.a(dVarO4), null, null, null, 7), new TimeClause(jE, new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, g0m.a.f139502a, 4)), null, 12);
        } else {
            textLocalisedClause = null;
        }
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R$string.rev_points_points_expiry_redeem_now, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listK, new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 28));
    }
}
