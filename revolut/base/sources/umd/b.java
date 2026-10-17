package umd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f281283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f281284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f281285c;

    public b(i3 category, dj0.d allocated, dj0.d spent) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(allocated, "allocated");
        Intrinsics.checkNotNullParameter(spent, "spent");
        this.f281283a = category;
        this.f281284b = allocated;
        this.f281285c = spent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f281283a, bVar.f281283a) && Intrinsics.f(this.f281284b, bVar.f281284b) && Intrinsics.f(this.f281285c, bVar.f281285c);
    }

    public final int hashCode() {
        return this.f281285c.hashCode() + v7.c(this.f281283a.hashCode() * 31, 31, this.f281284b);
    }
}
