package zkj;

import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingAttributeRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ArrayList a(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = ((b) entry.getValue()).f323056a;
            EsimPhoneNumberPortingAttributeRequest esimPhoneNumberPortingAttributeRequest = null;
            if (str2 != null) {
                if (d0.W(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    esimPhoneNumberPortingAttributeRequest = new EsimPhoneNumberPortingAttributeRequest(str, d0.F0(str2).toString());
                }
            }
            if (esimPhoneNumberPortingAttributeRequest != null) {
                arrayList.add(esimPhoneNumberPortingAttributeRequest);
            }
        }
        return arrayList;
    }
}
