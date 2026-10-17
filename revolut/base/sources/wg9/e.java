package wg9;

import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreenContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FormScreen f297247w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(FormScreen formScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297247w = formScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f297247w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f297247w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f297247w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FormScreen formScreen = this.f297247w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = formScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar2 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) mVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (clickData.f275447c instanceof HtmlClause) {
                    aVar2.C1(new ExternalDestination.Browser(clickData.f275445a, null));
                }
                break;
            case 1:
                String menuItemId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = formScreen.d();
                Intrinsics.h(menuItemId);
                com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar4 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) mVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("ERRORS_MENU_ITEM_ID")) {
                    oki.h.v2(aVar4.u, new FormScreenContract$ModalStep.Errors(((k) ((j2) aVar4.v.f22677a).getValue()).f297248a, null), ModalDestination.Style.POPUP.f98311a);
                }
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE33 = formScreen.d();
                Intrinsics.h(clickData2);
                com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar6 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) mVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                String str = clickData2.f275445a;
                if (a0.H(str, "HEADER_TOOLTIP_ID_PREFIX", false)) {
                    Object obj3 = clickData2.d;
                    BillFormField.Tooltip tooltip = obj3 instanceof BillFormField.Tooltip ? (BillFormField.Tooltip) obj3 : null;
                    if (tooltip != null) {
                        of9.n nVar = aVar6.f78725t;
                        String str2 = tooltip.f61290b;
                        if (str2 != null) {
                            String str3 = tooltip.f61291c;
                            nVar.getClass();
                            aVar6.C1(new com.revolut.kompot.common.b(of9.n.a(str2, str3), ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
                        }
                    }
                } else if (clickData2.f275447c instanceof HtmlClause) {
                    aVar6.C1(new ExternalDestination.Browser(str, null));
                }
                break;
        }
        return Unit.f186387a;
    }
}
