package n29;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new n08.b(20)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f211497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f211498c;

    public /* synthetic */ y(int i, String str, s sVar, h0 h0Var) {
        if (7 != (i & 7)) {
            j1.f(w.f211495a.getDescriptor(), i, 7);
            throw null;
        }
        this.f211496a = str;
        this.f211497b = sVar;
        this.f211498c = h0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f211496a, yVar.f211496a) && Intrinsics.f(this.f211497b, yVar.f211497b) && Intrinsics.f(this.f211498c, yVar.f211498c);
    }

    public final int hashCode() {
        int iHashCode = (this.f211497b.hashCode() + (this.f211496a.hashCode() * 31)) * 31;
        h0 h0Var = this.f211498c;
        return iHashCode + (h0Var == null ? 0 : h0Var.hashCode());
    }

    public y(String ref2, s content, h0 h0Var) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f211496a = ref2;
        this.f211497b = content;
        this.f211498c = h0Var;
    }
}
