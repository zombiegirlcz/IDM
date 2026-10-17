package cmi;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f25299w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, gim.c cVar) {
        super(cVar);
        this.v = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f25299w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
