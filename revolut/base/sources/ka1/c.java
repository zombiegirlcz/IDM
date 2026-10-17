package ka1;

import a2d.m;
import android.content.Context;
import android.location.LocationManager;
import com.revolut.feature.acquiring.card_reader.data.impl.data.network.CardReaderService;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.categorisation.impl.network.TransactionsCategorisationService;
import com.revolut.feature.crypto.spare.change.impl.data.service.CryptoSpareChangeService;
import com.revolut.feature.payinstore.impl.data.service.PayInStoreService;
import ecm.q;
import ha1.u;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kr9.x;
import mae.o;
import mae.p;
import ne0.n;
import qoc.d0;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c implements e4m.e {
    public static o A(p factory, f01.c uiKitResources, t70.b currenciesLocalization) {
        kde.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return factory.d(uiKitResources, currenciesLocalization);
    }

    public static xe0.e B(je0.d objectMapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "storage_card_reader.pref", objectMapper, 0, null, 56);
    }

    public static CryptoSpareChangeService C(kl5.a aVar, Retrofit retrofit) {
        CryptoSpareChangeService cryptoSpareChangeService = (CryptoSpareChangeService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CryptoSpareChangeService.class, "create(...)");
        s.k(cryptoSpareChangeService);
        return cryptoSpareChangeService;
    }

    public static jlc.f D(d0 factory, jlc.e delegates, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        return factory.a(delegates, bottomExpandableDialogControllerExtension);
    }

    public static m a(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new m(aVar, aVar2, aVar3, 15);
    }

    public static emi.g b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar) {
        return new emi.g(aVar, aVar2, aVar3, aVar4, qVar, 6);
    }

    public static fpc.b c(a1j.a aVar, a1j.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5) {
        return new fpc.b(aVar3, aVar4, aVar5, aVar, aVar2);
    }

    public static EntitiesSelectionItem d(FormScreen screen) {
        kb0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        return ue8.c.J(screen);
    }

    public static nd.k e(Context context) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        File logFilesDir = new File(context.getFilesDir(), "cardreader/logs");
        File logShareDir = new File(logFilesDir, "share");
        pa1.a copyLogFile = new pa1.a();
        Intrinsics.checkNotNullParameter(logFilesDir, "logFilesDir");
        Intrinsics.checkNotNullParameter(logShareDir, "logShareDir");
        Intrinsics.checkNotNullParameter(copyLogFile, "copyLogFile");
        return new nd.k(5);
    }

    public static oa1.a f(ma1.i cardReaderLogsInteractor) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(cardReaderLogsInteractor, "cardReaderLogsInteractor");
        return new oa1.a(cardReaderLogsInteractor);
    }

    public static sa1.q g(Context context, tl0.a base64Util, ma1.j cardReaderPairingStateReceiver, ma1.f bluetoothRequirementsChecker, oa1.d youTransactorLogger, d4m.a connectionManagerProvider) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(base64Util, "base64Util");
        Intrinsics.checkNotNullParameter(cardReaderPairingStateReceiver, "cardReaderPairingStateReceiver");
        Intrinsics.checkNotNullParameter(bluetoothRequirementsChecker, "bluetoothRequirementsChecker");
        Intrinsics.checkNotNullParameter(youTransactorLogger, "youTransactorLogger");
        Intrinsics.checkNotNullParameter(connectionManagerProvider, "connectionManagerProvider");
        n.Companion.getClass();
        return new sa1.q(context, base64Util, cardReaderPairingStateReceiver, ne0.l.a(1, 5L), bluetoothRequirementsChecker, youTransactorLogger, connectionManagerProvider);
    }

    public static CardReaderService h(Retrofit retrofit) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CardReaderService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CardReaderService cardReaderService = (CardReaderService) objCreate;
        s.k(cardReaderService);
        return cardReaderService;
    }

    public static la1.a i(ma1.k sdkInteractor, ne0.j memoryCache, oa1.a logsRecorder, ue0.c storage) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(logsRecorder, "logsRecorder");
        Intrinsics.checkNotNullParameter(sdkInteractor, "sdkInteractor");
        return new la1.a(sdkInteractor, memoryCache, logsRecorder, storage);
    }

    public static htl.f j(r10.q factory) {
        ktl.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return (htl.k) factory.f250849b;
    }

    public static kg.o k(kg.o gson) {
        kl2.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        he0.m mVar = new he0.m("type", ml2.c.class, false, false);
        mVar.c(ml2.a.class, "CONTENT_IMAGE");
        mVar.c(ml2.b.class, "CONTENT_PROGRESS");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        pVar.e.add(mVar);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static hsl.f l(hsl.h factory, jsl.d screen, jdf.e controllerModelExtension) {
        kdf.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new hsl.f(screen, controllerModelExtension);
    }

    public static LocationManager m(Context context) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) LocationManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
        LocationManager locationManager = (LocationManager) systemService;
        s.k(locationManager);
        return locationManager;
    }

    public static sri.m n(Context context) {
        kek.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m o(Context context) {
        kn9.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m p(Context context) {
        x.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static le0.a q(kg.o gson, le0.b factory) {
        kl2.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(gson);
    }

    public static yd9.g r(r10.q factory) {
        kde.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new yd9.g((yd9.e) factory.f250849b);
    }

    public static yd9.k s(r10.q factory) {
        kde.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new yd9.k((p0i.b) factory.f250850c, (xua.a) factory.d);
    }

    public static ha1.n t(CardReaderService service, ca1.a cardReaderRepository, ia1.c pairingInfoDomainMapper, ia1.b firmwareBinaryDomainMapper, kg.o gson) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        Intrinsics.checkNotNullParameter(pairingInfoDomainMapper, "pairingInfoDomainMapper");
        Intrinsics.checkNotNullParameter(firmwareBinaryDomainMapper, "firmwareBinaryDomainMapper");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return new ha1.n(service, cardReaderRepository, pairingInfoDomainMapper, firmwareBinaryDomainMapper, gson);
    }

    public static u u(CardReaderService service, tl0.a base64Util, ia1.d paymentMapper, bd1.a lineItemMapper, kg.o gson) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(base64Util, "base64Util");
        Intrinsics.checkNotNullParameter(paymentMapper, "paymentMapper");
        Intrinsics.checkNotNullParameter(lineItemMapper, "lineItemMapper");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return new u(service, base64Util, paymentMapper, lineItemMapper, gson);
    }

    public static PayInStoreService v(kn9.f fVar, Retrofit retrofit) {
        PayInStoreService payInStoreService = (PayInStoreService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PayInStoreService.class, "create(...)");
        s.k(payInStoreService);
        return payInStoreService;
    }

    public static TransactionsCategorisationService w(Retrofit retrofit) {
        ke3.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TransactionsCategorisationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TransactionsCategorisationService transactionsCategorisationService = (TransactionsCategorisationService) objCreate;
        s.k(transactionsCategorisationService);
        return transactionsCategorisationService;
    }

    public static ve0.c x(je0.d mapper, xe0.f storageFactory) {
        ke3.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.e(storageFactory, "analytics_categorization_shared_pref", mapper, 8);
    }

    public static xe0.e y(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        kl2.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_backend_driven_limits", mapper, 0, null, 56);
    }

    public static xe0.e z(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        kvb.j.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "exclusive_store", mapper, 0, null, 56);
    }
}
