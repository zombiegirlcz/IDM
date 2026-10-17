package vr9;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;

    @NotNull
    public static final n Companion;
    public static final o OWED;
    public static final o OWES;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f291532id;

    static {
        o oVar = new o("OWED", 0, "SETTLEMENT_YOU_OWE_TAB_ID");
        OWED = oVar;
        o oVar2 = new o("OWES", 1, "SETTLEMENT_YOU_ARE_OWED_TAB_ID");
        OWES = oVar2;
        o[] oVarArr = {oVar, oVar2};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
        Companion = new n();
    }

    public o(String str, int i, String str2) {
        this.f291532id = str2;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
