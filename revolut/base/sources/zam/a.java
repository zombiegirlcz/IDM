package zam;

import ch.qos.logback.core.CoreConstants;
import ehe.n;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import uam.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f320746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f320747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f320748c;

    public a(i size, byte[] image, int i) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f320746a = size;
        this.f320747b = image;
        this.f320748c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!a.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type io.fotoapparat.preview.Frame");
        a aVar = (a) obj2;
        return Intrinsics.f(this.f320746a, aVar.f320746a) && Arrays.equals(this.f320747b, aVar.f320747b) && this.f320748c == aVar.f320748c;
    }

    public final int hashCode() {
        return n.b(this.f320746a.hashCode() * 31, 31, this.f320747b) + this.f320748c;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Frame{size=");
        sb6.append(this.f320746a);
        sb6.append(", image= array(");
        sb6.append(this.f320747b.length);
        sb6.append("), rotation=");
        return j6.a.t(sb6, this.f320748c, CoreConstants.CURLY_RIGHT);
    }
}
