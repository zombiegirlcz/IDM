package s6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n AUTHENTICATION_VERIFIED;
    public static final n AUTHORISATION_PASSED;
    public static final n AUTHORISATION_STARTED;
    public static final n DECLINED;
    public static final n DECLINING;
    public static final n UNKNOWN;

    static {
        n nVar = new n("AUTHENTICATION_VERIFIED", 0);
        AUTHENTICATION_VERIFIED = nVar;
        n nVar2 = new n("DECLINED", 1);
        DECLINED = nVar2;
        n nVar3 = new n("DECLINING", 2);
        DECLINING = nVar3;
        n nVar4 = new n("AUTHORISATION_PASSED", 3);
        AUTHORISATION_PASSED = nVar4;
        n nVar5 = new n("AUTHORISATION_STARTED", 4);
        AUTHORISATION_STARTED = nVar5;
        n nVar6 = new n("UNKNOWN", 5);
        UNKNOWN = nVar6;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
