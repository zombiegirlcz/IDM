package of9;

import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class m {
    public static boolean a(BillFormField field, String input) {
        Intrinsics.checkNotNullParameter(field, "field");
        if ((input != null && input.length() != 0) || !field.d) {
            if (input == null) {
                return false;
            }
            Intrinsics.checkNotNullParameter(field, "<this>");
            Intrinsics.checkNotNullParameter(input, "input");
            String str = field.f;
            Regex regex = str != null ? new Regex(str) : null;
            if (!(regex == null ? true : regex.f(input))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(List definitions, Map values) {
        Intrinsics.checkNotNullParameter(definitions, "definitions");
        Intrinsics.checkNotNullParameter(values, "values");
        if (!definitions.isEmpty()) {
            List<BillFormField> listA = ff9.a.a((String) values.get("INPUT_METHOD"), definitions);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                for (BillFormField billFormField : listA) {
                    if (!a(billFormField, (String) values.get(billFormField.f61274a))) {
                        return false;
                    }
                    if (l.f224762a[billFormField.f61276c.ordinal()] == 1) {
                        String str = (String) values.get(billFormField.f61274a);
                        if (str == null) {
                            str = "";
                        }
                        BillFormField.Choice choiceB = ff9.a.b(billFormField, str);
                        if (choiceB != null && !b(choiceB.d, values)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
