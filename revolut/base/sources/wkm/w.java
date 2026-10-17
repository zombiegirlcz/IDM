package wkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import ukm.j0;

/* JADX INFO: loaded from: classes13.dex */
public final class w implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f298333a;

    public w(j0 j0Var) {
        this.f298333a = j0Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        Object objSend = this.f298333a.send(obj2, continuation);
        return objSend == fim.a.COROUTINE_SUSPENDED ? objSend : Unit.f186387a;
    }
}
