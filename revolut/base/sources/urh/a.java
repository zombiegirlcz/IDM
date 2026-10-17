package urh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CHANGE_EMAIL_3FA;
    public static final a RESET_PASSWORD_3FA;
    public static final a SIGNIN_3FA;

    static {
        a aVar = new a("SIGNIN_3FA", 0);
        SIGNIN_3FA = aVar;
        a aVar2 = new a("RESET_PASSWORD_3FA", 1);
        RESET_PASSWORD_3FA = aVar2;
        a aVar3 = new a("CHANGE_EMAIL_3FA", 2);
        CHANGE_EMAIL_3FA = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
