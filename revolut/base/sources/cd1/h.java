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
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACTIVE;
    public static final h ARCHIVED;

    @NotNull
    public static final g Companion;

    @NotNull
    private static final Map<String, h> MAPPING;

    @NotNull
    private final String key;

    static {
        h hVar = new h("ACTIVE", 0, "ACTIVE");
        ACTIVE = hVar;
        h hVar2 = new h("ARCHIVED", 1, "ARCHIVED");
        ARCHIVED = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
        Companion = new g();
        h[] hVarArrValues = values();
        int iB = q0.b(hVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (h hVar3 : hVarArrValues) {
            linkedHashMap.put(hVar3.key, hVar3);
        }
        MAPPING = linkedHashMap;
    }

    public h(String str, int i, String str2) {
        this.key = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
