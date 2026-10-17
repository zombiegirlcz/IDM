package r6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a REVOLUT_APP_PUSH;
    public static final a REVOLUT_APP_QR;
    public static final a REVOLUT_SSO;
    public static final a THREE_DS;
    public static final a THREE_DS_FINGERPRINT;
    public static final a UNKNOWN;

    static {
        a aVar = new a("THREE_DS", 0);
        THREE_DS = aVar;
        a aVar2 = new a("THREE_DS_FINGERPRINT", 1);
        THREE_DS_FINGERPRINT = aVar2;
        a aVar3 = new a("REVOLUT_APP_QR", 2);
        REVOLUT_APP_QR = aVar3;
        a aVar4 = new a("REVOLUT_APP_PUSH", 3);
        REVOLUT_APP_PUSH = aVar4;
        a aVar5 = new a("REVOLUT_SSO", 4);
        REVOLUT_SSO = aVar5;
        a aVar6 = new a("UNKNOWN", 5);
        UNKNOWN = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
