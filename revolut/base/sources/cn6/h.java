package cn6;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r10.a f25369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f25370x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r10.a aVar, gim.c cVar) {
        super(cVar);
        this.f25369w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f25370x |= Integer.MIN_VALUE;
        return this.f25369w.a0(null, this);
    }
}
