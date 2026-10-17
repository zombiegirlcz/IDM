package c42;

import android.location.Address;
import android.location.Location;
import aw0.n6;
import c7b.q;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreen;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.Rev10ChatTransferScreen;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature_move_money.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import g5a.r;
import ip0.cs;
import ip0.pb0;
import ip0.rv;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.p;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20986a;

    public /* synthetic */ j(int i) {
        this.f20986a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20986a) {
            case 0:
                return a.a((a) obj2, new Data(null, null, true, 3, null), null, false, 26);
            case 1:
                Function0 loadingItemsGenerator = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItemsGenerator, "loadingItemsGenerator");
                return (List) loadingItemsGenerator.invoke();
            case 2:
                Address address = (Address) obj2;
                Intrinsics.checkNotNullParameter(address, "address");
                return new x39.a(address.getLocality(), address.getAdminArea(), address.getCountryCode());
            case 3:
                Address addr = (Address) obj2;
                Intrinsics.checkNotNullParameter(addr, "addr");
                return new LocationDomain(addr.getLatitude(), addr.getLongitude());
            case 4:
                Location it8 = (Location) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new LocationDomain(it8.getLatitude(), it8.getLongitude());
            case 5:
                LocationDomain location = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(location, "location");
                return new LocationDomain(location.f78066a, location.f78067b);
            case 6:
                kel.g it9 = (kel.g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof kel.n) {
                    return (kel.n) it9;
                }
                return null;
            case 7:
                kel.n it10 = (kel.n) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f183173a.f183145a;
            case 8:
                List<kel.g> holdings = (List) obj2;
                Intrinsics.checkNotNullParameter(holdings, "holdings");
                ArrayList arrayList = new ArrayList();
                for (kel.g gVar : holdings) {
                    kel.n nVar = gVar instanceof kel.n ? (kel.n) gVar : null;
                    if (nVar != null) {
                        arrayList.add(nVar);
                    }
                }
                return arrayList;
            case 9:
                vh it11 = (vh) obj2;
                KProperty[] kPropertyArr = ChatTransferScreen.f80146e0;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj3 = it11.f54883a.f;
                if (obj3 instanceof r) {
                    return (r) obj3;
                }
                return null;
            case 10:
                c5a.l update = (c5a.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return c5a.l.a(update, null, null, new Data(Boolean.FALSE, null, false, 6, null), null, null, false, null, null, null, null, null, null, null, null, false, false, null, false, null, 524283);
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 12:
                return ((PersistedBackground) obj2).f63743a.f63742b;
            case 13:
                q3a.g applyOnBinding = (q3a.g) obj2;
                KProperty[] kPropertyArr2 = Rev10ChatTransferScreen.i0;
                Intrinsics.checkNotNullParameter(applyOnBinding, "$this$applyOnBinding");
                applyOnBinding.f241934b.setExpandRatio(1.0f);
                return Unit.f186387a;
            case 14:
                vh it12 = (vh) obj2;
                KProperty[] kPropertyArr3 = Rev10ChatTransferScreen.i0;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj4 = it12.f54883a.f;
                if (obj4 instanceof r) {
                    return (r) obj4;
                }
                return null;
            case 15:
                q3a.e applyOnBinding2 = (q3a.e) obj2;
                KProperty[] kPropertyArr4 = Rev10ChatTransferScreen.i0;
                Intrinsics.checkNotNullParameter(applyOnBinding2, "$this$applyOnBinding");
                applyOnBinding2.f241929c.setBackground(NavBarWithContainerBackground.TransparentBackground.f57882a);
                return Unit.f186387a;
            case 16:
                eu3.c it13 = (eu3.c) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new eu3.e(it13, null);
            case 17:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                eu3.e eVar = (eu3.e) pair.f186385a;
                return new eu3.f(eVar.f129492a, (p5l.c) pair.f186386b, eVar.f129493b);
            case 18:
                byte[] it14 = (byte[]) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                p.r(it14);
                return Unit.f186387a;
            case 19:
                PricingPlanSubscription it15 = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f81129a.f152287a;
            case 20:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 21:
                ChargeBreakdown it16 = (ChargeBreakdown) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = v.k(new rv("list_id_plan_header_loading", null, 62), new s7("list_id_plan_benefit_loading_0", 0, 0, 0, 0, false, null, 94), new s7("list_id_plan_benefit_loading_1", 0, 0, 0, 0, false, null, 94), new cs("list_id_plan_button_loading"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new q(null, listK);
            case 23:
                c7i.r it17 = (c7i.r) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new yhm.r(Long.valueOf(it17.f22024c), it17.d, it17.f22022a);
            case 24:
                c7i.r update2 = (c7i.r) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return c7i.r.a(update2, null, 0L, 0L, null, null, null, null, null, null, 479);
            case 25:
                c7i.r it18 = (c7i.r) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new Pair(it18.f22022a.getContent(), it18.d);
            case 26:
                c7i.r it19 = (c7i.r) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                c7i.p pVar = (c7i.p) it19.f22022a.getContent();
                if (pVar != null) {
                    return new Pair(pVar, it19.d);
                }
                return null;
            case 27:
                return ((c7i.r) obj2).e;
            case 28:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(new pb0(a0.d.n("ROW_LOADING_LIST_ID", i)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return new c7i.v(arrayListP, new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.move_money_automation_set_automation_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "MOVE_MONEY_AUTOMATION_CTA_BUTTON_TAG", false, null, null, 972), null, null, 55), null);
            default:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "DeviceLockProtectionActivityDelegate", "Lock protection missing, forcing logout", null, null, 16);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ j(cli.n nVar, int i) {
        this.f20986a = i;
    }
}
