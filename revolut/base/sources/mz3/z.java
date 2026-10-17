package mz3;

import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.c {
    public FeatureCommand u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f210709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f210710x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f210709w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f210710x |= Integer.MIN_VALUE;
        return a0.a(this.f210709w, null, this);
    }
}
