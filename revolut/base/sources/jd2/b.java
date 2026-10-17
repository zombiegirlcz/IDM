package jd2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b PAYMENT_CONFIRMATION;
    public static final b SETTINGS;

    static {
        b bVar = new b("SETTINGS", 0);
        SETTINGS = bVar;
        b bVar2 = new b("PAYMENT_CONFIRMATION", 1);
        PAYMENT_CONFIRMATION = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
