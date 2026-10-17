package akf;

import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 extends gim.c {
    public qua.p u;
    public a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f5879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s1 f5880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5881y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(s1 s1Var, gim.c cVar) {
        super(cVar);
        this.f5880x = s1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f5879w = obj2;
        this.f5881y |= Integer.MIN_VALUE;
        return this.f5880x.c3(null, this);
    }
}
