package eqc;

import ekd.i0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new i0(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f128426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128427c;

    public /* synthetic */ h(int i, String str, f fVar, String str2) {
        if (7 != (i & 7)) {
            j1.f(e.f128424a.getDescriptor(), i, 7);
            throw null;
        }
        this.f128425a = str;
        this.f128426b = fVar;
        this.f128427c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f128425a, hVar.f128425a) && this.f128426b == hVar.f128426b && Intrinsics.f(this.f128427c, hVar.f128427c);
    }

    public final int hashCode() {
        return this.f128427c.hashCode() + ((this.f128426b.hashCode() + (this.f128425a.hashCode() * 31)) * 31);
    }
}
