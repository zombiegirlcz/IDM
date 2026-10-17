package pql;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f238810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238811b;

    public b(Throwable exception, String str) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f238810a = exception;
        this.f238811b = str;
    }

    public final String a() {
        return this.f238811b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f238810a, bVar.f238810a) && Intrinsics.f(this.f238811b, bVar.f238811b);
    }

    public final int hashCode() {
        int iHashCode = this.f238810a.hashCode() * 31;
        String str = this.f238811b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
