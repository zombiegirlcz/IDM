package q7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CABIN;
    public static final b CHECKED;

    @NotNull
    public static final a Companion;
    public static final b PERSONAL;
    public static final b UNKNOWN;

    static {
        b bVar = new b("UNKNOWN", 0);
        UNKNOWN = bVar;
        b bVar2 = new b("PERSONAL", 1);
        PERSONAL = bVar2;
        b bVar3 = new b("CABIN", 2);
        CABIN = bVar3;
        b bVar4 = new b("CHECKED", 3);
        CHECKED = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
