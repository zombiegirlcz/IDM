package rz;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f258447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258448b;

    public h(int i, List args) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.f258447a = i;
        this.f258448b = args;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f258447a == hVar.f258447a && Intrinsics.f(this.f258448b, hVar.f258448b);
    }

    public final int hashCode() {
        return this.f258448b.hashCode() + (Integer.hashCode(this.f258447a) * 31);
    }

    public h(int i) {
        this(i, f0.f322471a);
    }
}
