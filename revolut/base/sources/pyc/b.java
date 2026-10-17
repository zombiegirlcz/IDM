package pyc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b UNDER_REVIEW;
    public static final b USER_ACTION_REQUIRED;
    public static final b VERIFICATION_COMPLETED;

    static {
        b bVar = new b("USER_ACTION_REQUIRED", 0);
        USER_ACTION_REQUIRED = bVar;
        b bVar2 = new b("UNDER_REVIEW", 1);
        UNDER_REVIEW = bVar2;
        b bVar3 = new b("VERIFICATION_COMPLETED", 2);
        VERIFICATION_COMPLETED = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
