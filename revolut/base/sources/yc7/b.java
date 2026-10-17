package yc7;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f312544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f312545x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, gim.c cVar) {
        super(cVar);
        this.f312544w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f312545x |= Integer.MIN_VALUE;
        return this.f312544w.b(null, this);
    }
}
