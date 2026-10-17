package c7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.t0;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21994c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Flow e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c0(Flow flow, oki.h hVar, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, long j2, int i) {
        this.f21992a = i;
        this.e = flow;
        this.f = hVar;
        this.f21993b = accountWrapper;
        this.f21994c = accountWrapper2;
        this.d = j2;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r7v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f21992a) {
            case 0:
                Object objCollect = this.e.collect(new b0(flowCollector, (com.revolut.feature_move_money.impl.automation.screen.c) this.f, (AccountWrapper) this.f21993b, (AccountWrapper) this.f21994c, this.d, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((t0) this.e).collect(new b0(flowCollector, (com.revolut.feature_move_money.impl.topup.a) this.f, (AccountWrapper) this.f21993b, (AccountWrapper) this.f21994c, this.d, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = ((v0f.p) this.e).collect(new b0(flowCollector, (gim.i) this.f, (nfj.i) this.f21993b, this.d, (gim.i) this.f21994c), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(v0f.p pVar, Function3 function3, nfj.i iVar, long j2, Function1 function1) {
        this.f21992a = 2;
        this.e = pVar;
        this.f = (gim.i) function3;
        this.f21993b = iVar;
        this.d = j2;
        this.f21994c = (gim.i) function1;
    }
}
