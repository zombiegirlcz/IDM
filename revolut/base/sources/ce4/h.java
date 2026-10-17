package ce4;

import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.c {
    public List u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f23359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23360y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, gim.c cVar) {
        super(cVar);
        this.f23359x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23358w = obj2;
        this.f23360y |= Integer.MIN_VALUE;
        return this.f23359x.j(null, this);
    }
}
