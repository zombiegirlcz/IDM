package z79;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b JOINT;
    public static final b JUNIOR;
    public static final b MAIN;
    public static final b OTHER;
    public static final b PRO;

    @NotNull
    private final String shortenedName;

    static {
        b bVar = new b("MAIN", 0, "CUR");
        MAIN = bVar;
        b bVar2 = new b("JOINT", 1, "JNT");
        JOINT = bVar2;
        b bVar3 = new b("PRO", 2, "PRO");
        PRO = bVar3;
        b bVar4 = new b("JUNIOR", 3, "JU");
        JUNIOR = bVar4;
        b bVar5 = new b("OTHER", 4, "");
        OTHER = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, String str2) {
        this.shortenedName = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        return this.shortenedName;
    }
}
