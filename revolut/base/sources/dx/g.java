package dx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g implements h, xv.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f120499a;

    public g(Iterable validationResults) {
        Intrinsics.checkNotNullParameter(validationResults, "validationResults");
        e rawResult = e.f120496a;
        Intrinsics.checkNotNullParameter(rawResult, "rawResult");
        this.f120499a = validationResults;
    }

    @Override // xv.l
    public final Iterable a() {
        return this.f120499a;
    }

    @Override // xv.l
    public final xv.n b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g) || !Intrinsics.f(this.f120499a, ((g) obj2).f120499a)) {
            return false;
        }
        Object obj3 = e.f120496a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return (e.f120496a.hashCode() + (this.f120499a.hashCode() * 31)) * 31;
    }
}
