package xnd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f307395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f307396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f307397c;

    public f0(Flow flow, boolean z, boolean z3) {
        this.f307395a = flow;
        this.f307396b = z;
        this.f307397c = z3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f307395a.collect(new e0(flowCollector, this.f307396b, this.f307397c), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }
}
