package fn5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.total.wealth.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import fjd.w;
import fk4.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yfe.h0;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f136534w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f136535x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f136536y;
    public final /* synthetic */ sfe.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Continuation continuation, j jVar, sfe.a aVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f136536y = jVar;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g gVar = new g(continuation, this.f136536y, this.z, 0);
                gVar.f136534w = flowCollector;
                gVar.f136535x = obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            default:
                g gVar2 = new g(continuation, this.f136536y, this.z, 1);
                gVar2.f136534w = flowCollector;
                gVar2.f136535x = obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f136534w;
                    int i2 = f.f136533a[((yh5.a) this.f136535x).ordinal()];
                    Continuation continuation = null;
                    if (i2 != 1) {
                        j jVar = this.f136536y;
                        if (i2 == 2) {
                            gVar = new go.g(new h0((String) jVar.i.getValue(), ty0.c.a(jVar.f136543g, new TextLocalisedClause(R$string.crypto_total_wealth_tile_subtitle, null, null, 14), jVar.f, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString()), 2);
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            wsg.b bVar = jVar.f136541b;
                            sfe.a aVar2 = this.z;
                            jhi.b bVarG = mo3.a.g(bVar.e(c8g.c.C(aVar2)), null, new r(15), 1);
                            gVar = mo3.a.g(nim.a.v(u0.m(q.Q(bVarG, new f5h.b((Continuation) null, jVar, 9)), q.Q(q.q(new a87.b(bVarG, 21)), new g(continuation, jVar, aVar2, 1))), new w(jVar, 16)), null, new r(16), 1);
                        }
                    } else {
                        gVar = new go.g(null, 2);
                    }
                    this.f136534w = null;
                    this.f136535x = null;
                    this.v = 1;
                    if (q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f136534w;
                    vkm.d dVarB = rd0.e.b(gt5.a.a(this.f136536y.f136542c, (xi0.b) this.f136535x, this.z == sfe.a.RELOAD, 2));
                    this.f136534w = null;
                    this.f136535x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, dVarB, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
