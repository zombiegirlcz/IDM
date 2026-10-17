package my8;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q FOURTHLINE;
    public static final q INCODE;
    public static final q INTERNAL;
    public static final q ONFIDO;
    public static final q ONFIDO_STUDIO;
    public static final q REVID;
    public static final q TRUSTDOCK;
    public static final q VISION;

    static {
        q qVar = new q("INCODE", 0);
        INCODE = qVar;
        q qVar2 = new q("INTERNAL", 1);
        INTERNAL = qVar2;
        q qVar3 = new q("ONFIDO", 2);
        ONFIDO = qVar3;
        q qVar4 = new q("ONFIDO_STUDIO", 3);
        ONFIDO_STUDIO = qVar4;
        q qVar5 = new q("REVID", 4);
        REVID = qVar5;
        q qVar6 = new q("TRUSTDOCK", 5);
        TRUSTDOCK = qVar6;
        q qVar7 = new q("VISION", 6);
        VISION = qVar7;
        q qVar8 = new q("FOURTHLINE", 7);
        FOURTHLINE = qVar8;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
