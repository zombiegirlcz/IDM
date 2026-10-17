package xge;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends gim.c {
    public int A;
    public List u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f305708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f305709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f305710y;
    public final /* synthetic */ g0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, gim.c cVar) {
        super(cVar);
        this.z = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f305710y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, this);
    }
}
