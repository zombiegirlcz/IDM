package st1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7l.c f265436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f265437b;

    public c(e7l.c cVar, List counterLimits) {
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        this.f265436a = cVar;
        this.f265437b = counterLimits;
    }

    public static c a(c cVar, e7l.c cVar2, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            cVar2 = cVar.f265436a;
        }
        List counterLimits = arrayList;
        if ((i & 2) != 0) {
            counterLimits = cVar.f265437b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        return new c(cVar2, counterLimits);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f265436a, cVar.f265436a) && Intrinsics.f(this.f265437b, cVar.f265437b);
    }

    public final int hashCode() {
        e7l.c cVar = this.f265436a;
        return this.f265437b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }
}
