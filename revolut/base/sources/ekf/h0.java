package ekf;

import kotlin.coroutines.Continuation;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends gim.c {
    public int A;
    public a3 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zm3.a f127081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f127082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f127083y;
    public final /* synthetic */ i0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Continuation continuation) {
        super(continuation);
        this.z = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127083y = obj2;
        this.A |= Integer.MIN_VALUE;
        return i0.b3(this.z, null, this);
    }
}
