package y20;

import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 extends gim.c {
    public i20.w0 u;
    public Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f310532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b1 f310533x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f310534y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(b1 b1Var, gim.c cVar) {
        super(cVar);
        this.f310533x = b1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f310532w = obj2;
        this.f310534y |= Integer.MIN_VALUE;
        return this.f310533x.h(null, null, this);
    }
}
