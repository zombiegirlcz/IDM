package ds6;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f117237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k71.q f117239c;
    public final dj0.d d;

    public g0(LinkedHashMap transactions, int i, k71.q transactionExtraData, dj0.d transactionSum) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionExtraData, "transactionExtraData");
        Intrinsics.checkNotNullParameter(transactionSum, "transactionSum");
        this.f117237a = transactions;
        this.f117238b = i;
        this.f117239c = transactionExtraData;
        this.d = transactionSum;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f117237a.equals(g0Var.f117237a) && this.f117238b == g0Var.f117238b && Intrinsics.f(this.f117239c, g0Var.f117239c) && this.d.equals(g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f117239c.hashCode() + j6.a.b(this.f117238b, this.f117237a.hashCode() * 31, 31)) * 31);
    }
}
