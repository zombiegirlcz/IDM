package blm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends gim.c {
    public int A;
    public f u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i f16750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f16751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f16752y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(continuation);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f16752y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.j(null, this);
    }
}
