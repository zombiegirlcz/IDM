package a15;

import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsight;
import com.revolut.feature.credit.health.impl.ui.insights.InsightsScreen;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InsightsScreen f533w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(InsightsScreen insightsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f533w = insightsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f533w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f533w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((CreditScoreInsight) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        int i = this.u;
        InsightsScreen insightsScreen = this.f533w;
        switch (i) {
            case 0:
                CreditScoreInsight insight = (CreditScoreInsight) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarD3 = insightsScreen.d3();
                mVarD3.getClass();
                Intrinsics.checkNotNullParameter(insight, "insight");
                mVarD3.C2(new i(insight));
                break;
            default:
                LocalDate date = (LocalDate) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarD32 = insightsScreen.d3();
                mVarD32.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                mVarD32.H2(mVarD32.f542q, new l(0, date));
                j2 j2Var = mVarD32.f541p;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, date));
                break;
        }
        return Unit.f186387a;
    }
}
