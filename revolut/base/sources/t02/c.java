package t02;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c INVEST;
    public static final c POCKET;
    public static final c SAVINGS_ACCOUNT;

    @NotNull
    private final String value;

    static {
        c cVar = new c("POCKET", 0, "POCKET");
        POCKET = cVar;
        c cVar2 = new c("SAVINGS_ACCOUNT", 1, "SAVINGS_ACCOUNT");
        SAVINGS_ACCOUNT = cVar2;
        c cVar3 = new c("INVEST", 2, "INVEST");
        INVEST = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.value = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
