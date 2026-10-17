package o5l;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u CGST;

    @NotNull
    public static final t Companion;
    public static final u GMF;
    public static final u IGST;
    public static final u SGST;
    public static final u STAMP_DUTY;
    public static final u UNKNOWN;
    public static final u VAT;

    static {
        u uVar = new u("VAT", 0);
        VAT = uVar;
        u uVar2 = new u("IGST", 1);
        IGST = uVar2;
        u uVar3 = new u("CGST", 2);
        CGST = uVar3;
        u uVar4 = new u("SGST", 3);
        SGST = uVar4;
        u uVar5 = new u("GMF", 4);
        GMF = uVar5;
        u uVar6 = new u("STAMP_DUTY", 5);
        STAMP_DUTY = uVar6;
        u uVar7 = new u("UNKNOWN", 6);
        UNKNOWN = uVar7;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
        Companion = new t();
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
