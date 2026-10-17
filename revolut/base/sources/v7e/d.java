package v7e;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SubaccountInfoPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SubaccountInfoPickerScreen subaccountInfoPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = subaccountInfoPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarI3 = this.v.T2();
        Object obj3 = suggestion.f53496h;
        Continuation continuation = null;
        l lVar = obj3 instanceof l ? (l) obj3 : null;
        u uVar = (u) kVarI3;
        uVar.getClass();
        if (lVar != null) {
            uVar.x2(new v25.k(lVar, 17));
            a2 a2Var = uVar.z;
            if (a2Var != null) {
                a2Var.f(null);
            }
            uVar.z = uVar.l2(new v06.i(uVar, lVar, continuation, 18), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
