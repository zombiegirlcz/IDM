package fkf;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public int A;
    public f u;
    public a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f135819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f135820x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f135821y;
    public final /* synthetic */ i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.z = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f135821y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
