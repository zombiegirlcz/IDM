package z6k;

import com.revolut.data.model.Data;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b f319792w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f319792w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h0 h0Var = new h0(this.f319792w, continuation, 0);
                h0Var.v = obj2;
                return h0Var;
            default:
                h0 h0Var2 = new h0(this.f319792w, continuation, 1);
                h0Var2.v = obj2;
                return h0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h0) create((i6k.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b bVar = this.f319792w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new yvk.n(data, 17));
                return Unit.f186387a;
            default:
                i6k.e eVar = (i6k.e) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((eVar instanceof i6k.b) || (eVar instanceof i6k.c) || (eVar instanceof i6k.d)) {
                    FlowExtras f102149b = bVar.f102158s.getF102149b();
                    NaviCommand naviCommand = f102149b != null ? f102149b.f98611a : null;
                    if (naviCommand != null) {
                        bVar.C1(u0.b(naviCommand));
                    } else {
                        bVar.B2();
                    }
                } else if (!(eVar instanceof i6k.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
