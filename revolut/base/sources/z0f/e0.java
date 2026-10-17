package z0f;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends gim.c {
    public ArrayList u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f318250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f318251x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.f318250w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f318251x |= Integer.MIN_VALUE;
        return f0.I2(this.f318250w, null, this);
    }
}
