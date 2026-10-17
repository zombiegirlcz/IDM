package yjh;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public j u;
    public cjh.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ixg.b f314474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f314475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f314476y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.f314476y = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f314475x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f314476y.b3(null, this);
    }
}
