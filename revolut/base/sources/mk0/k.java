package mk0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vkm.f f206153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f206154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tk0.g f206155c;

    public k(vkm.f fVar, o oVar, tk0.g gVar) {
        this.f206153a = fVar;
        this.f206154b = oVar;
        this.f206155c = gVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f206153a.collect(new j(flowCollector, this.f206154b, this.f206155c), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }
}
