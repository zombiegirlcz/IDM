package h56;

import xhf.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public d1 u;
    public ej0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f149508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f149509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f149510y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f149510y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149509x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f149510y.a(null, this);
    }
}
