package f0k;

import a5h.g;
import com.revolut.data.network.services.StatementTemplateService;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferOutCreateService;
import com.revolut.retail.feature.marketnews.impl.data.network.wealth.WealthNewsService;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.network.PaymentVendorsService;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.network.RemittanceService;
import e3h.f;
import e3h.i;
import e4m.e;
import e54.z;
import e60.t;
import ecm.q;
import h98.j;
import h98.k;
import i4h.n;
import i4h.p0;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Retrofit;
import rlm.o;
import rp0.m;
import t80.v;
import ulm.a1;
import ulm.b1;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d implements e {
    public static yji.d A(f3h.b bVar, e3h.a extensions) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        return extensions.f122270a;
    }

    public static WealthNewsService B(Retrofit retrofit) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(WealthNewsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        WealthNewsService wealthNewsService = (WealthNewsService) objCreate;
        s.k(wealthNewsService);
        return wealthNewsService;
    }

    public static j C(k kVar) {
        j jVar = (j) kVar.b();
        s.k(jVar);
        return jVar;
    }

    public static j4i.a D(j4i.b bVar) {
        j4i.a aVar = (j4i.a) bVar.b();
        s.k(aVar);
        return aVar;
    }

    public static f1i.d a(a31.a aVar, a31.a aVar2, uhc.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10) {
        return new f1i.d(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static f49.d b(a31.a aVar, a31.a aVar2, q qVar) {
        return new f49.d(aVar, aVar2, qVar);
    }

    public static l5d.j c(g factory, e5d.e stateProvider) {
        f5d.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        f4h.a aVar = (f4h.a) factory.f1406b;
        gte.a aVar2 = (gte.a) factory.f1407c;
        Object obj2 = ((phm.a) factory.d).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return new l5d.j(stateProvider, aVar, aVar2, (l5d.k) obj2);
    }

    public static e54.a d(CreditAmountInputScreenContract$InputData inputData) {
        f54.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new e54.a(Integer.valueOf(inputData.d), inputData.f67036a);
    }

    public static void e(w80.b amountFormatter) {
        f54.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
    }

    public static l5d.g f(g factory, e5d.d view, e5d.a model) {
        f5d.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        sn.a aVar = (sn.a) ((os2.g) factory.e).f229224b;
        Object obj2 = ((phm.a) factory.f).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return new l5d.g(view, model, aVar, (qn.a) obj2);
    }

    public static e3h.a g(f3h.b bVar, i4h.a factory, e3h.d inputData, i view) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(view, "view");
        p0 p0Var = new p0(inputData, factory.f158436b, factory.f158437c, factory.d, factory.e, factory.f, factory.f158438g, factory.f158439h, factory.i, factory.f158440j, factory.k, factory.f158441l, factory.f158442m);
        return new e3h.a(new n(view, p0Var), p0Var);
    }

    public static Retrofit h(f9f.a aVar, ik0.b retrofitFactory, Json baseJson) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        o oVarB = ue0.e.b(baseJson, new f7l.c(6));
        b1.Companion.getClass();
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, ek.b.a(oVarB, a1.a("application/json")), null, 27);
        s.k(retrofitA);
        return retrofitA;
    }

    public static kg.o i(kg.o baseGson) {
        f3k.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        p pVar = new p(baseGson);
        pVar.c(new i3k.n(), RemittanceRouteId.class);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static le0.a j(kg.o gson, le0.b factory) {
        f3k.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(gson);
    }

    public static com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c k(CreditAmountInputScreenContract$InputData inputData, z inputValueMapper, e54.a amountCalculator) {
        f54.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputValueMapper, "inputValueMapper");
        Intrinsics.checkNotNullParameter(amountCalculator, "amountCalculator");
        return new com.revolut.feature.credit.application.plugins.impl.ui.amount_input.c(inputData.f67041j, inputData.f67037b, inputData.f67036a, inputValueMapper, amountCalculator);
    }

    public static z l(CreditAmountInputScreenContract$InputData inputData, w80.b amountFormatter) {
        f54.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        return new z(inputData.f67040h, amountFormatter);
    }

    public static y38.b m(ne0.j memoryCache, ue0.c storage) {
        f48.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        return new y38.b(memoryCache, storage);
    }

    public static f n(f3h.a aVar, i4h.a factory) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.f158435a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d o(e60.a extension) {
        f60.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d p(e60.a extension) {
        f60.s.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    public static PaymentVendorsService q(f3k.a aVar, Retrofit retrofit) {
        PaymentVendorsService paymentVendorsService = (PaymentVendorsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PaymentVendorsService.class, "create(...)");
        s.k(paymentVendorsService);
        return paymentVendorsService;
    }

    public static xe0.e r(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        f3k.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "payment_vendors_storage", mapper, 0, null, 56);
    }

    public static RemittanceService s(f3k.a aVar, Retrofit retrofit) {
        RemittanceService remittanceService = (RemittanceService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", RemittanceService.class, "create(...)");
        s.k(remittanceService);
        return remittanceService;
    }

    public static xe0.e t(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        f3k.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "remittance_storage", mapper, 2, u.c(new exa.a(1, 2, 5)), 32);
    }

    public static e60.s u(com.revolut.kompot.navigable.a controller, v mediaPicker, e60.z itemsProvider, m dialogDisplayer, t extensionModel, nji.b controllerUtils) {
        f60.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(mediaPicker, "mediaPicker");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(extensionModel, "extensionModel");
        Intrinsics.checkNotNullParameter(controllerUtils, "controllerUtils");
        return new e60.s(controller, mediaPicker, itemsProvider, dialogDisplayer, extensionModel, controllerUtils);
    }

    public static e60.s v(com.revolut.kompot.navigable.a controller, v mediaPicker, e60.z itemsProvider, m dialogDisplayer, t extensionModel, nji.b controllerUtils) {
        f60.s.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(mediaPicker, "mediaPicker");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(extensionModel, "extensionModel");
        Intrinsics.checkNotNullParameter(controllerUtils, "controllerUtils");
        return new e60.s(controller, mediaPicker, itemsProvider, dialogDisplayer, extensionModel, controllerUtils);
    }

    public static StatementTemplateService w(Retrofit retrofit) {
        f21.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(StatementTemplateService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        StatementTemplateService statementTemplateService = (StatementTemplateService) objCreate;
        s.k(statementTemplateService);
        return statementTemplateService;
    }

    public static xe0.e x(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        f21.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "statements", mapper, 0, null, 56);
    }

    public static tse.i y(y9l.a actionControllerExtension, ep6.n feedbackExtension, rul.e factory) {
        f50.f.Companion.getClass();
        Intrinsics.checkNotNullParameter(actionControllerExtension, "actionControllerExtension");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return rul.e.b(factory, feedbackExtension, actionControllerExtension, null, false, 12);
    }

    public static TransferOutCreateService z(f9f.a aVar, Retrofit retrofit) {
        TransferOutCreateService transferOutCreateService = (TransferOutCreateService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", TransferOutCreateService.class, "create(...)");
        s.k(transferOutCreateService);
        return transferOutCreateService;
    }
}
