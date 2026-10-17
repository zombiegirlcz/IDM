package lge;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public hlm.a u;
    public h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f195097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f195098x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f195099y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f195099y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f195098x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f195099y.c(null, this);
    }
}
