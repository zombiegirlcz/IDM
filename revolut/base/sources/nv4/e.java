package nv4;

import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardStatementExportScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditCardStatementExportScreen creditCardStatementExportScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardStatementExportScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardStatementExportScreen creditCardStatementExportScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement.export.b bVar = (com.revolut.feature.credit.card.impl.ui.statement.export.b) creditCardStatementExportScreen.e3();
                int i2 = q.f219474a[((i) ((j2) bVar.f69703t.f22677a).getValue()).f219465b.ordinal()];
                if (i2 == 1) {
                    bVar.n2(new u(bVar, null, 2), new whi.b(6));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.n2(new u(bVar, null, 1), new nb6.p(1, bVar, com.revolut.feature.credit.card.impl.ui.statement.export.b.class, "showCommonErrorDialog", "showCommonErrorDialog(Ljava/lang/Throwable;)Z", 0, 16));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.statement.export.b) creditCardStatementExportScreen.e3()).B2();
                return Unit.f186387a;
        }
    }
}
