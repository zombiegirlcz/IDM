package rsc;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f257048b;

    public a(String name, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f257047a = name;
        this.f257048b = bitmap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f257047a, aVar.f257047a) && Intrinsics.f(this.f257048b, aVar.f257048b);
    }

    public final int hashCode() {
        return this.f257048b.hashCode() + (this.f257047a.hashCode() * 31);
    }
}
