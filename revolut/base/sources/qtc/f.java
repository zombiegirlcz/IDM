package qtc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ANDROID_PAY;
    public static final f APPLE_PAY;
    public static final f CLICK_TO_PAY;
    public static final f FITBIT_PAY;
    public static final f GARMIN_PAY;
    public static final f MERCHANT;
    public static final f SAMSUNG_PAY;
    public static final f UNKNOWN;

    static {
        f fVar = new f("ANDROID_PAY", 0);
        ANDROID_PAY = fVar;
        f fVar2 = new f("APPLE_PAY", 1);
        APPLE_PAY = fVar2;
        f fVar3 = new f("FITBIT_PAY", 2);
        FITBIT_PAY = fVar3;
        f fVar4 = new f("GARMIN_PAY", 3);
        GARMIN_PAY = fVar4;
        f fVar5 = new f("SAMSUNG_PAY", 4);
        SAMSUNG_PAY = fVar5;
        f fVar6 = new f("CLICK_TO_PAY", 5);
        CLICK_TO_PAY = fVar6;
        f fVar7 = new f("MERCHANT", 6);
        MERCHANT = fVar7;
        f fVar8 = new f("UNKNOWN", 7);
        UNKNOWN = fVar8;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8};
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
