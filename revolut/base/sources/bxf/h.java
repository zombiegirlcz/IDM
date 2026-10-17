package bxf;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    public static final g Companion;
    public static final h DEFAULT;
    public static final h GROUP;
    public static final h LONG_TERM;
    public static final h ONE_TRIP;
    public static final h TIME_LIMITED;

    @NotNull
    private final String value;

    static {
        h hVar = new h("DEFAULT", 0, "");
        DEFAULT = hVar;
        h hVar2 = new h("ONE_TRIP", 1, "ONE_TRIP");
        ONE_TRIP = hVar2;
        h hVar3 = new h("TIME_LIMITED", 2, "TIME_LIMITED");
        TIME_LIMITED = hVar3;
        h hVar4 = new h("LONG_TERM", 3, "LONG_TERM");
        LONG_TERM = hVar4;
        h hVar5 = new h("GROUP", 4, "GROUP");
        GROUP = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
        Companion = new g();
    }

    public h(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
