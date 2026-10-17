package g37;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.TaxHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TaxHubScreen f140216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TaxHubScreen taxHubScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140216w = taxHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f140216w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f140216w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TaxHubScreen taxHubScreen = this.f140216w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = taxHubScreen.R2();
                Intrinsics.h(listId);
                com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e eVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e) rVarE3;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "LIST_ID_MENU_SETTINGS")) {
                    eVar.C2(l.f140220a);
                }
                break;
            default:
                com.revolut.core.ui_kit.delegates.t data = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = taxHubScreen.R2();
                Intrinsics.h(data);
                com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e eVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e) rVarE32;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                if (Intrinsics.f(data.f54722b.f51590a, "LIST_ID_TAX_POCKET_BANNER")) {
                    ActionWidgetDelegate.a aVar3 = data.f54721a;
                    Continuation continuation = null;
                    if (Intrinsics.f(aVar3, ActionWidgetDelegate.a.C0395a.f51607a)) {
                        eVar2.n2(new y(0, eVar2, continuation), new whi.b(6));
                    } else if (Intrinsics.f(aVar3, ActionWidgetDelegate.a.c.f51609a)) {
                        eVar2.n2(new y(1, eVar2, continuation), new whi.b(6));
                    } else {
                        Unit unit = Unit.f186387a;
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
