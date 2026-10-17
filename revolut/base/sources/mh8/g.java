package mh8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f205427c = {null, yhm.j.c(yhm.k.PUBLICATION, new mfl.b(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f205429b;

    public /* synthetic */ g(int i, String str, f fVar) {
        if (3 != (i & 3)) {
            j1.f(c.f205426a.getDescriptor(), i, 3);
            throw null;
        }
        this.f205428a = str;
        this.f205429b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205428a, gVar.f205428a) && this.f205429b == gVar.f205429b;
    }

    public final int hashCode() {
        return this.f205429b.hashCode() + (this.f205428a.hashCode() * 31);
    }
}
