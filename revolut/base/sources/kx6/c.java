package kx6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f190439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f190440x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f190439w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f190440x |= Integer.MIN_VALUE;
        return this.f190439w.a(null, this);
    }
}
