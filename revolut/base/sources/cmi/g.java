package cmi;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f25275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f25276x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, gim.c cVar) {
        super(cVar);
        this.f25275w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f25276x |= Integer.MIN_VALUE;
        return this.f25275w.j3(null, this);
    }
}
