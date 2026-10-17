package yb4;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s7a.l0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FinancialSituationChangesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FinancialSituationChangesScreen financialSituationChangesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = financialSituationChangesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputChecklistDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.TextData textData = (InputChecklistDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.O.getValue();
        String id10 = textData.f52532a;
        String text = textData.f52533b.toString();
        jVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        jVar.H2(jVar.f312189p, new l0(id10, text, 7));
        return Unit.f186387a;
    }
}
