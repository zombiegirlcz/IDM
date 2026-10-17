package l7e;

import ard.b0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public int A;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f192565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f192566x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j f192567y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f192565w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f192565w.emit(null, this);
    }
}
