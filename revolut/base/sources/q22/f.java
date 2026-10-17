package q22;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.ApmNewContactScreen;
import com.revolut.feature.picker.PickerController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pwb.p;
import s7a.x;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ApmNewContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ApmNewContactScreen apmNewContactScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = apmNewContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ApmNewContactScreen apmNewContactScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                apmNewContactScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar3 = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) apmNewContactScreen.R2();
                aVar3.getClass();
                aVar3.l2(new p(aVar3, null, 6), new yi5.b(26));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar5 = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) apmNewContactScreen.R2();
                aVar5.getClass();
                x xVar = new x(null, null, null, null, false, null, new TextLocalisedClause(R.string.search_country, null, null, 14), null, null, false, null, ((a) ((j2) aVar5.u.f22677a).getValue()).f241484b.f297794a, null, null, true, null, null, null, null, null, 2138963454);
                Object obj3 = aVar5.f62355t.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                aVar5.f2(new PickerController(xVar, (x7a.d) obj3), ModalDestination.Style.POPUP.f98311a, new l(aVar5, 1));
                break;
        }
        return Unit.f186387a;
    }
}
