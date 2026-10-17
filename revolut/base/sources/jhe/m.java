package jhe;

import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public int A;
    public Set u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f174226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public UnifiedTransactionsFilter f174227x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f174228y;
    public final /* synthetic */ t z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, gim.c cVar) {
        super(cVar);
        this.z = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f174228y = obj2;
        this.A |= Integer.MIN_VALUE;
        return t.o(this.z, null, null, this);
    }
}
