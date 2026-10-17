package tk6;

import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public dj0.d u;
    public x02.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ApmQuoteDirection.Outgoing f271886w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f271887x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f271888y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f271888y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f271887x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f271888y.b(null, this);
    }
}
