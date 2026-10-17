package ms0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f208342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f208343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f208344c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f208345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f208346h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final uw0.i f208347j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f208348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f208349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f208350n;

    public o1(float f, float f4, float f5, int i, int i2, int i3, int i5, float f6, long j2, uw0.i iVar, boolean z, float f32, float f35, boolean z3, int i6) {
        f4 = (i6 & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f4;
        i2 = (i6 & 16) != 0 ? R$attr.uikit_colorGreyTone50 : i2;
        long j3 = (i6 & 256) != 0 ? 0L : j2;
        uw0.i iVar2 = (i6 & 512) != 0 ? null : iVar;
        float f36 = (i6 & 2048) != 0 ? 288.0f : f32;
        float f37 = (i6 & 4096) != 0 ? 90.0f : f35;
        boolean z4 = (i6 & 8192) != 0 ? false : z3;
        this.f208342a = f;
        this.f208343b = f4;
        this.f208344c = f5;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f208345g = i5;
        this.f208346h = f6;
        this.i = j3;
        this.f208347j = iVar2;
        this.k = z;
        this.f208348l = f36;
        this.f208349m = f37;
        this.f208350n = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Float.compare(this.f208342a, o1Var.f208342a) == 0 && Float.compare(this.f208343b, o1Var.f208343b) == 0 && Float.compare(this.f208344c, o1Var.f208344c) == 0 && this.d == o1Var.d && this.e == o1Var.e && this.f == o1Var.f && this.f208345g == o1Var.f208345g && Float.compare(this.f208346h, o1Var.f208346h) == 0 && this.i == o1Var.i && Intrinsics.f(this.f208347j, o1Var.f208347j) && this.k == o1Var.k && Float.compare(this.f208348l, o1Var.f208348l) == 0 && Float.compare(this.f208349m, o1Var.f208349m) == 0 && this.f208350n == o1Var.f208350n;
    }

    public final int hashCode() {
        int iC = a0.d.c(m72.b.b(this.f208346h, j6.a.b(this.f208345g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, m72.b.b(this.f208344c, m72.b.b(this.f208343b, Float.hashCode(this.f208342a) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i);
        uw0.i iVar = this.f208347j;
        return Boolean.hashCode(this.f208350n) + m72.b.b(this.f208349m, m72.b.b(this.f208348l, j6.a.c((iC + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.k), 31), 31);
    }
}
