package t73;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class v1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f268556x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f268555w = gVar;
        this.f268556x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v1(this.f268555w, this.f268556x, continuation, 0);
            case 1:
                return new v1(this.f268555w, this.f268556x, continuation, 1);
            case 2:
                return new v1(this.f268555w, this.f268556x, continuation, 2);
            default:
                return new v1(this.f268555w, this.f268556x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268555w;
                    u1 u1Var = new u1(gVar, this.f268556x, null, 0);
                    this.v = 1;
                    if (gVar.p2(this, u1Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = this.f268555w;
                    u1 u1Var2 = new u1(gVar2, this.f268556x, null, 1);
                    this.v = 1;
                    if (gVar2.p2(this, u1Var2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                String str = this.f268556x;
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar3 = this.f268555w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    u1 u1Var3 = new u1(gVar3, str, null, 3);
                    this.v = 1;
                    if (pu7.a.B(gVar3.k, "enable_online_transactions_and_refresh", u1Var3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                gVar3.X1(new mii.k("id_shot_enable_online_transactions_success", new TextLocalisedClause(R$string.card_online_transaction_prompt_toast_message, null, null, 14), null, null, null, 28));
                gVar3.l2(new sma.f(8, gVar3, new h(7), str, (Continuation) null), new yi5.b(26));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = this.f268555w.T;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f268556x, null, null, this, 6);
                return objX1 == aVar4 ? aVar4 : objX1;
        }
    }
}
