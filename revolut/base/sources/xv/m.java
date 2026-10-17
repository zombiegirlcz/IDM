package xv;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f309127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f309128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f309129c;
    public final int d;

    public m(ByteBuffer byteBuffer, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        this.f309127a = byteBuffer;
        this.f309128b = i;
        this.f309129c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f309127a, mVar.f309127a) && this.f309128b == mVar.f309128b && this.f309129c == mVar.f309129c && this.d == mVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f309129c, j6.a.b(this.f309128b, this.f309127a.hashCode() * 31, 31), 31);
    }
}
