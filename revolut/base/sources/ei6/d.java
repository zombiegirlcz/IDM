package ei6;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f126447b;

    public d(String name, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f126446a = name;
        this.f126447b = bitmap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f126446a, dVar.f126446a) && Intrinsics.f(this.f126447b, dVar.f126447b);
    }

    public final int hashCode() {
        int iHashCode = this.f126446a.hashCode() * 31;
        Bitmap bitmap = this.f126447b;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }
}
