package ds6;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;

    @NotNull
    public static final r Companion;
    public static final s FILING_PERIOD_STARTED;
    public static final s IN_PROGRESS;
    public static final s NOT_STARTED;
    public static final s UNKNOWN;

    static {
        s sVar = new s("NOT_STARTED", 0);
        NOT_STARTED = sVar;
        s sVar2 = new s("FILING_PERIOD_STARTED", 1);
        FILING_PERIOD_STARTED = sVar2;
        s sVar3 = new s("IN_PROGRESS", 2);
        IN_PROGRESS = sVar3;
        s sVar4 = new s("UNKNOWN", 3);
        UNKNOWN = sVar4;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
        Companion = new r();
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
