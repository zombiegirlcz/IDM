package v20;

import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends gim.c {
    public UUID u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.c f285327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f285328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f0 f285329y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.f285329y = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f285328x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f285329y.a(null, this);
    }
}
