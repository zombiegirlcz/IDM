package hje;

import java.time.Instant;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public Instant u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f152752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f152753x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.f152752w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f152753x |= Integer.MIN_VALUE;
        return this.f152752w.e(null, this);
    }
}
