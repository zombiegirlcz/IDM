package y48;

import n38.x;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public x u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f310825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310826x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f310825w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310826x |= Integer.MIN_VALUE;
        return this.f310825w.P(null, this);
    }
}
