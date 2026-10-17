package t3i;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f267788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f267789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f267790c;

    public d(Bitmap bitmap, c type, boolean z) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f267788a = bitmap;
        this.f267789b = type;
        this.f267790c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f267788a, dVar.f267788a) && this.f267789b == dVar.f267789b && this.f267790c == dVar.f267790c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267790c) + ((this.f267789b.hashCode() + (this.f267788a.hashCode() * 31)) * 31);
    }
}
