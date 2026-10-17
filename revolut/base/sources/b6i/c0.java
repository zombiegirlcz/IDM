package b6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f12766c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Serializable f12767g;

    public /* synthetic */ c0(Flow flow, Object obj2, Object obj3, Object obj4, long j2, Serializable serializable, int i) {
        this.f12764a = i;
        this.f12766c = flow;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.f12765b = j2;
        this.f12767g = serializable;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f12764a) {
            case 0:
                Object objCollect = ((vkm.t0) this.f12766c).collect(new a8k.c(flowCollector, (com.revolut.feature_move_money.impl.amount.c) this.d, (AccountWrapper) this.e, (AccountWrapper) this.f, this.f12765b, (j8l.d) this.f12767g, 1), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = ((vkm.y) this.f12766c).collect(new a8k.c(flowCollector, (h2k.k) this.d, (xi0.b) this.e, (wi0.b) this.f, this.f12765b, (xi0.b) this.f12767g, 2), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
