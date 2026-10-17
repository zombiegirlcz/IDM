package as1;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f8776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f8777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8778y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f8776w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f8776w.emit(null, this);
    }
}
