package up2;

import aw0.c7;
import aw0.o9;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreen;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutRequestStatus;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.obligated_products.SwitchOutObligatedProductsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.obligated_products.SwitchOutObligatedProductsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.y0;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BankAccountSwitchingReviewOutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bankAccountSwitchingReviewOutScreen;
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
        TextLocalisedClause textLocalisedClause;
        int i = this.u;
        BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bankAccountSwitchingReviewOutScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar3 = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a) bankAccountSwitchingReviewOutScreen.R2();
                SwitchOutReview switchOutReview = (SwitchOutReview) ((e) ((j2) aVar3.f64058s.f22677a).getValue()).f281817b.getContent();
                if (switchOutReview != null) {
                    SwitchOutRequestStatus switchOutRequestStatus = switchOutReview.f64068a;
                    mn2.a aVar4 = switchOutRequestStatus.f64064a;
                    if ((aVar4 != mn2.a.CASS && aVar4 != mn2.a.MOBILITY) || switchOutRequestStatus.f64065b != wn2.d.FULL) {
                        aVar3.f64056q.getClass();
                        Intrinsics.checkNotNullParameter(switchOutReview, "switchOutReview");
                        LocalDate localDate = switchOutRequestStatus.e;
                        BankInformation bankInformation = switchOutRequestStatus.d;
                        if (localDate == null) {
                            textLocalisedClause = new TextLocalisedClause(R$string.account_switch_accept_question_no_date, zhm.u.c(new TextClause(bankInformation.f63972a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                        } else {
                            int i2 = R$string.account_switch_accept_question;
                            TextClause textClause = new TextClause(bankInformation.f63972a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                            LocalDate localDate2 = switchOutRequestStatus.e;
                            LocalDateClause$DateFormat.INSTANCE.getClass();
                            textLocalisedClause = new TextLocalisedClause(i2, v.k(textClause, com.revolut.core.ui_kit.models.j.b(jVar, localDate2, LocalDateClause$DateFormat.Companion.f57815b)), null, 12);
                        }
                        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
                        m70.a.c(t0.f186434a);
                        yji.l.b1(aVar3, aVar3.X1(new y0("ID_ACCEPT_DIALOG_CONFIRMATION", new nii.v(textLocalisedClause2, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.account_switch_accept_accept, null, null, 14), new TextLocalisedClause(R$string.account_switch_accept_decline, null, null, 14), null, null, null, false, null, 4032), false, 4)), null, new p(aVar3, null, 1), 3);
                    } else if (switchOutReview.f64070c.isEmpty()) {
                        aVar3.I2();
                    } else {
                        aVar3.f2(new SwitchOutObligatedProductsScreen(new SwitchOutObligatedProductsScreenContract$InputData(switchOutReview)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new k(aVar3, 1));
                    }
                }
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar6 = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a) bankAccountSwitchingReviewOutScreen.R2();
                SwitchOutReview switchOutReview2 = (SwitchOutReview) ((e) ((j2) aVar6.f64058s.f22677a).getValue()).f281817b.getContent();
                if (switchOutReview2 != null) {
                    aVar6.f64056q.getClass();
                    yji.l.b1(aVar6, aVar6.X1(u.a(switchOutReview2)), null, new p(aVar6, null, 0), 3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
