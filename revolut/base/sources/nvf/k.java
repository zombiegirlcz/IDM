package nvf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.transport.models.fields.TransportDetailsField;
import com.revolut.feature.transport.models.fields.TransportDetailsFieldValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static ArrayList a(List fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        List list = fields;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            TransportDetailsField transportDetailsField = (TransportDetailsField) obj2;
            String strN = a0.d.n("ID_TICKET_FIELDS_PREFIX_ITEM_", i);
            TextClause textClause = new TextClause(transportDetailsField.f92626b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TransportDetailsFieldValue transportDetailsFieldValue = transportDetailsField.f92627c;
            String str = transportDetailsFieldValue.f92629b;
            if (str == null) {
                str = transportDetailsFieldValue.f92628a;
            }
            arrayList.add(new CellDetailsDelegate.Model(strN, textClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 3, null, false, null, 0, 0, 0, 0, 1044456));
            i = i2;
        }
        return arrayList;
    }
}
