package abm;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f2999c;

    public h(byte[] encodedImage, int i) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.f2997a = encodedImage;
        this.f2998b = i;
        this.f2999c = yhm.j.b(new f(this, 1));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!h.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type io.fotoapparat.result.Photo");
        h hVar = (h) obj2;
        return Arrays.equals(this.f2997a, hVar.f2997a) && this.f2998b == hVar.f2998b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f2997a) * 31) + this.f2998b;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Photo(encodedImage=ByteArray(");
        sb6.append(this.f2997a.length);
        sb6.append(") rotationDegrees=");
        return j6.a.t(sb6, this.f2998b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
