package gsh;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements FlowCollector, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f146495b;

    public /* synthetic */ m(ProducerScope producerScope, int i) {
        this.f146494a = i;
        this.f146495b = producerScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f146494a) {
            case 0:
                Object objSend = this.f146495b.send((List) obj2, continuation);
                if (objSend != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objSend2 = this.f146495b.send((Data) obj2, continuation);
                if (objSend2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objSend3 = this.f146495b.send(obj2, continuation);
                if (objSend3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objSend4 = this.f146495b.send(obj2, continuation);
                if (objSend4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objSend5 = this.f146495b.send((List) obj2, continuation);
                if (objSend5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objSend6 = this.f146495b.send((Data) obj2, continuation);
                if (objSend6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public final boolean equals(Object obj2) {
        switch (this.f146494a) {
            case 0:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 1:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 2:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 3:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 4:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f146494a) {
        }
        return new kotlin.jvm.internal.q(2, 0, ProducerScope.class, this.f146495b, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        switch (this.f146494a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
