package mx0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class sa implements ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f210000a;

    public sa(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f210000a = bitmap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof sa) && Intrinsics.f(this.f210000a, ((sa) obj2).f210000a);
    }

    public final int hashCode() {
        return this.f210000a.hashCode();
    }
}
