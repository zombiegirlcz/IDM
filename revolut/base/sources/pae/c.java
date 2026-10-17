package pae;

import java.util.HashSet;
import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f234536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f234537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f234538c;
    public final String d;

    public c(List transactions, q transactionsExtraData, HashSet selectedTransactionsIds, String searchQuery) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(selectedTransactionsIds, "selectedTransactionsIds");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f234536a = transactions;
        this.f234537b = transactionsExtraData;
        this.f234538c = selectedTransactionsIds;
        this.d = searchQuery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f234536a, cVar.f234536a) && Intrinsics.f(this.f234537b, cVar.f234537b) && Intrinsics.f(this.f234538c, cVar.f234538c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f234538c.hashCode() + ((this.f234537b.hashCode() + (this.f234536a.hashCode() * 31)) * 31)) * 31);
    }
}
