package hr0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f154748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f154749b = 1;

    public a(Object obj2) {
        this.f154748a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f154748a, aVar.f154748a) && this.f154749b == aVar.f154749b;
    }

    public final int hashCode() {
        Object obj2 = this.f154748a;
        return Integer.hashCode(this.f154749b) + ((obj2 == null ? 0 : obj2.hashCode()) * 31);
    }
}
