package nwf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import nvk.v;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f219867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f219868x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f219869y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, Continuation continuation) {
        super(continuation);
        this.f219867w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f219867w.emit(null, this);
    }
}
