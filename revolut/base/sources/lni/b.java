package lni;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SMS;
    public static final b TELEPHONE;
    public static final b WHATSAPP;

    static {
        b bVar = new b("SMS", 0);
        SMS = bVar;
        b bVar2 = new b("TELEPHONE", 1);
        TELEPHONE = bVar2;
        b bVar3 = new b("WHATSAPP", 2);
        WHATSAPP = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
