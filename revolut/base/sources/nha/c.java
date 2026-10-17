package nha;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f215392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f215393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f215394c;

    public c(a aVar, d dVar, e eVar) {
        this.f215392a = aVar;
        this.f215393b = dVar;
        this.f215394c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f215392a == cVar.f215392a && Intrinsics.f(this.f215393b, cVar.f215393b) && Intrinsics.f(this.f215394c, cVar.f215394c);
    }

    public final int hashCode() {
        a aVar = this.f215392a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        d dVar = this.f215393b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.f215394c;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }
}
