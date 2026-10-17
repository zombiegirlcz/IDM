package v30;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 ASSISTANT;

    @NotNull
    public static final a0 Companion;
    public static final c0 PRIVATE_BANKING;
    public static final c0 SUPPORT;

    @NotNull
    private static final Map<String, c0> mapping;

    @NotNull
    private final String ticketTypeName;

    @NotNull
    private final String value;

    static {
        c0 c0Var = new c0("ASSISTANT", 0, "ASSISTANT", "Assistant");
        ASSISTANT = c0Var;
        c0 c0Var2 = new c0("SUPPORT", 1, "SUPPORT", "Support");
        SUPPORT = c0Var2;
        c0 c0Var3 = new c0("PRIVATE_BANKING", 2, "PRIVATE_BANKING", "PrivateBanking");
        PRIVATE_BANKING = c0Var3;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3};
        $VALUES = c0VarArr;
        him.a aVarN = vc.s.n(c0VarArr);
        $ENTRIES = aVarN;
        Companion = new a0();
        int iB = zhm.q0.b(zhm.w.t(aVarN, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : aVarN) {
            linkedHashMap.put(((c0) obj2).value, obj2);
        }
        mapping = linkedHashMap;
    }

    public c0(String str, int i, String str2, String str3) {
        this.value = str2;
        this.ticketTypeName = str3;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }

    public final String c() {
        return this.ticketTypeName;
    }

    public final String d() {
        return this.value;
    }
}
