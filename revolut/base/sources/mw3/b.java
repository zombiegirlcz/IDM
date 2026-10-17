package mw3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ERROR;
    public static final b MANUAL_SWITCH;

    @NotNull
    private final String actionCode;

    static {
        b bVar = new b("MANUAL_SWITCH", 0, "MANUAL_SWITCH");
        MANUAL_SWITCH = bVar;
        b bVar2 = new b("ERROR", 1, "ERROR");
        ERROR = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, String str2) {
        this.actionCode = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        return this.actionCode;
    }
}
