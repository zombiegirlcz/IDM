package a9a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias.InputAliasScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s7a.x;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InputAliasScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InputAliasScreen inputAliasScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = inputAliasScreen;
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
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InputAliasScreen inputAliasScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                inputAliasScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) inputAliasScreen.e3();
                kVar.C2(((f) ((j2) kVar.f2400t.f22677a).getValue()).f2390a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) inputAliasScreen.e3();
                AliasRegistrationType.Inputtable inputtable = ((f) ((j2) kVar2.f2400t.f22677a).getValue()).f2390a;
                AliasRegistrationType.Phone phone = inputtable instanceof AliasRegistrationType.Phone ? (AliasRegistrationType.Phone) inputtable : null;
                if (phone != null) {
                    x xVar = new x(null, null, null, null, false, null, new TextLocalisedClause(R.string.search_country, null, null, 14), null, null, false, null, String.valueOf(phone.f80391b.f80395a), null, null, true, null, null, null, null, null, 2138963454);
                    Object obj3 = kVar2.f2397q.get();
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    kVar2.f2(new PickerController(xVar, (x7a.d) obj3), ModalDestination.Style.POPUP.f98311a, new a08.o(kVar2, phone, 22));
                }
                break;
        }
        return Unit.f186387a;
    }
}
