package e65;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f122905w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar, gim.c cVar) {
        super(cVar);
        this.v = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f122905w |= Integer.MIN_VALUE;
        return this.v.c3(null, this);
    }
}
