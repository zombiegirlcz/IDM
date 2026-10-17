package yff;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f313356w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, gim.c cVar) {
        super(cVar);
        this.v = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f313356w |= Integer.MIN_VALUE;
        return u.y2(this.v, null, this);
    }
}
