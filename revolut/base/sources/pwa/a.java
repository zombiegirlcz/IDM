package pwa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CRYPTO_CURRENCY;
    public static final a PERSONAL;
    public static final a PRIVACY;
    public static final a REFERRALS;

    static {
        a aVar = new a("CRYPTO_CURRENCY", 0);
        CRYPTO_CURRENCY = aVar;
        a aVar2 = new a("PERSONAL", 1);
        PERSONAL = aVar2;
        a aVar3 = new a("REFERRALS", 2);
        REFERRALS = aVar3;
        a aVar4 = new a("PRIVACY", 3);
        PRIVACY = aVar4;
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
