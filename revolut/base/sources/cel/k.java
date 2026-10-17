package cel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k Q1;
    public static final k Q2;
    public static final k Q3;
    public static final k Q4;
    private final int value;

    static {
        k kVar = new k("Q1", 0, 1);
        Q1 = kVar;
        k kVar2 = new k("Q2", 1, 2);
        Q2 = kVar2;
        k kVar3 = new k("Q3", 2, 3);
        Q3 = kVar3;
        k kVar4 = new k("Q4", 3, 4);
        Q4 = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public k(String str, int i, int i2) {
        this.value = i2;
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

    public final int b() {
        return this.value;
    }
}
