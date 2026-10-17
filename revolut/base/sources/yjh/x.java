package yjh;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f314504w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.v = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f314504w |= Integer.MIN_VALUE;
        return this.v.b3(null, this);
    }
}
