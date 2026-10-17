package yjh;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f314480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f314481x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f314480w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f314481x |= Integer.MIN_VALUE;
        return this.f314480w.e3(this);
    }
}
