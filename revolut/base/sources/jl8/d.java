package jl8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f175641w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f175642x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f175641w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f175642x |= Integer.MIN_VALUE;
        return this.f175641w.a(null, null, this);
    }
}
