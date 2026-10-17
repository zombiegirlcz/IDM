package zw7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;

    @NotNull
    public static final x Companion;
    public static final z FEMALE;
    public static final z MALE;
    public static final z UNKNOWN;

    @NotNull
    private final String value;

    static {
        z zVar = new z("MALE", 0, "MALE");
        MALE = zVar;
        z zVar2 = new z("FEMALE", 1, "FEMALE");
        FEMALE = zVar2;
        z zVar3 = new z("UNKNOWN", 2, "UNKNOWN");
        UNKNOWN = zVar3;
        z[] zVarArr = {zVar, zVar2, zVar3};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
        Companion = new x();
    }

    public z(String str, int i, String str2) {
        this.value = str2;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }

    public final bj0.b b() {
        int i = y.f325863a[ordinal()];
        if (i == 1) {
            return bj0.b.MALE;
        }
        if (i == 2) {
            return bj0.b.FEMALE;
        }
        if (i == 3) {
            return bj0.b.MALE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
