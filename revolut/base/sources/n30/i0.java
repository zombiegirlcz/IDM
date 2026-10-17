package n30;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 extends gim.c {
    public UUID u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f211632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f211633x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p0 p0Var, gim.c cVar) {
        super(cVar);
        this.f211632w = p0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f211633x |= Integer.MIN_VALUE;
        return this.f211632w.b(null, this);
    }
}
