package w50;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f294672w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, gim.c cVar) {
        super(cVar);
        this.v = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f294672w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
