package vr;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BAD_QUALITY;
    public static final b BAD_SUBMISSION;
    public static final b REJECTED;

    static {
        b bVar = new b("BAD_QUALITY", 0);
        BAD_QUALITY = bVar;
        b bVar2 = new b("BAD_SUBMISSION", 1);
        BAD_SUBMISSION = bVar2;
        b bVar3 = new b("REJECTED", 2);
        REJECTED = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
