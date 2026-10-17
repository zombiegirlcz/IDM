package xkf;

import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 extends gim.c {
    public a3 u;
    public t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f306737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q1 f306738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f306739y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(q1 q1Var, gim.c cVar) {
        super(cVar);
        this.f306738x = q1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f306737w = obj2;
        this.f306739y |= Integer.MIN_VALUE;
        return this.f306738x.d3(this);
    }
}
