package ph0;

import vg0.k;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f236185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236186x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f236185w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f236186x |= Integer.MIN_VALUE;
        return this.f236185w.b(null, null, this);
    }
}
