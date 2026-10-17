package mk0;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.c {
    public List u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f206145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f206146x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f206147y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, gim.c cVar) {
        super(cVar);
        this.f206146x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f206145w = obj2;
        this.f206147y |= Integer.MIN_VALUE;
        return this.f206146x.p(null, this);
    }
}
