package jfh;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.g f173875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173876b;

    public d(d1h.g disclaimers, List list) {
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f173875a = disclaimers;
        this.f173876b = list;
    }

    public static d a(d dVar, d1h.g disclaimers, List list, int i) {
        if ((i & 1) != 0) {
            disclaimers = dVar.f173875a;
        }
        if ((i & 2) != 0) {
            list = dVar.f173876b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        return new d(disclaimers, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f173875a, dVar.f173875a) && Intrinsics.f(this.f173876b, dVar.f173876b);
    }

    public final int hashCode() {
        int iHashCode = this.f173875a.hashCode() * 31;
        List list = this.f173876b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
