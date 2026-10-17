package wd6;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.GeofenceStatusCodes;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g AMOUNT_LIMIT_EXCEEDED;
    public static final g DAILY_EXCHANGE_LIMIT_EXCEEDED;
    public static final g EXCESSIVE_VOLATILITY;
    public static final g LOW_BALANCE;
    public static final g UNKNOWN;
    private final int code;

    static {
        g gVar = new g("AMOUNT_LIMIT_EXCEEDED", 0, 5602);
        AMOUNT_LIMIT_EXCEEDED = gVar;
        g gVar2 = new g("LOW_BALANCE", 1, 1006);
        LOW_BALANCE = gVar2;
        g gVar3 = new g("EXCESSIVE_VOLATILITY", 2, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        EXCESSIVE_VOLATILITY = gVar3;
        g gVar4 = new g("DAILY_EXCHANGE_LIMIT_EXCEEDED", 3, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        DAILY_EXCHANGE_LIMIT_EXCEEDED = gVar4;
        g gVar5 = new g("UNKNOWN", 4, 0);
        UNKNOWN = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public g(String str, int i, int i2) {
        this.code = i2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int a() {
        return this.code;
    }
}
