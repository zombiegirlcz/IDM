package de9;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f113336w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, gim.c cVar) {
        super(cVar);
        this.v = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f113336w |= Integer.MIN_VALUE;
        return x.y2(this.v, this);
    }
}
