package g12;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r DETAILS;
    public static final r SCAN;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f139528id;

    static {
        r rVar = new r("SCAN", 0, "SCAN");
        SCAN = rVar;
        r rVar2 = new r("DETAILS", 1, "DETAILS");
        DETAILS = rVar2;
        r[] rVarArr = {rVar, rVar2};
        $VALUES = rVarArr;
        $ENTRIES = s.n(rVarArr);
    }

    public r(String str, int i, String str2) {
        this.f139528id = str2;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f139528id;
    }
}
