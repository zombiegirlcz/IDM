package h6i;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f149745c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Flow f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Serializable f149746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f149747h;

    public /* synthetic */ z(vkm.d dVar, Object obj2, Serializable serializable, xi0.b bVar, Object obj3, Object obj4, Object obj5, int i) {
        this.f149743a = i;
        this.f = dVar;
        this.e = obj2;
        this.f149747h = serializable;
        this.f149746g = bVar;
        this.f149745c = obj3;
        this.d = obj4;
        this.f149744b = obj5;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f149743a) {
            case 0:
                Object objCollect = this.f.collect(new y(flowCollector, (b6i.l) this.e, (xi0.b) this.f149746g, (AccountWrapper) this.f149745c, (e0) this.f149744b, (xi0.b) this.f149747h, (AccountWrapper) this.d), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((jhi.b) this.f).collect(new y(flowCollector, (e0) this.f149744b, (AccountWrapper) this.f149745c, (AccountWrapper) this.d, (b6i.j) this.f149746g, (b6i.l) this.e, (OrderMode) this.f149747h), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((vkm.d) this.f).collect(new c2d.f(flowCollector, (nj5.h) this.e, (String) this.f149747h, (xi0.b) this.f149746g, (String) this.f149745c, (wk5.a) this.d, (String) this.f149744b), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect4 = ((vkm.d) this.f).collect(new y(flowCollector, (urj.n) this.e, (uzi.b) this.f149747h, (xi0.b) this.f149746g, (od0.i) this.f149745c, (List) this.d, (AccountId) this.f149744b), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public z(jhi.b bVar, e0 e0Var, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, b6i.j jVar, b6i.l lVar, OrderMode orderMode) {
        this.f149743a = 1;
        this.f = bVar;
        this.f149744b = e0Var;
        this.f149745c = accountWrapper;
        this.d = accountWrapper2;
        this.f149746g = jVar;
        this.e = lVar;
        this.f149747h = orderMode;
    }

    public z(Flow flow, b6i.l lVar, xi0.b bVar, AccountWrapper accountWrapper, e0 e0Var, xi0.b bVar2, AccountWrapper accountWrapper2) {
        this.f149743a = 0;
        this.f = flow;
        this.e = lVar;
        this.f149746g = bVar;
        this.f149745c = accountWrapper;
        this.f149744b = e0Var;
        this.f149747h = bVar2;
        this.d = accountWrapper2;
    }
}
