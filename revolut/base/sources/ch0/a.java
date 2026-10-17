package ch0;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f24097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24099c;
    public final int d;
    public final int e;

    public a(ByteBuffer byteBuffer, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        this.f24097a = byteBuffer;
        this.f24098b = i;
        this.f24099c = i2;
        this.d = i3;
        this.e = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f24097a, aVar.f24097a) && this.f24098b == aVar.f24098b && this.f24099c == aVar.f24099c && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f24099c, j6.a.b(this.f24098b, this.f24097a.hashCode() * 31, 31), 31), 31);
    }
}
