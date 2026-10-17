package jl8;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zq.a f175648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f175649x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.f175648w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f175649x |= Integer.MIN_VALUE;
        return this.f175648w.h(null, null, this);
    }
}
