package qqa;

import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static ArrayList b(List list, AdditionalFieldInput additionalFieldInput) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Object obj2 : list2) {
            if (Intrinsics.f(((AdditionalFieldInput) obj2).getF81562a(), additionalFieldInput.getF81562a())) {
                obj2 = additionalFieldInput;
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    public final AdditionalFieldInput.TextInput a(String str, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(sqa.a.a((AdditionalFieldInput) next), str)) {
                break;
            }
        }
        AdditionalFieldInput additionalFieldInput = (AdditionalFieldInput) next;
        if (additionalFieldInput == null) {
            throw new IllegalStateException("Editable field is not in the state");
        }
        if (additionalFieldInput instanceof AdditionalFieldInput.TextInput) {
            return (AdditionalFieldInput.TextInput) additionalFieldInput;
        }
        throw new IllegalArgumentException("Field must be TextInput");
    }
}
