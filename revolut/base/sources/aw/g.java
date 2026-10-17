package aw;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f10159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10160x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.f10159w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f10160x |= Integer.MIN_VALUE;
        return this.f10159w.l(this);
    }
}
