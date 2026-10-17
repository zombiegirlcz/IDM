package u1m;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.c {
    public o u;
    public Context v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f276483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f276484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f276485y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.f276484x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f276483w = obj2;
        this.f276485y |= Integer.MIN_VALUE;
        return this.f276484x.j(null, this);
    }
}
