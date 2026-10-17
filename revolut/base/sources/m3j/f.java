package m3j;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.r0;
import zhm.t0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static List a(f5j.a beneficiary) {
        Map mapT;
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        String[] elements = {"CARD_LAST_FOUR", "CLABE", "IBAN", "ACCOUNT_NUMBER", "MSISDN"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        String[] elements2 = {"BRAZIL_ACCOUNT_TYPE", "BRAZIL_BANK_NUMBER", "BRAZIL_BRANCH_NUMBER", "BRAZIL_CPF_ID"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Set setY02 = kotlin.collections.d.y0(elements2);
        String[] elements3 = {"COLOMBIA_ACH_ACCOUNT_TYPE", "COLOMBIA_BANK_CODE", "COLOMBIA_DOCUMENT_NUMBER", "COLOMBIA_DOCUMENT_TYPE"};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set setY03 = kotlin.collections.d.y0(elements3);
        String str = beneficiary.C;
        List listL = v.l(str != null ? new Pair("INSTITUTION_NAME", str) : null);
        Map mapG = beneficiary.u;
        if (mapG == null) {
            mapG = r0.g();
        }
        List pairs = listL;
        Intrinsics.checkNotNullParameter(mapG, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (mapG.isEmpty()) {
            mapT = r0.t(pairs);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapG);
            r0.r(linkedHashMap, pairs);
            mapT = linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : mapT.entrySet()) {
            if (((String) entry.getKey()).length() > 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return d0.P0(d0.P0(t0.C(linkedHashMap2), new e()), new m2j.s(setY0, 2, setY02, setY03));
    }
}
