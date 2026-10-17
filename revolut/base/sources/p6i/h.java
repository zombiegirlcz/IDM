package p6i;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f233328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f233329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f233330y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.f233330y = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233329x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f233330y.d(null, null, this);
    }
}
