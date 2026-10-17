package dw3;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.ui.models.R$id;
import com.revolut.camerakit.ui.views.view.CameraKitPreviewView;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.camerakit.ui.views.view.MaskHintView;
import com.revolut.data.network.models.transfer.adapter.PeerToPeerTransferDtoTypeAdapterFactory;
import com.youTransactor.uCube.rpc.Constants;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes22.dex */
public abstract class l implements e4m.e {
    public static ezj.a A(ezj.g gVar) {
        ezj.a aVar = (ezj.a) gVar.b();
        vc.s.k(aVar);
        return aVar;
    }

    public static zfe.e B(Context context) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        zfe.e.Companion.getClass();
        return zfe.d.a(context);
    }

    public static f49.b C(f49.d dVar) {
        f49.b bVar = (f49.b) dVar.b();
        vc.s.k(bVar);
        return bVar;
    }

    public static xv.c a(sw.d core) {
        Intrinsics.checkNotNullParameter(core, "core");
        xv.c cVar = (xv.c) core.E.get();
        vc.s.k(cVar);
        return cVar;
    }

    public static xv.d b(sw.d core) {
        Intrinsics.checkNotNullParameter(core, "core");
        xv.d dVar = (xv.d) core.f266058m.get();
        vc.s.k(dVar);
        return dVar;
    }

    public static jv.r c(nv.a api2, dv.m cameraKitUiDelegate, xv.c cameraCoreDelegate, CameraKitClientSettings cameraKitClientSettings, xv.h detector, LifecycleOwner lifecycleOwner, CameraKitUiSettings cameraKitUiSettings, pv.a cameraKitEventsDelegate, ww.b cameraPerformanceTracker, dx.m previewWithMaskMetadata, fv.e customHintMapperFactory, yw.h cameraSettings, vw.b bVar, vw.c cVar, vw.d dVar) {
        dy.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(cameraKitUiDelegate, "cameraKitUiDelegate");
        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
        Intrinsics.checkNotNullParameter(cameraKitClientSettings, "cameraKitClientSettings");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraKitUiSettings, "cameraKitUiSettings");
        Intrinsics.checkNotNullParameter(cameraKitEventsDelegate, "cameraKitEventsDelegate");
        Intrinsics.checkNotNullParameter(cameraPerformanceTracker, "cameraPerformanceTracker");
        Intrinsics.checkNotNullParameter(previewWithMaskMetadata, "previewWithMaskMetadata");
        Intrinsics.checkNotNullParameter(customHintMapperFactory, "customHintMapperFactory");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        rv.a aVar = (rv.a) api2.e.get();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(cameraKitUiDelegate, "cameraKitUiDelegate");
        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
        Intrinsics.checkNotNullParameter(cameraKitClientSettings, "cameraKitClientSettings");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraKitUiSettings, "cameraKitUiSettings");
        Intrinsics.checkNotNullParameter(cameraKitEventsDelegate, "cameraKitEventsDelegate");
        Intrinsics.checkNotNullParameter(cameraPerformanceTracker, "cameraPerformanceTracker");
        Intrinsics.checkNotNullParameter(previewWithMaskMetadata, "previewWithMaskMetadata");
        Intrinsics.checkNotNullParameter(customHintMapperFactory, "customHintMapperFactory");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        prl.e eVar = aVar.f257631a;
        Intrinsics.checkNotNullParameter(cameraCoreDelegate, "cameraCoreDelegate");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        kv.p pVar = new kv.p(cameraCoreDelegate, (xw.a) eVar.f239325b, cameraSettings, (d4m.a) eVar.f239326c, (qw.a) eVar.d, (d4m.a) eVar.e);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        uc.d dVar2 = new uc.d();
        dVar2.f278952a = lifecycleOwner;
        dVar2.f278953b = vkm.q.b(0, 7, null);
        return new jv.r(cameraKitUiDelegate, detector, lifecycleOwner, pVar, dVar2, new sv.a(cameraKitUiDelegate, cameraKitClientSettings, new tv.l(cameraKitUiSettings, new tv.h(), new tv.e(), new tv.d(), new tv.f(), new tv.a(), new tv.n(), customHintMapperFactory)), new p56.a(cameraKitEventsDelegate), cameraCoreDelegate, new kv.a(), new mv.c(cameraKitUiSettings, cameraKitUiDelegate), cameraPerformanceTracker, previewWithMaskMetadata, cameraKitClientSettings, new lv.b(bVar, cVar, dVar, cameraCoreDelegate), new a5h.g(new iv.a(), new iv.b(), new fn2.c(detector)), new iv.c());
    }

    public static sw.d d(tw.a factory, LifecycleOwner lifecycleOwner, PreviewView previewView, yw.h settings, boolean z, vw.b bVar, vw.c cVar, vw.d dVar, vw.g gVar) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(settings, "settings");
        om4.d0 d0Var = factory.f274781a;
        lifecycleOwner.getClass();
        previewView.getClass();
        settings.getClass();
        return new sw.d((sw.c) d0Var.f226551b, lifecycleOwner, previewView, settings, Boolean.valueOf(z), bVar, cVar, dVar, gVar);
    }

    public static pv.a e(nv.a api2) {
        dy.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(api2, "api");
        ((rv.b) api2.f219337h.get()).getClass();
        return new pv.a();
    }

    public static CameraKitPreviewView f(com.revolut.kompot.navigable.a controller) {
        dy.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        View viewFindViewById = controller.D2().findViewById(R$id.cameraKitUi_previewView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CameraKitPreviewView cameraKitPreviewView = (CameraKitPreviewView) viewFindViewById;
        vc.s.k(cameraKitPreviewView);
        return cameraKitPreviewView;
    }

    public static lv.c g(nv.a api2, CameraKitView cameraKitView, CameraKitUiSettings cameraKitUiSettings) {
        dy.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(cameraKitView, "cameraKitView");
        Intrinsics.checkNotNullParameter(cameraKitUiSettings, "cameraKitUiSettings");
        ((rv.c) api2.f219336g.get()).getClass();
        Intrinsics.checkNotNullParameter(cameraKitView, "cameraKitView");
        Intrinsics.checkNotNullParameter(cameraKitUiSettings, "cameraKitUiSettings");
        return new lv.c(cameraKitView, cameraKitUiSettings);
    }

    public static LinkedHashSet h(u00.d api2, Set configs, dx.l previewMetadata, f00.b customValidatorFactory) {
        dy.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        Intrinsics.checkNotNullParameter(customValidatorFactory, "customValidatorFactory");
        sw.c cVar = api2.f275998a;
        zw.e eVarD = cVar.d();
        vc.s.j(eVarD);
        nw.c cVar2 = (nw.c) cVar.i.get();
        vc.s.j(cVar2);
        c00.a impl = new c00.a(eVarD, cVar2, e4m.b.a(api2.d), e4m.b.a(api2.e), e4m.b.a(api2.f), e4m.b.a(api2.f276002h), e4m.b.a(api2.i), e4m.b.a(api2.f276001g), e4m.b.a(api2.f276003j), e4m.b.a(api2.k), api2.f275999b.b(), new bi0.f(new ci0.a(), api2.f276000c.d(), new di0.e()));
        u00.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl.a(configs, previewMetadata, customValidatorFactory);
    }

    public static csh.e i(g5k.e factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj2 = factory.f140805a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        csh.e eVar = (csh.e) obj2;
        vc.s.k(eVar);
        return eVar;
    }

    public static tb4.t j(m mVar, ew3.a creditPluginsFactoryApi) {
        Intrinsics.checkNotNullParameter(creditPluginsFactoryApi, "creditPluginsFactoryApi");
        d8e.a pluginFactories = new d8e.a(creditPluginsFactoryApi, 19);
        Intrinsics.checkNotNullParameter(pluginFactories, "pluginFactories");
        return new tb4.t(pluginFactories);
    }

    public static pw.c k(sw.d core) {
        Intrinsics.checkNotNullParameter(core, "core");
        pw.c cVar = (pw.c) core.f266063s.get();
        vc.s.k(cVar);
        return cVar;
    }

    public static aah.g l(gah.f factory, d1h.j view, d1h.e modelExtension) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        return new aah.g(view, modelExtension);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n m(d1h.e ext) {
        Intrinsics.checkNotNullParameter(ext, "ext");
        yji.n nVar = (yji.n) ext;
        vc.s.k(nVar);
        return nVar;
    }

    public static g5k.d n(g5k.e factory, ash.d widgetsCommonEventDispatcher) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        return new g5k.d(widgetsCommonEventDispatcher);
    }

    public static kg.o o(e21.c cVar, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        gson.getClass();
        kg.p pVar = new kg.p(gson);
        he0.m mVarCreate = PeerToPeerTransferDtoTypeAdapterFactory.create();
        Objects.requireNonNull(mVarCreate);
        pVar.e.add(mVarCreate);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    public static OkHttpClient p(e21.a aVar, xj0.i okHttpClientFactory) {
        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
        return xj0.i.a(okHttpClientFactory, null, false, true, null, null, null, Constants.TAG_RESOURCE_FILE_VERSION);
    }

    public static ww.b q(sw.d core) {
        Intrinsics.checkNotNullParameter(core, "core");
        ww.b bVar = (ww.b) core.F.get();
        vc.s.k(bVar);
        return bVar;
    }

    public static ww.b r(sw.d core) {
        Intrinsics.checkNotNullParameter(core, "core");
        ww.b bVar = (ww.b) core.f266064t.get();
        vc.s.k(bVar);
        return bVar;
    }

    public static dx.m s(com.revolut.kompot.navigable.a controller) {
        dy.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        View viewFindViewById = controller.D2().findViewById(R$id.cameraKitUi_previewView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = controller.D2().findViewById(R$id.cameraKitUi_maskHintView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        return new dx.m((CameraKitPreviewView) viewFindViewById, (MaskHintView) viewFindViewById2);
    }

    public static PreviewView t(CameraKitPreviewView cameraKitPreviewView) {
        dy.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(cameraKitPreviewView, "cameraKitPreviewView");
        cameraKitPreviewView.removeAllViews();
        PreviewView previewView = new PreviewView(cameraKitPreviewView.getContext());
        cameraKitPreviewView.addView(previewView);
        previewView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cameraKitPreviewView.currentPreview = previewView;
        previewView.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
        return previewView;
    }

    public static dx.l u(dx.m previewMetadata) {
        dy.n.Companion.getClass();
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        vc.s.k(previewMetadata);
        return previewMetadata;
    }

    public static kuj.a v(jpc.e factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new kuj.a();
    }

    public static kuj.e w(jpc.e factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new kuj.e((stj.h) factory.f177256b, (gte.a) factory.f177257c, (kuj.g) factory.d);
    }

    public static xe0.e x(je0.d objectMapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        dyk.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "TRADING_ONBOARDING_STORAGE", objectMapper, 1, zhm.f0.f322471a, 32);
    }

    public static wie.a y(Context context) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        rie.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        phm.a aVar = (phm.a) ue0.e.j(context).a().get(uie.h.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((uie.h) aVar2.b()).a();
        }
        throw new IllegalStateException(a0.d.q("Api ", uie.h.class, " is not found"));
    }

    public static e48.a z(e48.s sVar) {
        e48.a aVar = (e48.a) sVar.b();
        vc.s.k(aVar);
        return aVar;
    }
}
