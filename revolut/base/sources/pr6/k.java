package pr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k APPLE_PAY;
    public static final k CARD;
    public static final k GOOGLE_PAY;
    public static final k REVOLUT_PAY;
    public static final k TAP_TO_PAY;

    static {
        k kVar = new k("CARD", 0);
        CARD = kVar;
        k kVar2 = new k("REVOLUT_PAY", 1);
        REVOLUT_PAY = kVar2;
        k kVar3 = new k("GOOGLE_PAY", 2);
        GOOGLE_PAY = kVar3;
        k kVar4 = new k("APPLE_PAY", 3);
        APPLE_PAY = kVar4;
        k kVar5 = new k("TAP_TO_PAY", 4);
        TAP_TO_PAY = kVar5;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
