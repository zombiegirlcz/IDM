package c90;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b HDPI;
    public static final b MDPI;
    public static final b XHDPI;
    public static final b XXHDPI;
    public static final b XXXHDPI;

    static {
        b bVar = new b("MDPI", 0);
        MDPI = bVar;
        b bVar2 = new b("HDPI", 1);
        HDPI = bVar2;
        b bVar3 = new b("XHDPI", 2);
        XHDPI = bVar3;
        b bVar4 = new b("XXHDPI", 3);
        XXHDPI = bVar4;
        b bVar5 = new b("XXXHDPI", 4);
        XXXHDPI = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
