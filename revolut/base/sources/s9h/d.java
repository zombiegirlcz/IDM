package s9h;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public Data A;
    public h B;
    public int C;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c2d.f f261182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f261183x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f261184y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c2d.f fVar, Continuation continuation) {
        super(continuation);
        this.f261182w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f261182w.emit(null, this);
    }
}
