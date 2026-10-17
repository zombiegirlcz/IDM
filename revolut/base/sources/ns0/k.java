package ns0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f218703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f218704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f218705c;
    public boolean d;
    public boolean e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f218706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f218707h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f218708j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f218709l;

    public k() {
        this(0);
    }

    public k(int i) {
        l animationType = l.Move;
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        this.f218703a = BitmapDescriptorFactory.HUE_RED;
        this.f218704b = BitmapDescriptorFactory.HUE_RED;
        this.f218705c = animationType;
        this.d = false;
        this.e = false;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.f218706g = BitmapDescriptorFactory.HUE_RED;
        this.f218707h = 1.0f;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.f218708j = 1.0f;
        this.k = 1.0f;
        this.f218709l = BitmapDescriptorFactory.HUE_RED;
    }
}
