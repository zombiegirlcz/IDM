package gz0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b Center;
    public static final b CenterCrop;
    public static final b CenterInside;
    public static final b FitCenter;
    public static final b Undefined;

    static {
        b bVar = new b("FitCenter", 0);
        FitCenter = bVar;
        b bVar2 = new b("CenterCrop", 1);
        CenterCrop = bVar2;
        b bVar3 = new b("Center", 2);
        Center = bVar3;
        b bVar4 = new b("CenterInside", 3);
        CenterInside = bVar4;
        b bVar5 = new b("Undefined", 4);
        Undefined = bVar5;
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
