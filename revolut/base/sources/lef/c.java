package lef;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Llef/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "createdSince", "", "b", "Z", "()Z", "last", "", "Llef/e;", "c", "Ljava/util/List;", "()Ljava/util/List;", "transactions", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdSince")
    private final long createdSince;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("last")
    private final boolean last;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactions")
    @NotNull
    private final List<e> transactions;

    public c(long j2, ArrayList transactions, boolean z) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.createdSince = j2;
        this.last = z;
        this.transactions = transactions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreatedSince() {
        return this.createdSince;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getLast() {
        return this.last;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getTransactions() {
        return this.transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.createdSince == cVar.createdSince && this.last == cVar.last && Intrinsics.f(this.transactions, cVar.transactions);
    }

    public final int hashCode() {
        return this.transactions.hashCode() + j6.a.c(Long.hashCode(this.createdSince) * 31, 31, this.last);
    }
}
