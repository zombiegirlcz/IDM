package fi8;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreen;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.mapper.CheckboxParcel;
import f9g.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorDetailsConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JuniorDetailsConfirmationScreen juniorDetailsConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorDetailsConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model item = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(item);
        k kVar = (k) hVarE3;
        y yVar = kVar.f135355r;
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj3 = ((TextDelegate.Model) item.f53305b).f53534g;
        if (obj3 instanceof CheckboxParcel.Mandatory) {
            kVar.H2(yVar, new l(((CheckboxParcel.Mandatory) obj3).f77032a, 13));
        } else if (obj3 instanceof CheckboxParcel.Consent) {
            kVar.H2(yVar, new l(((CheckboxParcel.Consent) obj3).f77031a.f76951a, 14));
        }
        return Unit.f186387a;
    }
}
