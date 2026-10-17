package fd0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f133848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f133849b;

    public a(c cVar, Object obj2) {
        this.f133848a = cVar;
        this.f133849b = obj2;
    }

    public final Object a() {
        return this.f133848a;
    }

    public final Object b() {
        return this.f133849b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f133848a, aVar.f133848a) && Intrinsics.f(this.f133849b, aVar.f133849b);
    }

    public final int hashCode() {
        Object obj2 = this.f133848a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f133849b;
        return iHashCode + (obj3 != null ? obj3.hashCode() : 0);
    }
}
