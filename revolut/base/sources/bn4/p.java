package bn4;

import java.time.LocalDate;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.c {
    public LocalDate u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f17086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17087x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.f17086w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f17087x |= Integer.MIN_VALUE;
        return this.f17086w.p(null, this);
    }
}
