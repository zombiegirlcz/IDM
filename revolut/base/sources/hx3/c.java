package hx3;

import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public List u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f156373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f156374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f156375y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f156374x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f156373w = obj2;
        this.f156375y |= Integer.MIN_VALUE;
        return g.a(this.f156374x, this);
    }
}
