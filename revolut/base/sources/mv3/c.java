package mv3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BACK;
    public static final c CONTINUE;

    @NotNull
    public static final b Companion;
    public static final c UNKNOWN;

    static {
        c cVar = new c("CONTINUE", 0);
        CONTINUE = cVar;
        c cVar2 = new c("BACK", 1);
        BACK = cVar2;
        c cVar3 = new c("UNKNOWN", 2);
        UNKNOWN = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
