package e10;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f121834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121836c;

    public q(ByteBuffer image, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f121834a = image;
        this.f121835b = i;
        this.f121836c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f121834a, qVar.f121834a) && this.f121835b == qVar.f121835b && this.f121836c == qVar.f121836c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121836c) + j6.a.b(this.f121835b, this.f121834a.hashCode() * 31, 31);
    }
}
