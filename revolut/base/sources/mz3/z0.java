package mz3;

import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes22.dex */
public final class z0 extends gim.c {
    public FeatureCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f210711w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f210712x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, gim.c cVar) {
        super(cVar);
        this.f210711w = a1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f210712x |= Integer.MIN_VALUE;
        return this.f210711w.a(null, this);
    }
}
