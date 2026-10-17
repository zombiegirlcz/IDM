package g6k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f140995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MoneyRequest f140996x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(r rVar, MoneyRequest moneyRequest, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f140995w = rVar;
        this.f140996x = moneyRequest;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f140995w, this.f140996x, continuation, 0);
            case 1:
                return new k(this.f140995w, this.f140996x, continuation, 1);
            default:
                return new k(this.f140995w, this.f140996x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                bqf.g gVar = this.f140995w.f141009p;
                MoneyRequestCounterParty moneyRequestCounterParty = this.f140996x.f60320l;
                this.v = 1;
                Object objB = gVar.b(moneyRequestCounterParty, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                r rVar = this.f140995w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarE = ((u6k.c) rVar.f141007m).e(this.f140996x);
                    this.v = 1;
                    if (nim.a.a(bVarE, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return rVar.L2(new mii.f("DIALOG_ID_REMIND_TOAST", new TextLocalisedClause(R$string.money_request_core_remind_message, null, null, 14), null, null, null, null, 124));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vv9.b bVar = this.f140995w.f141008n;
                this.v = 1;
                Object objB2 = ((u6k.f) bVar).b(this.f140996x, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
