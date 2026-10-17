package nw5;

import c2d.l0;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0 f219776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f219777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Data f219778y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l0 l0Var, Continuation continuation) {
        super(continuation);
        this.f219776w = l0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f219776w.emit(null, this);
    }
}
