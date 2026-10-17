package hy6;

import aim.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$SingleChoiceItem;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$Step;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import sr6.b;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C0898a Companion = new C0898a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f156743a;

    /* JADX INFO: renamed from: hy6.a$a, reason: collision with other inner class name */
    public static final class C0898a {
        private C0898a() {
        }
    }

    static {
        b[] elements = {b.SIXTY_DAYS, b.NINETY_DAYS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f156743a = d.y0(elements);
    }

    public static e a(InvoicePaymentScheduleScreenContract$Step invoicePaymentScheduleScreenContract$Step) {
        e eVarB = u.b();
        List<b> listB0 = d0.B0(b.a(), f156743a);
        ArrayList arrayList = new ArrayList(w.t(listB0, 10));
        for (b bVar : listB0) {
            arrayList.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(q.M(bVar), bVar.name()));
        }
        a0.x(arrayList, eVarB);
        eVarB.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(new TextLocalisedClause(invoicePaymentScheduleScreenContract$Step instanceof InvoicePaymentScheduleScreenContract$Step.DueDateOptionPicker ? R$string.freelancer_sale_invoice_schedule_option_custom_due_date : R$string.freelancer_sale_invoice_schedule_recurring_picker_offset_custom_date, null, null, 14), "ITEM_ID_CUSTOM"));
        return u.a(eVarB);
    }
}
