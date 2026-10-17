package gb8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public String u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f142233w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f142234x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f142235y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f142235y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f142234x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f142235y.a(null, this);
    }
}
