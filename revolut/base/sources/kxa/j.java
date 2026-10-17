package kxa;

import ael.d0;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Vibrator;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import ish.a0;
import jid.x;
import kotlin.jvm.internal.Intrinsics;
import sri.o;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j implements e4m.e {
    public static p96.a a(l70.g gVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return new p96.a(20);
    }

    public static l80.a b(l70.g gVar, l80.c printer) {
        Intrinsics.checkNotNullParameter(printer, "printer");
        return printer;
    }

    public static void c(l70.g gVar, toh.d groupingSeparatorProvider) {
        Intrinsics.checkNotNullParameter(groupingSeparatorProvider, "groupingSeparatorProvider");
    }

    public static n80.d d(l70.g gVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return new n80.d(packageManager);
    }

    public static c3d.d e(a31.a aVar, a31.a aVar2) {
        return new c3d.d(aVar, aVar2, 15);
    }

    public static m f(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, ibh.a aVar12) {
        return new m(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, 0);
    }

    public static AudioManager g(Context context) {
        l70.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("audio");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public static ClipboardManager h(Context context) {
        l70.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        return (ClipboardManager) systemService;
    }

    public static a5h.d i(a5h.g factory, k3h.c delegates, k3h.b controllerModelExtension) {
        l3h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new a5h.d(controllerModelExtension, delegates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d j(j60.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d k(j60.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d l(j60.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d m(j60.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    public static a5h.f n(a5h.g factory, k3h.e inputData) {
        l3h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new a5h.f(inputData, (b5h.b) factory.f1406b, (d0) factory.f1407c, (ybl.b) factory.d, (c4h.c) factory.e);
    }

    public static he2.b o(nji.b controllerUtils) {
        Intrinsics.checkNotNullParameter(controllerUtils, "controllerUtils");
        return new he2.b(controllerUtils);
    }

    public static j60.c p(com.revolut.kompot.navigable.a controller, rp0.m dialogDisplayer, j60.e dialogHostFinder) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    public static j60.c q(com.revolut.kompot.navigable.a controller, rp0.m dialogDisplayer, j60.e dialogHostFinder) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d r(j60.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d s(j60.a extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.d dVar = (yji.d) extension;
        s.k(dVar);
        return dVar;
    }

    public static iy.b t(gte.a featureToggleInteractor, g70.a androidEmulatorSimpleDetector) {
        ky.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(androidEmulatorSimpleDetector, "androidEmulatorSimpleDetector");
        return new iy.b(featureToggleInteractor, androidEmulatorSimpleDetector);
    }

    public static sri.m u(l0k.m mVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static o69.a v(p69.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new o69.a();
    }

    public static o69.g w(p69.a factory, x shopsOutletsInteractor, w39.b locationInteractor, mjd.b shopsNearbyDraggableWidgetMapper, h4g.g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(shopsOutletsInteractor, "shopsOutletsInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(shopsNearbyDraggableWidgetMapper, "shopsNearbyDraggableWidgetMapper");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(shopsOutletsInteractor, "shopsOutletsInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(shopsNearbyDraggableWidgetMapper, "shopsNearbyDraggableWidgetMapper");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        return new o69.g(shopsOutletsInteractor, locationInteractor, shopsNearbyDraggableWidgetMapper, shopsFeatureAvailabilityInteractor, factory.f233231a, factory.f233232b);
    }

    public static o69.i x(p69.b factory, ash.d widgetsCommonEventDispatcher, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        return new o69.i(widgetsCommonEventDispatcher, widgetsUiInteractor);
    }

    public static j3f.f y(TradingDatabase db8) {
        l3f.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        j3f.f fVarJ = db8.j();
        s.k(fVarJ);
        return fVarJ;
    }

    public static Vibrator z(Context context) {
        l70.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("vibrator");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (Vibrator) systemService;
    }
}
