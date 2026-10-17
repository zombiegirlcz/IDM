package zuj;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m AirportFastTrack;
    public static final m Custom;
    public static final m Experiences;
    public static final m Stays;

    static {
        m mVar = new m("Stays", 0);
        Stays = mVar;
        m mVar2 = new m("Experiences", 1);
        Experiences = mVar2;
        m mVar3 = new m("AirportFastTrack", 2);
        AirportFastTrack = mVar3;
        m mVar4 = new m("Custom", 3);
        Custom = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
