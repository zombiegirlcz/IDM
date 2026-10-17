package lge;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public hlm.a u;
    public h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f195094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f195095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f195096y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.f195096y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f195095x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f195096y.b(null, this);
    }
}
