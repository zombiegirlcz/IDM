package xv;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f309137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f309138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f309139c;
    public final int d;
    public final int e;

    public t(byte[] bytes, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f309137a = bytes;
        this.f309138b = i;
        this.f309139c = i2;
        this.d = i3;
        this.e = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f309137a, tVar.f309137a) && this.f309138b == tVar.f309138b && this.f309139c == tVar.f309139c && this.d == tVar.d && this.e == tVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f309139c, j6.a.b(this.f309138b, Arrays.hashCode(this.f309137a) * 31, 31), 31), 31);
    }
}
