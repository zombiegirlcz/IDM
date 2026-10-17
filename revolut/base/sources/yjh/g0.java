package yjh;

import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 extends gim.c {
    public int A;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function3 f314471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f314472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f314473y;
    public final /* synthetic */ k0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.z = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f314473y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d3(null, null, false, null, null, this);
    }
}
