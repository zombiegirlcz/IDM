package rnb;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ dl2.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f255551w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dl2.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f255551w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
