package v30;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTIVE;
    public static final c BUSY;

    @NotNull
    public static final b Companion;
    public static final c IN_CALL;
    public static final c OCCUPIED;
    public static final c TERMINATED;

    @NotNull
    private static final Map<String, c> mapping;

    @NotNull
    private final String key;

    static {
        c cVar = new c("ACTIVE", 0, "active");
        ACTIVE = cVar;
        c cVar2 = new c("IN_CALL", 1, "inCall");
        IN_CALL = cVar2;
        c cVar3 = new c("BUSY", 2, "busy");
        BUSY = cVar3;
        c cVar4 = new c("OCCUPIED", 3, "occupied");
        OCCUPIED = cVar4;
        c cVar5 = new c("TERMINATED", 4, "terminated");
        TERMINATED = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        him.a aVarN = vc.s.n(cVarArr);
        $ENTRIES = aVarN;
        Companion = new b();
        int iB = zhm.q0.b(zhm.w.t(aVarN, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : aVarN) {
            linkedHashMap.put(((c) obj2).key, obj2);
        }
        mapping = linkedHashMap;
    }

    public c(String str, int i, String str2) {
        this.key = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
