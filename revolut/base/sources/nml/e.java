package nml;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CountrySelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CountrySelectionScreen countrySelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = countrySelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.sso.impl.ui.country_selection.b bVar = (com.revolut.sso.impl.ui.country_selection.b) iVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bVar.I2();
        String listId = model.f52519a;
        boolean z = model.f52521c;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listId, "listId");
        bVar.H2(bVar.f106507r, new nc1.j(Intrinsics.f(listId, "country_explicit_consent_item_id") ? Boolean.valueOf(!z) : null, bVar, 19));
        return Unit.f186387a;
    }
}
