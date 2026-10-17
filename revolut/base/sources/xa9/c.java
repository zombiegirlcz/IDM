package xa9;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.s0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f303787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a f303788x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f303789y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f303787w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f303787w.emit(null, this);
    }
}
