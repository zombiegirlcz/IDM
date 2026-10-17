package akf;

import kotlin.coroutines.Continuation;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public a3 u;
    public t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f5823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f5824y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, Continuation continuation) {
        super(continuation);
        this.f5824y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f5823x = obj2;
        this.z |= Integer.MIN_VALUE;
        return k.Z2(this.f5824y, null, null, false, this);
    }
}
