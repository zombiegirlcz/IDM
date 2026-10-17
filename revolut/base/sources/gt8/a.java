package gt8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NONE;
    public static final a REVIEW_IN_PROGRESS;
    public static final a UPLOADING_DONE;
    public static final a VERIFY_IDENTITY_IN_PROGRESS;

    static {
        a aVar = new a("VERIFY_IDENTITY_IN_PROGRESS", 0);
        VERIFY_IDENTITY_IN_PROGRESS = aVar;
        a aVar2 = new a("REVIEW_IN_PROGRESS", 1);
        REVIEW_IN_PROGRESS = aVar2;
        a aVar3 = new a("UPLOADING_DONE", 2);
        UPLOADING_DONE = aVar3;
        a aVar4 = new a("NONE", 3);
        NONE = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
