package c1b;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f V_0_0_1;
    public static final f V_1_0_0;

    @NotNull
    private final String versionName;

    static {
        f fVar = new f("V_0_0_1", 0, "0.0.1");
        V_0_0_1 = fVar;
        f fVar2 = new f("V_1_0_0", 1, "1.0.0");
        V_1_0_0 = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(String str, int i, String str2) {
        this.versionName = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String a() {
        return this.versionName;
    }
}
