package xw0;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.h1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements SensorEventListener, Runnable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f309304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f309305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f309306c;
    public SensorManager d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f309307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f309308h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f309309j;
    public e k;

    public d(Context context, int i, int[] iArr) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f309304a = context;
        this.f309305b = i;
        this.f309306c = iArr;
        this.i = true;
    }

    public final SensorManager a() {
        SensorManager sensorManager = this.d;
        if (sensorManager != null) {
            return sensorManager;
        }
        Object systemService = this.f309304a.getSystemService("sensor");
        SensorManager sensorManager2 = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        if (sensorManager2 == null) {
            throw new UnsupportedOperationException("SensorManager is not available");
        }
        this.d = sensorManager2;
        return sensorManager2;
    }

    public abstract void b(SensorEvent sensorEvent);

    public final void c() {
        if (this.f || !this.e) {
            return;
        }
        this.e = false;
        if (this.f309308h) {
            this.f309308h = false;
            h1.e(this);
        }
        SensorManager sensorManager = this.d;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    public abstract void d();

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f309308h) {
            float[] values = event.values;
            Intrinsics.checkNotNullExpressionValue(values, "values");
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (values[i] != BitmapDescriptorFactory.HUE_RED) {
                        this.i = false;
                        this.f309308h = false;
                        h1.e(this);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        b(event);
    }

    @Override // java.lang.Runnable
    public final void run() {
        c();
        this.f309308h = false;
        this.f = true;
        e eVar = this.k;
        if (eVar != null) {
            eVar.invoke();
        }
    }
}
