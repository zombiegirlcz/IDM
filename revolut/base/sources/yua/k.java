package yua;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public String u;
    public s71.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f316947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f316948x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f316949y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, gim.c cVar) {
        super(cVar);
        this.f316949y = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f316948x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f316949y.g(null, null, this);
    }
}
