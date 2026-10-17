package dx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements xv.l, xv.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f120511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f120512b;

    public q(Iterable validationResults, o rawResult) {
        Intrinsics.checkNotNullParameter(validationResults, "validationResults");
        Intrinsics.checkNotNullParameter(rawResult, "rawResult");
        this.f120511a = validationResults;
        this.f120512b = rawResult;
    }

    @Override // xv.l
    public final Iterable a() {
        return this.f120511a;
    }

    @Override // xv.l
    public final xv.n b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f120511a, qVar.f120511a) && Intrinsics.f(this.f120512b, qVar.f120512b);
    }

    public final int hashCode() {
        return (this.f120512b.f120508a.hashCode() + (this.f120511a.hashCode() * 31)) * 31;
    }
}
