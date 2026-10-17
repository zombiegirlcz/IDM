package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k NotAvailable;
    public static final k NotReadyToUse;
    public static final k NotSupported;
    public static final k ReadyToUse;

    static {
        k kVar = new k("ReadyToUse", 0);
        ReadyToUse = kVar;
        k kVar2 = new k("NotReadyToUse", 1);
        NotReadyToUse = kVar2;
        k kVar3 = new k("NotSupported", 2);
        NotSupported = kVar3;
        k kVar4 = new k("NotAvailable", 3);
        NotAvailable = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
