package v30;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ACTIVE;
    public static final e BUSY;

    @NotNull
    public static final d Companion;
    public static final e IN_CALL;
    public static final e OCCUPIED;
    public static final e OUT_OF_OFFICE;
    public static final e TERMINATED;

    @NotNull
    private static final Map<String, e> mapping;

    @NotNull
    private final String key;

    static {
        e eVar = new e("ACTIVE", 0, "active");
        ACTIVE = eVar;
        e eVar2 = new e("IN_CALL", 1, "inCall");
        IN_CALL = eVar2;
        e eVar3 = new e("BUSY", 2, "busy");
        BUSY = eVar3;
        e eVar4 = new e("OCCUPIED", 3, "occupied");
        OCCUPIED = eVar4;
        e eVar5 = new e("TERMINATED", 4, "terminated");
        TERMINATED = eVar5;
        e eVar6 = new e("OUT_OF_OFFICE", 5, "outOfOffice");
        OUT_OF_OFFICE = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        $VALUES = eVarArr;
        him.a aVarN = vc.s.n(eVarArr);
        $ENTRIES = aVarN;
        Companion = new d();
        int iB = zhm.q0.b(zhm.w.t(aVarN, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : aVarN) {
            linkedHashMap.put(((e) obj2).key, obj2);
        }
        mapping = linkedHashMap;
    }

    public e(String str, int i, String str2) {
        this.key = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
