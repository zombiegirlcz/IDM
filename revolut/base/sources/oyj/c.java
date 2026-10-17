package oyj;

import aah.g;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import b9.w2;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeature;
import com.revolut.biometric_verification.api.models.FaceDetectionResource;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.core.settings.VideoWatermark;
import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import com.revolut.feature.revolutpay.impl.data.service.MerchantAppVerificationService;
import com.revolut.feature.revolutpay.impl.data.service.RevolutPayDeferredPaymentsService;
import com.revolut.feature.wealth.impl.data.network.free_stocks.FreeStocksService;
import com.revolut.feature.wealth.impl.data.network.promotions.PromotionsService;
import com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService;
import com.revolut.feature.wealth.impl.data.network.stock_lending.StockLendingService;
import e4m.e;
import java.util.LinkedHashSet;
import java.util.Set;
import je0.d;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import oz9.l;
import p2k.c0;
import p2k.g0;
import p2k.u;
import p7c.c1;
import p7c.e1;
import p7c.h1;
import p7c.k1;
import p7c.y0;
import retrofit2.Retrofit;
import sri.m;
import sri.o;
import ulm.b1;
import vc.s;
import xe0.f;
import xv.h;
import yw.i;
import yw.j;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c implements e {
    public static xe0.e A(d mapper, yk0.a databaseSessionProvider, f storageFactory) {
        l.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "recipient_payments_preferences", mapper, 0, null, 56);
    }

    public static c90.c B(Context context) {
        e1.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new c90.c(context);
    }

    public static p2k.f C(c0 c0Var) {
        p2k.f fVar = (p2k.f) c0Var.b();
        s.k(fVar);
        return fVar;
    }

    public static u D(g0 g0Var) {
        u uVar = (u) g0Var.b();
        s.k(uVar);
        return uVar;
    }

    public static h a(vy.a inputData, w2 factory, LinkedHashSet validators, xv.d framesProvider, LifecycleOwner lifecycleOwner, dx.l previewMetadata, boolean z, boolean z3) {
        oz.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(validators, "validators");
        Intrinsics.checkNotNullParameter(framesProvider, "framesProvider");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        Intrinsics.checkNotNullParameter("default", "analysisCollectionFolder");
        FaceDetectionResource faceDetectionResource = inputData.i;
        return factory.n(validators, framesProvider, lifecycleOwner, previewMetadata, z, z3, faceDetectionResource != null ? new cx.a(faceDetectionResource.f50442b, faceDetectionResource.f50443c) : cx.b.f109873a);
    }

    public static n8j.a b(a31.a aVar) {
        return new n8j.a(aVar, 10);
    }

    public static yw.f c(pz.a factory, f4h.a featuresInteractor) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        pz.b bVar = (pz.b) factory;
        bVar.getClass();
        CameraCaptureSettings[] elements = {CameraCaptureSettings.FaceEmbedding.f50696a, CameraCaptureSettings.CompactSelfie.f50693a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        CameraKitClientSettings cameraKitClientSettings = bVar.f240858a;
        CameraCaptureSettings cameraCaptureSettings = cameraKitClientSettings.f50706a;
        boolean zContains = setY0.contains(cameraCaptureSettings);
        yw.a cameraLens = yw.a.FRONT;
        yw.e videoResolution = hy.e.a(cameraKitClientSettings);
        yw.e analysisResolution = zContains ? yw.e.HIGHEST : yw.e.HD;
        yw.e photoResolution = yw.e.HD;
        yw.e previewResolution = zContains ? yw.e.HIGHEST : yw.e.FHD;
        yw.d cameraPreset = new yw.d(zContains ? new yw.c(100, hy.b.a(cameraCaptureSettings), j.LOSSY) : new yw.c(hy.a.a(cameraCaptureSettings), hy.b.a(cameraCaptureSettings), hy.a.b(cameraCaptureSettings)), new i(hy.d.a(cameraCaptureSettings), hy.c.a(cameraCaptureSettings)));
        yw.b initialMode = zContains ? yw.b.PICTURE : yw.b.COMBINED;
        VideoWatermark videoWatermark = hy.f.a(cameraCaptureSettings);
        Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
        Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
        Intrinsics.checkNotNullParameter(analysisResolution, "analysisResolution");
        Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
        Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
        Intrinsics.checkNotNullParameter(initialMode, "initialMode");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        Intrinsics.checkNotNullParameter(videoWatermark, "videoWatermark");
        BiometricVerificationFeature biometricVerificationFeature = ((ly.c) featuresInteractor.f132229b).i.f50396j;
        if (biometricVerificationFeature != null) {
            str = "videoWatermark";
            z = true;
            if (!biometricVerificationFeature.f50390a) {
            }
            Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
            Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
            Intrinsics.checkNotNullParameter(analysisResolution, "analysisResolution");
            Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
            Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
            Intrinsics.checkNotNullParameter(initialMode, "initialMode");
            Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
            Intrinsics.checkNotNullParameter(videoWatermark, str);
            return new yw.f(cameraLens, videoResolution, analysisResolution, photoResolution, cameraPreset, initialMode, previewResolution, videoWatermark, z);
        }
        str = "videoWatermark";
        z = false;
        Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
        Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
        Intrinsics.checkNotNullParameter(analysisResolution, "analysisResolution");
        Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
        Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
        Intrinsics.checkNotNullParameter(initialMode, "initialMode");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        Intrinsics.checkNotNullParameter(videoWatermark, str);
        return new yw.f(cameraLens, videoResolution, analysisResolution, photoResolution, cameraPreset, initialMode, previewResolution, videoWatermark, z);
    }

    public static cdh.a d(r2d.h factory, o1d.b widgetDataProvider, o1d.a widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        return new cdh.a(widgetDataProvider);
    }

    public static g e(z factory, n2h.g view, n2h.a controllerModelExtension) {
        p2h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new g(view, controllerModelExtension);
    }

    public static g f(z factory, n2h.g view, n2h.a controllerModelExtension) {
        p2h.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new g(view, controllerModelExtension);
    }

    public static m3h.a g(z factory, n2h.e input, o2h.a navigationExtension) {
        p2h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        return new m3h.a(input, (kdh.b) factory.f174461b, navigationExtension, (d4h.b) factory.f174462c);
    }

    public static m3h.a h(z factory, n2h.e input, o2h.a navigationExtension) {
        p2h.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        return new m3h.a(input, (kdh.b) factory.f174461b, navigationExtension, (d4h.b) factory.f174462c);
    }

    public static r2d.c i(r2d.h factory, z widgetDataProvider, o1d.a widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        return new r2d.c(widgetDataProvider, widgetConfigProvider);
    }

    public static Retrofit j(p7h.a aVar, ik0.b retrofitFactory, Json json) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(json, "json");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, p.a.g(b1.Companion, "application/json", json), null, 27);
        s.k(retrofitA);
        return retrofitA;
    }

    public static FreeStocksService k(p7h.a aVar, Retrofit retrofit) {
        FreeStocksService freeStocksService = (FreeStocksService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", FreeStocksService.class, "create(...)");
        s.k(freeStocksService);
        return freeStocksService;
    }

    public static LearnService l(Retrofit retrofit) {
        LearnService learnService = (LearnService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", LearnService.class, "create(...)");
        s.k(learnService);
        return learnService;
    }

    public static m3h.c m(z factory) {
        p2h.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new m3h.c((d4h.b) factory.f174462c);
    }

    public static xe0.e n(d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        p77.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "market_details", mapper, 2, zhm.u.c(new u77.a()), 32);
    }

    public static xe0.e o(d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        p59.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "marketplace", mapper, 0, null, 56);
    }

    public static r2d.c p(r2d.h factory, z widgetDataProvider, o1d.a widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        return new r2d.c(widgetDataProvider, widgetConfigProvider);
    }

    public static xe0.e q(d mapper, f storageFactory, yk0.a databaseSecurityProvider) {
        h1.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSecurityProvider, "MERCHANT_INITIATED_DEFERRED_PAYMENT_STORAGE", mapper, 0, null, 56);
    }

    public static m r(Context context) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static m s(Context context) {
        e1.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static PromotionsService t(p7h.a aVar, Retrofit retrofit) {
        PromotionsService promotionsService = (PromotionsService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PromotionsService.class, "create(...)");
        s.k(promotionsService);
        return promotionsService;
    }

    public static PortfolioRecurringOrdersService u(p7h.a aVar, Retrofit retrofit) {
        PortfolioRecurringOrdersService portfolioRecurringOrdersService = (PortfolioRecurringOrdersService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", PortfolioRecurringOrdersService.class, "create(...)");
        s.k(portfolioRecurringOrdersService);
        return portfolioRecurringOrdersService;
    }

    public static xe0.e v(d mapper, f storageFactory, yk0.a databaseSecurityProvider) {
        y0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSecurityProvider, "revolut_pay_info", mapper, 1, null, 48);
    }

    public static MerchantAppVerificationService w(Retrofit retrofit) {
        k1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(MerchantAppVerificationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        MerchantAppVerificationService merchantAppVerificationService = (MerchantAppVerificationService) objCreate;
        s.k(merchantAppVerificationService);
        return merchantAppVerificationService;
    }

    public static RevolutPayDeferredPaymentsService x(Retrofit retrofit) {
        c1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(RevolutPayDeferredPaymentsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RevolutPayDeferredPaymentsService revolutPayDeferredPaymentsService = (RevolutPayDeferredPaymentsService) objCreate;
        s.k(revolutPayDeferredPaymentsService);
        return revolutPayDeferredPaymentsService;
    }

    public static xe0.e y(d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        h1.Companion.getClass();
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return f.f(storageFactory, databaseSessionProvider, "shipping_contacts", mapper, 0, null, 56);
    }

    public static StockLendingService z(p7h.a aVar, Retrofit retrofit) {
        StockLendingService stockLendingService = (StockLendingService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", StockLendingService.class, "create(...)");
        s.k(stockLendingService);
        return stockLendingService;
    }
}
