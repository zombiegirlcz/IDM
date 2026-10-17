package fkd;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new fk8.a(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f135770c;

    public /* synthetic */ j(int i, String str, String str2, k kVar) {
        if (3 != (i & 3)) {
            j1.f(h.f135766a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135768a = str;
        this.f135769b = str2;
        if ((i & 4) == 0) {
            this.f135770c = null;
        } else {
            this.f135770c = kVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f135768a, jVar.f135768a) && Intrinsics.f(this.f135769b, jVar.f135769b) && this.f135770c == jVar.f135770c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f135768a.hashCode() * 31, 31, this.f135769b);
        k kVar = this.f135770c;
        return iC + (kVar == null ? 0 : kVar.hashCode());
    }
}
