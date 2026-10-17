package l25;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f191628w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u uVar, gim.c cVar) {
        super(cVar);
        this.v = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f191628w |= Integer.MIN_VALUE;
        return u.e3(this.v, null, this);
    }
}
