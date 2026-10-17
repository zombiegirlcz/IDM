package qy6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$SingleChoiceItem;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sr6.l;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    public d(b clauseFactory) {
        Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
    }

    public static FreelancerSingleChoiceScreen a(String str, boolean z) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_recurring_input_end_title, null, null, 14);
        FreelancerSingleChoiceScreenContract$SingleChoiceItem[] elements = {new FreelancerSingleChoiceScreenContract$SingleChoiceItem(new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_recurring_picker_end_never, null, null, 14), "ID_SINGLE_CHOICE_LIMIT_NEVER"), new FreelancerSingleChoiceScreenContract$SingleChoiceItem(new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_recurring_picker_end_after_number_of_invoices, null, null, 14), "ID_SINGLE_CHOICE_LIMIT_AFTER"), z ? new FreelancerSingleChoiceScreenContract$SingleChoiceItem(new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_recurring_picker_end_custom_date, null, null, 14), "ID_SINGLE_CHOICE_LIMIT_DATE") : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new FreelancerSingleChoiceScreen(new FreelancerSingleChoiceScreenContract$InputData(textLocalisedClause, null, kotlin.collections.d.L(elements), str));
    }

    public final FreelancerSingleChoiceScreen b(l lVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_recurring_input_repeat_every_title, null, null, 14);
        EnumEntries<l> enumEntriesA = l.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (l lVar2 : enumEntriesA) {
            arrayList.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(b.a(lVar2), lVar2.name()));
        }
        return new FreelancerSingleChoiceScreen(new FreelancerSingleChoiceScreenContract$InputData(textLocalisedClause, null, arrayList, lVar != null ? lVar.name() : null));
    }
}
