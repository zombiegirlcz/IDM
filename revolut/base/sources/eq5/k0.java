package eq5;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends gim.c {
    public int A;
    public String u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.l f128281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f128282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f128283y;
    public final /* synthetic */ x0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(x0 x0Var, gim.c cVar) {
        super(cVar);
        this.z = x0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f128283y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, this);
    }
}
