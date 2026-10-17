package or6;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f228066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f228067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f228068c;
    public final a d;

    public c(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f228066a = aVar;
        this.f228067b = aVar2;
        this.f228068c = aVar3;
        this.d = aVar4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f228066a == cVar.f228066a && this.f228067b == cVar.f228067b && this.f228068c == cVar.f228068c && this.d == cVar.d;
    }

    public final int hashCode() {
        a aVar = this.f228066a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.f228067b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.f228068c;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.d;
        return iHashCode3 + (aVar4 != null ? aVar4.hashCode() : 0);
    }
}
