package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class fd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ fd[] $VALUES;
    public static final fd SEQUENTIALLY;
    public static final fd TOGETHER;

    static {
        fd fdVar = new fd("SEQUENTIALLY", 0);
        SEQUENTIALLY = fdVar;
        fd fdVar2 = new fd("TOGETHER", 1);
        TOGETHER = fdVar2;
        fd[] fdVarArr = {fdVar, fdVar2};
        $VALUES = fdVarArr;
        $ENTRIES = vc.s.n(fdVarArr);
    }

    public static fd valueOf(String str) {
        return (fd) Enum.valueOf(fd.class, str);
    }

    public static fd[] values() {
        return (fd[]) $VALUES.clone();
    }
}
