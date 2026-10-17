package fod;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f136939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.v = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f136939w |= Integer.MIN_VALUE;
        return k.a(this.v, null, this);
    }
}
