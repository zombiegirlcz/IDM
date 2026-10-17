package k18;

import j18.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public o u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f180137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180138y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f180137x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180136w = obj2;
        this.f180138y |= Integer.MIN_VALUE;
        return this.f180137x.e(null, null, 0, this);
    }
}
