package jv9;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f178793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f178794x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f178793w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f178794x |= Integer.MIN_VALUE;
        return this.f178793w.a(null, 0L, false, this);
    }
}
