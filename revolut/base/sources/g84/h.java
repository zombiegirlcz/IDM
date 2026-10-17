package g84;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f141256w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, gim.c cVar) {
        super(cVar);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f141256w |= Integer.MIN_VALUE;
        return this.v.h(this);
    }
}
