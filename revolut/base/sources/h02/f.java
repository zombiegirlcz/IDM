package h02;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACTIVE;
    public static final f CANCELLED;

    @NotNull
    public static final e Companion;
    public static final f EXPIRED;
    public static final f UNKNOWN;
    public static final f USED;

    @NotNull
    private final String value;

    static {
        f fVar = new f("UNKNOWN", 0, "");
        UNKNOWN = fVar;
        f fVar2 = new f("ACTIVE", 1, "ACTIVE");
        ACTIVE = fVar2;
        f fVar3 = new f("USED", 2, "USED");
        USED = fVar3;
        f fVar4 = new f("EXPIRED", 3, "EXPIRED");
        EXPIRED = fVar4;
        f fVar5 = new f("CANCELLED", 4, "CANCELLED");
        CANCELLED = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new e();
    }

    public f(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
