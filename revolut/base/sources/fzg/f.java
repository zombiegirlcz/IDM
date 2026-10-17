package fzg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BY_ASSET;
    public static final f BY_POSITIONS;
    public static final f BY_TRANSACTION;

    static {
        f fVar = new f("BY_ASSET", 0);
        BY_ASSET = fVar;
        f fVar2 = new f("BY_TRANSACTION", 1);
        BY_TRANSACTION = fVar2;
        f fVar3 = new f("BY_POSITIONS", 2);
        BY_POSITIONS = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
