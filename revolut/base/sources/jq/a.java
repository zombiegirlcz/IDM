package jq;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a KYC_PENDING;
    public static final a KYC_REQUIRED;
    public static final a LOGIN_REQUIRED;

    static {
        a aVar = new a("LOGIN_REQUIRED", 0);
        LOGIN_REQUIRED = aVar;
        a aVar2 = new a("KYC_PENDING", 1);
        KYC_PENDING = aVar2;
        a aVar3 = new a("KYC_REQUIRED", 2);
        KYC_REQUIRED = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
