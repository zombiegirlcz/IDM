package auc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9727b;

    public /* synthetic */ g0(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(e0.f9716a.getDescriptor(), i, 3);
            throw null;
        }
        this.f9726a = j2;
        this.f9727b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f9726a == g0Var.f9726a && Intrinsics.f(this.f9727b, g0Var.f9727b);
    }

    public final int hashCode() {
        return this.f9727b.hashCode() + (Long.hashCode(this.f9726a) * 31);
    }

    public g0(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f9726a = j2;
        this.f9727b = currency;
    }
}
