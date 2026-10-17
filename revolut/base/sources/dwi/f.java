package dwi;

import android.view.View;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import dyf.d;
import ip0.ah0;
import ip0.bo0;
import ip0.gu;
import ip0.nz;
import ip0.pb0;
import ip0.rv;
import ip0.s7;
import ip0.uz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.joda.time.DateTime;
import qv0.c;
import svi.k;
import svi.k1;
import svi.l1;
import svi.o1;
import svi.q1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120421a;

    public /* synthetic */ f(int i) {
        this.f120421a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        char c2 = 0;
        boolean z = false;
        c2 = 0;
        switch (this.f120421a) {
            case 0:
                Data passData = (Data) obj2;
                Intrinsics.checkNotNullParameter(passData, "passData");
                svi.k kVar = (svi.k) passData.getContent();
                String strU = kVar != null ? cp5.d.u(kVar) : null;
                return strU == null ? "" : strU;
            case 1:
                Data data = (Data) obj2;
                svi.t tVar = (svi.t) data.getContent();
                if (!data.getLoading() && data.getError() == null && tVar != null) {
                    long j2 = tVar.f265989c;
                    DateTime dateTime = tVar.f265988b;
                    int i = (int) j2;
                    DateTime dateTimeMinusSeconds = dateTime.minusSeconds(i);
                    Intrinsics.checkNotNullExpressionValue(dateTimeMinusSeconds, "minusSeconds(...)");
                    if (dateTimeMinusSeconds.isBeforeNow() && dateTime.minusSeconds(5).isAfterNow()) {
                        c2 = 1;
                    }
                    if ((c2 ^ 1) == 1) {
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.b(rd0.c.WARNING, "AirportLoungePassQrCodeInteractor", "Cannot obtain valid QR code\nQR code is valid from " + dateTime.minusSeconds(i) + " until " + dateTime + " but device time is " + DateTime.now(), null, null, 16);
                    }
                }
                return Unit.f186387a;
            case 2:
                svi.k pass = (svi.k) obj2;
                Intrinsics.checkNotNullParameter(pass, "pass");
                if ((pass instanceof svi.j) || (pass instanceof svi.l)) {
                    z = true;
                } else if (!(pass instanceof k.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 3:
                svi.r rVar = (svi.r) obj2;
                int i2 = j.f120431a[rVar.f265980r.ordinal()];
                return (i2 == 1 || i2 == 2) ? new m(o1.f265960a) : (i2 == 3 || i2 == 4) ? l.f120439a : new m(new q1(rVar.f265980r));
            case 4:
                svi.k membership = (svi.k) obj2;
                Intrinsics.checkNotNullParameter(membership, "membership");
                return efm.r.just(new Data(membership, null, false, 6, null));
            case 5:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 5, null);
            case 6:
                svi.k pass2 = (svi.k) obj2;
                Intrinsics.checkNotNullParameter(pass2, "pass");
                return Boolean.valueOf(cp5.d.m(pass2));
            case 7:
                return ((Boolean) obj2).booleanValue() ? zi0.c.j(new b39.a(b39.d.LOUNGES)) : zi0.c.j(b39.b.f12015a);
            case 8:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Address address = user.k;
                return address != null ? a0.d.v(new Object[]{address.getCountry()}, 1, "https://www.revolut.com/en-%s/legal/airport-lounges", "format(...)") : "https://www.revolut.com/legal/airport-lounges";
            case 9:
                k0 it8 = (k0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f120436a;
            case 10:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((Number) pair.f186386b).intValue() > 0);
            case 11:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return ((k0) pair2.f186385a).f120436a;
            case 12:
                LocationDomain it9 = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zi0.c.P(it9, false, null, 3);
            case 13:
                List nearbyAirports = (List) obj2;
                Intrinsics.checkNotNullParameter(nearbyAirports, "nearbyAirports");
                return nearbyAirports.isEmpty() ? k1.c.f265934a : new l1(nearbyAirports);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nz nzVarB = dwk.b.b(true);
                Intrinsics.checkNotNullParameter("OrderBook_ItemsLoading", "listId");
                int i3 = R$attr.uikit_dp16;
                int i5 = R$attr.uikit_dp0;
                uz uzVar = new uz();
                uzVar.f166742a = c.d.f249513a;
                uzVar.f166743b = null;
                uzVar.f166744c = null;
                uzVar.d = null;
                uzVar.e = null;
                uzVar.f166746h = i5;
                uzVar.i = i5;
                uzVar.f = i3;
                uzVar.f166745g = i3;
                Unit unit = Unit.f186387a;
                List listK = zhm.v.k(nzVarB, uzVar);
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 15:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i6 = 0; i6 < 5; i6++) {
                    arrayListP.add(new s7(a0.d.n("BUY_FLOW_CONFIRMATION_LOADING_CELL ", i6), 0, 0, 0, 0, false, null, 126));
                }
                return arrayListP;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 18:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 19:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM wero_contacts");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 20:
                zw7.d0 it10 = (zw7.d0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it10);
            case 21:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : it11) {
                    if (((by7.h) obj3).f19776b) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it12 = arrayList.iterator();
                while (it12.hasNext()) {
                    arrayList2.add(((by7.h) it12.next()).f19775a);
                }
                return arrayList2;
            case 22:
                d.a aVar = dyf.d.Companion;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("DISCOVER_MORE_TITLE_ITEM_ID", 0, 0, 30);
                ArrayList arrayList3 = new ArrayList(4);
                for (int i21 = 0; i21 < 4; i21++) {
                    String strN = a0.d.n("DISCOVER_MORE_LOADING_ITEM_ID ", i21);
                    bo0 bo0Var = new bo0(strN);
                    int i22 = R$attr.uikit_dp0;
                    yp0.b.l(bo0Var, i22, i22, i22, i22, null, false, 48);
                    arrayList3.add(new ah0(strN, bo0Var, false));
                }
                return i2b.a.q(guVar, arrayList3);
            case 23:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 2, 1);
                ArrayList arrayList4 = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it13 = intRangeU.iterator();
                while (it13.f289625c) {
                    rv rvVar = new rv(a0.d.n("BOOKING_LIST_ITEM_ID", it13.nextInt()), null, 62);
                    yp0.b.l(rvVar, 0, 0, 0, 0, null, false, 63);
                    arrayList4.add(rvVar);
                }
                return arrayList4;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 26:
                dyg.h it14 = (dyg.h) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.d;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_analytics_widgetised_allocation_title, null, null, 14);
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return new dyg.i(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause, false, true);
            case 28:
                View it15 = (View) obj2;
                int i32 = TransferToChatTransitionFlowContainerLayout.f107124p;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(!(it15 instanceof BackgroundWallpaperView));
            default:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 3);
                for (int i33 = 0; i33 < 3; i33++) {
                    arrayListP2.add(new pb0(a0.d.n("LIST_ID_TEMPLATE_LOADER_", i33)));
                }
                yp0.b.k(arrayListP2, 0, 0, 0, 0, 31);
                return arrayListP2;
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f120421a = i;
    }
}
