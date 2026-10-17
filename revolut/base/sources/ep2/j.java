package ep2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.bank_account_switching.impl.ui.review_joint.a f128071w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.feature.bank_account_switching.impl.ui.review_joint.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f128071w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f128071w, continuation, 0);
            default:
                return new j(this.f128071w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.bank_account_switching.impl.ui.review_joint.a aVar2 = this.f128071w;
                if (i == 0) {
                    o.b(obj2);
                    bp2.c cVar = aVar2.f63980p;
                    String str = ((f) ((j2) aVar2.f63982r.f22677a).getValue()).f128067a;
                    this.v = 1;
                    if (cVar.a(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar2.I2(new TextLocalisedClause(R$string.account_switch_request_review_in_joint_outcome_accept, null, null, 14));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.bank_account_switching.impl.ui.review_joint.a aVar4 = this.f128071w;
                if (i2 == 0) {
                    o.b(obj2);
                    bp2.c cVar2 = aVar4.f63980p;
                    String str2 = ((f) ((j2) aVar4.f63982r.f22677a).getValue()).f128067a;
                    this.v = 1;
                    if (cVar2.c(str2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar4.I2(new TextLocalisedClause(R$string.account_switch_request_review_in_joint_outcome_decline, null, null, 14));
                return Unit.f186387a;
        }
    }
}
