package au0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9193c;
    public final float d;
    public final boolean e;
    public final n2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o2 f9194g;

    public f(List parts, int i, int i2, float f, boolean z, n2 onClick, o2 onLongClick) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
        this.f9191a = parts;
        this.f9192b = i;
        this.f9193c = i2;
        this.d = f;
        this.e = z;
        this.f = onClick;
        this.f9194g = onLongClick;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f9191a, fVar.f9191a) && this.f9192b == fVar.f9192b && this.f9193c == fVar.f9193c && Float.compare(this.d, fVar.d) == 0 && this.e == fVar.e && this.f.equals(fVar.f) && this.f9194g.equals(fVar.f9194g);
    }

    public final int hashCode() {
        return this.f9194g.hashCode() + ((this.f.hashCode() + j6.a.c(m72.b.b(this.d, j6.a.b(this.f9193c, j6.a.b(this.f9192b, this.f9191a.hashCode() * 31, 31), 31), 31), 31, this.e)) * 31);
    }
}
