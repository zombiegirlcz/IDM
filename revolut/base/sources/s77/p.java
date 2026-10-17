package s77;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260552b;

    public /* synthetic */ p(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(n.f260550a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260551a = str;
        this.f260552b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f260551a, pVar.f260551a) && Intrinsics.f(this.f260552b, pVar.f260552b);
    }

    public final int hashCode() {
        return this.f260552b.hashCode() + (this.f260551a.hashCode() * 31);
    }

    public p(String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f260551a = ref2;
        this.f260552b = symbol;
    }
}
