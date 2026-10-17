package p8k;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f234162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f234163b;

    public d(List counterLimits, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        this.f234162a = counterLimits;
        this.f234163b = dVar;
    }

    public static d a(d dVar, ArrayList arrayList, dj0.d dVar2, int i) {
        List counterLimits = arrayList;
        if ((i & 1) != 0) {
            counterLimits = dVar.f234162a;
        }
        if ((i & 2) != 0) {
            dVar2 = dVar.f234163b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        return new d(counterLimits, dVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f234162a, dVar.f234162a) && Intrinsics.f(this.f234163b, dVar.f234163b);
    }

    public final int hashCode() {
        int iHashCode = this.f234162a.hashCode() * 31;
        dj0.d dVar = this.f234163b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
