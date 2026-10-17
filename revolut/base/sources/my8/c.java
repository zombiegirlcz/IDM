package my8;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f210373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f210374b;

    public c(Bitmap bitmap, h metadata) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f210373a = bitmap;
        this.f210374b = metadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f210373a, cVar.f210373a) && Intrinsics.f(this.f210374b, cVar.f210374b);
    }

    public final int hashCode() {
        return this.f210374b.hashCode() + (this.f210373a.hashCode() * 31);
    }
}
