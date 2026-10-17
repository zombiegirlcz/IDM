package rp9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen;
import com.revolut.feature.payments.groups.api.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BillsChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(BillsChooserScreen billsChooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = billsChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BillsChooserScreen billsChooserScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                billsChooserScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = (m) billsChooserScreen.T2();
                int size = ((a) mVar.t2()).f256290b.size();
                SplitMethod.Multiple multiple = SplitMethod.Multiple.f79178a;
                if (size == 1 || !mVar.f256302p.f79186a) {
                    mVar.v2(new bp9.b(((a) mVar.t2()).f256290b, multiple));
                } else {
                    j60.a aVar3 = mVar.f256305s;
                    mVar.f256304r.getClass();
                    t tVar = new t(new TextLocalisedClause(R$string.split_bill_summary_method_bottom_sheet_title, null, null, 14), null, null, 30);
                    List listK = v.k(new RowDelegate.Model("BILL_SELECTION_CONFIRMATION_MULTIPLE_ID", new RowDelegate.Model.MainImage.Image40(h5k.a.b(R$drawable.uikit_icn_24_pie_chart), null, null, false, null, false, 62), new TextLocalisedClause(R$string.split_bill_summary_method_together_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.split_bill_summary_method_together_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, multiple, null, 0, 0, 0, 0, 532676568), new RowDelegate.Model("BILL_SELECTION_CONFIRMATION_INDIVIDUALLY_ID", new RowDelegate.Model.MainImage.Image40(h5k.a.b(R$drawable.uikit_icn_24_pencil), null, null, false, null, false, 62), new TextLocalisedClause(R$string.split_bill_summary_method_separate_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.split_bill_summary_method_separate_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, SplitMethod.Individually.f79177a, null, 0, 0, 0, 0, 532676568));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    aVar3.x(new y(listK, tVar, rp0.l.WINDOW, null, null, null, 1016));
                }
                break;
        }
        return Unit.f186387a;
    }
}
