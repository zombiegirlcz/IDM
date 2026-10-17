package o6l;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b NON_REACTIVABLE;
    public static final b OWNERSHIP_UNVERIFIED;
    public static final b TERMINATED_REACTIVABLE;
    public static final b UNKNOWN;

    static {
        b bVar = new b("OWNERSHIP_UNVERIFIED", 0);
        OWNERSHIP_UNVERIFIED = bVar;
        b bVar2 = new b("TERMINATED_REACTIVABLE", 1);
        TERMINATED_REACTIVABLE = bVar2;
        b bVar3 = new b("NON_REACTIVABLE", 2);
        NON_REACTIVABLE = bVar3;
        b bVar4 = new b("UNKNOWN", 3);
        UNKNOWN = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
