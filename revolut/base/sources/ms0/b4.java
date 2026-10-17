package ms0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b4 extends d4 {
    public final float d;
    public final float e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aw0.h3 f208192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uw0.i f208193h;
    public final boolean i;

    public b4(float f, float f4, long j2, aw0.h3 h3Var, uw0.i iVar, boolean z) {
        super(R$attr.internal_textAppearanceHeading2, 8.0f, 8.0f);
        this.d = f;
        this.e = f4;
        this.f = j2;
        this.f208192g = h3Var;
        this.f208193h = iVar;
        this.i = z;
    }

    @Override // ms0.d4
    public final long a() {
        return this.f;
    }

    @Override // ms0.d4
    public final uw0.i b() {
        return this.f208193h;
    }

    @Override // ms0.d4
    public final aw0.h3 c() {
        return this.f208192g;
    }

    @Override // ms0.d4
    public final float d() {
        return this.d;
    }

    @Override // ms0.d4
    public final float e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Float.compare(this.d, b4Var.d) == 0 && Float.compare(this.e, b4Var.e) == 0 && this.f == b4Var.f && this.f208192g.equals(b4Var.f208192g) && Float.compare(8.0f, 8.0f) == 0 && Intrinsics.f(this.f208193h, b4Var.f208193h) && this.i == b4Var.i;
    }

    @Override // ms0.d4
    public final boolean f() {
        return false;
    }

    @Override // ms0.d4
    public final boolean g() {
        return this.i;
    }

    public final int hashCode() {
        int iB = m72.b.b(8.0f, (this.f208192g.hashCode() + j6.a.c(a0.d.c(m72.b.b(this.e, Float.hashCode(this.d) * 31, 31), 31, this.f), 31, false)) * 31, 31);
        uw0.i iVar = this.f208193h;
        return Boolean.hashCode(this.i) + ((iB + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
