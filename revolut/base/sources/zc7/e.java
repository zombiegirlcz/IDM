package zc7;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f321243w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f321244x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f321245y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f321243w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f321243w.emit(null, this);
    }
}
