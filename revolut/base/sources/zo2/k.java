package zo2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$InputData;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import wli.x;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.bank_account_switching.impl.ui.review.b f323869w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.bank_account_switching.impl.ui.review.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f323869w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f323869w, continuation, 0);
            case 1:
                return new k(this.f323869w, continuation, 1);
            case 2:
                return new k(this.f323869w, continuation, 2);
            default:
                return new k(this.f323869w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.bank_account_switching.impl.ui.review.b bVar = this.f323869w;
                y yVar = bVar.f63971t;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    bp2.c cVar = bVar.f63968q;
                    BankAccountSwitchingReviewScreenContract$InputData bankAccountSwitchingReviewScreenContract$InputData = bVar.o;
                    mn2.a aVar2 = bankAccountSwitchingReviewScreenContract$InputData.f63961a;
                    wn2.d dVar = bankAccountSwitchingReviewScreenContract$InputData.e;
                    FormState formState = ((d) ((j2) yVar.f22677a).getValue()).f323858a;
                    LocalDate localDate = ((d) ((j2) yVar.f22677a).getValue()).f323859b;
                    wn2.a aVar3 = ((d) ((j2) yVar.f22677a).getValue()).d;
                    this.v = 1;
                    obj2 = cVar.b(aVar2, dVar, formState, localDate, aVar3, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar.H2(yVar, new znc.m((Data) obj2, 1));
                return Unit.f186387a;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.bank_account_switching.impl.ui.review.b bVar2 = this.f323869w;
                    com.revolut.feature.bank_account_switching.impl.ui.review.a aVar5 = new com.revolut.feature.bank_account_switching.impl.ui.review.a(bVar2, null);
                    this.v = 1;
                    if (u0.b0(bVar2.X(), "SUBMIT_BUTTON_LOADING", aVar5, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                x xVar = this.f323869w.f63970s;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, "revolut://app/terms/account_switching-556", null, null, this, 6);
                return objX1 == aVar6 ? aVar6 : objX1;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.bank_account_switching.impl.ui.review.b bVar3 = this.f323869w;
                zjc.g gVar = new zjc.g(1, null, bVar3);
                this.v = 1;
                Object objB0 = u0.b0(bVar3.X(), "SUBMIT_BUTTON_LOADING", gVar, this);
                return objB0 == aVar7 ? aVar7 : objB0;
        }
    }
}
