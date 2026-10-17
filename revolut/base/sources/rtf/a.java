package rtf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f257226a;

    public a(krf.c cVar) {
        this.f257226a = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f257226a, ((a) obj2).f257226a);
    }

    public final int hashCode() {
        krf.c cVar = this.f257226a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}
