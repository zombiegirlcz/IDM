package z0g;

import android.content.Context;
import android.icu.text.MeasureFormat;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.credit.impl.notifications.network.CreditCollectionNotificationSettingsService;
import com.revolut.feature.external_accounts.impl.repository.network.IndiaUpiService;
import com.revolut.feature.freelancer.impl.network.services.OrderInitiationPageService;
import com.revolut.feature.junior.account_activation.impl.data.network.JuniorAccountActivationService;
import com.revolut.feature.junior.account_activation.impl.data.network.JuniorActivationClaimService;
import com.revolut.feature.pro.onboarding.impl.data.network.ProPostActivationFlowService;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$Input;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Retrofit;
import vge.z2;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f1 implements e4m.e {
    public static xe0.e A(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        zpc.v.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "salary_switch_storage", mapper, 0, null, 56);
    }

    public static m1h.m B(CompositeAddMoneyScreenContract$Input input, m1h.l toolbarControllerModelExtensionFactory, j60.a bottomExpandableDialogControllerExtension, m1h.t view) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(toolbarControllerModelExtensionFactory, "toolbarControllerModelExtensionFactory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        return toolbarControllerModelExtensionFactory.a(input.f95583a, view, bottomExpandableDialogControllerExtension);
    }

    public static z58.b C(z58.l lVar) {
        z58.b bVar = (z58.b) lVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static ava.a D(ava.c cVar) {
        ava.a aVar = (ava.a) cVar.b();
        vc.s.k(aVar);
        return aVar;
    }

    public static an0.d a(a31.a aVar, a31.a aVar2, vxc.g gVar, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7) {
        return new an0.d(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, gVar);
    }

    public static bo9.d b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, ecm.q qVar) {
        return new bo9.d(qVar, aVar, aVar2, aVar3, aVar4, aVar5, 19);
    }

    public static i39.d c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, r5a.b bVar, a31.a aVar5, r5a.b bVar2, r5a.b bVar3, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19) {
        return new i39.d(aVar, aVar2, aVar3, aVar4, bVar, aVar5, bVar2, bVar3, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19);
    }

    public static jmd.e d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, ecm.q qVar) {
        return new jmd.e(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, qVar);
    }

    public static zxb.v0 e(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new zxb.v0(aVar, aVar2, aVar3, aVar4);
    }

    public static yhe.l f(RemoveAccountContract$InputData inputData, ImmutableMap accountContentProviderMap, ImmutableMap productAccountDataSourceMap, z2 productAccountsInteractor, qek.a removeAccountErrorHandler, wa7.m hiddenAccountsInteractor, yhe.m stateMapper) {
        zhe.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountContentProviderMap, "accountContentProviderMap");
        Intrinsics.checkNotNullParameter(productAccountDataSourceMap, "productAccountDataSourceMap");
        Intrinsics.checkNotNullParameter(productAccountsInteractor, "productAccountsInteractor");
        Intrinsics.checkNotNullParameter(removeAccountErrorHandler, "removeAccountErrorHandler");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        V v = accountContentProviderMap.get(inputData.f89567a);
        if (v == 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        xfe.j jVar = (xfe.j) v;
        V v2 = productAccountDataSourceMap.get(inputData.f89567a);
        if (v2 != 0) {
            return new yhe.l(inputData, jVar, (pfe.b) v2, productAccountsInteractor, removeAccountErrorHandler, hiddenAccountsInteractor, stateMapper);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static xe0.e g(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        zd8.j.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "coparents", mapper, 2, zhm.v.k(new ge8.a(), new ge8.b()), 32);
    }

    public static CreditCollectionNotificationSettingsService h(Retrofit retrofit) {
        z15.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CreditCollectionNotificationSettingsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CreditCollectionNotificationSettingsService creditCollectionNotificationSettingsService = (CreditCollectionNotificationSettingsService) objCreate;
        vc.s.k(creditCollectionNotificationSettingsService);
        return creditCollectionNotificationSettingsService;
    }

    public static Retrofit i(kg.o gson, Retrofit retrofit) {
        z15.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a dbSessionProvider) {
        zf6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, dbSessionProvider, "india_upi_app_storage", mapper, 0, null, 56);
    }

    public static JuniorAccountActivationService k(Retrofit retrofit) {
        z58.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(JuniorAccountActivationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorAccountActivationService juniorAccountActivationService = (JuniorAccountActivationService) objCreate;
        vc.s.k(juniorAccountActivationService);
        return juniorAccountActivationService;
    }

    public static JuniorActivationClaimService l(Retrofit retrofit) {
        z58.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(JuniorActivationClaimService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorActivationClaimService juniorActivationClaimService = (JuniorActivationClaimService) objCreate;
        vc.s.k(juniorActivationClaimService);
        return juniorActivationClaimService;
    }

    public static Locale m(Context context) {
        e1.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Locale localeD = jh.d.d(context);
        vc.s.k(localeD);
        return localeD;
    }

    public static MeasureFormat n(Locale locale) {
        e1.Companion.getClass();
        Intrinsics.checkNotNullParameter(locale, "locale");
        MeasureFormat measureFormat = MeasureFormat.getInstance(locale, MeasureFormat.FormatWidth.SHORT);
        Intrinsics.checkNotNullExpressionValue(measureFormat, "getInstance(...)");
        vc.s.k(measureFormat);
        return measureFormat;
    }

    public static q9h.c o(b9k.f factory) {
        zkh.t0.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new q9h.c((su9.c) factory.f13816a, (d9h.a) factory.f13818c, (e9h.d) factory.d);
    }

    public static sri.m p(Context context) {
        z9h.q.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m q(Context context) {
        zpc.t.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m r(Context context) {
        zu8.y0.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static OrderInitiationPageService s(Retrofit retrofit) {
        zs6.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(OrderInitiationPageService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        OrderInitiationPageService orderInitiationPageService = (OrderInitiationPageService) objCreate;
        vc.s.k(orderInitiationPageService);
        return orderInitiationPageService;
    }

    public static rbh.m t(ou5.b factory, CompositeAddMoneyScreenContract$Input input, m1h.k portfolioInfoProvider) {
        zbh.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        rbh.e input2 = new rbh.e(input.f95583a, input.f95585c);
        Intrinsics.checkNotNullParameter(input2, "input");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        return new rbh.m((j60.a) factory.f229820b, (rbh.r) factory.f229819a, portfolioInfoProvider, input2, (prl.e) factory.f229821c, (tnb.g0) factory.d, (tbh.a) factory.e);
    }

    public static t9h.a u(hd.r factory) {
        zkh.t0.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new t9h.a((ryc.a) factory.f151364a, (ybl.l) factory.f151365b, (e9h.d) factory.d, (rul.e) factory.e, (gte.a) factory.f);
    }

    public static ProPostActivationFlowService v(ik0.b retrofitFactory, Json json) {
        zia.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, p.a.g(ulm.b1.Companion, "application/json", json), null, 27).create(ProPostActivationFlowService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ProPostActivationFlowService proPostActivationFlowService = (ProPostActivationFlowService) objCreate;
        vc.s.k(proPostActivationFlowService);
        return proPostActivationFlowService;
    }

    public static IndiaUpiService w(Retrofit retrofit) {
        zf6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(IndiaUpiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        IndiaUpiService indiaUpiService = (IndiaUpiService) objCreate;
        vc.s.k(indiaUpiService);
        return indiaUpiService;
    }

    public static ue0.c x(ue0.c storage) {
        z15.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static ve0.c y(je0.d objectMapper, xe0.f storageFactory) {
        zse.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.e(storageFactory, "tips_storage", objectMapper, 12);
    }

    public static xe0.e z(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        zia.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "pro_post_activation", mapper, 0, null, 56);
    }
}
