package vza;

import kotlin.enums.EnumEntries;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @d
    public static final a CUSTOM_FIRMWARE;
    public static final a CUSTOM_KEYS;
    public static final a CUSTOM_OS;
    public static final a KA_REVOKED_CERT;
    public static final a ROOTED;
    public static final a UNLOCKED_BOOTLOADER;

    static {
        a aVar = new a("CUSTOM_FIRMWARE", 0);
        CUSTOM_FIRMWARE = aVar;
        a aVar2 = new a("CUSTOM_KEYS", 1);
        CUSTOM_KEYS = aVar2;
        a aVar3 = new a("CUSTOM_OS", 2);
        CUSTOM_OS = aVar3;
        a aVar4 = new a("KA_REVOKED_CERT", 3);
        KA_REVOKED_CERT = aVar4;
        a aVar5 = new a("ROOTED", 4);
        ROOTED = aVar5;
        a aVar6 = new a("UNLOCKED_BOOTLOADER", 5);
        UNLOCKED_BOOTLOADER = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
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
