package yk5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CURRENCY_DELISTED;
    public static final f EXCHANGE_BLACKLIST_MATCH;
    public static final f GAMBLING_BLOCK;
    public static final f RISK_DETECTED;
    public static final f TRANSACTION_MONITORING_DECLINED;
    public static final f TRAVEL_RULE_DATA_JURISDICTION_REQ_FAILED;
    public static final f UNKNOWN;
    public static final f UNSUPPORTED_ASSET;
    public static final f UNSUPPORTED_EMT;
    public static final f USER_RESTRICTED;

    static {
        f fVar = new f("EXCHANGE_BLACKLIST_MATCH", 0);
        EXCHANGE_BLACKLIST_MATCH = fVar;
        f fVar2 = new f("RISK_DETECTED", 1);
        RISK_DETECTED = fVar2;
        f fVar3 = new f("TRAVEL_RULE_DATA_JURISDICTION_REQ_FAILED", 2);
        TRAVEL_RULE_DATA_JURISDICTION_REQ_FAILED = fVar3;
        f fVar4 = new f("TRANSACTION_MONITORING_DECLINED", 3);
        TRANSACTION_MONITORING_DECLINED = fVar4;
        f fVar5 = new f("UNSUPPORTED_ASSET", 4);
        UNSUPPORTED_ASSET = fVar5;
        f fVar6 = new f("UNSUPPORTED_EMT", 5);
        UNSUPPORTED_EMT = fVar6;
        f fVar7 = new f("CURRENCY_DELISTED", 6);
        CURRENCY_DELISTED = fVar7;
        f fVar8 = new f("GAMBLING_BLOCK", 7);
        GAMBLING_BLOCK = fVar8;
        f fVar9 = new f("USER_RESTRICTED", 8);
        USER_RESTRICTED = fVar9;
        f fVar10 = new f("UNKNOWN", 9);
        UNKNOWN = fVar10;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
