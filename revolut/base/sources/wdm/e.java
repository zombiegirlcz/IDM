package wdm;

/* JADX INFO: loaded from: classes23.dex */
public final class e extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f296599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f296600x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f296599w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f296600x |= Integer.MIN_VALUE;
        return this.f296599w.a(null, this);
    }
}
