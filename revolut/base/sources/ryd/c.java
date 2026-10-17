package ryd;

import java.util.Map;
import kotlin.Pair;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements zxd.b {
    public static Map b(a71.f fVar) {
        return r0.k(new Pair("legalInfo", fVar.f1730a), new Pair("copyright", fVar.f1731b), new Pair("supportPhoneNumber", fVar.f1732c));
    }

    public static Map c(a71.k kVar) {
        return r0.k(new Pair("firstName", kVar.f1746a), new Pair("lastName", kVar.f1747b), new Pair("dateOfBirth", kVar.f1748c), new Pair("phoneNumber", kVar.d), new Pair("email", kVar.e), new Pair("address", kVar.f), new Pair("accountStatus", kVar.f1749g), new Pair("openingDate", kVar.f1750h), new Pair("referenceNumber", kVar.i), new Pair("closureDate", kVar.f1751j));
    }
}
