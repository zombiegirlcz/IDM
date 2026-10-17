package ct6;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.c {
    public Iterator A;
    public ir6.e B;
    public Object C;
    public Set D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ m L;
    public int M;
    public Set u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f108626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f108627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hr6.k f108628y;
    public Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, gim.c cVar) {
        super(cVar);
        this.L = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.K = obj2;
        this.M |= Integer.MIN_VALUE;
        return this.L.d(null, this);
    }
}
