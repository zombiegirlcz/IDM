package fr0;

import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f137359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f137360b;

    public k(Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f137359a = path;
        this.f137360b = paint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f137359a, kVar.f137359a) && Intrinsics.f(this.f137360b, kVar.f137360b);
    }

    public final int hashCode() {
        return this.f137360b.hashCode() + (this.f137359a.hashCode() * 31);
    }
}
