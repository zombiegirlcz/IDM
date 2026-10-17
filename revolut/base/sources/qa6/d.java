package qa6;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f243966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f243967b;

    public d(List transactions, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f243966a = transactions;
        this.f243967b = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f243966a, dVar.f243966a) && Intrinsics.f(this.f243967b, dVar.f243967b);
    }

    public final int hashCode() {
        return this.f243967b.hashCode() + (this.f243966a.hashCode() * 31);
    }
}
