package ei3;

import ahe.f0;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f126382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f126383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Data f126384y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f126382w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f126382w.emit(null, this);
    }
}
