package al8;

import af4.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_referrals.impl.R$string;
import gim.i;
import in8.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mii.k;
import ufm.f;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.a f6164w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f6164w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f6164w, continuation, 0);
            default:
                return new c(this.f6164w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.a aVar2 = this.f6164w;
                if (i == 0) {
                    o.b(obj2);
                    f fVarM = aVar2.f77164p.m(aVar2.o.f77162c, new g(true));
                    this.v = 1;
                    if (nim.a.b(fVarM, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return l.a1(aVar2, aVar2.X1(new k("ALLOW_REFERRALS_PROMPT_SUCCESS_SHOT_ID", new TextLocalisedClause(R$string.youth_referrals_access_prompt_allowed, null, null, 14), null, null, null, 28)), null, null, new e(aVar2, null, 19), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.a aVar4 = this.f6164w;
                c cVar = new c(aVar4, null, 0);
                this.v = 1;
                Object objP2 = aVar4.p2(this, cVar);
                return objP2 == aVar3 ? aVar3 : objP2;
        }
    }
}
