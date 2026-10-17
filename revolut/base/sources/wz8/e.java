package wz8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import wyc.u;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f301381c = {null, yhm.j.c(yhm.k.PUBLICATION, new u(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f301383b;

    public /* synthetic */ e(int i, String str, d dVar) {
        if (3 != (i & 3)) {
            j1.f(a.f301380a.getDescriptor(), i, 3);
            throw null;
        }
        this.f301382a = str;
        this.f301383b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f301382a, eVar.f301382a) && this.f301383b == eVar.f301383b;
    }

    public final int hashCode() {
        return this.f301383b.hashCode() + (this.f301382a.hashCode() * 31);
    }
}
