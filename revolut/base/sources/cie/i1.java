package cie;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i1 implements FlowCollector, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f24491b;

    public /* synthetic */ i1(FlowCollector flowCollector, int i) {
        this.f24490a = i;
        this.f24491b = flowCollector;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f24490a) {
            case 0:
                Object objEmit = this.f24491b.emit((Data) obj2, continuation);
                if (objEmit != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objEmit2 = this.f24491b.emit((Data) obj2, continuation);
                if (objEmit2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objEmit3 = this.f24491b.emit((Data) obj2, continuation);
                if (objEmit3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objEmit4 = this.f24491b.emit((Data) obj2, continuation);
                if (objEmit4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objEmit5 = this.f24491b.emit((Map) obj2, continuation);
                if (objEmit5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objEmit6 = this.f24491b.emit((Data) obj2, continuation);
                if (objEmit6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objEmit7 = this.f24491b.emit((Data) obj2, continuation);
                if (objEmit7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public final boolean equals(Object obj2) {
        switch (this.f24490a) {
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
            case 5:
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
        switch (this.f24490a) {
        }
        return new kotlin.jvm.internal.q(2, 0, FlowCollector.class, this.f24491b, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        switch (this.f24490a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
