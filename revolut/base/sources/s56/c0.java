package s56;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends gim.c {
    public wk5.a u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f259940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i0 f259941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f259942y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.f259941x = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259940w = obj2;
        this.f259942y |= Integer.MIN_VALUE;
        return this.f259941x.f(null, null, null, this);
    }
}
