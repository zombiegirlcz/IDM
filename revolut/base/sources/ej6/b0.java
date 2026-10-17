package ej6;

import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d f126722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f126722w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f126722w, continuation, 0);
                b0Var.v = obj2;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(this.f126722w, continuation, 1);
                b0Var2.v = obj2;
                return b0Var2;
            case 2:
                b0 b0Var3 = new b0(this.f126722w, continuation, 2);
                b0Var3.v = obj2;
                return b0Var3;
            case 3:
                b0 b0Var4 = new b0(this.f126722w, continuation, 3);
                b0Var4.v = obj2;
                return b0Var4;
            default:
                b0 b0Var5 = new b0(this.f126722w, continuation, 4);
                b0Var5.v = obj2;
                return b0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b0) create((i0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b0) create((AccountWrapper) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b0) create((sh5.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d dVar = this.f126722w;
        switch (i) {
            case 0:
                i0 i0Var = (i0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.D, new ei8.d(i0Var, 3));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                OutboundPaymentExtras outboundPaymentExtras = null;
                if (data.getError() != null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Error while fetching payment extras", data.getError());
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else if (data.getContent() != null) {
                    outboundPaymentExtras = (OutboundPaymentExtras) data.getContent();
                }
                dVar.H2(dVar.D, new ei8.d(outboundPaymentExtras, 4));
                break;
            case 2:
                AccountWrapper accountWrapper = (AccountWrapper) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.D, new d0(accountWrapper, 1));
                break;
            case 3:
                sh5.c cVar = (sh5.c) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.D, new bke.o(cVar, 5));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.D, new ec6.l(data2, 16));
                break;
        }
        return Unit.f186387a;
    }
}
