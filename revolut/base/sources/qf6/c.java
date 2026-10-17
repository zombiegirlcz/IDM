package qf6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf6.g;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public static final OpenBankingBrazilPayment.PaymentInformation a(g.e eVar) {
        ?? arrayList;
        List groups;
        OpenBankingBrazilPayment.EditableMoneyField editableMoneyField;
        if (eVar == null || (groups = eVar.getGroups()) == null) {
            arrayList = f0.f322471a;
        } else {
            List list = groups;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                List<g.d> items = ((g.c) it8.next()).getItems();
                ArrayList arrayList2 = new ArrayList(w.t(items, 10));
                for (g.d dVar : items) {
                    String title = dVar.getTitle();
                    String value = dVar.getValue();
                    g.b editableMoneyField2 = dVar.getEditableMoneyField();
                    OpenBankingBrazilPayment.EditableDateField editableDateField = null;
                    if (editableMoneyField2 != null) {
                        String id10 = editableMoneyField2.getId();
                        boolean zJ = pd.b.j(editableMoneyField2.getRequired());
                        dj0.d dVarO = mo3.a.o(editableMoneyField2.getMaxValueMoney());
                        jo3.a currentMoney = editableMoneyField2.getCurrentMoney();
                        editableMoneyField = new OpenBankingBrazilPayment.EditableMoneyField(dVarO, currentMoney != null ? mo3.a.o(currentMoney) : null, id10, zJ);
                    } else {
                        editableMoneyField = null;
                    }
                    g.a editableDateField2 = dVar.getEditableDateField();
                    if (editableDateField2 != null) {
                        String id11 = editableDateField2.getId();
                        String currentDate = editableDateField2.getCurrentDate();
                        editableDateField = new OpenBankingBrazilPayment.EditableDateField(id11, currentDate != null ? LocalDate.parse(currentDate) : null);
                    }
                    arrayList2.add(new OpenBankingBrazilPayment.Item(title, value, editableMoneyField, editableDateField));
                }
                arrayList.add(new OpenBankingBrazilPayment.InfoGroup(arrayList2));
            }
        }
        return new OpenBankingBrazilPayment.PaymentInformation(arrayList);
    }
}
