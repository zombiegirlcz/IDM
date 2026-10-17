package xeg;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f304656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f304657c;
    public final double d;
    public final int e;
    public final double f;

    public /* synthetic */ d(int i, String str, long j2, long j3, double d, int i2, double d5) {
        if (63 != (i & 63)) {
            j1.f(b.f304654a.getDescriptor(), i, 63);
            throw null;
        }
        this.f304655a = str;
        this.f304656b = j2;
        this.f304657c = j3;
        this.d = d;
        this.e = i2;
        this.f = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f304655a, dVar.f304655a) && this.f304656b == dVar.f304656b && this.f304657c == dVar.f304657c && Double.compare(this.d, dVar.d) == 0 && this.e == dVar.e && Double.compare(this.f, dVar.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + j6.a.b(this.e, m72.b.c(a0.d.c(a0.d.c(this.f304655a.hashCode() * 31, 31, this.f304656b), 31, this.f304657c), this.d, 31), 31);
    }

    public d(String propertyId, long j2, long j3, double d, int i, double d5) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f304655a = propertyId;
        this.f304656b = j2;
        this.f304657c = j3;
        this.d = d;
        this.e = i;
        this.f = d5;
    }
}
