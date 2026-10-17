package l8a;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CNPJ;
    public static final i CPF;
    public static final i EMAIL;
    public static final i EVP;
    public static final i PHONE;

    static {
        i iVar = new i("CPF", 0);
        CPF = iVar;
        i iVar2 = new i("CNPJ", 1);
        CNPJ = iVar2;
        i iVar3 = new i("PHONE", 2);
        PHONE = iVar3;
        i iVar4 = new i("EMAIL", 3);
        EMAIL = iVar4;
        i iVar5 = new i("EVP", 4);
        EVP = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
