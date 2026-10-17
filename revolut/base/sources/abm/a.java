package abm;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f2989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2990b;

    public a(Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f2989a = bitmap;
        this.f2990b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f2989a, aVar.f2989a) && this.f2990b == aVar.f2990b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2990b) + (this.f2989a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("BitmapPhoto(bitmap=");
        sb6.append(this.f2989a);
        sb6.append(", rotationDegrees=");
        return j6.a.t(sb6, this.f2990b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
