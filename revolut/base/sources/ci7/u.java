package ci7;

import chc.c0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class u {

    @NotNull
    public static final c Companion = new c();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new c0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f24423c;

    public /* synthetic */ u(int i, String str, String str2, t tVar) {
        if (7 != (i & 7)) {
            j1.f(b.f24403a.getDescriptor(), i, 7);
            throw null;
        }
        this.f24421a = str;
        this.f24422b = str2;
        this.f24423c = tVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f24421a, uVar.f24421a) && Intrinsics.f(this.f24422b, uVar.f24422b) && Intrinsics.f(this.f24423c, uVar.f24423c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f24421a.hashCode() * 31, 31, this.f24422b);
        t tVar = this.f24423c;
        return iC + (tVar == null ? 0 : tVar.hashCode());
    }

    public u(String ref2, String symbol, t tVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f24421a = ref2;
        this.f24422b = symbol;
        this.f24423c = tVar;
    }
}
