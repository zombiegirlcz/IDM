package nd1;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lmg.k f214288w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f214289x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f214290y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(lmg.k kVar, Continuation continuation) {
        super(continuation);
        this.f214288w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f214288w.emit(null, this);
    }
}
