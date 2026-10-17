package lwf;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import lmg.k;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f200450w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f200451x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f200452y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Continuation continuation) {
        super(continuation);
        this.f200450w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f200450w.emit(null, this);
    }
}
