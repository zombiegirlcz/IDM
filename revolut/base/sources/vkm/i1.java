package vkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import yhm.m;

/* JADX INFO: loaded from: classes14.dex */
public final class i1 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f290041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f290042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ skm.r f290043c;

    public i1(Ref$ObjectRef ref$ObjectRef, CoroutineScope coroutineScope, skm.r rVar) {
        this.f290041a = ref$ObjectRef;
        this.f290042b = coroutineScope;
        this.f290043c = rVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = this.f290041a;
        MutableStateFlow mutableStateFlow = (MutableStateFlow) ref$ObjectRef.f186409a;
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(obj2);
        } else {
            j2 j2VarC = q.c(obj2);
            m.Companion companion = yhm.m.INSTANCE;
            this.f290043c.U(new yhm.m(new u1(j2VarC, skm.e0.t(this.f290042b.getF74819h()))));
            ref$ObjectRef.f186409a = j2VarC;
        }
        return Unit.f186387a;
    }
}
