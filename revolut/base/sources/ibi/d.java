package ibi;

import com.revolut.feature_retail_user_declarations.employer.screen.a;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import gim.i;
import hbi.a;
import kbi.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.employer.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.employer.screen.a f160184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature_retail_user_declarations.employer.flow.a aVar, com.revolut.feature_retail_user_declarations.employer.screen.a aVar2, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f160184w = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f160184w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        MobileScreenParams.Employer employer;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature_retail_user_declarations.employer.flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar3 = aVar2.f97638p;
            String str = aVar2.o.f97634a;
            com.revolut.feature_retail_user_declarations.employer.screen.a aVar4 = this.f160184w;
            if (aVar4 instanceof h) {
                h hVar = (h) aVar4;
                employer = new MobileScreenParams.Employer(false, hVar.f182601a, hVar.f182602b);
            } else {
                if (!Intrinsics.f(aVar4, a.C0594a.f97645a)) {
                    throw new NoWhenBranchMatchedException();
                }
                employer = new MobileScreenParams.Employer(true, null, null);
            }
            this.u = 1;
            if (aVar3.j(str, employer, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar2.C2(a.C0865a.f150752a);
        return Unit.f186387a;
    }
}
