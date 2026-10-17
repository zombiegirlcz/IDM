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
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CATALOGUE;
    public static final b CUSTOM;

    @NotNull
    public static final a Companion;

    @NotNull
    private static final Map<String, b> MAPPING;

    @NotNull
    private final String key;

    static {
        b bVar = new b("CUSTOM", 0, "CUSTOM");
        CUSTOM = bVar;
        b bVar2 = new b("CATALOGUE", 1, "CATALOGUE");
        CATALOGUE = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
        b[] bVarArrValues = values();
        int iB = q0.b(bVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (b bVar3 : bVarArrValues) {
            linkedHashMap.put(bVar3.key, bVar3);
        }
        MAPPING = linkedHashMap;
    }

    public b(String str, int i, String str2) {
        this.key = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
