package hi3;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public String u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f152483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f152484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f152485y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f152485y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f152484x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f152485y.c(null, this);
    }
}
