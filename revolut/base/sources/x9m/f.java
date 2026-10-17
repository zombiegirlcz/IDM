package x9m;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import org.jetbrains.annotations.NotNull;
import zsc.p;

/* JADX INFO: loaded from: classes17.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f303756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f303757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f303758c;
    public final d d;

    public f(d x3, d y2, d z, d w3) {
        Intrinsics.checkNotNullParameter(x3, "x");
        Intrinsics.checkNotNullParameter(y2, "y");
        Intrinsics.checkNotNullParameter(z, "z");
        Intrinsics.checkNotNullParameter(w3, "w");
        this.f303756a = x3;
        this.f303757b = y2;
        this.f303758c = z;
        this.d = w3;
    }

    public final d a(d v) {
        Intrinsics.checkNotNullParameter(v, "v");
        d dVar = this.f303756a;
        float f = dVar.f303753a;
        float f4 = v.f303753a;
        d dVar2 = this.f303757b;
        float f5 = dVar2.f303753a;
        float f6 = v.f303754b;
        float f32 = (f5 * f6) + (f * f4);
        d dVar3 = this.f303758c;
        float f35 = dVar3.f303753a;
        float f36 = v.f303755c;
        float f37 = (f35 * f36) + f32;
        d dVar4 = this.d;
        float f41 = dVar4.f303753a;
        float f42 = v.d;
        return new d((f41 * f42) + f37, (dVar4.f303754b * f42) + (dVar3.f303754b * f36) + (dVar2.f303754b * f6) + (dVar.f303754b * f4), (dVar4.f303755c * f42) + (dVar3.f303755c * f36) + (dVar2.f303755c * f6) + (dVar.f303755c * f4), (dVar4.d * f42) + (dVar3.d * f36) + (dVar2.d * f6) + (dVar.d * f4));
    }

    public final f b(f m3) {
        Intrinsics.checkNotNullParameter(m3, "m");
        d dVar = this.f303756a;
        float f = dVar.f303753a;
        d dVar2 = m3.f303756a;
        float f4 = dVar2.f303753a;
        d dVar3 = this.f303757b;
        float f5 = dVar3.f303753a;
        float f6 = dVar2.f303754b;
        d dVar4 = this.f303758c;
        float f32 = dVar4.f303753a;
        float f35 = dVar2.f303755c;
        float f36 = (f32 * f35) + (f5 * f6) + (f * f4);
        d dVar5 = this.d;
        float f37 = dVar5.f303753a;
        float f41 = dVar2.d;
        float f42 = (f37 * f41) + f36;
        float f57 = dVar.f303754b;
        float f69 = f57 * f4;
        float f75 = dVar3.f303754b;
        float f77 = (f75 * f6) + f69;
        float f81 = dVar4.f303754b;
        float f82 = (f81 * f35) + f77;
        float f93 = dVar5.f303754b;
        float f94 = dVar.f303755c;
        float f99 = f94 * f4;
        float f100 = dVar3.f303755c;
        float f101 = (f100 * f6) + f99;
        float f102 = dVar4.f303755c;
        float f103 = (f102 * f35) + f101;
        float f104 = dVar5.f303755c;
        float f105 = dVar.d;
        float f106 = dVar3.d;
        float f107 = (f6 * f106) + (f4 * f105);
        float f108 = dVar4.d;
        float f109 = dVar5.d;
        d dVar6 = new d(f42, (f93 * f41) + f82, (f104 * f41) + f103, (f41 * f109) + (f35 * f108) + f107);
        d dVar7 = m3.f303757b;
        float f110 = dVar7.f303753a;
        float f111 = dVar7.f303754b;
        float f112 = dVar7.f303755c;
        float f113 = (f32 * f112) + (f5 * f111) + (f * f110);
        float f114 = dVar7.d;
        float f115 = f112 * f108;
        float f116 = f114 * f109;
        d dVar8 = new d((f37 * f114) + f113, (f93 * f114) + (f81 * f112) + (f75 * f111) + (f57 * f110), (f104 * f114) + (f102 * f112) + (f100 * f111) + (f94 * f110), f116 + f115 + (f111 * f106) + (f110 * f105));
        d dVar9 = m3.f303758c;
        float f117 = dVar9.f303753a;
        float f118 = dVar9.f303754b;
        float f119 = dVar9.f303755c;
        float f120 = (f32 * f119) + (f5 * f118) + (f * f117);
        float f121 = dVar9.d;
        float f122 = (f37 * f121) + f120;
        float f123 = (f93 * f121) + (f81 * f119) + (f75 * f118) + (f57 * f117);
        float f124 = (f102 * f119) + (f100 * f118) + (f94 * f117);
        float f125 = f119 * f108;
        d dVar10 = new d(f122, f123, (f104 * f121) + f124, (f109 * f121) + f125 + (f118 * f106) + (f117 * f105));
        d dVar11 = m3.d;
        float f126 = dVar11.f303753a;
        float f127 = dVar11.f303754b;
        float f128 = dVar11.f303755c;
        float f129 = dVar11.d;
        return new f(dVar6, dVar8, dVar10, new d((f37 * f129) + (f32 * f128) + (f5 * f127) + (f * f126), (f93 * f129) + (f81 * f128) + (f75 * f127) + (f57 * f126), (f104 * f129) + (f102 * f128) + (f100 * f127) + (f94 * f126), (f109 * f129) + (f108 * f128) + (f106 * f127) + (f126 * f105)));
    }

    public final h c() {
        h hVar;
        Intrinsics.checkNotNullParameter(this, "m");
        d dVar = this.f303756a;
        float f = dVar.f303753a;
        d dVar2 = this.f303757b;
        float f4 = dVar2.f303754b;
        d dVar3 = this.f303758c;
        float f5 = dVar3.f303755c;
        if (f + f4 + f5 > BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = ((float) Math.sqrt(r4 + 1.0f)) * 2.0f;
            hVar = new h((dVar2.f303755c - dVar3.f303754b) / fSqrt, (dVar3.f303753a - dVar.f303755c) / fSqrt, (dVar.f303754b - dVar2.f303753a) / fSqrt, fSqrt * 0.25f);
        } else if (f > f4 && f > f5) {
            float fSqrt2 = ((float) Math.sqrt(((f + 1.0f) - f4) - f5)) * 2.0f;
            hVar = new h(0.25f * fSqrt2, (dVar2.f303753a + dVar.f303754b) / fSqrt2, (dVar3.f303753a + dVar.f303755c) / fSqrt2, (dVar2.f303755c - dVar3.f303754b) / fSqrt2);
        } else if (f4 > f5) {
            float fSqrt3 = ((float) Math.sqrt(((f4 + 1.0f) - f) - f5)) * 2.0f;
            hVar = new h((dVar2.f303753a + dVar.f303754b) / fSqrt3, 0.25f * fSqrt3, (dVar3.f303754b + dVar2.f303755c) / fSqrt3, (dVar3.f303753a - dVar.f303755c) / fSqrt3);
        } else {
            float fSqrt4 = ((float) Math.sqrt(((f5 + 1.0f) - f) - f4)) * 2.0f;
            hVar = new h((dVar3.f303753a + dVar.f303755c) / fSqrt4, (dVar3.f303754b + dVar2.f303755c) / fSqrt4, 0.25f * fSqrt4, (dVar.f303754b - dVar2.f303753a) / fSqrt4);
        }
        return a.a.v(hVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f303756a, fVar.f303756a) && Intrinsics.f(this.f303757b, fVar.f303757b) && Intrinsics.f(this.f303758c, fVar.f303758c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f303758c.hashCode() + ((this.f303757b.hashCode() + (this.f303756a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("\n            |");
        d dVar = this.f303756a;
        sb6.append(dVar.f303753a);
        sb6.append(p.SPACE_CHAR);
        d dVar2 = this.f303757b;
        sb6.append(dVar2.f303753a);
        sb6.append(p.SPACE_CHAR);
        d dVar3 = this.f303758c;
        sb6.append(dVar3.f303753a);
        sb6.append(p.SPACE_CHAR);
        d dVar4 = this.d;
        sb6.append(dVar4.f303753a);
        sb6.append("|\n            |");
        sb6.append(dVar.f303754b);
        sb6.append(p.SPACE_CHAR);
        sb6.append(dVar2.f303754b);
        sb6.append(p.SPACE_CHAR);
        sb6.append(dVar3.f303754b);
        sb6.append(p.SPACE_CHAR);
        sb6.append(dVar4.f303754b);
        sb6.append("|\n            |");
        sb6.append(dVar.f303755c);
        sb6.append(p.SPACE_CHAR);
        sb6.append(dVar2.f303755c);
        sb6.append(p.SPACE_CHAR);
        sb6.append(dVar3.f303755c);
        sb6.append(p.SPACE_CHAR);
        sb6.append(dVar4.f303755c);
        sb6.append("|\n            |");
        sb6.append(dVar.d);
        sb6.append(p.SPACE_CHAR);
        sb6.append(dVar2.d);
        sb6.append(p.SPACE_CHAR);
        sb6.append(dVar3.d);
        sb6.append(p.SPACE_CHAR);
        sb6.append(dVar4.d);
        sb6.append("|\n            ");
        return t.e(sb6.toString());
    }

    public /* synthetic */ f(d dVar, d dVar2, d dVar3, d dVar4, int i) {
        this((i & 1) != 0 ? new d(1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14) : dVar, (i & 2) != 0 ? new d(BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 13) : dVar2, (i & 4) != 0 ? new d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 11) : dVar3, (i & 8) != 0 ? new d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 7) : dVar4);
    }

    public f(c right, c up6, c forward) {
        c position = new c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 7);
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(up6, "up");
        Intrinsics.checkNotNullParameter(forward, "forward");
        Intrinsics.checkNotNullParameter(position, "position");
        this(new d(right, BitmapDescriptorFactory.HUE_RED), new d(up6, BitmapDescriptorFactory.HUE_RED), new d(forward, BitmapDescriptorFactory.HUE_RED), new d(position, 1.0f));
    }
}
