package cxe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f109938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f109939b;

    public d(dj0.d paidFromMainPocket, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(paidFromMainPocket, "paidFromMainPocket");
        this.f109938a = paidFromMainPocket;
        this.f109939b = dVar;
    }

    public static d a(d dVar, dj0.d paidFromMainPocket) {
        dj0.d dVar2 = dVar.f109939b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(paidFromMainPocket, "paidFromMainPocket");
        return new d(paidFromMainPocket, dVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f109938a, dVar.f109938a) && Intrinsics.f(this.f109939b, dVar.f109939b);
    }

    public final int hashCode() {
        int iHashCode = this.f109938a.hashCode() * 31;
        dj0.d dVar = this.f109939b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
