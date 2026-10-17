package y20;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class n0 extends gim.c {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ b1 H;
    public int I;
    public Set u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f310526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i20.b0 f310527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i20.b0 f310528y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(b1 b1Var, gim.c cVar) {
        super(cVar);
        this.H = b1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.G = obj2;
        this.I |= Integer.MIN_VALUE;
        return this.H.e(this, null, false);
    }
}
