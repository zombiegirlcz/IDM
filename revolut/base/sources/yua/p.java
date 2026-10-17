package yua;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.c {
    public s71.a u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fva.e f316960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f316961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f316962y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.f316962y = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f316961x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f316962y.z(null, null, this);
    }
}
