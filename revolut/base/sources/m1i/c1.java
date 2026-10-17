package m1i;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class c1 extends gim.c {
    public Function1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i1 f201517w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f201518x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(i1 i1Var, gim.c cVar) {
        super(cVar);
        this.f201517w = i1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f201518x |= Integer.MIN_VALUE;
        return i1.Q(this.f201517w, null, this);
    }
}
