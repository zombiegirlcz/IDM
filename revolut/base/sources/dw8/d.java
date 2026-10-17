package dw8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d SDK_ALREADY_COMPLETED;
    public static final d SDK_INIT_ERROR;
    public static final d SDK_INTERNAL_ERROR;
    public static final d SDK_INVALID_CONFIGURATION;
    public static final d SDK_NETWORK_ERROR;
    public static final d SDK_NOT_SUPPORTED;
    public static final d SDK_TIMEOUT;
    public static final d SDK_USER_ABORTED;
    public static final d SDK_USER_BLOCKED;
    public static final d SDK_USER_DEACTIVATED;
    public static final d SDK_USER_INVALID;

    static {
        d dVar = new d("SDK_INVALID_CONFIGURATION", 0);
        SDK_INVALID_CONFIGURATION = dVar;
        d dVar2 = new d("SDK_TIMEOUT", 1);
        SDK_TIMEOUT = dVar2;
        d dVar3 = new d("SDK_ALREADY_COMPLETED", 2);
        SDK_ALREADY_COMPLETED = dVar3;
        d dVar4 = new d("SDK_INTERNAL_ERROR", 3);
        SDK_INTERNAL_ERROR = dVar4;
        d dVar5 = new d("SDK_NETWORK_ERROR", 4);
        SDK_NETWORK_ERROR = dVar5;
        d dVar6 = new d("SDK_USER_BLOCKED", 5);
        SDK_USER_BLOCKED = dVar6;
        d dVar7 = new d("SDK_USER_DEACTIVATED", 6);
        SDK_USER_DEACTIVATED = dVar7;
        d dVar8 = new d("SDK_USER_INVALID", 7);
        SDK_USER_INVALID = dVar8;
        d dVar9 = new d("SDK_USER_ABORTED", 8);
        SDK_USER_ABORTED = dVar9;
        d dVar10 = new d("SDK_NOT_SUPPORTED", 9);
        SDK_NOT_SUPPORTED = dVar10;
        d dVar11 = new d("SDK_INIT_ERROR", 10);
        SDK_INIT_ERROR = dVar11;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
