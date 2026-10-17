package t1e;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q ACTIVITY;
    public static final q CATEGORY;
    public static final q PRODUCT;

    @NotNull
    private final String prefix;

    static {
        q qVar = new q("ACTIVITY", 0, "A");
        ACTIVITY = qVar;
        q qVar2 = new q("PRODUCT", 1, "P");
        PRODUCT = qVar2;
        q qVar3 = new q("CATEGORY", 2, "C");
        CATEGORY = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public q(String str, int i, String str2) {
        this.prefix = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final String b() {
        return this.prefix;
    }
}
