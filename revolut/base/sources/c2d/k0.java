package c2d;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0 f20709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f20710x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Data f20711y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, Continuation continuation) {
        super(continuation);
        this.f20709w = l0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f20709w.emit(null, this);
    }
}
