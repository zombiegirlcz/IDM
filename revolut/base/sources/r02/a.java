package r02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f250679a;

    public a(g gVar) {
        Intrinsics.checkNotNullParameter("UPI", "method");
        this.f250679a = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f250679a.equals(((a) obj2).f250679a);
    }

    public final int hashCode() {
        return (this.f250679a.hashCode() * 31) + 84238;
    }
}
