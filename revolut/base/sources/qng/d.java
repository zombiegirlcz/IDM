package qng;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.AddressSuggestionScreen;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddressSuggestionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AddressSuggestionScreen addressSuggestionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addressSuggestionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.R2();
        Object obj3 = model.k;
        WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem = obj3 instanceof WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem ? (WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem) obj3 : null;
        k kVar = (k) iVarE3;
        if (addressSuggestionItem == null) {
            kVar.getClass();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("item is null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        } else {
            kVar.H2(kVar.o, new qgf.o(addressSuggestionItem, 16));
        }
        return Unit.f186387a;
    }
}
