package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116744b;

    public /* synthetic */ e1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(c1.f116736a.getDescriptor(), i, 3);
            throw null;
        }
        this.f116743a = str;
        this.f116744b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f116743a, e1Var.f116743a) && Intrinsics.f(this.f116744b, e1Var.f116744b);
    }

    public final int hashCode() {
        return this.f116744b.hashCode() + (this.f116743a.hashCode() * 31);
    }

    public e1(String quoteToken, String counterpartyId) {
        Intrinsics.checkNotNullParameter(quoteToken, "quoteToken");
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        this.f116743a = quoteToken;
        this.f116744b = counterpartyId;
    }
}
