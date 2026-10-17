package xl7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r Acceleration;
    public static final r Braking;
    public static final r Corners;
    public static final r Environment;
    public static final r HoursDriven;
    public static final r Speed;
    public static final r Trips;

    static {
        r rVar = new r("Speed", 0);
        Speed = rVar;
        r rVar2 = new r("Braking", 1);
        Braking = rVar2;
        r rVar3 = new r("Acceleration", 2);
        Acceleration = rVar3;
        r rVar4 = new r("Corners", 3);
        Corners = rVar4;
        r rVar5 = new r("Environment", 4);
        Environment = rVar5;
        r rVar6 = new r("Trips", 5);
        Trips = rVar6;
        r rVar7 = new r("HoursDriven", 6);
        HoursDriven = rVar7;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7};
        $VALUES = rVarArr;
        $ENTRIES = s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
