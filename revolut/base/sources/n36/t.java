package n36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f211900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c36.c f211901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211902c;

    public /* synthetic */ t(int i, b0 b0Var, c36.c cVar, String str) {
        if (7 != (i & 7)) {
            j1.f(r.f211899a.getDescriptor(), i, 7);
            throw null;
        }
        this.f211900a = b0Var;
        this.f211901b = cVar;
        this.f211902c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f211900a, tVar.f211900a) && Intrinsics.f(this.f211901b, tVar.f211901b) && Intrinsics.f(this.f211902c, tVar.f211902c);
    }

    public final int hashCode() {
        return this.f211902c.hashCode() + ((this.f211901b.hashCode() + (this.f211900a.hashCode() * 31)) * 31);
    }
}
