package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10606a;

    public x6(List colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f10606a = colors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x6) && Intrinsics.f(this.f10606a, ((x6) obj2).f10606a);
    }

    public final int hashCode() {
        return this.f10606a.hashCode();
    }
}
