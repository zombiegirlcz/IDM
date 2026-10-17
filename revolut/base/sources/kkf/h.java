package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f184708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184709x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f184708w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184709x |= Integer.MIN_VALUE;
        return this.f184708w.b3(null, this);
    }
}
