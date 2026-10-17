package cnm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.apache.commons.validator.routines.checkdigit.CheckDigitException;

/* JADX INFO: loaded from: classes14.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a[] f25473b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f25474a;

    static {
        a[] aVarArr = {new a("AD", 24, "AD\\d{10}[A-Z0-9]{12}"), new a("AE", 23, "AE\\d{21}"), new a("AL", 28, "AL\\d{10}[A-Z0-9]{16}"), new a("AT", 20, "AT\\d{18}"), new a("AZ", 28, "AZ\\d{2}[A-Z]{4}[A-Z0-9]{20}"), new a("BA", 20, "BA\\d{18}"), new a("BE", 16, "BE\\d{14}"), new a("BG", 22, "BG\\d{2}[A-Z]{4}\\d{6}[A-Z0-9]{8}"), new a("BH", 22, "BH\\d{2}[A-Z]{4}[A-Z0-9]{14}"), new a("BR", 29, "BR\\d{25}[A-Z]{1}[A-Z0-9]{1}"), new a("BY", 28, "BY\\d{2}[A-Z0-9]{4}\\d{4}[A-Z0-9]{16}"), new a("CH", 21, "CH\\d{7}[A-Z0-9]{12}"), new a("CR", 22, "CR\\d{20}"), new a("CY", 28, "CY\\d{10}[A-Z0-9]{16}"), new a("CZ", 24, "CZ\\d{22}"), new a("DE", 22, "DE\\d{20}"), new a("DK", 18, "DK\\d{16}"), new a("DO", 28, "DO\\d{2}[A-Z0-9]{4}\\d{20}"), new a("EE", 20, "EE\\d{18}"), new a("ES", 24, "ES\\d{22}"), new a("FI", 18, "FI\\d{16}"), new a("FO", 18, "FO\\d{16}"), new a("FR", 27, "FR\\d{12}[A-Z0-9]{11}\\d{2}"), new a("GB", 22, "GB\\d{2}[A-Z]{4}\\d{14}"), new a("GE", 22, "GE\\d{2}[A-Z]{2}\\d{16}"), new a("GI", 23, "GI\\d{2}[A-Z]{4}[A-Z0-9]{15}"), new a("GL", 18, "GL\\d{16}"), new a("GR", 27, "GR\\d{9}[A-Z0-9]{16}"), new a("GT", 28, "GT\\d{2}[A-Z0-9]{24}"), new a("HR", 21, "HR\\d{19}"), new a("HU", 28, "HU\\d{26}"), new a("IE", 22, "IE\\d{2}[A-Z]{4}\\d{14}"), new a("IL", 23, "IL\\d{21}"), new a("IQ", 23, "IQ\\d{2}[A-Z]{4}\\d{15}"), new a("IS", 26, "IS\\d{24}"), new a("IT", 27, "IT\\d{2}[A-Z]{1}\\d{10}[A-Z0-9]{12}"), new a("JO", 30, "JO\\d{2}[A-Z]{4}\\d{4}[A-Z0-9]{18}"), new a("KW", 30, "KW\\d{2}[A-Z]{4}[A-Z0-9]{22}"), new a("KZ", 20, "KZ\\d{5}[A-Z0-9]{13}"), new a("LB", 28, "LB\\d{6}[A-Z0-9]{20}"), new a("LC", 32, "LC\\d{2}[A-Z]{4}[A-Z0-9]{24}"), new a("LI", 21, "LI\\d{7}[A-Z0-9]{12}"), new a("LT", 20, "LT\\d{18}"), new a("LU", 20, "LU\\d{5}[A-Z0-9]{13}"), new a("LV", 21, "LV\\d{2}[A-Z]{4}[A-Z0-9]{13}"), new a("MC", 27, "MC\\d{12}[A-Z0-9]{11}\\d{2}"), new a("MD", 24, "MD\\d{2}[A-Z0-9]{20}"), new a("ME", 22, "ME\\d{20}"), new a("MG", 27, "MG\\d{12}[A-Z0-9]{11}\\d{2}"), new a("MK", 19, "MK\\d{5}[A-Z0-9]{10}\\d{2}"), new a("MR", 27, "MR\\d{25}"), new a("MT", 31, "MT\\d{2}[A-Z]{4}\\d{5}[A-Z0-9]{18}"), new a("MU", 30, "MU\\d{2}[A-Z]{4}\\d{19}[A-Z]{3}"), new a("NL", 18, "NL\\d{2}[A-Z]{4}\\d{10}"), new a("NO", 15, "NO\\d{13}"), new a("PK", 24, "PK\\d{2}[A-Z]{4}[A-Z0-9]{16}"), new a("PL", 28, "PL\\d{26}"), new a("PS", 29, "PS\\d{2}[A-Z]{4}[A-Z0-9]{21}"), new a("PT", 25, "PT\\d{23}"), new a("QA", 29, "QA\\d{2}[A-Z]{4}[A-Z0-9]{21}"), new a("RO", 24, "RO\\d{2}[A-Z]{4}[A-Z0-9]{16}"), new a("RS", 22, "RS\\d{20}"), new a("SA", 24, "SA\\d{4}[A-Z0-9]{18}"), new a("SC", 31, "SC\\d{2}[A-Z]{4}\\d{20}[A-Z]{3}"), new a("SE", 24, "SE\\d{22}"), new a("SI", 19, "SI\\d{17}"), new a("SK", 24, "SK\\d{22}"), new a("SM", 27, "SM\\d{2}[A-Z]{1}\\d{10}[A-Z0-9]{12}"), new a("ST", 25, "ST\\d{23}"), new a("SV", 28, "SV\\d{2}[A-Z0-9]{4}\\d{20}"), new a("TL", 23, "TL\\d{21}"), new a("TN", 24, "TN\\d{22}"), new a("TR", 26, "TR\\d{8}[A-Z0-9]{16}"), new a("UA", 29, "UA\\d{8}[A-Z0-9]{19}"), new a("VG", 24, "VG\\d{2}[A-Z]{4}\\d{16}"), new a("XK", 20, "XK\\d{18}")};
        f25473b = aVarArr;
        new b(aVarArr);
    }

    public b(a[] aVarArr) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (a aVar : aVarArr) {
            concurrentHashMap.put(aVar.f25470a, aVar);
        }
        this.f25474a = concurrentHashMap;
    }

    public final boolean a(String str) {
        a aVar = (str == null || str.length() < 2) ? null : (a) this.f25474a.get(str.substring(0, 2));
        if (aVar != null && str.length() == aVar.f25472c) {
            c cVar = aVar.f25471b;
            int i = 0;
            while (true) {
                Pattern[] patternArr = (Pattern[]) cVar.f25476b;
                if (i >= patternArr.length) {
                    break;
                }
                if (patternArr[i].matcher(str).matches()) {
                    if (str.length() < 5) {
                        return false;
                    }
                    String strSubstring = str.substring(2, 4);
                    if ("00".equals(strSubstring) || "01".equals(strSubstring) || "99".equals(strSubstring)) {
                        return false;
                    }
                    try {
                        return dnm.a.a(str) == 1;
                    } catch (CheckDigitException unused) {
                        return false;
                    }
                }
                i++;
            }
        }
        return false;
    }

    public b(a aVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a aVar2 = new a[]{aVar}[0];
        concurrentHashMap.put(aVar2.f25470a, aVar2);
        this.f25474a = concurrentHashMap;
    }
}
