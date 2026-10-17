package eq5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends gim.c {
    public int A;
    public xi0.b u;
    public wk5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f128304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f128305x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f128306y;
    public final /* synthetic */ x0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(x0 x0Var, gim.c cVar) {
        super(cVar);
        this.z = x0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f128306y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.k(null, null, null, null, this);
    }
}
