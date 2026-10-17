package tjg;

import java.util.Map;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import le.u1;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CALL;

    @NotNull
    public static final d Companion;
    public static final e EMAIL;
    public static final e PASSCODE;
    public static final e PUSH;
    public static final e SESSION;
    public static final e SMS;

    @NotNull
    private static final Map<String, e> mapping;

    static {
        e eVar = new e("PUSH", 0);
        PUSH = eVar;
        e eVar2 = new e("SMS", 1);
        SMS = eVar2;
        e eVar3 = new e("EMAIL", 2);
        EMAIL = eVar3;
        e eVar4 = new e("CALL", 3);
        CALL = eVar4;
        e eVar5 = new e("PASSCODE", 4);
        PASSCODE = eVar5;
        e eVar6 = new e("SESSION", 5);
        SESSION = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
        Companion = new d();
        mapping = r0.k(new Pair("PUSH", eVar), new Pair("SMS", eVar2), new Pair("CALL", eVar4), new Pair("EMAIL", eVar3), new Pair("PASSWORD", eVar5), new Pair("APP", eVar6));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return u1.g(this, mapping);
    }
}
