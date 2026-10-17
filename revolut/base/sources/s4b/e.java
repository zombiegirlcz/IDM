package s4b;

import androidx.content.NavDestination;
import androidx.content.NavOptionsBuilder;
import androidx.content.internal.NavBackStackEntryImpl;
import androidx.content.internal.NavControllerImpl;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentDayChangeTerms;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreen;
import do3.n;
import do3.q;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jel.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lw0.h;
import od0.i;
import pcd.l0;
import pcd.s;
import s4f.k;
import s56.o;
import s56.u0;
import z0h.m0;
import z0h.t1;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259806a;

    public /* synthetic */ e(int i) {
        this.f259806a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DeFiAssetDetails deFiAssetDetails;
        xi0.b bVar;
        int i;
        int i2;
        int i3 = this.f259806a;
        i iVar = i.f224256b;
        int i5 = 0;
        switch (i3) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new cii.b(null, f0.f322471a, new h(lw0.i.TITLE_SUBTITLE));
            case 1:
                jel.c cVar = (jel.c) obj2;
                if (cVar instanceof w2) {
                    return (w2) cVar;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 3:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CollectionScreen.Y;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.u;
                if (obj3 instanceof s4f.h) {
                    return (s4f.h) obj3;
                }
                return null;
            case 4:
                SmallCardDelegate.Model it9 = (SmallCardDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = CollectionScreen.Y;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj4 = it9.f53364p;
                if (obj4 instanceof s4f.g) {
                    return (s4f.g) obj4;
                }
                return null;
            case 5:
                ty0.a it10 = (ty0.a) obj2;
                KProperty[] kPropertyArr3 = CollectionScreen.Y;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj5 = it10.d;
                if (obj5 instanceof s4f.i) {
                    return (s4f.i) obj5;
                }
                return null;
            case 6:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                while (i5 < 5) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("LOADING_STOCK_", i5), false, 0, false, 30));
                    i5++;
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return k.f259860a;
            case 9:
                t1 it11 = (t1) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new m0(it11.f318563a, it11.f318564b);
            case 10:
                Intrinsics.checkNotNullParameter((eii.k) obj2, "it");
                return Unit.f186387a;
            case 11:
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10$lambda$9$lambda$8((CreationExtras) obj2);
            case 12:
                return Integer.valueOf(NavControllerImpl.launchSingleTopInternal$lambda$47((NavDestination) obj2));
            case 13:
                return NavControllerImpl.clearBackStackInternal$lambda$19((NavOptionsBuilder) obj2);
            case 14:
                return NavControllerImpl.executePopOperations$lambda$11((NavDestination) obj2);
            case 15:
                return NavControllerImpl.executePopOperations$lambda$14((NavDestination) obj2);
            case 16:
                n it12 = (n) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return q.y(it12);
            case 17:
                o it13 = (o) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f259975h;
            case 18:
                o it14 = (o) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                String str = it14.f259972b;
                s56.n nVar = it14.f259973c;
                DeFiBalance deFiBalance = it14.f259975h;
                if (deFiBalance == null || (deFiAssetDetails = it14.f259974g) == null || (bVar = it14.f259976j) == null) {
                    return null;
                }
                return new s56.m0(str, nVar, deFiBalance, deFiAssetDetails, bVar, it14.e);
            case 19:
                o it15 = (o) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.d;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u0.a();
            case 21:
                List vaults = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : vaults) {
                    l0.Companion.getClass();
                    if (l0.proVaults.contains(((s) obj6).e)) {
                        arrayList.add(obj6);
                    }
                }
                return arrayList;
            case 22:
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                List list = orders;
                boolean z = list instanceof Collection;
                if (z && list.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it16 = list.iterator();
                    i = 0;
                    while (it16.hasNext()) {
                        nr6.e eVar = ((nr6.b) it16.next()).e;
                        if (eVar != null && eVar.c() && (i = i + 1) < 0) {
                            v.r();
                            throw null;
                        }
                    }
                }
                if (z && list.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it17 = list.iterator();
                    i2 = 0;
                    while (it17.hasNext()) {
                        nr6.e eVar2 = ((nr6.b) it17.next()).e;
                        if (eVar2 != null && eVar2.d() && (i2 = i2 + 1) < 0) {
                            v.r();
                            throw null;
                        }
                    }
                }
                if (!z || !list.isEmpty()) {
                    Iterator it18 = list.iterator();
                    while (it18.hasNext()) {
                        if (((nr6.b) it18.next()).e == nr6.e.LINK && (i5 = i5 + 1) < 0) {
                            v.r();
                            throw null;
                        }
                    }
                }
                return new y57.d(i, i2, i5);
            case 23:
                ReferralCampaignV4 campaign = (ReferralCampaignV4) obj2;
                Intrinsics.checkNotNullParameter(campaign, "campaign");
                i.Companion.getClass();
                return od0.h.a(campaign);
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                i.Companion.getClass();
                return iVar;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                i.Companion.getClass();
                return iVar;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                i.Companion.getClass();
                return iVar;
            case 27:
                s5h.f update = (s5h.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new s5h.f(false);
            case 28:
                Intrinsics.checkNotNullParameter((dii.g) obj2, "it");
                return Unit.f186387a;
            default:
                i.Companion.getClass();
                return new Data(od0.h.a((LoanRepaymentDayChangeTerms) obj2), null, false, 6, null);
        }
    }

    public /* synthetic */ e(cli.n nVar, int i) {
        this.f259806a = i;
    }
}
