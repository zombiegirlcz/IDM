package d80;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e implements SensorEventListener {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a31.a f112105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f112107c;
    public SensorManager d;
    public Sensor e;

    public e(a31.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f112105a = listener;
        this.f112106b = 13;
        this.f112107c = new d();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r15 = r7;
        r16 = r8;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r21) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.e.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
