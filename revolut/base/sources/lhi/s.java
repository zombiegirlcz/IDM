package lhi;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s BUY;

    @NotNull
    public static final r Companion;
    public static final s SELL;

    static {
        s sVar = new s("BUY", 0);
        BUY = sVar;
        s sVar2 = new s("SELL", 1);
        SELL = sVar2;
        s[] sVarArr = {sVar, sVar2};
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
