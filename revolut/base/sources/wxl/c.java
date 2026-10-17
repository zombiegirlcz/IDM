package wxl;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public String u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f301011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f301012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f301013y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f301013y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f301012x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f301013y.b(null, this);
    }
}
