package cjl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;

    @NotNull
    public static final r Companion;
    public static final s GLOBAL;
    public static final s REGIONAL;

    @NotNull
    private final String value;

    static {
        s sVar = new s("GLOBAL", 0, "GLOBAL");
        GLOBAL = sVar;
        s sVar2 = new s("REGIONAL", 1, "REGIONAL");
        REGIONAL = sVar2;
        s[] sVarArr = {sVar, sVar2};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
        Companion = new r();
    }

    public s(String str, int i, String str2) {
        this.value = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
