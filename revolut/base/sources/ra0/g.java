package ra0;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.c {
    public UUID u;
    public b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UUID f252769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f252770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f252771y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f252771y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f252770x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f252771y.c(null, null, this);
    }
}
