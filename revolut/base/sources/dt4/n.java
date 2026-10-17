package dt4;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.c {
    public dj0.d A;
    public int B;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f117377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f117378x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public whf.p f117379y;
    public wi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f117377w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f117377w.emit(null, this);
    }
}
