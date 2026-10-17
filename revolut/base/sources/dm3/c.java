package dm3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreen;
import com.revolut.retail.common.ui.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ContactDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ContactDetailsScreen contactDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = contactDetailsScreen;
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
        ContactDetailsScreen contactDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                contactDetailsScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar3 = (com.revolut.feature.contacts.impl.ui.contact.screen.details.a) contactDetailsScreen.e3();
                zm3.a aVar4 = ((e) ((j2) aVar3.G.f22677a).getValue()).f115827a;
                zm3.l lVar = aVar4 instanceof zm3.l ? (zm3.l) aVar4 : null;
                if (lVar != null) {
                    aVar3.C2(new h(lVar));
                }
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar6 = (com.revolut.feature.contacts.impl.ui.contact.screen.details.a) contactDetailsScreen.e3();
                zm3.a aVar7 = ((e) ((j2) aVar6.G.f22677a).getValue()).f115827a;
                if (aVar7 instanceof zm3.l) {
                    aVar6.f66014y.a(null, ((zm3.l) aVar7).N0(), false);
                    if (!c70.a.g()) {
                        aVar6.X1(new mii.f("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, null, 124));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
