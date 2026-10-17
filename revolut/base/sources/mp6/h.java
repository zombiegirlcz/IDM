package mp6;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lmg.k f207748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f207749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f207750y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(lmg.k kVar, Continuation continuation) {
        super(continuation);
        this.f207748w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f207748w.emit(null, this);
    }
}
