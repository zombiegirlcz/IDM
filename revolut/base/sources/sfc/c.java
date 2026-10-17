package sfc;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f262391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f262392x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f262391w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f262392x |= Integer.MIN_VALUE;
        return this.f262391w.c(null, this);
    }
}
