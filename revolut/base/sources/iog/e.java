package iog;

import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreenContract$ModalStep;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.a;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PepFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PepFormScreen pepFormScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pepFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PepFormScreen pepFormScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b bVar = (com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b) pepFormScreen.e3();
                bVar.C2(new g(((f) ((j2) bVar.f94657p.f22677a).getValue()).f163318a));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b) pepFormScreen.e3()).C2(a.C0581a.f94656a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.b) pepFormScreen.e3()).f94658q, PepFormScreenContract$ModalStep.Help.f94654a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
