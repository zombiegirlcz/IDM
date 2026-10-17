package com.fourthline.vision.internal;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import androidx.compose.ui.geometry.Rect;
import androidx.core.content.ContextCompat;
import androidx.view.result.ActivityResultRegistryOwner;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.TimestampProviderInternal;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.internal.devicedata.SdkSensorAvailability;
import com.fourthline.core.location.FourthlineLocationHelper;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineScope f36093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f36094c;
    private final TimestampProvider d;
    private final Lazy e;
    private final t7 f;

    public d3(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36092a = context;
        this.f36093b = coroutineScope;
        Executor mainExecutor = ContextCompat.getMainExecutor(context);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(...)");
        this.f36094c = mainExecutor;
        this.d = new TimestampProviderInternal();
        this.e = yhm.j.b(new dg(this, 3));
        Object systemService = context.getSystemService("sensor");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        elm.g gVar = skm.p0.f264002b;
        y6 y6Var = new y6((SensorManager) systemService, 0, gVar.plus(skm.e0.d()), 2, null);
        Object systemService2 = context.getSystemService("sensor");
        Intrinsics.i(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
        long j2 = 0;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        this.f = new t7(y6Var, new a((SensorManager) systemService2, 0, gVar.plus(skm.e0.d()), 2, null), j2, f, f4, gVar.plus(skm.e0.d()), 28, null);
    }

    private final LocationProvider getLocationProvider() {
        return (LocationProvider) this.e.getValue();
    }

    private final Map<String, Boolean> getSdkSensorAvailability() {
        Object systemService = this.f36092a.getSystemService("sensor");
        return SdkSensorAvailability.INSTANCE.getAvailabilityMap(systemService instanceof SensorManager ? (SensorManager) systemService : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationProvider locationProvider_delegate$lambda$0(d3 d3Var) {
        Context applicationContext = d3Var.f36092a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Object obj2 = d3Var.f36092a;
        ActivityResultRegistryOwner activityResultRegistryOwner = obj2 instanceof ActivityResultRegistryOwner ? (ActivityResultRegistryOwner) obj2 : null;
        if (activityResultRegistryOwner != null) {
            return FourthlineLocationHelper.getLocationProvider(applicationContext, activityResultRegistryOwner.getActivityResultRegistry());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final k8 mediaDurationIntervalDataSource(DocumentScannerConfig documentScannerConfig, a9 a9Var) {
        return new dd(a9Var, new ng(documentScannerConfig, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long mediaDurationIntervalDataSource$lambda$0(DocumentScannerConfig documentScannerConfig) {
        return documentScannerConfig.getVideoDuration().getDuration();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MotionDataCollector motionDataCollector(boolean z) {
        TelephonyManager telephonyManager = null;
        LocationManager locationManager = null;
        ConnectivityManager connectivityManager = null;
        BatteryManager batteryManager = null;
        PowerManager powerManager = null;
        ActivityManager activityManager = null;
        WindowManager windowManager = null;
        ContentResolver contentResolver = null;
        SensorManager sensorManager = null;
        return new MotionDataCollector(new AndroidDataCollectorHelper(this.f36092a, telephonyManager, locationManager, connectivityManager, batteryManager, powerManager, activityManager, windowManager, contentResolver, sensorManager, this.f36093b, 1022, null), new ArrayList(), new LinkedHashMap(), z, 100L, 0 == true ? 1 : 0, 32, 0 == true ? 1 : 0);
    }

    private final g9 motionDataManager(boolean z, k8 k8Var) {
        return new e(z, motionDataCollector(z), this.d, new c(k8Var));
    }

    private final tf visionStepManager(DocumentScannerConfig documentScannerConfig, u uVar, Function0<od> function0, Function0<Rect> function02, q5 q5Var) {
        return new g2(documentScannerConfig, uVar, this.f, function0, function02, this.d, getLocationProvider(), q5Var, documentAnalyzer(uVar.getCoordinates().getAnalyzerTargetCoordinateSystem()), this.f36093b, documentScannerConfig.getInternalConfig().getFeatureConfig().getDynamicStepsEvaluator());
    }

    @NotNull
    public final v2 documentAnalyzer(int i) {
        return new v2(this.f36094c, i);
    }

    public final void setCameraSpecsOnScannerContext(@NotNull l0 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        m0.applyCameraSpecsToScannerContext$default(this.f36092a, input, "document", null, 8, null);
    }

    @NotNull
    public final rd stateMachine(@NotNull DocumentScannerConfig config, @NotNull u cameraEngine, @NotNull Function0<od> screenSizeProvider, @NotNull Function0<Rect> detectionAreaProvider, @NotNull Function1<? super DocumentScannerEvent, Unit> publicCallbacks) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(screenSizeProvider, "screenSizeProvider");
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        Intrinsics.checkNotNullParameter(publicCallbacks, "publicCallbacks");
        a9 a9Var = new a9();
        g9 g9VarMotionDataManager = motionDataManager(config.getIncludeMotionData(), mediaDurationIntervalDataSource(config, a9Var));
        d6 d6Var = new d6(config, new pe("vision_x", config, getSdkSensorAvailability()));
        q5 q5Var = new q5();
        return new m5(cameraEngine, config, publicCallbacks, detectionAreaProvider, a9Var, g9VarMotionDataManager, this.d, getLocationProvider(), this.f, d6Var, visionStepManager(config, cameraEngine, screenSizeProvider, detectionAreaProvider, q5Var), q5Var, this.f36093b);
    }
}
