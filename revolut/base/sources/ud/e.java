package ud;

import ao.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f279062a;

    public e(AppMeasurementSdk appMeasurementSdk, h hVar) {
        this.f279062a = hVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new d(this));
    }
}
