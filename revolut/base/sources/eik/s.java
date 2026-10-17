package eik;

import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g f126687w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f126687w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f126687w, continuation, 0);
            default:
                return new s(this.f126687w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar = this.f126687w;
                    e94.g gVar2 = new e94.g(gVar, null, 2);
                    this.v = 1;
                    if (gVar.p2(this, gVar2) == aVar) {
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
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar3 = this.f126687w;
                lx0.j jVar = gVar3.f103238w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = gVar3.O2(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                String str = (String) obj2;
                if (str == null) {
                    return Unit.f186387a;
                }
                if (!jVar.a(str)) {
                    pfm.r rVarB = jVar.b(str);
                    Set customKeys = y0.b(new Pair("PlanReferralsSenderFlowModel", "Unable to preload invitation video"));
                    Intrinsics.checkNotNullParameter(rVarB, "<this>");
                    Intrinsics.checkNotNullParameter(customKeys, "customKeys");
                    pfm.a aVar3 = new pfm.a(ue0.e.r(rVarB, customKeys), mfm.f.f205044g, 1);
                    Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorComplete(...)");
                    this.v = 2;
                    if (nim.a.a(aVar3, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f186387a;
        }
    }
}
