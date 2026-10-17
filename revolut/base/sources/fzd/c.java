package fzd;

import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ConsolidatedStatementCustomisationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = consolidatedStatementCustomisationScreen;
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
        ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                consolidatedStatementCustomisationScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) consolidatedStatementCustomisationScreen.R2();
                cli.y yVar = uVar.u;
                CustomisationParameters customisationParameters = (CustomisationParameters) ((j) ((j2) yVar.f22677a).getValue()).f139143a.getContent();
                if (customisationParameters != null) {
                    uVar.C2(new k(customisationParameters, ((j) ((j2) yVar.f22677a).getValue()).f139144b));
                } else {
                    uVar.B2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
