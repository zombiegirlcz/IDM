package ud;

import ao.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f279059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f279060b;

    public c(AppMeasurementSdk appMeasurementSdk, h hVar) {
        this.f279060b = hVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new b(this));
        this.f279059a = new HashSet();
    }
}
