package rrc;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public dda.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f256754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f256755x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar, gim.c cVar) {
        super(cVar);
        this.f256754w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f256755x |= Integer.MIN_VALUE;
        return this.f256754w.b(null, this);
    }
}
