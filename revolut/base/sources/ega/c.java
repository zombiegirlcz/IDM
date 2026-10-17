package ega;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f125574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125575x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f125574w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f125575x |= Integer.MIN_VALUE;
        return this.f125574w.b(this);
    }
}
