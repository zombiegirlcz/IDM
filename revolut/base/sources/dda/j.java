package dda;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @NotNull
    public static final i Companion;
    public static final j SIX_QR;
    public static final j UNKNOWN;

    @NotNull
    private final String value;

    static {
        j jVar = new j("SIX_QR", 0, "SIX_QR");
        SIX_QR = jVar;
        j jVar2 = new j("UNKNOWN", 1, "");
        UNKNOWN = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
        Companion = new i();
    }

    public j(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
