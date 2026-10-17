package n5a;

import o97.y;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public y u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f212551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212552x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f212551w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212552x |= Integer.MIN_VALUE;
        return this.f212551w.b(null, this);
    }
}
