package jw;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import r10.v;
import zhm.d0;

/* JADX INFO: loaded from: classes16.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SensorManager f178907a;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f178907a = (SensorManager) context.getSystemService(SensorManager.class);
    }

    public final v a(double d, k65.d onSample) {
        Sensor gyroscope;
        Sensor linearAcceleration;
        Sensor gravity;
        Sensor rotationVector;
        Intrinsics.checkNotNullParameter(onSample, "onSample");
        SensorManager sensorManager = this.f178907a;
        if (sensorManager == null || (gyroscope = sensorManager.getDefaultSensor(4)) == null || (linearAcceleration = sensorManager.getDefaultSensor(10)) == null || (gravity = sensorManager.getDefaultSensor(9)) == null || (rotationVector = sensorManager.getDefaultSensor(11)) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(gyroscope, "gyroscope");
        Intrinsics.checkNotNullParameter(linearAcceleration, "linearAcceleration");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        Intrinsics.checkNotNullParameter(rotationVector, "rotationVector");
        List listK = zhm.v.k(gyroscope, linearAcceleration, gravity, rotationVector);
        HandlerThread handlerThread = new HandlerThread(o.r(UUID.randomUUID(), "worker-"));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            int minDelay = ((Sensor) it8.next()).getMinDelay();
            Integer numValueOf = Integer.valueOf(minDelay);
            if (minDelay <= 0) {
                numValueOf = null;
            }
            Double dValueOf = numValueOf != null ? Double.valueOf(1000000.0d / ((double) numValueOf.intValue())) : null;
            if (dValueOf != null) {
                arrayList.add(dValueOf);
            }
        }
        Double dV0 = d0.v0(arrayList);
        double dDoubleValue = dV0 != null ? dV0.doubleValue() : 100.0d;
        if (d > dDoubleValue) {
            d = dDoubleValue;
        }
        double d5 = d <= 100.0d ? d : 100.0d;
        if (d5 < 1.0d) {
            d5 = 1.0d;
        }
        Companion.getClass();
        int iB = rim.d.b(1000000.0d / d5);
        d dVar = new d(onSample);
        try {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listK) {
                if (sensorManager.registerListener(dVar, (Sensor) obj2, iB, handler)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() == listK.size()) {
                return new v(sensorManager, dVar, handlerThread);
            }
            sensorManager.unregisterListener(dVar);
            handlerThread.quitSafely();
            return null;
        } catch (RuntimeException unused) {
            sensorManager.unregisterListener(dVar);
            handlerThread.quitSafely();
            return null;
        }
    }
}
