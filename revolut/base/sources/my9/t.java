package my9;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f210433w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, gim.c cVar) {
        super(cVar);
        this.v = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f210433w |= Integer.MIN_VALUE;
        return this.v.l(null, null, this);
    }
}
