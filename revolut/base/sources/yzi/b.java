package yzi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b APPROVED;
    public static final b COMPLETED;
    public static final b CREATED;
    public static final b DEFERRED;
    public static final b FAILED;
    public static final b IN_REVIEW;
    public static final b SKIPPED;
    public static final b UNKNOWN;

    static {
        b bVar = new b("COMPLETED", 0);
        COMPLETED = bVar;
        b bVar2 = new b("FAILED", 1);
        FAILED = bVar2;
        b bVar3 = new b("CREATED", 2);
        CREATED = bVar3;
        b bVar4 = new b("IN_REVIEW", 3);
        IN_REVIEW = bVar4;
        b bVar5 = new b("APPROVED", 4);
        APPROVED = bVar5;
        b bVar6 = new b("DEFERRED", 5);
        DEFERRED = bVar6;
        b bVar7 = new b("SKIPPED", 6);
        SKIPPED = bVar7;
        b bVar8 = new b("UNKNOWN", 7);
        UNKNOWN = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
