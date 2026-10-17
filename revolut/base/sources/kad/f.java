package kad;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f182465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182466b;

    public f(Bitmap bitmap, String fileName) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f182465a = bitmap;
        this.f182466b = fileName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f182465a, fVar.f182465a) && Intrinsics.f(this.f182466b, fVar.f182466b);
    }

    public final int hashCode() {
        return this.f182466b.hashCode() + (this.f182465a.hashCode() * 31);
    }
}
