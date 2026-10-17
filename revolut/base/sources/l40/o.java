package l40;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends gim.c {
    public UUID u;
    public UUID v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r f192007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f192008x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f192009y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.f192009y = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f192008x = obj2;
        this.z |= Integer.MIN_VALUE;
        return q.l3(this.f192009y, null, null, null, this);
    }
}
