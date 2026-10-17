package fa1;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AUTOMATIC;

    @NotNull
    public static final e Companion;
    public static final f MANUAL;

    @NotNull
    private final String key;

    static {
        f fVar = new f("AUTOMATIC", 0, "automatic");
        AUTOMATIC = fVar;
        f fVar2 = new f("MANUAL", 1, "manual");
        MANUAL = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
        Companion = new e();
    }

    public f(String str, int i, String str2) {
        this.key = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String a() {
        return this.key;
    }
}
