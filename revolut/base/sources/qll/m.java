package qll;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f247592a;

    public m() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f247592a, ((m) obj2).f247592a);
    }

    public final int hashCode() {
        p pVar = this.f247592a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }

    public m(p pVar) {
        this.f247592a = pVar;
    }
}
