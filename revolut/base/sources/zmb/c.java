package zmb;

import android.content.Context;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.delegates.zh;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowImpl;
import dej.t1;
import do3.n;
import do3.r;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import koi.j;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mx0.lc;
import mx0.mc;
import pcd.s;
import qv0.p;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zmd.g;
import zmd.i;
import zmj.m;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323439a;

    public /* synthetic */ c(int i) {
        this.f323439a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        z = false;
        boolean z = false;
        switch (this.f323439a) {
            case 0:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.TRUE;
            case 1:
                s vault = (s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                return jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(vault.f234881a, null), ProductId.SAVINGS), null), null, null, 12);
            case 2:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 4);
                for (int i = 0; i < 4; i++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("budget_upcoming_payments_loading_", i), false, 0, false, 30));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return new i(arrayListP, g.f323464a);
            case 3:
                r userProfile = (r) obj2;
                Intrinsics.checkNotNullParameter(userProfile, "userProfile");
                return d0.Q(userProfile.f116431b);
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return zmg.d.a((n) pair.f186385a, (od0.i) pair.f186386b);
            case 5:
                ScreenerCollection collection = (ScreenerCollection) obj2;
                Intrinsics.checkNotNullParameter(collection, "collection");
                return new knh.g(collection);
            case 6:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List list = accounts;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (((WealthAccount) it9.next()).Q2()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.FALSE;
            case 8:
                zmj.n update = (zmj.n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return zmj.n.a(update, null, null, null, null, null, null, null, null, null, null, null, new Data(null, null, false, 6, null), 8191);
            case 9:
                zmj.n it11 = (zmj.n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f323568a;
            case 10:
                t1 it12 = (t1) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.e.f100440a;
            case 11:
                zmj.n update2 = (zmj.n) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return zmj.n.a(update2, null, null, null, null, null, null, null, null, null, new Data(f0.f322471a, null, false, 6, null), null, null, 14335);
            case 12:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                List listK = v.k(new s7("loadingItemId1", 0, 0, 0, 0, false, null, 126), new s7("loadingItemId2", 0, 0, 0, 0, false, null, 126), new s7("loadingItemId3", 0, 0, 0, 0, false, null, 126), new s7("loadingItemId4", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new zmj.f0(listK, m.f323566b, null, f0.f322471a);
            case 13:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return null;
            case 14:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr = ExternalEntryFlowImpl.f106553a0;
                Intrinsics.checkNotNullParameter(context, "context");
                return new bii.a(context);
            case 15:
                zn8.b update3 = (zn8.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                return new zn8.b(null);
            case 16:
                zn8.b it15 = (zn8.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f323684a;
            case 17:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return znc.f.f323694a;
            case 18:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 3);
                for (int i2 = 0; i2 < 3; i2++) {
                    s7 s7Var = new s7(a0.d.n("transaction-loading-cell-", i2), 0, 0, 0, 0, false, null, 126);
                    yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                    arrayListP2.add(s7Var);
                }
                return arrayListP2;
            case 19:
                mc it17 = (mc) obj2;
                AnalyticsDetailsController.Companion companion = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(it17, "it");
                return ((lc) it17).f209806a;
            case 20:
                g6 it18 = (g6) obj2;
                AnalyticsDetailsController.Companion companion2 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f54199a;
            case 21:
                FixedTabsDelegate.Model it19 = (FixedTabsDelegate.Model) obj2;
                AnalyticsDetailsController.Companion companion3 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(it19, "it");
                return "tab_custom";
            case 22:
                zh it20 = (zh) obj2;
                AnalyticsDetailsController.Companion companion4 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(Intrinsics.f(it20.f55713b.f53517a, "tabs"));
            case 23:
                j it21 = (j) obj2;
                AnalyticsDetailsController.Companion companion5 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(it21, "it");
                p pVar = it21 instanceof p ? (p) it21 : null;
                Object f52567m = pVar != null ? pVar.getE() : null;
                if (f52567m instanceof ind.f) {
                    return (ind.f) f52567m;
                }
                return null;
            case 24:
                ai it22 = (ai) obj2;
                AnalyticsDetailsController.Companion companion6 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(Intrinsics.f(it22.f53688b.f53517a, "tabs"));
            case 25:
                ai it23 = (ai) obj2;
                AnalyticsDetailsController.Companion companion7 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23.f53687a;
            case 26:
                Throwable it24 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return jnd.c.f176709a;
            case 27:
                return znd.a.a((znd.a) obj2, null, null, null, null, null, null, 0, false, !r2.i, false, false, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, false, 67108607);
            case 28:
                return znd.a.a((znd.a) obj2, null, null, null, null, null, null, 0, !r2.f323711h, false, false, false, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, false, 67108735);
            default:
                return znd.a.a((znd.a) obj2, null, null, null, null, null, null, 0, false, false, !r8.f323712j, false, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, false, 67108351);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f323439a = i;
    }
}
