package jhi;

import ard.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174255a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Flow f174256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f174257c;
    public final Function3 d;
    public final Function2 e;

    public b(Flow upstream, Function3 contentMapper, Function2 nullContentHandler, Function2 consumeErrors) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(nullContentHandler, "nullContentHandler");
        Intrinsics.checkNotNullParameter(consumeErrors, "consumeErrors");
        this.f174256b = upstream;
        this.d = contentMapper;
        this.f174257c = nullContentHandler;
        this.e = consumeErrors;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f174255a) {
            case 0:
                Object objCollect = this.f174256b.collect(new im9.k(this, new Ref$ObjectRef(), flowCollector), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f174256b.collect(new b0(flowCollector, this.f174257c, this.d, this.e, 17), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public b(Flow flow, Function2 function2, Function3 function3, Function2 function22) {
        this.f174256b = flow;
        this.f174257c = function2;
        this.d = function3;
        this.e = function22;
    }
}
