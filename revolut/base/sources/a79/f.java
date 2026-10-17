package a79;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CLOSED;
    public static final f OPENED;
    public static final f VIEWED;

    @NotNull
    private final String value;

    static {
        f fVar = new f("OPENED", 0, "OPENED");
        OPENED = fVar;
        f fVar2 = new f("CLOSED", 1, "CLOSED");
        CLOSED = fVar2;
        f fVar3 = new f("VIEWED", 2, "VIEWED");
        VIEWED = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(String str, int i, String str2) {
        this.value = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
