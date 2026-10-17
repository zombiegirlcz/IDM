package vpk;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;
    public static final c FULL_RANGE;
    public static final c SINCE_PREVIOUS_EOD;
    private final String cutoff;

    static {
        c cVar = new c("FULL_RANGE", 0, "FULL_RANGE");
        FULL_RANGE = cVar;
        c cVar2 = new c("SINCE_PREVIOUS_EOD", 1, null);
        SINCE_PREVIOUS_EOD = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
        Companion = new b();
    }

    public c(String str, int i, String str2) {
        this.cutoff = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.cutoff;
    }
}
