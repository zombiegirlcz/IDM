package ds6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f117227a;

    public a0(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f117227a = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f117227a, ((a0) obj2).f117227a);
    }

    public final int hashCode() {
        return this.f117227a.hashCode();
    }
}
