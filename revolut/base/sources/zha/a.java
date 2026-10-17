package zha;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f322372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f322373x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.f322372w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f322373x |= Integer.MIN_VALUE;
        return this.f322372w.b(false, this);
    }
}
