package cd1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @NotNull
    public static final i Companion;
    public static final j DAY;
    public static final j HOUR;
    public static final j ITEM;

    @NotNull
    private static final Map<String, j> MAPPING;

    @NotNull
    private final String key;

    static {
        j jVar = new j("ITEM", 0, "ITEM");
        ITEM = jVar;
        j jVar2 = new j("DAY", 1, "DAY");
        DAY = jVar2;
        j jVar3 = new j("HOUR", 2, "HOUR");
        HOUR = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
        Companion = new i();
        j[] jVarArrValues = values();
        int iB = q0.b(jVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (j jVar4 : jVarArrValues) {
            linkedHashMap.put(jVar4.key, jVar4);
        }
        MAPPING = linkedHashMap;
    }

    public j(String str, int i, String str2) {
        this.key = str2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
