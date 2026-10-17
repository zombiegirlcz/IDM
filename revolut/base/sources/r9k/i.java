package r9k;

import ard.b0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f252749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f252750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f252751y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f252749w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f252749w.emit(null, this);
    }
}
