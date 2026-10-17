package x33;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f302637b;

    public d(List pockets, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        this.f302636a = pockets;
        this.f302637b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f302636a, dVar.f302636a) && Intrinsics.f(this.f302637b, dVar.f302637b);
    }

    public final int hashCode() {
        int iHashCode = this.f302636a.hashCode() * 31;
        dj0.d dVar = this.f302637b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
