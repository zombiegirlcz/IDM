package xng;

import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreen;
import com.revolut.feature.user_declarations.shared.flows.income.screen.a;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeScreen f307487w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(IncomeScreen incomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307487w = incomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f307487w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f307487w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IncomeScreen incomeScreen = this.f307487w;
        switch (i) {
            case 0:
                y clickData = (y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarR2 = incomeScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.user_declarations.shared.flows.income.screen.b bVar = (com.revolut.feature.user_declarations.shared.flows.income.screen.b) jVarR2;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                bVar.H2(bVar.f94636t, new xe7.a(clickData, 28));
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarR22 = incomeScreen.R2();
                Intrinsics.h(clickData2);
                com.revolut.feature.user_declarations.shared.flows.income.screen.b bVar2 = (com.revolut.feature.user_declarations.shared.flows.income.screen.b) jVarR22;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                bVar2.C2(a.C0580a.f94631a);
                break;
        }
        return Unit.f186387a;
    }
}
