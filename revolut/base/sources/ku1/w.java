package ku1;

import kkf.i8;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8 f189626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f189627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f189628y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i8 i8Var, Continuation continuation) {
        super(continuation);
        this.f189626w = i8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f189626w.emit(null, this);
    }
}
