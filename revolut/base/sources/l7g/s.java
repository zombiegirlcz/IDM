package l7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;

    @NotNull
    public static final r Companion;
    public static final s ONE_WAY;
    public static final s ROUND_TRIP;
    public static final s UNKNOWN;

    static {
        s sVar = new s("ONE_WAY", 0);
        ONE_WAY = sVar;
        s sVar2 = new s("ROUND_TRIP", 1);
        ROUND_TRIP = sVar2;
        s sVar3 = new s("UNKNOWN", 2);
        UNKNOWN = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
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
