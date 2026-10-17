package njk;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import lmg.k;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f216595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f216596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f216597y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, Continuation continuation) {
        super(continuation);
        this.f216595w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f216595w.emit(null, this);
    }
}
