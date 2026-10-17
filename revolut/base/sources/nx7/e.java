package nx7;

import java.io.Serializable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BASE_DETAILS;
    public static final e BREED_SELECTION;
    public static final e PET_AGE;
    public static final e PET_SELECTION;

    static {
        e eVar = new e("PET_SELECTION", 0);
        PET_SELECTION = eVar;
        e eVar2 = new e("BASE_DETAILS", 1);
        BASE_DETAILS = eVar2;
        e eVar3 = new e("BREED_SELECTION", 2);
        BREED_SELECTION = eVar3;
        e eVar4 = new e("PET_AGE", 3);
        PET_AGE = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
