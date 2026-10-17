package ril;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DOCUMENTS;
    public static final c IDENTITY_DECLARATION;
    public static final c QES;
    public static final c TAX_RESIDENCY;
    public static final c WORKFLOW;

    static {
        c cVar = new c("IDENTITY_DECLARATION", 0);
        IDENTITY_DECLARATION = cVar;
        c cVar2 = new c("DOCUMENTS", 1);
        DOCUMENTS = cVar2;
        c cVar3 = new c("TAX_RESIDENCY", 2);
        TAX_RESIDENCY = cVar3;
        c cVar4 = new c("QES", 3);
        QES = cVar4;
        c cVar5 = new c("WORKFLOW", 4);
        WORKFLOW = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
