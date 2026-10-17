package u1f;

import u2f.j;
import u2f.n;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public j u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f276405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f276406x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f276407y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f276406x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f276405w = obj2;
        this.f276407y |= Integer.MIN_VALUE;
        return this.f276406x.b(null, null, this);
    }
}
