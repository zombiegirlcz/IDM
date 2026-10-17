package mr1;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bills.postal_check.api.R$string;
import ip0.kr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    @Override // cli.n
    public final o c(cli.j jVar) {
        Object objA;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List fields = domainState.f208040a;
        Map inputs = domainState.f208041b;
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        List list = fields;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it8 = list.iterator();
        while (true) {
            nr1.c cVar = null;
            if (!it8.hasNext()) {
                break;
            }
            BillFormField billFormField = (BillFormField) it8.next();
            String str = billFormField.f61274a;
            String str2 = (String) inputs.get(str);
            if (!billFormField.d && (str2 == null || d0.W(str2))) {
                cVar = nr1.b.f218521a;
            } else if (str2 != null) {
                String str3 = billFormField.f;
                try {
                    m.Companion companion = m.INSTANCE;
                    objA = str3 != null ? new Regex(str3) : null;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (objA instanceof yhm.n) {
                    objA = null;
                }
                Regex regex = (Regex) objA;
                if (!pd.b.k(regex != null ? Boolean.valueOf(d0.W(str2) || regex.f(str2)) : null)) {
                    cVar = nr1.a.f218520a;
                }
            }
            linkedHashMap.put(str, cVar);
        }
        LinkedHashMap linkedHashMapF = foh.i.f(linkedHashMap);
        boolean zIsEmpty = linkedHashMapF.isEmpty();
        List<BillFormField> list2 = domainState.f208040a;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (BillFormField billFormField2 : list2) {
            String str4 = billFormField2.f61274a;
            String str5 = (String) inputs.get(str4);
            InputTextDelegate.Model model = new InputTextDelegate.Model(j6.a.q("ACCOUNT_FIELD_ID_PREFIX_", str4), str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, billFormField2.d ? new TextLocalisedClause(R$string.postal_check_form_field_optional, u.c(new TextClause(billFormField2.f61275b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextClause(billFormField2.f61275b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, null, null, null, null, null, null, false, null, null, ((nr1.c) linkedHashMapF.get(str4)) instanceof nr1.a, false, false, false, kr.f165065a, 0, null, null, true, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, billFormField2, null, null, 0, R$attr.uikit_dp8, 0, 0, -572661768, 56831);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return new g(arrayList, zIsEmpty);
    }
}
