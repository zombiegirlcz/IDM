package mx0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ra implements ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f209977a;

    public ra(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f209977a = bitmap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ra) && Intrinsics.f(this.f209977a, ((ra) obj2).f209977a);
    }

    public final int hashCode() {
        return this.f209977a.hashCode();
    }
}
