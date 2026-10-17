package o3j;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector.DefinitionSelectorContract$Choice;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector.DefinitionSelectorController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DefinitionSelectorController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DefinitionSelectorController definitionSelectorController, Continuation continuation) {
        super(2, continuation);
        this.v = definitionSelectorController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = this.v.S;
        Intrinsics.h(model);
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        DefinitionSelectorContract$Choice definitionSelectorContract$Choice = obj3 instanceof DefinitionSelectorContract$Choice ? (DefinitionSelectorContract$Choice) obj3 : null;
        if (definitionSelectorContract$Choice == null) {
            hx7.e.n(new IllegalStateException(a0.d.m(obj3, "Unknown parcel type ")));
        } else {
            dVar.C2(new b(definitionSelectorContract$Choice));
        }
        return Unit.f186387a;
    }
}
