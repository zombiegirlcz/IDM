package wl8;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f298453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f298454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a f298455y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f298455y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                l lVar = new l(0, this.f298455y, continuation);
                lVar.f298453w = flowCollector;
                lVar.f298454x = obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            default:
                l lVar2 = new l(1, this.f298455y, continuation);
                lVar2.f298453w = flowCollector;
                lVar2.f298454x = obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f298453w;
                    cbh.f fVarG = t1.g(this.f298455y.f77221s, 1000L);
                    this.f298453w = null;
                    this.f298454x = null;
                    this.v = 1;
                    if (q.u(flowCollector, fVarG, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f298453w;
                    String str = (String) this.f298454x;
                    q0 q0VarN = rd0.e.n(this.f298455y.f77218p.a(str), h0.f322473a);
                    this.f298453w = null;
                    this.f298454x = null;
                    this.v = 1;
                    q.w(flowCollector2);
                    Object objCollect = q0VarN.collect(new nj8.g(flowCollector2, str, 17), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
