package xw0;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f309296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f309297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f309298n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f309299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f309300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f309301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f309302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f309303t;
    public final float[] u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, 1, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.u = new float[3];
    }

    public static boolean e(float[] fArr) {
        return Math.abs(fArr[0]) <= 3.5f && fArr[1] > BitmapDescriptorFactory.HUE_RED && fArr[2] > BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x015f  */
    @Override // xw0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.hardware.SensorEvent r26) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xw0.b.b(android.hardware.SensorEvent):void");
    }

    @Override // xw0.d
    public final void d() {
        this.v = 0L;
        long j2 = this.f309296l;
        this.f309297m = 0;
        this.f309296l = j2;
    }
}
