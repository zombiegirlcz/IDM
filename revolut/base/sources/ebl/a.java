package ebl;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreen;
import ecd.b1;
import ecd.e3;
import ecd.h4;
import ecd.j3;
import ecd.l2;
import ecd.n4;
import ecd.p;
import ecd.q2;
import ecd.r4;
import ecd.s4;
import ecd.t1;
import ecd.t4;
import ecd.u2;
import ecd.w1;
import ecd.w3;
import ef2.i;
import egb.f0;
import egb.g0;
import egb.l;
import egb.u;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import qlm.d1;
import qlm.h0;
import qlm.j1;
import qlm.v1;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124382a;

    public /* synthetic */ a(int i) {
        this.f124382a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f124382a) {
            case 0:
                return v.k(new PlainTextDelegate(), new TextDelegate(), new ListCellDelegate(), new InputDisclosureDelegate(), new ListCellBulletDelegate(), new RowLoadingDelegate(), new ErrorDelegate(), new CounterTextDelegate());
            case 1:
                return new qlm.e(w1.f124695a);
            case 2:
                return new qlm.e(v1.f247718a);
            case 3:
                return new qlm.e(b1.f124493a);
            case 4:
                return new qlm.e(t1.f124674a);
            case 5:
                return new qlm.e(l2.f124608a);
            case 6:
                return new qlm.e(u2.f124682a);
            case 7:
                return new qlm.e(q2.f124652a);
            case 8:
                return new qlm.e(l2.f124608a);
            case 9:
                return new qlm.e(e3.f124537a);
            case 10:
                return new qlm.e(p.f124640a);
            case 11:
                return new qlm.e(j3.f124592a);
            case 12:
                return new qlm.e(j3.f124592a);
            case 13:
                return new qlm.e(s4.Companion.serializer());
            case 14:
                return new qlm.e(w3.f124699a);
            case 15:
                return new qlm.e(t4.f124680a);
            case 16:
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 17:
                return new qlm.e(h4.f124566a);
            case 18:
                return new d1("com.revolut.feature.shared.savings.impl.product.data.dto.SavingsProductDto.LimitDto.UnknownLimitDto", r4.INSTANCE, new Annotation[]{new n4()});
            case 19:
                return j1.b("com.revolut.feature.apm.upi.impl.data.network.model.UpiPeriodDto", i.values());
            case 20:
                UpiTransferReviewScreen.a aVar = UpiTransferReviewScreen.Companion;
                return new CellDetailsActionDelegate();
            case 21:
                UpiTransferReviewScreen.a aVar2 = UpiTransferReviewScreen.Companion;
                return new CellDetailsDelegate();
            case 22:
                UpiTransferReviewScreen.a aVar3 = UpiTransferReviewScreen.Companion;
                return new CellDetailsNoteDelegate();
            case 23:
                UpiTransferReviewScreen.a aVar4 = UpiTransferReviewScreen.Companion;
                return new LargeActionButtonDelegate();
            case 24:
                return new qlm.e(g0.Companion.serializer());
            case 25:
                return new qlm.e(egb.d.f125586a);
            case 26:
                return new qlm.e(egb.p.f125607a);
            case 27:
                return new qlm.e(l.f125602a);
            case 28:
                return new qlm.e(u.f125620a);
            default:
                return new d1("com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotionBlock.Unknown", f0.INSTANCE, new Annotation[]{new bka.b(9)});
        }
    }
}
