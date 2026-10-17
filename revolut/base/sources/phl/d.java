package phl;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public String u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f236344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f236345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f236346y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f236346y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f236345x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f236346y.a(null, this);
    }
}
