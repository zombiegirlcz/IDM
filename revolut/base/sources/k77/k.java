package k77;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181838b;

    public k(String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f181837a = ref2;
        this.f181838b = symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f181837a, kVar.f181837a) && Intrinsics.f(this.f181838b, kVar.f181838b);
    }

    public final int hashCode() {
        return this.f181838b.hashCode() + (this.f181837a.hashCode() * 31);
    }
}
