package nd1;

import id1.o;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public o u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f214291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214292x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f214291w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214292x |= Integer.MIN_VALUE;
        return this.f214291w.e(this);
    }
}
