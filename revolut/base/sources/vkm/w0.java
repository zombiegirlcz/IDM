package vkm;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes13.dex */
public final class w0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f290135b;

    public /* synthetic */ w0(Ref$ObjectRef ref$ObjectRef, int i) {
        this.f290134a = i;
        this.f290135b = ref$ObjectRef;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f290134a) {
            case 0:
                this.f290135b.f186409a = obj2;
                throw new AbortFlowException(this);
            default:
                this.f290135b.f186409a = obj2;
                throw new AbortFlowException(this);
        }
    }
}
