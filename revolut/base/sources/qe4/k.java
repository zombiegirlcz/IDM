package qe4;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f245067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f245068x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f245067w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f245068x |= Integer.MIN_VALUE;
        return this.f245067w.e3(null, this);
    }
}
