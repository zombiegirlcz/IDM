package qng;

import com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.AddressSuggestionScreen;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddressSuggestionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AddressSuggestionScreen addressSuggestionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addressSuggestionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
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
        AddressSuggestionScreen addressSuggestionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) addressSuggestionScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) addressSuggestionScreen.e3();
                WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem = ((e) ((j2) kVar.o.f22677a).getValue()).f247942b;
                if (addressSuggestionItem == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("onContinueClicked called with no selected item");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    kVar.C2(new g(addressSuggestionItem));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) addressSuggestionScreen.e3()).C2(f.f247943a);
                break;
        }
        return Unit.f186387a;
    }
}
