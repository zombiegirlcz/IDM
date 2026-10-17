package eq5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends gim.c {
    public xi0.b u;
    public wk5.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f128325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f128326x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x0 f128327y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(x0 x0Var, gim.c cVar) {
        super(cVar);
        this.f128327y = x0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f128326x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f128327y.m(null, null, this);
    }
}
