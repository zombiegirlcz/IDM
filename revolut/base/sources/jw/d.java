package jw;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k65.d f178904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f178905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f178906c;
    public c d;
    public boolean e;

    public d(k65.d onSample) {
        Intrinsics.checkNotNullParameter(onSample, "onSample");
        this.f178904a = onSample;
    }

    public static c a(float[] fArr) {
        int length = fArr.length;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f4 = length > 0 ? fArr[0] : 0.0f;
        float f5 = 1 < fArr.length ? fArr[1] : 0.0f;
        if (2 < fArr.length) {
            f = fArr[2];
        }
        return new c(f4, f5, f);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (sensor == null || sensor.getType() != 11) {
            return;
        }
        this.e = i == 0;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        b bVar;
        c cVar;
        c cVar2;
        Intrinsics.checkNotNullParameter(event, "event");
        int type = event.sensor.getType();
        if (type == 4) {
            long j2 = event.timestamp;
            float[] values = event.values;
            Intrinsics.checkNotNullExpressionValue(values, "values");
            c cVarA = a(values);
            if (this.e || (bVar = this.f178905b) == null || (cVar = this.f178906c) == null || (cVar2 = this.d) == null) {
                return;
            }
            this.f178904a.invoke(new f(j2, bVar.f178898a, bVar.f178899b, bVar.f178900c, bVar.d, cVarA.f178901a, cVarA.f178902b, cVarA.f178903c, cVar.f178901a, cVar.f178902b, cVar.f178903c, cVar2.f178901a, cVar2.f178902b, cVar2.f178903c));
            return;
        }
        switch (type) {
            case 9:
                float[] values2 = event.values;
                Intrinsics.checkNotNullExpressionValue(values2, "values");
                this.d = a(values2);
                break;
            case 10:
                float[] values3 = event.values;
                Intrinsics.checkNotNullExpressionValue(values3, "values");
                this.f178906c = a(values3);
                break;
            case 11:
                float[] values4 = event.values;
                Intrinsics.checkNotNullExpressionValue(values4, "values");
                float[] fArr = new float[4];
                SensorManager.getQuaternionFromVector(fArr, values4);
                this.f178905b = new b(fArr[1], fArr[2], fArr[3], fArr[0]);
                break;
        }
    }
}
