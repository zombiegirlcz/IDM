package s3d;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f259640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f259641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f259642y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f259640w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f259640w.emit(null, this);
    }
}
