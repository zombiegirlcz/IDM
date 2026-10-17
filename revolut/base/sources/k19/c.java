package k19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new k16.d(1)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f180148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l19.b f180149c;
    public final String d;

    public /* synthetic */ c(int i, String str, d0 d0Var, l19.b bVar, String str2) {
        if (1 != (i & 1)) {
            j1.f(a.f180142a.getDescriptor(), i, 1);
            throw null;
        }
        this.f180147a = str;
        if ((i & 2) == 0) {
            this.f180148b = null;
        } else {
            this.f180148b = d0Var;
        }
        if ((i & 4) == 0) {
            this.f180149c = null;
        } else {
            this.f180149c = bVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f180147a, cVar.f180147a) && Intrinsics.f(this.f180148b, cVar.f180148b) && Intrinsics.f(this.f180149c, cVar.f180149c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f180147a.hashCode() * 31;
        d0 d0Var = this.f180148b;
        int iHashCode2 = (iHashCode + (d0Var == null ? 0 : d0Var.f180151a.hashCode())) * 31;
        l19.b bVar = this.f180149c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
