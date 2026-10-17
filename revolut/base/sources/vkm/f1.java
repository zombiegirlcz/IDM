package vkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class f1 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f290021b;

    public /* synthetic */ f1(Ref$ObjectRef ref$ObjectRef, int i) {
        this.f290020a = i;
        this.f290021b = ref$ObjectRef;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f290020a) {
            case 0:
                this.f290021b.f186409a = obj2;
                break;
            default:
                this.f290021b.f186409a = obj2;
                break;
        }
        return Unit.f186387a;
    }
}
