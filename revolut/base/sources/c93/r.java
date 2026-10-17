package c93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r ACTIVE;

    @NotNull
    public static final q Companion;
    public static final r ELIGIBLE_TO_CREATE;
    public static final r IN_PROGRESS;
    public static final r REJECTED;
    public static final r UNKNOWN;

    static {
        r rVar = new r("ELIGIBLE_TO_CREATE", 0);
        ELIGIBLE_TO_CREATE = rVar;
        r rVar2 = new r("IN_PROGRESS", 1);
        IN_PROGRESS = rVar2;
        r rVar3 = new r("ACTIVE", 2);
        ACTIVE = rVar3;
        r rVar4 = new r("REJECTED", 3);
        REJECTED = rVar4;
        r rVar5 = new r("UNKNOWN", 4);
        UNKNOWN = rVar5;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
        Companion = new q();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
