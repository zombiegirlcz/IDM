package h2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f148857a;

    public b(dj0.d savings) {
        Intrinsics.checkNotNullParameter(savings, "savings");
        this.f148857a = savings;
    }

    @Override // h2k.c
    public final dj0.d a() {
        return this.f148857a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f148857a, ((b) obj2).f148857a);
    }

    public final int hashCode() {
        return this.f148857a.hashCode();
    }
}
