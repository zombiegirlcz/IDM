package s15;

import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesController;
import h15.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import l15.f;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FinancialDifficultiesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FinancialDifficultiesController financialDifficultiesController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = financialDifficultiesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FinancialDifficultiesController financialDifficultiesController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) financialDifficultiesController.d()).C2(c.a.f148464a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) financialDifficultiesController.d();
                f.b bVar = (f.b) zi0.c.I(((f) ((j2) lVar.f259095r.f22677a).getValue()).f259085a);
                boolean z = bVar instanceof l15.h;
                c.C0856c c0856c = c.C0856c.f148466a;
                if (z) {
                    lVar.C2(c0856c);
                } else {
                    if (!(bVar instanceof l15.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l15.j jVar = ((l15.g) bVar).f191461a.f;
                    int i2 = jVar == null ? -1 : i.f259089a[jVar.ordinal()];
                    if (i2 == -1) {
                        int i3 = jli.h.f175850a;
                    } else if (i2 == 1) {
                        lVar.C2(c0856c);
                    } else if (i2 == 2) {
                        lVar.C2(c.b.f148465a);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lVar.I2();
                    }
                }
                return Unit.f186387a;
        }
    }
}
