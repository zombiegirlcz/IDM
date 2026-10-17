package f0d;

import a9g.x1;
import aii.e0;
import aii.u;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.room.util.DBUtil;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a3;
import com.revolut.core.ui_kit.delegates.widgets.c3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.extension_auth.impl.R$string;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.rewards.api.model.rewards.RewardAction;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowDestination;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import fag.j0;
import fag.t0;
import fg8.l0;
import gzc.r;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import rp0.y;
import tof.q6;
import u09.v;
import wim.z;
import z8g.t;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f131096c;

    public /* synthetic */ m(Object obj2, Object obj3, int i) {
        this.f131094a = i;
        this.f131095b = obj2;
        this.f131096c = obj3;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kfm.a
    public final void run() throws IOException {
        gzc.c cVar;
        String str;
        TextLocalisedClause textLocalisedClause;
        boolean z = true;
        int i = 0;
        switch (this.f131094a) {
            case 0:
                q qVar = (q) this.f131095b;
                d dVar = (d) this.f131096c;
                ypi.i iVar = qVar.f131102m;
                r rVar = dVar.f131084a;
                if ((!rVar.e || rVar.f148031a != gzc.d.TEXT || (cVar = dVar.f131085b) == null || (str = cVar.f147989b) == null || str.length() < 3) && dVar.f131084a.e) {
                    z = false;
                }
                iVar.setEnabled(z);
                return;
            case 1:
                f3d.k kVar = (f3d.k) this.f131095b;
                u uVar = (u) this.f131096c;
                ash.d dVar2 = kVar.f131954a;
                Intrinsics.h(uVar);
                dVar2.a(new e0(uVar, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), false, 4));
                return;
            case 2:
                ((f9g.c) this.f131095b).f132942c.c((NaviCommand) this.f131096c);
                return;
            case 3:
                fag.r rVar2 = (fag.r) this.f131095b;
                afi.a aVar = (afi.a) this.f131096c;
                rVar2.f133366a.f(aVar.f4100a, aVar);
                rVar2.f133367b.onNext(new fag.q(aVar.f4100a, aVar));
                return;
            case 4:
                j0 j0Var = (j0) this.f131095b;
                String str2 = (String) this.f131096c;
                z8g.u uVar2 = j0Var.f133337a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Intrinsics.checkNotNullParameter(new ffi.d(str2, jCurrentTimeMillis), "<this>");
                DBUtil.performBlocking(uVar2.f320131a, false, true, new t(uVar2, new x1(str2, jCurrentTimeMillis), i));
                return;
            case 5:
                t0 t0Var = (t0) this.f131095b;
                t0Var.e(dgi.c.a(t0Var.a(), null, null, null, null, null, null, null, false, null, null, (zfi.a) this.f131096c, null, null, 2097151));
                return;
            case 6:
                t0 t0Var2 = (t0) this.f131095b;
                t0Var2.e(dgi.c.a(t0Var2.a(), null, null, null, (List) this.f131096c, null, null, null, false, null, null, null, null, null, 4194295));
                return;
            case 7:
                t0 t0Var3 = (t0) this.f131095b;
                t0Var3.e(dgi.c.a(t0Var3.a(), null, null, null, null, null, null, null, false, null, (TravelHotelsSortingOption) this.f131096c, null, null, null, 3145727));
                return;
            case 8:
                t0 t0Var4 = (t0) this.f131095b;
                HotelsProperty hotelsProperty = (HotelsProperty) this.f131096c;
                ReentrantReadWriteLock reentrantReadWriteLock = t0Var4.u;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    t0Var4.f133375b.f("CACHE_KEY_HOTELS_PROPERTY", hotelsProperty);
                    Unit unit = Unit.f186387a;
                    while (i < readHoldCount) {
                        lock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    t0Var4.f133387t.onNext(hotelsProperty);
                    return;
                } catch (Throwable th10) {
                    while (i < readHoldCount) {
                        lock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th10;
                }
            case 9:
                t0 t0Var5 = (t0) this.f131095b;
                t0Var5.e(dgi.c.a(t0Var5.a(), (LocationData) this.f131096c, null, null, null, null, null, null, false, null, null, null, null, null, 3145726));
                return;
            case 10:
                ((fg8.m) this.f131095b).g((NaviCommand) this.f131096c);
                return;
            case 11:
                l0 l0Var = (l0) this.f131095b;
                NaviCommand naviCommand = (NaviCommand) this.f131096c;
                sri.m mVar = l0Var.f134945a;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return;
            case 12:
                fg8.t0 t0Var6 = (fg8.t0) this.f131095b;
                NaviCommand naviCommand2 = (NaviCommand) this.f131096c;
                sri.m mVar2 = t0Var6.d;
                Intrinsics.h(naviCommand2);
                mVar2.c(naviCommand2);
                return;
            case 13:
                ((fqj.h) this.f131095b).e.remove((q6) this.f131096c);
                return;
            case 14:
                fv5.d dVar3 = (fv5.d) this.f131095b;
                CryptoOrderDetailsInputData.RecurringInputData inputData = (CryptoOrderDetailsInputData.RecurringInputData) this.f131096c;
                CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode = ((pt5.c) dVar3.b3()).f239614a;
                CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency singleCurrency = currencyMode instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency ? (CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency) currencyMode : null;
                xi0.b bVar = singleCurrency != null ? singleCurrency.f71405a : null;
                pu5.a aVar2 = dVar3.f138352q;
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter("", "searchQuery");
                yji.n.P2(dVar3, dVar3.o2(new sxh.a(inputData, "", bVar)), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
                return;
            case 15:
                ((fv5.d) this.f131095b).A2(new BridgeDestination((NaviCommand) this.f131096c));
                return;
            case 16:
                fv5.d dVar4 = (fv5.d) this.f131095b;
                ExchangeOrder exchangeOrder = (ExchangeOrder) this.f131096c;
                CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode2 = ((pt5.c) dVar4.b3()).f239614a;
                CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency singleCurrency2 = currencyMode2 instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency ? (CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency) currencyMode2 : null;
                xi0.b bVar2 = singleCurrency2 != null ? singleCurrency2.f71405a : null;
                pu5.a aVar3 = dVar4.f138352q;
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                yji.n.P2(dVar4, dVar4.o2(aVar3.a(exchangeOrder, "", bVar2)), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
                return;
            case 17:
                rl0.d dVar5 = (rl0.d) this.f131095b;
                fwj.p pVar = (fwj.p) this.f131096c;
                int i3 = fwj.i.f138672a[dVar5.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (pVar.f138691l.d() == wl0.o.NONE) {
                        return;
                    }
                    pVar.f138691l.b();
                    return;
                }
                return;
            case 18:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((g09.i) this.f131095b).f139377b, ((v) this.f131096c).name(), Boolean.TRUE);
                return;
            case 19:
                ((g3e.i) this.f131095b).f140276c.onNext((lk0.g) this.f131096c);
                return;
            case 20:
                g5c.f fVar = (g5c.f) this.f131095b;
                fVar.f140745b.c(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, "com.revolut.revolutx", null, ((f80.b) fVar.d).f(g5c.f.g((jf0.c) this.f131096c)), 10), null, null, null, 268435456, null, null, null, null, false, 1006));
                return;
            case 21:
                BaseDraggableWidgetDelegate.a aVar4 = (BaseDraggableWidgetDelegate.a) this.f131095b;
                g5k.d dVar6 = (g5k.d) this.f131096c;
                koi.j jVar = aVar4 instanceof com.revolut.core.ui_kit.delegates.widgets.i ? ((com.revolut.core.ui_kit.delegates.widgets.i) aVar4).f55375c : aVar4 instanceof a3 ? ((a3) aVar4).f55292c : aVar4 instanceof c3 ? ((c3) aVar4).f55316c : null;
                qv0.p pVar2 = jVar instanceof qv0.p ? (qv0.p) jVar : null;
                Object f = pVar2 != null ? pVar2.getF51674g() : null;
                RemittancePaymentsCountryData remittancePaymentsCountryData = f instanceof RemittancePaymentsCountryData ? (RemittancePaymentsCountryData) f : null;
                if (remittancePaymentsCountryData != null) {
                    dVar6.f140804a.a(new RemittanceBridgeFeatureConfig.BridgeDestination(new RemittanceInputData(TransferFlowType.Default.f92257b, new TransferMoneyPocket(null, null, 3), remittancePaymentsCountryData)));
                    return;
                }
                return;
            case 22:
                ((gae.d) this.f131096c).f142149a.onNext(new FeatureCommand(new TransactionsFeatureConfig.Details((k71.i) this.f131095b, null, null, null, 122)));
                return;
            case 23:
                gd8.h hVar = (gd8.h) this.f131095b;
                String str3 = (String) this.f131096c;
                synchronized (hVar) {
                    ue0.c cVar2 = hVar.f143086b;
                    Type JUNIOR_CONSENT_PROMPT_STATES_TYPE = gd8.h.d;
                    Intrinsics.checkNotNullExpressionValue(JUNIOR_CONSENT_PROMPT_STATES_TYPE, "JUNIOR_CONSENT_PROMPT_STATES_TYPE");
                    Map map = (Map) cVar2.T2("CACHE_KEY_JUNIOR_CONSENT_PROMPT_STATES", JUNIOR_CONSENT_PROMPT_STATES_TYPE);
                    if (map != null) {
                        LinkedHashMap linkedHashMapZ = r0.z(map);
                        linkedHashMapZ.remove(str3);
                        ue0.c cVar3 = hVar.f143086b;
                        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                        KType kTypeB = o0.b(String.class);
                        companion.getClass();
                        cVar3.G(linkedHashMapZ, "CACHE_KEY_JUNIOR_CONSENT_PROMPT_STATES", z.d(o0.f186429a.d(o0.d(KTypeProjection.Companion.a(kTypeB), KTypeProjection.Companion.a(o0.b(ed8.b.class))))));
                        Unit unit2 = Unit.f186387a;
                    }
                    break;
                }
                return;
            case 24:
                ge6.v vVar = (ge6.v) this.f131095b;
                String str4 = (String) this.f131096c;
                sri.m mVar3 = vVar.f143253h;
                til.m mVar4 = vVar.f143259q;
                Intrinsics.h(str4);
                WorkflowConfiguration.Workflow configuration = new WorkflowConfiguration.Workflow(str4, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126);
                ((pth.g) mVar4).getClass();
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                mVar3.c(new FeatureCommand(new KompotOverlayFeatureConfig(new WorkflowFlowDestination(configuration, false), yhi.b.SOLID, (Integer) null, 12)));
                return;
            case 25:
                ge6.v vVar2 = (ge6.v) this.f131095b;
                ExtensionAuthRequestData extensionAuthRequestData = (ExtensionAuthRequestData) this.f131096c;
                k3l.b bVar3 = vVar2.f143255l;
                Intrinsics.h(extensionAuthRequestData);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_secure_sign_in_success_title, null, null, 14);
                if (extensionAuthRequestData instanceof ExtensionAuthRequestData.Verification) {
                    zd6.b bVar4 = ((ExtensionAuthRequestData.Verification) extensionAuthRequestData).i;
                    int i5 = bVar4 == null ? -1 : ge6.p.f143247a[bVar4.ordinal()];
                    if (i5 == -1 || i5 == 1 || i5 == 2 || i5 == 3) {
                        textLocalisedClause = new TextLocalisedClause(R$string.revolut_secure_sign_in_success_subtitle, null, null, 14);
                        ((k3l.d) bVar3).O(new StatusViewConfiguration.Success("status_view_id", textLocalisedClause2, textLocalisedClause, null, null, 2040));
                        return;
                    } else if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!(extensionAuthRequestData instanceof ExtensionAuthRequestData.AppChallenge)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = null;
                ((k3l.d) bVar3).O(new StatusViewConfiguration.Success("status_view_id", textLocalisedClause2, textLocalisedClause, null, null, 2040));
                return;
            case 26:
                gic.h hVar2 = (gic.h) this.f131095b;
                RewardAction rewardAction = (RewardAction) this.f131096c;
                aii.o oVar = hVar2.f144118m;
                RewardAction.OpenMap openMap = (RewardAction.OpenMap) rewardAction;
                co3.a aVar5 = openMap.f84822b;
                knm.b.j(oVar, new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, Uri.parse("geo:0,0?q=" + aVar5.f25486a + "," + aVar5.f25487b + "(" + Uri.encode(openMap.f84823c) + ")"), 0, null, 494));
                return;
            case 27:
                ((opi.b) ((gz7.v) this.f131095b).f147964m).Z((y) this.f131096c);
                return;
            case 28:
                ((opi.b) ((h2i.c) this.f131095b).i).Z((y) this.f131096c);
                return;
            default:
                File file = (File) this.f131095b;
                Bitmap bitmap = (Bitmap) this.f131096c;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    Unit unit3 = Unit.f186387a;
                    fileOutputStream.close();
                    return;
                } catch (Throwable th11) {
                    try {
                        throw th11;
                    } catch (Throwable th12) {
                        com.bumptech.glide.d.e(fileOutputStream, th11);
                        throw th12;
                    }
                }
        }
    }
}
