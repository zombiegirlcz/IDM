package rrc;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.c {
    public xi0.b u;
    public kbb.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w4l.h f256773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f256774x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f256775y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, gim.c cVar) {
        super(cVar);
        this.f256775y = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f256774x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f256775y.f(null, this);
    }
}
