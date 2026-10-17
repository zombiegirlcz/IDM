package rn2;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;

    @NotNull
    public static final m Companion;
    public static final n DATE_INPUT;
    public static final n DROPDOWN;
    public static final n IBAN;
    public static final n PHONE_NUMBER;
    public static final n TEXT;

    @NotNull
    private final String value;

    static {
        n nVar = new n("TEXT", 0, "TEXT");
        TEXT = nVar;
        n nVar2 = new n("IBAN", 1, "IBAN");
        IBAN = nVar2;
        n nVar3 = new n("DATE_INPUT", 2, "DATE");
        DATE_INPUT = nVar3;
        n nVar4 = new n("PHONE_NUMBER", 3, "PHONE_NUMBER");
        PHONE_NUMBER = nVar4;
        n nVar5 = new n("DROPDOWN", 4, "DROPDOWN");
        DROPDOWN = nVar5;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
        Companion = new m();
    }

    public n(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
