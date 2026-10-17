package ws3;

import kotlin.enums.EnumEntries;
import ks3.c;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ADDITIONAL_DOCUMENTS_REQUIRED;
    public static final a REQUIRED;
    public static final a TICKETOR_PROGRESS;
    public static final a WAITING;

    static {
        a aVar = new a("WAITING", 0);
        WAITING = aVar;
        a aVar2 = new a("REQUIRED", 1);
        REQUIRED = aVar2;
        a aVar3 = new a("ADDITIONAL_DOCUMENTS_REQUIRED", 2);
        ADDITIONAL_DOCUMENTS_REQUIRED = aVar3;
        a aVar4 = new a("TICKETOR_PROGRESS", 3);
        TICKETOR_PROGRESS = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
