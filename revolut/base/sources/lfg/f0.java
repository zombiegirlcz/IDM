package lfg;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends gim.c {
    public int A;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f194879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Function1 f194880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f194881y;
    public final /* synthetic */ g0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, gim.c cVar) {
        super(cVar);
        this.z = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f194881y = obj2;
        this.A |= Integer.MIN_VALUE;
        return g0.a(this.z, 0, 0L, null, this);
    }
}
