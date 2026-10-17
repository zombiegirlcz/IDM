package t38;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends gim.c {
    public wsg.n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cnh.f f267710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267711x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(cnh.f fVar, gim.c cVar) {
        super(cVar);
        this.f267710w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267711x |= Integer.MIN_VALUE;
        return this.f267710w.Z2(this);
    }
}
