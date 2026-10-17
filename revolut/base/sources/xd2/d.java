package xd2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f304231w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f304231w |= Integer.MIN_VALUE;
        return f.c3(this.v, null, null, null, this);
    }
}
