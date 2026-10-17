package uk5;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tk5.j f280687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f280688b;

    public b(tk5.j multichainInfoSheet, List list) {
        Intrinsics.checkNotNullParameter(multichainInfoSheet, "multichainInfoSheet");
        this.f280687a = multichainInfoSheet;
        this.f280688b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f280687a == bVar.f280687a && Intrinsics.f(this.f280688b, bVar.f280688b);
    }

    public final int hashCode() {
        int iHashCode = this.f280687a.hashCode() * 31;
        List list = this.f280688b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
