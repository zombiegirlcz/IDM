package mv2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t61.g f209094b;

    public c(String code, t61.g gVar) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f209093a = code;
        this.f209094b = gVar;
    }

    public static c a(c cVar, String code, t61.g gVar, int i) {
        if ((i & 1) != 0) {
            code = cVar.f209093a;
        }
        if ((i & 2) != 0) {
            gVar = cVar.f209094b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        return new c(code, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f209093a, cVar.f209093a) && Intrinsics.f(this.f209094b, cVar.f209094b);
    }

    public final int hashCode() {
        int iHashCode = this.f209093a.hashCode() * 31;
        t61.g gVar = this.f209094b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
