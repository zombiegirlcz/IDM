package z20;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public d u;
    public u10.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UUID f318909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f318910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f318911y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f318911y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f318910x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f318911y.b(null, this);
    }
}
