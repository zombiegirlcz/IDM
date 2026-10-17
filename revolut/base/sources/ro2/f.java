package ro2;

import cli.y;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.d5;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule.BankAccountSwitchingPaymentScheduleScreen;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import vkm.j2;
import yhm.o;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingPaymentScheduleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BankAccountSwitchingPaymentScheduleScreen bankAccountSwitchingPaymentScheduleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingPaymentScheduleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LocalDate localDate;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.R2();
        String listId = model.f52580a;
        y yVar = kVarE3.f255818q;
        b bVar = kVarE3.f255817p;
        j60.a aVar2 = kVarE3.o;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_START_DATE_FIELD")) {
            LocalDate localDate2 = ((h) ((j2) yVar.f22677a).getValue()).f255811b;
            DatePickerConfig datePickerConfig = ((h) ((j2) yVar.f22677a).getValue()).f255810a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(datePickerConfig, "datePickerConfig");
            t tVar = new t(new TextLocalisedClause(R$string.account_switch_set_payment_start_title, null, null, 14), null, null, 30);
            if (localDate2 == null) {
                LocalDate localDateE = datePickerConfig.f63987b;
                if (localDateE == null) {
                    localDateE = ((l80.f) bVar.f255807a).e();
                }
                localDate = localDateE;
            } else {
                localDate = localDate2;
            }
            g5 g5Var = new g5("ID_DATE_PICKER", localDate, localDate2, false, null, datePickerConfig.f63987b, datePickerConfig.f63988c, null, u.c(new d5(datePickerConfig.d)), null, 0, 0, 1014584);
            yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
            aVar2.x(new rp0.y(u.c(g5Var), tVar, null, null, null, null, 1020));
        } else if (Intrinsics.f(listId, "ID_FREQUENCY_FIELD")) {
            qo2.c cVar = ((h) ((j2) yVar.f22677a).getValue()).f255812c;
            bVar.getClass();
            t tVar2 = new t(new TextLocalisedClause(R$string.account_switch_set_payment_repeat_title, null, null, 14), null, null, 30);
            EnumEntries<qo2.c> enumEntriesA = qo2.c.a();
            ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
            for (qo2.c cVar2 : enumEntriesA) {
                arrayList.add(new SingleChoiceDelegate.Model("ID_FREQUENCY_ITEM_" + cVar2, qo2.e.a(cVar2), cVar2 == cVar, null, cVar2, YearClass.CLASS_2008));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            aVar2.x(new rp0.y(arrayList, tVar2, null, null, null, null, 1020));
        }
        return Unit.f186387a;
    }
}
