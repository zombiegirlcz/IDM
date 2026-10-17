package lhk;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.c {
    public w u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f195381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f195382x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, gim.c cVar) {
        super(cVar);
        this.f195381w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f195382x |= Integer.MIN_VALUE;
        return this.f195381w.e(null, this);
    }
}
