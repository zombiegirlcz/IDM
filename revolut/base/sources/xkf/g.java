package xkf;

import tof.a3;
import tof.f3;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public f3 A;
    public dj0.d B;
    public dj0.d C;
    public /* synthetic */ Object D;
    public final /* synthetic */ tsk.t E;
    public int F;
    public a3 u;
    public t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public do3.n f306707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public cmf.a f306708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n9l.a f306709y;
    public dj0.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tsk.t tVar, gim.c cVar) {
        super(cVar);
        this.E = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.i(null, null, null, this);
    }
}
