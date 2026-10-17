package epg;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f128192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f128193x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, gim.c cVar) {
        super(cVar);
        this.f128192w = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f128193x |= Integer.MIN_VALUE;
        return u.y2(this.f128192w, null, this);
    }
}
