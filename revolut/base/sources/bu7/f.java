package bu7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f EMAIL;
    public static final f HIDDEN_PHONE;
    public static final f PHONE;
    public static final f WEB;

    static {
        f fVar = new f("PHONE", 0);
        PHONE = fVar;
        f fVar2 = new f("EMAIL", 1);
        EMAIL = fVar2;
        f fVar3 = new f("WEB", 2);
        WEB = fVar3;
        f fVar4 = new f("HIDDEN_PHONE", 3);
        HIDDEN_PHONE = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
