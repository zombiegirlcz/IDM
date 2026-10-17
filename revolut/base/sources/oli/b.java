package oli;

import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public z1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f226413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226414x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f226413w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226414x |= Integer.MIN_VALUE;
        return this.f226413w.a(this);
    }
}
