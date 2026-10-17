package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public abstract class f0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;

    static {
        f0[] f0VarArr = new f0[0];
        $VALUES = f0VarArr;
        $ENTRIES = vc.s.n(f0VarArr);
    }

    public static f0 valueOf(String str) {
        a0.d.B(Enum.valueOf(f0.class, str));
        throw null;
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
