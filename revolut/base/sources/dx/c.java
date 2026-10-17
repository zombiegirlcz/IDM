package dx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements d, xv.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f120493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f120494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv.n f120495c;

    public c(Iterable validationResults, a rawResult, xv.n nVar) {
        Intrinsics.checkNotNullParameter(validationResults, "validationResults");
        Intrinsics.checkNotNullParameter(rawResult, "rawResult");
        this.f120493a = validationResults;
        this.f120494b = rawResult;
        this.f120495c = nVar;
    }

    @Override // xv.l
    public final Iterable a() {
        return this.f120493a;
    }

    @Override // xv.l
    public final xv.n b() {
        return this.f120495c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f120493a, cVar.f120493a) && Intrinsics.f(this.f120494b, cVar.f120494b) && Intrinsics.f(this.f120495c, cVar.f120495c);
    }

    public final int hashCode() {
        int iHashCode = (this.f120494b.f120490a.hashCode() + (this.f120493a.hashCode() * 31)) * 31;
        xv.n nVar = this.f120495c;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
