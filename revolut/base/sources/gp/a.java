package gp;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BRAZILIAN_PHONE;
    public static final a CNPJ;
    public static final a CPF;

    static {
        a aVar = new a("BRAZILIAN_PHONE", 0);
        BRAZILIAN_PHONE = aVar;
        a aVar2 = new a("CPF", 1);
        CPF = aVar2;
        a aVar3 = new a("CNPJ", 2);
        CNPJ = aVar3;
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
