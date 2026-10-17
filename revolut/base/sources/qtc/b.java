package qtc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AUTOMOBILE_DEVICE;
    public static final b HOUSEHOLD_DEVICE;
    public static final b MOBILEPHONE_OR_TABLET;
    public static final b PC;
    public static final b PHONE;
    public static final b TABLET;
    public static final b UNKNOWN;
    public static final b WATCH;
    public static final b WEARABLE_DEVICE;

    static {
        b bVar = new b("PHONE", 0);
        PHONE = bVar;
        b bVar2 = new b("TABLET", 1);
        TABLET = bVar2;
        b bVar3 = new b("WATCH", 2);
        WATCH = bVar3;
        b bVar4 = new b("MOBILEPHONE_OR_TABLET", 3);
        MOBILEPHONE_OR_TABLET = bVar4;
        b bVar5 = new b("PC", 4);
        PC = bVar5;
        b bVar6 = new b("HOUSEHOLD_DEVICE", 5);
        HOUSEHOLD_DEVICE = bVar6;
        b bVar7 = new b("WEARABLE_DEVICE", 6);
        WEARABLE_DEVICE = bVar7;
        b bVar8 = new b("AUTOMOBILE_DEVICE", 7);
        AUTOMOBILE_DEVICE = bVar8;
        b bVar9 = new b("UNKNOWN", 8);
        UNKNOWN = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
