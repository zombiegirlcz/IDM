package zw7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i BEHAVIOUR;
    public static final i CASH;
    public static final i DENTAL;
    public static final i FAREWELL;
    public static final i LOST;
    public static final i LOST_AD_REWARD;
    public static final i MEDICAL_CARE;
    public static final i ONLINE_SUPPORT;
    public static final i PUBLIC_LIABILITY;
    public static final i SPARKS;
    public static final i TRAVEL;

    @NotNull
    private final String value;

    static {
        i iVar = new i("CASH", 0, "CASH");
        CASH = iVar;
        i iVar2 = new i("LOST", 1, "LOST");
        LOST = iVar2;
        i iVar3 = new i("DENTAL", 2, "DENTAL");
        DENTAL = iVar3;
        i iVar4 = new i("TRAVEL", 3, "TRAVEL");
        TRAVEL = iVar4;
        i iVar5 = new i("FAREWELL", 4, "FAREWELL");
        FAREWELL = iVar5;
        i iVar6 = new i("LOST_AD_REWARD", 5, "LOST_AD_REWARD");
        LOST_AD_REWARD = iVar6;
        i iVar7 = new i("ONLINE_SUPPORT", 6, "ONLINE_SUPPORT");
        ONLINE_SUPPORT = iVar7;
        i iVar8 = new i("MEDICAL_CARE", 7, "MEDICAL_CARE");
        MEDICAL_CARE = iVar8;
        i iVar9 = new i("PUBLIC_LIABILITY", 8, "PUBLIC_LIABILITY");
        PUBLIC_LIABILITY = iVar9;
        i iVar10 = new i("SPARKS", 9, "SPARKS");
        SPARKS = iVar10;
        i iVar11 = new i("BEHAVIOUR", 10, "BEHAVIOUR");
        BEHAVIOUR = iVar11;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public i(String str, int i, String str2) {
        this.value = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
