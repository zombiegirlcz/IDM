package ekf;

import kotlin.coroutines.Continuation;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends gim.c {
    public a3 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f127077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i0 f127078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f127079y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, Continuation continuation) {
        super(continuation);
        this.f127078x = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127077w = obj2;
        this.f127079y |= Integer.MIN_VALUE;
        return i0.Z2(this.f127078x, null, this);
    }
}
