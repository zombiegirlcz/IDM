package o22;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.ui.impl.ui.new_alias.ApmNewAliasScreen;
import com.revolut.feature.picker.PickerController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nya.b0;
import s7a.x;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ApmNewAliasScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ApmNewAliasScreen apmNewAliasScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = apmNewAliasScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        ApmNewAliasScreen apmNewAliasScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                apmNewAliasScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) apmNewAliasScreen.R2();
                nVar.getClass();
                nVar.l2(new m(nVar, continuation, 0), new yi5.b(26));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar2 = (n) apmNewAliasScreen.R2();
                nVar2.getClass();
                b bVar = (b) ((a) ((j2) nVar2.u.f22677a).getValue()).f221417b.getContent();
                x xVar = new x(null, null, null, null, false, null, new TextLocalisedClause(R.string.search_country, null, null, 14), null, null, false, null, bVar != null ? bVar.f221419a.f297794a : null, null, null, true, null, null, null, null, null, 2138963454);
                Object obj3 = nVar2.f221432t.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                nVar2.f2(new PickerController(xVar, (x7a.d) obj3), ModalDestination.Style.POPUP.f98311a, new b0(nVar2, 18));
                break;
        }
        return Unit.f186387a;
    }
}
