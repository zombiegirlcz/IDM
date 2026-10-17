package zr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f324606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f324607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f324608c;

    public c(Boolean bool, h hVar, b bVar) {
        this.f324606a = bool;
        this.f324607b = hVar;
        this.f324608c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f324606a, cVar.f324606a) && this.f324607b == cVar.f324607b && this.f324608c == cVar.f324608c;
    }

    public final int hashCode() {
        Boolean bool = this.f324606a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        h hVar = this.f324607b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        b bVar = this.f324608c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
