package lf5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CRYPTO_SETTINGS;
    public static final b DEEPLINK;
    public static final b ORDER_REVIEW;
    public static final b TRANSACTION_DETAILS;

    static {
        b bVar = new b("ORDER_REVIEW", 0);
        ORDER_REVIEW = bVar;
        b bVar2 = new b("TRANSACTION_DETAILS", 1);
        TRANSACTION_DETAILS = bVar2;
        b bVar3 = new b("CRYPTO_SETTINGS", 2);
        CRYPTO_SETTINGS = bVar3;
        b bVar4 = new b("DEEPLINK", 3);
        DEEPLINK = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
