package lrd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a LINK_EXTERNAL_ACCOUNT;
    public static final a OTHER_ASSETS;
    public static final a PROPERTY;
    public static final a REVOLUT_ACCOUNT;

    static {
        a aVar = new a("REVOLUT_ACCOUNT", 0);
        REVOLUT_ACCOUNT = aVar;
        a aVar2 = new a("LINK_EXTERNAL_ACCOUNT", 1);
        LINK_EXTERNAL_ACCOUNT = aVar2;
        a aVar3 = new a("PROPERTY", 2);
        PROPERTY = aVar3;
        a aVar4 = new a("OTHER_ASSETS", 3);
        OTHER_ASSETS = aVar4;
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
