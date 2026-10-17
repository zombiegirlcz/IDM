package xsh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f308493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f308494b;

    public d(List entries, int i) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f308493a = entries;
        this.f308494b = i;
    }

    public static d a(d dVar, ArrayList arrayList, int i, int i2) {
        List entries = arrayList;
        if ((i2 & 1) != 0) {
            entries = dVar.f308493a;
        }
        if ((i2 & 2) != 0) {
            i = dVar.f308494b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new d(entries, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f308493a, dVar.f308493a) && this.f308494b == dVar.f308494b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f308494b) + (this.f308493a.hashCode() * 31);
    }
}
