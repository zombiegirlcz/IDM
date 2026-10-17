package yma;

import java.io.Serializable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CHECK_EMAIL;
    public static final d CODE_CONFIRMATION;
    public static final d EMAIL;
    public static final d ERROR;
    public static final d SUCCESS;

    static {
        d dVar = new d("EMAIL", 0);
        EMAIL = dVar;
        d dVar2 = new d("CHECK_EMAIL", 1);
        CHECK_EMAIL = dVar2;
        d dVar3 = new d("CODE_CONFIRMATION", 2);
        CODE_CONFIRMATION = dVar3;
        d dVar4 = new d("SUCCESS", 3);
        SUCCESS = dVar4;
        d dVar5 = new d("ERROR", 4);
        ERROR = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
