package ehk;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import zfk.n;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public final /* synthetic */ g A;
    public int B;
    public FlowCollector u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function1 f126209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xfk.a f126210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f126211y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.A = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return g.b3(this.A, null, null, null, this);
    }
}
