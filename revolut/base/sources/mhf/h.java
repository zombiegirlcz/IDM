package mhf;

import com.revolut.domain.interactors.transactions.TransactionContext;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f205566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionContext f205567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f205568c;
    public final String d;
    public final Set e;
    public final zsc.h f;

    public h(i7 transactionsFilter, TransactionContext transactionContext, int i, String searchQuery, Set remotelyFoundTransactionGroupIds, zsc.h hVar) {
        Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
        Intrinsics.checkNotNullParameter(transactionContext, "transactionContext");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(remotelyFoundTransactionGroupIds, "remotelyFoundTransactionGroupIds");
        this.f205566a = transactionsFilter;
        this.f205567b = transactionContext;
        this.f205568c = i;
        this.d = searchQuery;
        this.e = remotelyFoundTransactionGroupIds;
        this.f = hVar;
    }

    @Override // mhf.i
    public final zsc.h a() {
        return this.f;
    }

    @Override // mhf.i
    public final int b() {
        return this.f205568c;
    }

    @Override // mhf.i
    public final Set c() {
        return this.e;
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
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f205566a, hVar.f205566a) && Intrinsics.f(this.f205567b, hVar.f205567b) && this.f205568c == hVar.f205568c && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    @Override // mhf.i
    public final TransactionContext f() {
        return this.f205567b;
    }

    @Override // mhf.i
    public final i7 g() {
        return this.f205566a;
    }

    public final int hashCode() {
        int iF = p.a.f(j6.a.b(200, p.a.c(j6.a.b(this.f205568c, (this.f205567b.hashCode() + (this.f205566a.hashCode() * 31)) * 31, 31), 31, this.d), 31), 31, this.e);
        zsc.h hVar = this.f;
        return iF + (hVar == null ? 0 : hVar.f324874a.hashCode());
    }
}
