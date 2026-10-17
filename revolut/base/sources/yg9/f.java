package yg9;

import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yg6.v;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SubformScreen f313581w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(SubformScreen subformScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f313581w = subformScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f313581w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f313581w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f313581w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object[] objArr = 0;
        SubformScreen subformScreen = this.f313581w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = subformScreen.d();
                Intrinsics.h(menuItemId);
                com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a aVar2 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) mVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("SUBFORM_MENU_ITEM_REMOVE")) {
                    List userInputs = aVar2.u;
                    SubformScreenContract$InputData subformScreenContract$InputData = aVar2.o;
                    String name = subformScreenContract$InputData.f78727b;
                    String str = subformScreenContract$InputData.f78730h;
                    String str2 = subformScreenContract$InputData.i;
                    Intrinsics.checkNotNullParameter(userInputs, "userInputs");
                    Intrinsics.checkNotNullParameter(name, "name");
                    aVar2.l2(new v(aVar2, str == null ? of9.d.d(name, userInputs) : str2 != null ? of9.d.e(name, str, str2, userInputs) : of9.d.c(name, str, userInputs), objArr == true ? 1 : 0, 1), new yi5.b(26));
                }
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = subformScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a aVar4 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) mVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str3 = clickData.f275445a;
                if (a0.H(str3, "HEADER_TOOLTIP_ID_PREFIX", false)) {
                    Object obj3 = clickData.d;
                    BillFormField.Tooltip tooltip = obj3 instanceof BillFormField.Tooltip ? (BillFormField.Tooltip) obj3 : null;
                    if (tooltip != null) {
                        of9.n nVar = aVar4.f78739s;
                        String str4 = tooltip.f61290b;
                        if (str4 != null) {
                            String str5 = tooltip.f61291c;
                            nVar.getClass();
                            aVar4.C1(new com.revolut.kompot.common.b(of9.n.a(str4, str5), ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
                        }
                    }
                } else if (clickData.f275447c instanceof HtmlClause) {
                    aVar4.C1(new ExternalDestination.Browser(str3, null));
                }
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE33 = subformScreen.d();
                Intrinsics.h(clickData2);
                com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a aVar6 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) mVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                if (clickData2.f275447c instanceof HtmlClause) {
                    aVar6.C1(new ExternalDestination.Browser(clickData2.f275445a, null));
                }
                break;
        }
        return Unit.f186387a;
    }
}
