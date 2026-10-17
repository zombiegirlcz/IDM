package q6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f242560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f242561c;

    public q(String name, long j2, p pVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f242559a = name;
        this.f242560b = j2;
        this.f242561c = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f242559a, qVar.f242559a) && this.f242560b == qVar.f242560b && this.f242561c == qVar.f242561c;
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f242559a.hashCode() * 31, 31, this.f242560b);
        p pVar = this.f242561c;
        return iC + (pVar == null ? 0 : pVar.hashCode());
    }
}
