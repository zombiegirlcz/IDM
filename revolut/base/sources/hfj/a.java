package hfj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ALWAYS_INCLUDE;
    public static final a SKIP_IF_NO_SUBSCRIPTIONS;

    static {
        a aVar = new a("SKIP_IF_NO_SUBSCRIPTIONS", 0);
        SKIP_IF_NO_SUBSCRIPTIONS = aVar;
        a aVar2 = new a("ALWAYS_INCLUDE", 1);
        ALWAYS_INCLUDE = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
