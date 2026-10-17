package to0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f272490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f272491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f272492c;
    public final Bitmap d;

    public e(int i, int i2, int i3, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f272490a = i;
        this.f272491b = i2;
        this.f272492c = i3;
        this.d = bitmap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f272490a == eVar.f272490a && this.f272491b == eVar.f272491b && this.f272492c == eVar.f272492c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f272492c, j6.a.b(this.f272491b, Integer.hashCode(this.f272490a) * 31, 31), 31);
    }
}
