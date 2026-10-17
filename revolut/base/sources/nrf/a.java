package nrf;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a TransferDefault;
    public static final a TransferFtt;
    public static final a TransferOther;

    @NotNull
    private final String value;

    static {
        a aVar = new a("TransferDefault", 0, "transfer.default");
        TransferDefault = aVar;
        a aVar2 = new a("TransferOther", 1, "transfer.other");
        TransferOther = aVar2;
        a aVar3 = new a("TransferFtt", 2, "transfer.ftt");
        TransferFtt = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
