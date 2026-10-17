package v4e;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f286039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f286040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f286041c;
    public final double d;

    public d(long j2, long j3, long j5) {
        this.f286039a = j2;
        this.f286040b = j3;
        this.f286041c = j5;
        this.d = Math.max((j3 - j2) / (j5 - j2), 0.7d);
    }

    public final float a(long j2) {
        if (j2 <= this.f286039a) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (j2 >= this.f286041c) {
            return 1.0f;
        }
        long j3 = this.f286040b;
        double d = this.d;
        return j2 <= j3 ? (float) ((d * (j2 - r0)) / (j3 - r0)) : (float) ((((1.0d - d) * (j2 - j3)) / (r2 - j3)) + d);
    }
}
