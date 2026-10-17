package tof;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r CRYPTO;

    @NotNull
    private final String alias = "CRYPTO";

    static {
        r rVar = new r();
        CRYPTO = rVar;
        r[] rVarArr = {rVar};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final String a() {
        return this.alias;
    }
}
