package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class zj {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ zj[] $VALUES;
    public static final zj AVATAR;
    public static final zj OVERLAPPED;
    public static final zj REGULAR;
    public static final zj SMALL;
    private final int heightDp;
    private final int paddingsDp;
    private final int widthDp;

    static {
        zj zjVar = new zj("SMALL", 0, 56, 56, 0);
        SMALL = zjVar;
        zj zjVar2 = new zj("AVATAR", 1, 104, 104, 16);
        AVATAR = zjVar2;
        zj zjVar3 = new zj("REGULAR", 2, 104, 104, 0);
        REGULAR = zjVar3;
        zj zjVar4 = new zj("OVERLAPPED", 3, -2, 80, 0);
        OVERLAPPED = zjVar4;
        zj[] zjVarArr = {zjVar, zjVar2, zjVar3, zjVar4};
        $VALUES = zjVarArr;
        $ENTRIES = vc.s.n(zjVarArr);
    }

    public zj(String str, int i, int i2, int i3, int i5) {
        this.widthDp = i2;
        this.heightDp = i3;
        this.paddingsDp = i5;
    }

    public static zj valueOf(String str) {
        return (zj) Enum.valueOf(zj.class, str);
    }

    public static zj[] values() {
        return (zj[]) $VALUES.clone();
    }

    public final int a() {
        return this.heightDp;
    }

    public final int b() {
        return this.paddingsDp;
    }

    public final int c() {
        return this.widthDp;
    }
}
