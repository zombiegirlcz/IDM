package lkf;

import kkf.i8;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8 f196365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f196366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f196367y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(i8 i8Var, Continuation continuation) {
        super(continuation);
        this.f196365w = i8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f196365w.emit(null, this);
    }
}
