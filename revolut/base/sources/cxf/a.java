package cxf;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ANONYMIZED;
    public static final a NOT_REGISTERED;
    public static final a OPTED_OUT;
    public static final a REGISTERED;

    @NotNull
    private final String value;

    static {
        a aVar = new a("REGISTERED", 0, "REGISTERED");
        REGISTERED = aVar;
        a aVar2 = new a("NOT_REGISTERED", 1, "NOT_REGISTERED");
        NOT_REGISTERED = aVar2;
        a aVar3 = new a("OPTED_OUT", 2, "OPTED_OUT_OF_SERVICE");
        OPTED_OUT = aVar3;
        a aVar4 = new a("ANONYMIZED", 3, "ANONYMIZED");
        ANONYMIZED = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
}
