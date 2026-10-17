package vtc;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.revolut.feature.referrals.common.data.impl.network.services.IncentivesService;
import com.revolut.feature.security_hub.impl.network.SecurityHubChecklistService;
import com.revolut.feature.security_hub.impl.network.SecurityHubService;
import com.revolut.feature.wealth.account_closure.impl.data.network.AccountClosureService;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ulm.b1;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p0 implements e4m.e {
    public static s3d.d A(s3d.l factory, jpc.e widgetDataProvider, v1d.b widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        return factory.a(widgetDataProvider, widgetConfigProvider);
    }

    public static s3d.k B(s3d.m factory, v1d.b widgetConfigProvider, ash.d widgetsCommonEventDispatcher, m3d.j navigationProvider, a38.a aVar) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        return factory.a(widgetConfigProvider, widgetsCommonEventDispatcher, navigationProvider, true, aVar);
    }

    public static AccountClosureService C(vtg.a aVar, Retrofit retrofit) {
        AccountClosureService accountClosureService = (AccountClosureService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", AccountClosureService.class, "create(...)");
        vc.s.k(accountClosureService);
        return accountClosureService;
    }

    public static WifiManager D(Context context) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("wifi");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (WifiManager) systemService;
    }

    public static q0 a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new q0(aVar, aVar2, aVar3, aVar4, 0);
    }

    public static r0 b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, ecm.q qVar) {
        return new r0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, qVar);
    }

    public static vxc.k c(a31.a aVar, uhc.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new vxc.k(aVar, aVar2, aVar3, aVar4);
    }

    public static yji.n d(CryptoOrderDetailsInputData input, wxh.e recurringFactory, yxh.b tpslFactory, xxh.b stopLimitFactory) {
        vxh.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(recurringFactory, "recurringFactory");
        Intrinsics.checkNotNullParameter(tpslFactory, "tpslFactory");
        Intrinsics.checkNotNullParameter(stopLimitFactory, "stopLimitFactory");
        if (input instanceof CryptoOrderDetailsInputData.RecurringInputData) {
            return recurringFactory.a((CryptoOrderDetailsInputData.RecurringInputData) input);
        }
        if (input instanceof CryptoOrderDetailsInputData.TpslInputData) {
            return tpslFactory.a((CryptoOrderDetailsInputData.TpslInputData) input);
        }
        if (input instanceof CryptoOrderDetailsInputData.StopLimitInputData) {
            return stopLimitFactory.a((CryptoOrderDetailsInputData.StopLimitInputData) input);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static w80.b e(qd0.b languageProvider) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d f(j60.a bottomExpandableDialogControllerExtension) {
        w40.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        yji.d dVar = (yji.d) bottomExpandableDialogControllerExtension;
        vc.s.k(dVar);
        return dVar;
    }

    public static cdh.a g(s3d.l factory, jpc.e widgetDataProvider, v1d.b widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        return new cdh.a(widgetDataProvider);
    }

    public static a4h.a h(a4h.c factory, v2h.c delegates, v2h.b controllerModelExtension) {
        w2h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new a4h.a(delegates, controllerModelExtension);
    }

    public static Set i(CryptoOrderDetailsInputData input, yji.n activeModel, ayh.h recurringExtFactory, ayh.i tpslExtFactory, ayh.j stopLimitExtFactory) {
        Object aVar;
        vxh.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(activeModel, "activeModel");
        Intrinsics.checkNotNullParameter(recurringExtFactory, "recurringExtFactory");
        Intrinsics.checkNotNullParameter(tpslExtFactory, "tpslExtFactory");
        Intrinsics.checkNotNullParameter(stopLimitExtFactory, "stopLimitExtFactory");
        if (input instanceof CryptoOrderDetailsInputData.RecurringInputData) {
            wxh.k kVar = (wxh.k) activeModel;
            switch (recurringExtFactory.f11212a) {
                case 0:
                    aVar = new vzh.d((wxh.m) ((ayh.k) ((ak5.f) recurringExtFactory.f11213b).d).f11222h.get(), kVar);
                    break;
                default:
                    aVar = new vzh.d((wxh.m) ((ayh.p) ((ak5.f) recurringExtFactory.f11213b).d).f11237h.get(), kVar);
                    break;
            }
        } else if (input instanceof CryptoOrderDetailsInputData.TpslInputData) {
            yxh.f fVar = (yxh.f) activeModel;
            switch (tpslExtFactory.f11214a) {
                case 0:
                    aVar = new xxh.a((yxh.i) ((ayh.k) ((ak5.f) tpslExtFactory.f11215b).d).f11222h.get(), fVar);
                    break;
                default:
                    aVar = new xxh.a((yxh.i) ((ayh.p) ((ak5.f) tpslExtFactory.f11215b).d).f11237h.get(), fVar);
                    break;
            }
        } else {
            if (!(input instanceof CryptoOrderDetailsInputData.StopLimitInputData)) {
                throw new NoWhenBranchMatchedException();
            }
            xxh.f fVar2 = (xxh.f) activeModel;
            switch (stopLimitExtFactory.f11216a) {
                case 0:
                    aVar = new xxh.a((xxh.h) ((ayh.k) ((ak5.f) stopLimitExtFactory.f11217b).d).f11222h.get(), fVar2);
                    break;
                default:
                    aVar = new xxh.a((xxh.h) ((ayh.p) ((ak5.f) stopLimitExtFactory.f11217b).d).f11237h.get(), fVar2);
                    break;
            }
        }
        Set setB = y0.b(aVar);
        vc.s.k(setB);
        return setB;
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        vv5.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "currency_discover", mapper, 0, null, 56);
    }

    public static s3d.d k(s3d.l factory, jpc.e widgetDataProvider, v1d.b widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        return factory.a(widgetDataProvider, widgetConfigProvider);
    }

    public static s3d.k l(s3d.m factory, v1d.b widgetConfigProvider, ash.d widgetsCommonEventDispatcher, m3d.j navigationProvider, a38.a aVar) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        return factory.a(widgetConfigProvider, widgetsCommonEventDispatcher, navigationProvider, false, aVar);
    }

    public static v1h.b m(bdh.d extensionFactory, v1h.a delegates) {
        Intrinsics.checkNotNullParameter(extensionFactory, "extensionFactory");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        bdh.c cVar = new bdh.c();
        return new v1h.b(new bdh.b(cVar, delegates), cVar);
    }

    public static Retrofit n(vtg.a aVar, ik0.b retrofitFactory, Json baseJson) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, p.a.g(b1.Companion, "application/json", baseJson), null, 27);
        vc.s.k(retrofitA);
        return retrofitA;
    }

    public static qr0.i o(uvl.c factory) {
        vvl.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new qr0.i((ffk.t) factory.f283491a);
    }

    public static IncentivesService p(vwa.d dVar, ik0.b retrofitFactory, p9l.a referralsNetworkConfiguration) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(referralsNetworkConfiguration, "referralsNetworkConfiguration");
        Object objCreate = ik0.b.a(retrofitFactory, null, referralsNetworkConfiguration.getHostUrl(), null, null, 29).create(IncentivesService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        IncentivesService incentivesService = (IncentivesService) objCreate;
        vc.s.k(incentivesService);
        return incentivesService;
    }

    public static s3d.d q(s3d.l factory, jpc.e widgetDataProvider, v1d.b widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        return factory.a(widgetDataProvider, widgetConfigProvider);
    }

    public static s3d.k r(s3d.m factory, v1d.b widgetConfigProvider, ash.d widgetsCommonEventDispatcher, m3d.j navigationProvider, a38.a aVar) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        return factory.a(widgetConfigProvider, widgetsCommonEventDispatcher, navigationProvider, false, aVar);
    }

    public static s3d.d s(s3d.l factory, jpc.e widgetDataProvider, v1d.b widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        return factory.a(widgetDataProvider, widgetConfigProvider);
    }

    public static s3d.k t(s3d.m factory, v1d.b widgetConfigProvider, ash.d widgetsCommonEventDispatcher, m3d.j navigationProvider, a38.a aVar) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        return factory.a(widgetConfigProvider, widgetsCommonEventDispatcher, navigationProvider, false, aVar);
    }

    public static sri.m u(Context context) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static le0.a v(kg.o gson, le0.b factory) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(gson);
    }

    public static Retrofit w(kg.o gson, Retrofit retrofit) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        builderNewBuilder.converterFactories().clear();
        Retrofit retrofitBuild = builderNewBuilder.addConverterFactory(GsonConverterFactory.create(gson)).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        vc.s.k(retrofitBuild);
        return retrofitBuild;
    }

    public static SecurityHubChecklistService x(Retrofit retrofit) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SecurityHubChecklistService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SecurityHubChecklistService securityHubChecklistService = (SecurityHubChecklistService) objCreate;
        vc.s.k(securityHubChecklistService);
        return securityHubChecklistService;
    }

    public static SecurityHubService y(Retrofit retrofit) {
        n0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SecurityHubService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SecurityHubService securityHubService = (SecurityHubService) objCreate;
        vc.s.k(securityHubService);
        return securityHubService;
    }

    public static f3d.a z(s3d.l factory, v1d.d titleProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        return new f3d.a(titleProvider, 1);
    }
}
