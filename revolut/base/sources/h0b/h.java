package h0b;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1b.e f148346a;

    public h(d1b.e style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f148346a = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f148346a == ((h) obj2).f148346a;
    }

    public final int hashCode() {
        return this.f148346a.hashCode();
    }
}
