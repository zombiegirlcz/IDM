package tvb;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AU_NZ;

    @NotNull
    public static final b Companion;
    public static final c GLOBAL;
    public static final c IL;

    static {
        c cVar = new c("AU_NZ", 0);
        AU_NZ = cVar;
        c cVar2 = new c("IL", 1);
        IL = cVar2;
        c cVar3 = new c("GLOBAL", 2);
        GLOBAL = cVar3;
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
