package gok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f145186b;

    public d(String str, e eVar) {
        this.f145185a = str;
        this.f145186b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f145185a, dVar.f145185a) && Intrinsics.f(this.f145186b, dVar.f145186b);
    }

    public final int hashCode() {
        String str = this.f145185a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        e eVar = this.f145186b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
