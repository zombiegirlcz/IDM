package xf5;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f304778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f304779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f304780c;

    public /* synthetic */ d(int i, dj0.d dVar, dj0.d dVar2, double d) {
        if (7 != (i & 7)) {
            j1.f(b.f304777a.getDescriptor(), i, 7);
            throw null;
        }
        this.f304778a = dVar;
        this.f304779b = dVar2;
        this.f304780c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f304778a, dVar.f304778a) && Intrinsics.f(this.f304779b, dVar.f304779b) && Double.compare(this.f304780c, dVar.f304780c) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f304778a.hashCode() * 31;
        dj0.d dVar = this.f304779b;
        return Double.hashCode(this.f304780c) + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    public d(dj0.d from, dj0.d dVar, double d) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f304778a = from;
        this.f304779b = dVar;
        this.f304780c = d;
    }
}
