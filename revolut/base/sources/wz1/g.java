package wz1;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public j60.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f301346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f301347x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.f301346w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f301347x |= Integer.MIN_VALUE;
        return this.f301346w.h(null, null, this);
    }
}
