package hdk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.plan_rewards.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d f151474w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f151474w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f151474w, continuation, 0);
            default:
                return new h(this.f151474w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    gdk.d dVar = this.f151474w.f102554q;
                    this.v = 1;
                    if (((gdk.g) dVar).a(this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d dVar2 = this.f151474w;
                if (i2 == 0) {
                    o.b(obj2);
                    i iVar = new i(dVar2, null, 3);
                    this.v = 1;
                    if (u0.b0(dVar2.X(), "LOADING_TAG_OPT_OUT", iVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                dVar2.X1(new mii.k("OPT_OUT_SUCCESS_SHOT", new TextLocalisedClause(R$string.premium_monthly_draws_opt_out_footer_success, null, null, 14), null, null, null, 28));
                dVar2.B2();
                return Unit.f186387a;
        }
    }
}
