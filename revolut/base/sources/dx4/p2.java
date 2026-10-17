package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2 f120710b;

    public p2(String text, o2 style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f120709a = text;
        this.f120710b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f120709a, p2Var.f120709a) && this.f120710b == p2Var.f120710b;
    }

    public final int hashCode() {
        return this.f120710b.hashCode() + (this.f120709a.hashCode() * 31);
    }
}
