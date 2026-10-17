package etj;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f129420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129421x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, gim.c cVar) {
        super(cVar);
        this.f129420w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129421x |= Integer.MIN_VALUE;
        return this.f129420w.h(this);
    }
}
