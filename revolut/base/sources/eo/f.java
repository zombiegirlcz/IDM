package eo;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f REVOLUT;
    public static final f SEON;

    @NotNull
    private final String value;

    static {
        f fVar = new f("REVOLUT", 0, "REVOLUT");
        REVOLUT = fVar;
        f fVar2 = new f("SEON", 1, "SEON");
        SEON = fVar2;
        f[] fVarArr = {fVar, fVar2};
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
