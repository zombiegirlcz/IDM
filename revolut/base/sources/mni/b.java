package mni;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b EMAIL;
    public static final b RCS;
    public static final b SMS;
    public static final b TELEPHONE;
    public static final b WHATSAPP;

    static {
        b bVar = new b("EMAIL", 0);
        EMAIL = bVar;
        b bVar2 = new b("RCS", 1);
        RCS = bVar2;
        b bVar3 = new b("SMS", 2);
        SMS = bVar3;
        b bVar4 = new b("TELEPHONE", 3);
        TELEPHONE = bVar4;
        b bVar5 = new b("WHATSAPP", 4);
        WHATSAPP = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
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
