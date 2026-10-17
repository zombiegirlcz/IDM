package po0;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j implements l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CREDIT;
    public static final j CRYPTO;
    public static final j DEFAULT;
    public static final j INVEST;
    public static final j JOINT;
    public static final j LINKED;
    public static final j PLAN_PLUS;
    public static final j POCKETS;
    public static final j PRO;
    public static final j REV_POINTS;
    public static final j SAVINGS;
    public static final j U18;
    private final /* synthetic */ s $$delegate_0;

    static {
        j jVar = new j("DEFAULT", 0, 7315711, 1255165, 1255165);
        DEFAULT = jVar;
        j jVar2 = new j("SAVINGS", 1, 8419063, 3684541, 8419063);
        SAVINGS = jVar2;
        j jVar3 = new j("CREDIT", 2, 4572087, 29798, 4572087);
        CREDIT = jVar3;
        j jVar4 = new j("POCKETS", 3, 9002981, 5710541, 9002981);
        POCKETS = jVar4;
        j jVar5 = new j("JOINT", 4, 11620818, 8858340, 11620818);
        JOINT = jVar5;
        j jVar6 = new j("PRO", 5, 11646669, 9409448, 7895160);
        PRO = jVar6;
        j jVar7 = new j("U18", 6, 11564287, 6815980, 11564287);
        U18 = jVar7;
        j jVar8 = new j("LINKED", 7, 11056074, 7315711, 7315711);
        LINKED = jVar8;
        j jVar9 = new j("INVEST", 8, 6285561, 1335419, 6285561);
        INVEST = jVar9;
        j jVar10 = new j("CRYPTO", 9, 8756735, 4148112, 8756735);
        CRYPTO = jVar10;
        j jVar11 = new j("REV_POINTS", 10, 8412405, 5199345, 8412405);
        REV_POINTS = jVar11;
        j jVar12 = new j("PLAN_PLUS", 11, 5199345, 2895747, 5199345);
        PLAN_PLUS = jVar12;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public j(String str, int i, int i2, int i3, int i5) {
        this.$$delegate_0 = new s(i2, i3, i5, null);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    @Override // po0.l
    public final int a(boolean z) {
        return this.$$delegate_0.a(z);
    }

    @Override // po0.l
    public final LottieImage b(boolean z, boolean z3) {
        return this.$$delegate_0.b(z, z3);
    }

    @Override // po0.l
    public final Integer c() {
        return Integer.valueOf(this.$$delegate_0.e);
    }
}
