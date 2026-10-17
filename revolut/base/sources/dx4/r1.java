package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f120740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f120741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f120742c;

    public r1(a1 icon, q1 position, s1 style) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f120740a = icon;
        this.f120741b = position;
        this.f120742c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return this.f120740a == r1Var.f120740a && this.f120741b == r1Var.f120741b && this.f120742c == r1Var.f120742c;
    }

    public final int hashCode() {
        return this.f120742c.hashCode() + ((this.f120741b.hashCode() + (this.f120740a.hashCode() * 31)) * 31);
    }
}
