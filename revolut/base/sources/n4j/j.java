package n4j;

import com.revolut.domain.models.beneficiary.BeneficiarySearchList;
import com.revolut.domain.models.beneficiary.BeneficiarySearchListSource;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public static Field$BackendDefinition.SearchList.SelectedInfo a(String fieldType, BeneficiarySearchList searchListData, String str) {
        Object next;
        String str2;
        Object next2;
        String str3;
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(searchListData, "searchListData");
        if (str != null) {
            Iterator it8 = searchListData.f60292b.entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f((String) ((Map.Entry) next).getValue(), fieldType)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (str2 = (String) entry.getKey()) != null) {
                Iterator it9 = searchListData.f60291a.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it9.next();
                    if (Intrinsics.f(((BeneficiarySearchListSource) next2).f60296a, str)) {
                        break;
                    }
                }
                BeneficiarySearchListSource beneficiarySearchListSource = (BeneficiarySearchListSource) next2;
                if (beneficiarySearchListSource != null && (str3 = (String) beneficiarySearchListSource.d.get(str2)) != null) {
                    return new Field$BackendDefinition.SearchList.SelectedInfo(str, str3);
                }
            }
        }
        return null;
    }
}
