package m6i;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends gim.c {
    public dj0.d u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f203178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n0 f203179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f203180y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, gim.c cVar) {
        super(cVar);
        this.f203179x = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203178w = obj2;
        this.f203180y |= Integer.MIN_VALUE;
        return this.f203179x.b(null, null, this);
    }
}
