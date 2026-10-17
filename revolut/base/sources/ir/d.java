package ir;

import ip0.e70;
import java.util.List;
import jr.e0;
import jr.p;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f167915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f167916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f167917c;

    static {
        k kVar = k.PUBLICATION;
        d = new Lazy[]{j.c(kVar, new e70(27)), j.c(kVar, new e70(28)), null};
    }

    public /* synthetic */ d(int i, e0 e0Var, List list, p pVar) {
        if (1 != (i & 1)) {
            j1.f(b.f167914a.getDescriptor(), i, 1);
            throw null;
        }
        this.f167915a = e0Var;
        if ((i & 2) == 0) {
            this.f167916b = null;
        } else {
            this.f167916b = list;
        }
        if ((i & 4) == 0) {
            this.f167917c = null;
        } else {
            this.f167917c = pVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f167915a, dVar.f167915a) && Intrinsics.f(this.f167916b, dVar.f167916b) && Intrinsics.f(this.f167917c, dVar.f167917c);
    }

    public final int hashCode() {
        int iHashCode = this.f167915a.hashCode() * 31;
        List list = this.f167916b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        p pVar = this.f167917c;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }
}
