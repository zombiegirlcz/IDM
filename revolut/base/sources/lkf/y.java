package lkf;

import kkf.i8;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8 f196414w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f196415x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f196416y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i8 i8Var, Continuation continuation) {
        super(continuation);
        this.f196414w = i8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f196414w.emit(null, this);
    }
}
