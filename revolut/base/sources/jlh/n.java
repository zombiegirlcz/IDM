package jlh;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f175783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f175784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f175785y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f175784x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f175783w = obj2;
        this.f175785y |= Integer.MIN_VALUE;
        return this.f175784x.e(null, this);
    }
}
