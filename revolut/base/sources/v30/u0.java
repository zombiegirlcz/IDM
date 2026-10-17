package v30;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class u0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 Assistant;
    public static final u0 CallRequest;
    public static final u0 Chat;

    @NotNull
    public static final t0 Companion;
    public static final u0 InAppCallRequest;
    public static final u0 InboundInAppCall;
    public static final u0 Mass;
    public static final u0 Unknown;

    @NotNull
    private static final Map<String, u0> mapping;

    @NotNull
    private final String key;

    static {
        u0 u0Var = new u0("Assistant", 0, "Assistant");
        Assistant = u0Var;
        u0 u0Var2 = new u0("Chat", 1, "Chat");
        Chat = u0Var2;
        u0 u0Var3 = new u0("CallRequest", 2, "CallRequest");
        CallRequest = u0Var3;
        u0 u0Var4 = new u0("InAppCallRequest", 3, "InAppCallRequest");
        InAppCallRequest = u0Var4;
        u0 u0Var5 = new u0("InboundInAppCall", 4, "IncomingInAppCall");
        InboundInAppCall = u0Var5;
        u0 u0Var6 = new u0("Mass", 5, "Mass");
        Mass = u0Var6;
        u0 u0Var7 = new u0("Unknown", 6, "Unknown");
        Unknown = u0Var7;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3, u0Var4, u0Var5, u0Var6, u0Var7};
        $VALUES = u0VarArr;
        him.a aVarN = vc.s.n(u0VarArr);
        $ENTRIES = aVarN;
        Companion = new t0();
        int iB = zhm.q0.b(zhm.w.t(aVarN, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : aVarN) {
            linkedHashMap.put(((u0) obj2).key, obj2);
        }
        mapping = linkedHashMap;
    }

    public u0(String str, int i, String str2) {
        this.key = str2;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
