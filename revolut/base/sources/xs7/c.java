package xs7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f308429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f308430b;

    public c(e eVar, b bVar) {
        this.f308429a = eVar;
        this.f308430b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f308429a, cVar.f308429a) && Intrinsics.f(this.f308430b, cVar.f308430b);
    }

    public final int hashCode() {
        e eVar = this.f308429a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        b bVar = this.f308430b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
