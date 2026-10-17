package mjf;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f205979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f205980x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.f205979w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f205980x |= Integer.MIN_VALUE;
        return this.f205979w.q(null, this);
    }
}
