package ec5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f124432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f124433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f124434c;
    public final h d;

    public c(j status, boolean z, d dVar, h hVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f124432a = status;
        this.f124433b = z;
        this.f124434c = dVar;
        this.d = hVar;
    }

    public final boolean a() {
        return this.d != null && b();
    }

    public final boolean b() {
        j jVar = j.STARTED;
        j jVar2 = this.f124432a;
        return (jVar2 == jVar || jVar2 == j.ACCEPTED || jVar2 == j.RENEW) && this.f124433b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f124432a == cVar.f124432a && this.f124433b == cVar.f124433b && Intrinsics.f(this.f124434c, cVar.f124434c) && this.d == cVar.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f124432a.hashCode() * 31, 31, this.f124433b);
        d dVar = this.f124434c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        h hVar = this.d;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }
}
