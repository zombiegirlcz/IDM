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
import com.fourthline.vision.internal.b7;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerConfigKt;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineScope f37197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f37198c;
    private final TimestampProvider d;
    private final Lazy e;
    private final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t7 f37199g;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelfieScannerStep.values().length];
            try {
                iArr[SelfieScannerStep.SELFIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieScannerStep.ORCHESTRATED_LIVENESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieScannerStep.HAND_MOVEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public za(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f37196a = context;
        this.f37197b = coroutineScope;
        Executor mainExecutor = ContextCompat.getMainExecutor(context);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(...)");
        this.f37198c = mainExecutor;
        this.d = new TimestampProviderInternal();
        this.e = yhm.j.b(new dg(this, 11));
        this.f = yhm.j.b(new aem.v(18));
        Object systemService = context.getSystemService("sensor");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        elm.g gVar = skm.p0.f264002b;
        y6 y6Var = new y6((SensorManager) systemService, 0, gVar.plus(skm.e0.d()), 2, null);
        Object systemService2 = context.getSystemService("sensor");
        Intrinsics.i(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
        long j2 = 0;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        this.f37199g = new t7(y6Var, new com.fourthline.vision.internal.a((SensorManager) systemService2, 0, gVar.plus(skm.e0.d()), 2, null), j2, f, f4, gVar.plus(skm.e0.d()), 28, null);
    }

    private final LocationProvider getLocationProvider() {
        return (LocationProvider) this.e.getValue();
    }

    private final Map<String, Boolean> getSdkSensorAvailability() {
        Object systemService = this.f37196a.getSystemService("sensor");
        return SdkSensorAvailability.INSTANCE.getAvailabilityMap(systemService instanceof SensorManager ? (SensorManager) systemService : null);
    }

    private final uc getStepFlowRepository() {
        return (uc) this.f.getValue();
    }

    private final f7 handMovementStep(u uVar) {
        return new f7(uVar, handAnalyzer(uVar), getStepFlowRepository(), this.f37197b);
    }

    private final g7 headTurnLeftStep(u uVar) {
        return new g7(uVar, faceAnalyzer(uVar), getStepFlowRepository());
    }

    private final h7 headTurnRightStep(u uVar) {
        return new h7(uVar, faceAnalyzer(uVar), getStepFlowRepository());
    }

    private final c8 livenessRandomnessStep(SelfieScannerConfig selfieScannerConfig, u uVar) {
        return new c8(selfieScannerConfig, uVar, faceAnalyzer(uVar), getStepFlowRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationProvider locationProvider_delegate$lambda$0(za zaVar) {
        Context applicationContext = zaVar.f37196a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Object obj2 = zaVar.f37196a;
        ActivityResultRegistryOwner activityResultRegistryOwner = obj2 instanceof ActivityResultRegistryOwner ? (ActivityResultRegistryOwner) obj2 : null;
        if (activityResultRegistryOwner != null) {
            return FourthlineLocationHelper.getLocationProvider(applicationContext, activityResultRegistryOwner.getActivityResultRegistry());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final k8 mediaDurationIntervalDataSource(SelfieScannerConfig selfieScannerConfig, a9 a9Var) {
        return new dd(a9Var, new ag(selfieScannerConfig, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long mediaDurationIntervalDataSource$lambda$0(SelfieScannerConfig selfieScannerConfig) {
        return selfieScannerConfig.getVideoDuration().getDuration();
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
        return new MotionDataCollector(new AndroidDataCollectorHelper(this.f37196a, telephonyManager, locationManager, connectivityManager, batteryManager, powerManager, activityManager, windowManager, contentResolver, sensorManager, this.f37197b, 1022, null), new ArrayList(), new LinkedHashMap(), z, 100L, 0 == true ? 1 : 0, 32, 0 == true ? 1 : 0);
    }

    private final mc selfiePhotoStep(SelfieScannerConfig selfieScannerConfig, u uVar, Function0<Rect> function0) {
        return new mc(selfieScannerConfig, uVar, this.f37199g, function0, faceAnalyzer(uVar), getStepFlowRepository(), this.f37197b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List stateMachine$lambda$0(SelfieScannerConfig selfieScannerConfig) {
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = selfieScannerConfig.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null) {
            return randomnessLiveness.getSessionRandomnessLivenessSteps();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uc stepFlowRepository_delegate$lambda$0() {
        return new uc();
    }

    private final tf visionStepManager(SelfieScannerConfig selfieScannerConfig, u uVar, Function0<Rect> function0) {
        l lVarSelfiePhotoStep;
        List<SelfieScannerStep> steps = selfieScannerConfig.getSteps();
        ArrayList arrayList = new ArrayList(zhm.w.t(steps, 10));
        Iterator<T> it8 = steps.iterator();
        while (it8.hasNext()) {
            int i = a.$EnumSwitchMapping$0[((SelfieScannerStep) it8.next()).ordinal()];
            if (i == 1) {
                lVarSelfiePhotoStep = selfiePhotoStep(selfieScannerConfig, uVar, function0);
            } else if (i == 2) {
                lVarSelfiePhotoStep = headTurnLeftStep(uVar);
            } else if (i == 3) {
                lVarSelfiePhotoStep = headTurnRightStep(uVar);
            } else if (i == 4) {
                lVarSelfiePhotoStep = livenessRandomnessStep(selfieScannerConfig, uVar);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                lVarSelfiePhotoStep = handMovementStep(uVar);
            }
            arrayList.add(lVarSelfiePhotoStep);
        }
        return new i2(arrayList);
    }

    @NotNull
    public final f6 faceAnalyzer(@NotNull u cameraEngine) {
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        return new f6(this.f37198c, cameraEngine.getCoordinates().getAnalyzerTargetCoordinateSystem());
    }

    @NotNull
    public final z6 handAnalyzer(@NotNull u cameraEngine) {
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        if (!yd.f37153n.isAvailable()) {
            return new o9();
        }
        b7.a.C0329a c0329a = new b7.a.C0329a(null, 1, null);
        return new yd(this.f37196a, c0329a, new e7(), this.f37198c, cameraEngine.getCoordinates().getAnalyzerTargetCoordinateSystem());
    }

    @NotNull
    public final g9 motionDataManager(boolean z, @NotNull k8 mediaDurationIntervalDataSource) {
        Intrinsics.checkNotNullParameter(mediaDurationIntervalDataSource, "mediaDurationIntervalDataSource");
        return new e(z, motionDataCollector(z), this.d, new c(mediaDurationIntervalDataSource));
    }

    public final void setCameraSpecsOnScannerContext(@NotNull l0 input) {
        Intrinsics.checkNotNullParameter(input, "input");
        m0.applyCameraSpecsToScannerContext$default(this.f37196a, input, "selfie", null, 8, null);
    }

    @NotNull
    public final rd stateMachine(@NotNull u cameraEngine, @NotNull Function0<od> screenSizeProvider, @NotNull Function0<Rect> faceDetectionAreaProvider, @NotNull SelfieScannerConfig config, @NotNull Function1<? super SelfieScannerEvent, Unit> publicCallbacks) {
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(screenSizeProvider, "screenSizeProvider");
        Intrinsics.checkNotNullParameter(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(publicCallbacks, "publicCallbacks");
        a9 a9Var = new a9();
        g9 g9VarMotionDataManager = motionDataManager(config.getIncludeMotionData(), mediaDurationIntervalDataSource(config, a9Var));
        ad adVar = new ad(config, new ag(config, 1), new hf("vision_x", config, getSdkSensorAvailability()));
        if (config.getSteps().contains(SelfieScannerStep.HAND_MOVEMENT) || SelfieScannerConfigKt.isBioAuthEnabled(config) || SelfieScannerConfigKt.isPassiveLivenessAnalysisEnabled(config)) {
            tf tfVarVisionStepManager = visionStepManager(config, cameraEngine, faceDetectionAreaProvider);
            uc stepFlowRepository = getStepFlowRepository();
            CoroutineScope coroutineScope = this.f37197b;
            return new sc(screenSizeProvider, faceDetectionAreaProvider, config, publicCallbacks, cameraEngine, a9Var, g9VarMotionDataManager, this.d, getLocationProvider(), tfVarVisionStepManager, stepFlowRepository, adVar, coroutineScope);
        }
        CoroutineScope coroutineScope2 = this.f37197b;
        rc rcVar = new rc(screenSizeProvider, faceDetectionAreaProvider, config, publicCallbacks, cameraEngine, a9Var, g9VarMotionDataManager, this.d, getLocationProvider(), this.f37199g, adVar, coroutineScope2);
        f6 f6VarFaceAnalyzer = faceAnalyzer(cameraEngine);
        f6VarFaceAnalyzer.setCallback(rcVar);
        cameraEngine.setAnalyzer(f6VarFaceAnalyzer);
        return rcVar;
    }
}
