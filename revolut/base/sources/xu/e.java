package xu;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f308845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv.c f308846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f308847c;

    public e(byte[] bytes, bv.c size, int i) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f308845a = bytes;
        this.f308846b = size;
        this.f308847c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!e.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.camera.BytesFrame");
        e eVar = (e) obj2;
        return Arrays.equals(this.f308845a, eVar.f308845a) && this.f308846b.equals(eVar.f308846b) && this.f308847c == eVar.f308847c;
    }

    public final int hashCode() {
        return ((this.f308846b.hashCode() + (Arrays.hashCode(this.f308845a) * 31)) * 31) + this.f308847c;
    }
}
