package rrc;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.c {
    public dda.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f256749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f256750x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q qVar, gim.c cVar) {
        super(cVar);
        this.f256749w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f256750x |= Integer.MIN_VALUE;
        return this.f256749w.a(null, this);
    }
}
