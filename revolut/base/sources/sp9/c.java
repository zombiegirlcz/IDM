package sp9;

import java.util.ArrayList;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f264910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f264911b;

    public c(ArrayList transactions, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f264910a = transactions;
        this.f264911b = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f264910a.equals(cVar.f264910a) && Intrinsics.f(this.f264911b, cVar.f264911b);
    }

    public final int hashCode() {
        return this.f264911b.hashCode() + (this.f264910a.hashCode() * 31);
    }
}
