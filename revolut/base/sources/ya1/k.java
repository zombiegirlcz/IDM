package ya1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k CANCELLED;

    @NotNull
    public static final j Companion;

    @NotNull
    private static final Map<String, k> MAPPING;
    public static final k NEW;
    public static final k PAID;
    public static final k REFUNDED;
    public static final k REFUND_REQUIRED;
    public static final k UNKNOWN;

    @NotNull
    private final String key;

    static {
        k kVar = new k("NEW", 0, "NEW");
        NEW = kVar;
        k kVar2 = new k("PAID", 1, "PAID");
        PAID = kVar2;
        k kVar3 = new k("CANCELLED", 2, "CANCELLED");
        CANCELLED = kVar3;
        k kVar4 = new k("REFUND_REQUIRED", 3, "REFUND_REQUIRED");
        REFUND_REQUIRED = kVar4;
        k kVar5 = new k("REFUNDED", 4, "REFUNDED");
        REFUNDED = kVar5;
        k kVar6 = new k("UNKNOWN", 5, "UNKNOWN");
        UNKNOWN = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
        Companion = new j();
        k[] kVarArrValues = values();
        int iB = q0.b(kVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (k kVar7 : kVarArrValues) {
            linkedHashMap.put(kVar7.key, kVar7);
        }
        MAPPING = linkedHashMap;
    }

    public k(String str, int i, String str2) {
        this.key = str2;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
