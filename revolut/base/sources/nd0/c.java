package nd0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FINCRIME;
    public static final c NEWS;

    @NotNull
    private final String stringValue;

    static {
        c cVar = new c("NEWS", 0, "news");
        NEWS = cVar;
        c cVar2 = new c("FINCRIME", 1, "local");
        FINCRIME = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringValue;
    }
}
