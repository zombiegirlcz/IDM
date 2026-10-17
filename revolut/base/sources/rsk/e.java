package rsk;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qx4.b f257103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f257104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f257105y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qx4.b bVar, Continuation continuation) {
        super(continuation);
        this.f257103w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f257103w.emit(null, this);
    }
}
