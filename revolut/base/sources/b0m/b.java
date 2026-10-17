package b0m;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b implements r81.c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b EXPERIMENT_VALUE_A;
    public static final b EXPERIMENT_VALUE_B;

    @NotNull
    private final String value;

    static {
        b bVar = new b("EXPERIMENT_VALUE_A", 0, "A");
        EXPERIMENT_VALUE_A = bVar;
        b bVar2 = new b("EXPERIMENT_VALUE_B", 1, "B");
        EXPERIMENT_VALUE_B = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.value = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // r81.c
    public final String getValue() {
        return this.value;
    }
}
