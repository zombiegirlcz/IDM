package com.fourthline.core.internal.devicedata;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import com.fourthline.core.location.FourthlineLocationServicesHelper;
import fim.h;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.l;
import yhm.o;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001c\u001a\u00020\u001f*\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010 J\u0011\u0010#\u001a\u00020\"*\u00020!¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u00020\"*\u00020!¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\u00020\"2\u0014\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\u001f0(¢\u0006\u0004\b+\u0010,J)\u0010/\u001a\u00020\"2\u001a\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001f0-¢\u0006\u0004\b/\u00100J\u0019\u0010+\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u00102J!\u0010/\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u00103\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00104R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR(\u0010\\\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\u001f0(0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R.\u0010^\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001f0-0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[R\u0014\u0010b\u001a\u00020_8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lcom/fourthline/core/internal/devicedata/AndroidDataCollectorHelper;", "Landroid/hardware/SensorEventListener;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", "context", "Landroid/telephony/TelephonyManager;", "telephonyManager", "Landroid/location/LocationManager;", "locationManager", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/os/BatteryManager;", "batteryManager", "Landroid/os/PowerManager;", "powerManager", "Landroid/app/ActivityManager;", "activityManager", "Landroid/view/WindowManager;", "windowManager", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/hardware/SensorManager;", "sensorManager", "coroutineScope", "<init>", "(Landroid/content/Context;Landroid/telephony/TelephonyManager;Landroid/location/LocationManager;Landroid/net/ConnectivityManager;Landroid/os/BatteryManager;Landroid/os/PowerManager;Landroid/app/ActivityManager;Landroid/view/WindowManager;Landroid/content/ContentResolver;Landroid/hardware/SensorManager;Lkotlinx/coroutines/CoroutineScope;)V", "Landroid/hardware/Sensor;", "Lkotlinx/coroutines/Job;", "a", "(Landroid/hardware/Sensor;)Lkotlinx/coroutines/Job;", "sensor", "", "(Landroid/hardware/SensorManager;Landroid/hardware/Sensor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "isFeatureAvailable", "(Ljava/lang/String;)Z", "isPermissionAvailable", "isLocationServicesEnabled", "()Z", "Lkotlin/Function1;", "Landroid/hardware/SensorEvent;", "listener", "onSensorChanged", "(Lkotlin/jvm/functions/Function1;)Z", "Lkotlin/Function2;", "", "onAccuracyChanged", "(Lkotlin/jvm/functions/Function2;)Z", "event", "(Landroid/hardware/SensorEvent;)V", "accuracy", "(Landroid/hardware/Sensor;I)V", "b", "Landroid/content/Context;", "c", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "()Landroid/telephony/TelephonyManager;", "d", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "e", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "f", "Landroid/os/BatteryManager;", "getBatteryManager", "()Landroid/os/BatteryManager;", "g", "Landroid/os/PowerManager;", "getPowerManager", "()Landroid/os/PowerManager;", "h", "Landroid/app/ActivityManager;", "getActivityManager", "()Landroid/app/ActivityManager;", "i", "Landroid/view/WindowManager;", "getWindowManager", "()Landroid/view/WindowManager;", "j", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "k", "Landroid/hardware/SensorManager;", "", "l", "Ljava/util/List;", "sensorChangedListeners", "m", "accuracyChangedListeners", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AndroidDataCollectorHelper implements SensorEventListener, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f26301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TelephonyManager telephonyManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocationManager locationManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final BatteryManager batteryManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final PowerManager powerManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ActivityManager activityManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final WindowManager windowManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ContentResolver contentResolver;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final SensorManager sensorManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List sensorChangedListeners;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List accuracyChangedListeners;

    public static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SensorManager f26309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AndroidDataCollectorHelper f26310b;

        public a(SensorManager sensorManager, AndroidDataCollectorHelper androidDataCollectorHelper) {
            this.f26309a = sensorManager;
            this.f26310b = androidDataCollectorHelper;
        }

        public final void a(Throwable th10) {
            this.f26309a.unregisterListener(this.f26310b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((Throwable) obj2);
            return Unit.f186387a;
        }
    }

    public static final class b extends i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26311a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Sensor f26313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Sensor sensor, Continuation continuation) {
            super(2, continuation);
            this.f26313c = sensor;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return AndroidDataCollectorHelper.this.new b(this.f26313c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f26311a;
            if (i == 0) {
                o.b(obj2);
                SensorManager sensorManager = AndroidDataCollectorHelper.this.sensorManager;
                if (sensorManager != null) {
                    AndroidDataCollectorHelper androidDataCollectorHelper = AndroidDataCollectorHelper.this;
                    Sensor sensor = this.f26313c;
                    this.f26311a = 1;
                    if (androidDataCollectorHelper.a(sensorManager, sensor, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    public AndroidDataCollectorHelper(@NotNull Context context, TelephonyManager telephonyManager, LocationManager locationManager, ConnectivityManager connectivityManager, BatteryManager batteryManager, PowerManager powerManager, ActivityManager activityManager, WindowManager windowManager, @NotNull ContentResolver contentResolver, SensorManager sensorManager, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f26301a = coroutineScope;
        this.context = context;
        this.telephonyManager = telephonyManager;
        this.locationManager = locationManager;
        this.connectivityManager = connectivityManager;
        this.batteryManager = batteryManager;
        this.powerManager = powerManager;
        this.activityManager = activityManager;
        this.windowManager = windowManager;
        this.contentResolver = contentResolver;
        this.sensorManager = sensorManager;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(6);
            if (defaultSensor != null) {
                a(defaultSensor);
            }
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(12);
            if (defaultSensor2 != null) {
                a(defaultSensor2);
            }
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
            if (defaultSensor3 != null) {
                a(defaultSensor3);
            }
            Sensor defaultSensor4 = sensorManager.getDefaultSensor(1);
            if (defaultSensor4 != null) {
                a(defaultSensor4);
            }
            Sensor defaultSensor5 = sensorManager.getDefaultSensor(4);
            if (defaultSensor5 != null) {
                a(defaultSensor5);
            }
            Sensor defaultSensor6 = sensorManager.getDefaultSensor(11);
            if (defaultSensor6 != null) {
                a(defaultSensor6);
            }
        }
        this.sensorChangedListeners = new ArrayList();
        this.accuracyChangedListeners = new ArrayList();
    }

    private final Job a(Sensor sensor) {
        return e0.C(this, null, null, new b(sensor, null), 3);
    }

    public final ActivityManager getActivityManager() {
        return this.activityManager;
    }

    public final BatteryManager getBatteryManager() {
        return this.batteryManager;
    }

    public final ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    @NotNull
    public final ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f26301a.getCoroutineContext();
    }

    public final LocationManager getLocationManager() {
        return this.locationManager;
    }

    public final PowerManager getPowerManager() {
        return this.powerManager;
    }

    public final TelephonyManager getTelephonyManager() {
        return this.telephonyManager;
    }

    public final WindowManager getWindowManager() {
        return this.windowManager;
    }

    public final boolean isFeatureAvailable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        FeatureInfo[] systemAvailableFeatures = this.context.getPackageManager().getSystemAvailableFeatures();
        Intrinsics.checkNotNullExpressionValue(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList arrayList = new ArrayList(systemAvailableFeatures.length);
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            arrayList.add(featureInfo.name);
        }
        return arrayList.contains(str);
    }

    public final boolean isLocationServicesEnabled() {
        return FourthlineLocationServicesHelper.getLocationServicesEnabled(this.context);
    }

    public final boolean isPermissionAvailable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return this.context.checkSelfPermission(str) == 0;
    }

    public final boolean onAccuracyChanged(@NotNull Function2<? super Sensor, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.accuracyChangedListeners.add(listener);
    }

    public final boolean onSensorChanged(@NotNull Function1<? super SensorEvent, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.sensorChangedListeners.add(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(SensorManager sensorManager, Sensor sensor, Continuation frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        sensorManager.registerListener(this, sensor, 0);
        lVar.r(new a(sensorManager, this));
        Object objT = lVar.t();
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar ? objT : Unit.f186387a;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        Iterator it8 = this.accuracyChangedListeners.iterator();
        while (it8.hasNext()) {
            ((Function2) it8.next()).invoke(sensor, Integer.valueOf(accuracy));
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        Iterator it8 = this.sensorChangedListeners.iterator();
        while (it8.hasNext()) {
            ((Function1) it8.next()).invoke(event);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AndroidDataCollectorHelper(android.content.Context r13, android.telephony.TelephonyManager r14, android.location.LocationManager r15, android.net.ConnectivityManager r16, android.os.BatteryManager r17, android.os.PowerManager r18, android.app.ActivityManager r19, android.view.WindowManager r20, android.content.ContentResolver r21, android.hardware.SensorManager r22, kotlinx.coroutines.CoroutineScope r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper.<init>(android.content.Context, android.telephony.TelephonyManager, android.location.LocationManager, android.net.ConnectivityManager, android.os.BatteryManager, android.os.PowerManager, android.app.ActivityManager, android.view.WindowManager, android.content.ContentResolver, android.hardware.SensorManager, kotlinx.coroutines.CoroutineScope, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
