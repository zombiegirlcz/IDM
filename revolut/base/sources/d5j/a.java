package d5j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n4j.c;
import n4j.j;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zq.a f111420a;

    public a(s4j.a idGenerator, zq.a formattingValidator, c beneficiaryCreationUtils, j searchListSelectionUtils) {
        Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        Intrinsics.checkNotNullParameter(formattingValidator, "formattingValidator");
        Intrinsics.checkNotNullParameter(beneficiaryCreationUtils, "beneficiaryCreationUtils");
        Intrinsics.checkNotNullParameter(searchListSelectionUtils, "searchListSelectionUtils");
        this.f111420a = formattingValidator;
    }

    public static ArrayList b(List list, Field$BackendDefinition field$BackendDefinition) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Object obj2 : list2) {
            if (Intrinsics.f(((Field$BackendDefinition) obj2).getF99718a(), field$BackendDefinition.getF99718a())) {
                obj2 = field$BackendDefinition;
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    public final Field$BackendDefinition a(String str, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(s4j.a.a(((Field$BackendDefinition) next).getF99718a()), str)) {
                break;
            }
        }
        Field$BackendDefinition field$BackendDefinition = (Field$BackendDefinition) next;
        if (field$BackendDefinition != null) {
            return field$BackendDefinition;
        }
        throw new IllegalStateException("Editable field is not in the state");
    }
}
