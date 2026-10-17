package g8a;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a USER_DOES_NOT_RECOGNISE_PAYMENT;
    public static final a USER_NOT_INTERESTED;

    static {
        a aVar = new a("USER_DOES_NOT_RECOGNISE_PAYMENT", 0);
        USER_DOES_NOT_RECOGNISE_PAYMENT = aVar;
        a aVar2 = new a("USER_NOT_INTERESTED", 1);
        USER_NOT_INTERESTED = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
