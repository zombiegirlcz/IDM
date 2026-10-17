package t70;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c PLURALS;
    public static final c STRING;

    @NotNull
    private final String qualifier;

    static {
        c cVar = new c("STRING", 0, "string");
        STRING = cVar;
        c cVar2 = new c("PLURALS", 1, "plurals");
        PLURALS = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.qualifier = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.qualifier;
    }
}
