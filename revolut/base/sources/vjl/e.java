package vjl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ADDRESS;
    public static final e BIRTH_DATE;
    public static final e CITIZENSHIP;
    public static final e EMAIL;
    public static final e NAME;
    public static final e PHONE;
    public static final e UNKNOWN;

    @NotNull
    private final String value;

    static {
        e eVar = new e("ADDRESS", 0, "address");
        ADDRESS = eVar;
        e eVar2 = new e("BIRTH_DATE", 1, "birthdate");
        BIRTH_DATE = eVar2;
        e eVar3 = new e("EMAIL", 2, "email");
        EMAIL = eVar3;
        e eVar4 = new e("NAME", 3, "name");
        NAME = eVar4;
        e eVar5 = new e("CITIZENSHIP", 4, "citizenship");
        CITIZENSHIP = eVar5;
        e eVar6 = new e("PHONE", 5, "phone");
        PHONE = eVar6;
        e eVar7 = new e("UNKNOWN", 6, "unknown");
        UNKNOWN = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.value = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
