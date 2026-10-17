package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class hb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hb[] $VALUES;
    public static final hb Dark;
    public static final hb Default;
    public static final hb Light;

    static {
        hb hbVar = new hb("Light", 0);
        Light = hbVar;
        hb hbVar2 = new hb("Dark", 1);
        Dark = hbVar2;
        hb hbVar3 = new hb("Default", 2);
        Default = hbVar3;
        hb[] hbVarArr = {hbVar, hbVar2, hbVar3};
        $VALUES = hbVarArr;
        $ENTRIES = vc.s.n(hbVarArr);
    }

    public static hb valueOf(String str) {
        return (hb) Enum.valueOf(hb.class, str);
    }

    public static hb[] values() {
        return (hb[]) $VALUES.clone();
    }
}
