package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class ib {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ib[] $VALUES;
    public static final ib AVATAR;
    public static final ib ERROR;
    public static final ib ICON;
    public static final ib QR;
    public static final ib QR_BLURRED;

    static {
        ib ibVar = new ib("QR", 0);
        QR = ibVar;
        ib ibVar2 = new ib("QR_BLURRED", 1);
        QR_BLURRED = ibVar2;
        ib ibVar3 = new ib("AVATAR", 2);
        AVATAR = ibVar3;
        ib ibVar4 = new ib("ICON", 3);
        ICON = ibVar4;
        ib ibVar5 = new ib("ERROR", 4);
        ERROR = ibVar5;
        ib[] ibVarArr = {ibVar, ibVar2, ibVar3, ibVar4, ibVar5};
        $VALUES = ibVarArr;
        $ENTRIES = vc.s.n(ibVarArr);
    }

    public static ib valueOf(String str) {
        return (ib) Enum.valueOf(ib.class, str);
    }

    public static ib[] values() {
        return (ib[]) $VALUES.clone();
    }
}
