package yf1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.c f313130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f313131b;

    public q(qf1.c cVar, aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f313130a = cVar;
        this.f313131b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f313130a == qVar.f313130a && Intrinsics.f(this.f313131b, qVar.f313131b);
    }

    public final int hashCode() {
        qf1.c cVar = this.f313130a;
        return this.f313131b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }
}
