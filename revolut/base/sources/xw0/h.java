package xw0;

import android.hardware.SensorEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f309316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f309317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f309318n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f309319p;

    public static boolean e(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        return Math.abs(fArr[0]) <= 3.5f && fArr[1] >= BitmapDescriptorFactory.HUE_RED && fArr[2] >= 6.0f;
    }

    public static boolean f(SensorEvent sensorEvent) {
        if (Math.abs(sensorEvent.values[0]) <= 3.5f) {
            float[] fArr = sensorEvent.values;
            if (fArr[1] > BitmapDescriptorFactory.HUE_RED && fArr[2] > BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
        }
        return false;
    }

    @Override // xw0.d
    public final void b(SensorEvent event) {
        e eVar;
        Intrinsics.checkNotNullParameter(event, "event");
        long j2 = event.timestamp;
        int i = this.f309317m;
        if (i == 0) {
            if (f(event)) {
                this.f309317m = 1;
                this.f309316l = j2;
                return;
            }
            return;
        }
        if (i == 1) {
            if (!f(event)) {
                this.f309317m = 0;
                this.f309316l = j2;
                return;
            } else {
                if (j2 - this.f309316l >= 200000000) {
                    this.f309317m = 2;
                    this.f309316l = j2;
                    return;
                }
                return;
            }
        }
        if (i == 2) {
            if (f(event)) {
                return;
            }
            this.o = 0L;
            this.f309318n = false;
            this.f309317m = 3;
            this.f309316l = j2;
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            if (e(event)) {
                this.f309319p++;
            }
            if (this.f309319p < 2) {
                if (j2 - this.f309316l >= 300000000) {
                    this.f309317m = 0;
                    this.f309316l = j2;
                    return;
                }
                return;
            }
            if (!this.f && (eVar = this.f309309j) != null) {
                eVar.invoke();
            }
            this.f309317m = 0;
            this.f309316l = j2;
            return;
        }
        if (f(event) && !this.f309318n) {
            long j3 = this.o;
            if (j3 == 0) {
                this.o = j2;
                return;
            } else {
                if (event.timestamp - j3 >= 200000000) {
                    this.f309317m = 2;
                    this.f309316l = j2;
                    return;
                }
                return;
            }
        }
        this.o = 0L;
        long j5 = this.f309316l;
        if (j2 - j5 >= 2000000000) {
            this.f309317m = 0;
            this.f309316l = j5;
            return;
        }
        float[] fArr = event.values;
        float f = fArr[0];
        if (fArr[2] <= -8.6f && Math.abs(f) <= 3.5f) {
            this.f309318n = true;
            return;
        }
        if (this.f309318n && e(event)) {
            if (j2 - this.f309316l < 200000000) {
                this.f309317m = 0;
                this.f309316l = j2;
            } else {
                this.f309319p = 1;
                this.f309317m = 4;
                this.f309316l = j2;
            }
        }
    }

    @Override // xw0.d
    public final void d() {
        long j2 = this.f309316l;
        this.f309317m = 0;
        this.f309316l = j2;
    }
}
