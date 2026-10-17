package ll6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f196585a;

    public f() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f196585a, ((f) obj2).f196585a);
    }

    public final int hashCode() {
        e eVar = this.f196585a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public f(e eVar) {
        this.f196585a = eVar;
    }
}
