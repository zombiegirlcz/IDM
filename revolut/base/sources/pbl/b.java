package pbl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DECLARATION;
    public static final b EDIT_PROFILE;
    public static final b REMEDIATION;

    static {
        b bVar = new b("DECLARATION", 0);
        DECLARATION = bVar;
        b bVar2 = new b("REMEDIATION", 1);
        REMEDIATION = bVar2;
        b bVar3 = new b("EDIT_PROFILE", 2);
        EDIT_PROFILE = bVar3;
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
