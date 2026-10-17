package mhf;

import com.revolut.domain.interactors.transactions.TransactionContext;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f205563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionContext f205564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f205565c;
    public final String d;
    public final long e;
    public final Set f;

    public g(i7 transactionsFilter, TransactionContext transactionContext, int i, String searchQuery, long j2, h0 remotelyFoundTransactionGroupIds) {
        Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
        Intrinsics.checkNotNullParameter(transactionContext, "transactionContext");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(remotelyFoundTransactionGroupIds, "remotelyFoundTransactionGroupIds");
        this.f205563a = transactionsFilter;
        this.f205564b = transactionContext;
        this.f205565c = i;
        this.d = searchQuery;
        this.e = j2;
        this.f = remotelyFoundTransactionGroupIds;
    }

    @Override // mhf.i
    public final zsc.h a() {
        return null;
    }

    @Override // mhf.i
    public final int b() {
        return this.f205565c;
    }

    @Override // mhf.i
    public final Set c() {
        return this.f;
    }

    @Override // mhf.i
    public final int d() {
        return 200;
    }

    @Override // mhf.i
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205563a, gVar.f205563a) && Intrinsics.f(this.f205564b, gVar.f205564b) && this.f205565c == gVar.f205565c && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && Intrinsics.f(this.f, gVar.f);
    }

    @Override // mhf.i
    public final TransactionContext f() {
        return this.f205564b;
    }

    @Override // mhf.i
    public final i7 g() {
        return this.f205563a;
    }

    public final int hashCode() {
        return p.a.f(a0.d.c(j6.a.b(200, p.a.c(j6.a.b(this.f205565c, (this.f205564b.hashCode() + (this.f205563a.hashCode() * 31)) * 31, 31), 31, this.d), 31), 31, this.e), 31, this.f);
    }
}
