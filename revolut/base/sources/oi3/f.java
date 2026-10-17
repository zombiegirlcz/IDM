package oi3;

import com.revolut.feature.checkout.models.CheckoutOrder;
import java.time.Instant;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import nvk.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public CheckoutOrder A;
    public int B;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f225424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f225425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Instant f225426y;
    public Instant z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v vVar, Continuation continuation) {
        super(continuation);
        this.f225424w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f225424w.emit(null, this);
    }
}
