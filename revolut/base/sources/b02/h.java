package b02;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACTIVE;

    @NotNull
    public static final g Companion;
    public static final h INACTIVE;

    @NotNull
    private final String value;

    static {
        h hVar = new h("ACTIVE", 0, "ACTIVE");
        ACTIVE = hVar;
        h hVar2 = new h("INACTIVE", 1, "INACTIVE");
        INACTIVE = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
        Companion = new g();
    }

    public h(String str, int i, String str2) {
        this.value = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
