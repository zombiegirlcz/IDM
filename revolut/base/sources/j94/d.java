package j94;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsController;
import j87.m;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DebtDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DebtDetailsController debtDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = debtDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.R2();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        y yVar = aVar2.f67509t;
        for (my3.o oVar : ((f) ((j2) yVar.f22677a).getValue()).f172280a) {
            if (Intrinsics.f(oVar.getId(), listId)) {
                aVar2.H2(yVar, new m(aVar2.I2(oVar, text), 2));
                return Unit.f186387a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
