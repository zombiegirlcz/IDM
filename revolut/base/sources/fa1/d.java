package fa1;

import java.util.Map;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d AUTHORISATION_PASSED;
    public static final d AUTHORISATION_STARTED;
    public static final d AUTHORISED;

    @NotNull
    public static final c Companion;
    public static final d DECLINED;
    public static final d FAILED;
    public static final d SOFT_DECLINED;
    public static final d UNKNOWN;

    @NotNull
    private static final Map<String, d> mapping;

    static {
        d dVar = new d("AUTHORISATION_STARTED", 0);
        AUTHORISATION_STARTED = dVar;
        d dVar2 = new d("AUTHORISATION_PASSED", 1);
        AUTHORISATION_PASSED = dVar2;
        d dVar3 = new d("AUTHORISED", 2);
        AUTHORISED = dVar3;
        d dVar4 = new d("SOFT_DECLINED", 3);
        SOFT_DECLINED = dVar4;
        d dVar5 = new d("DECLINED", 4);
        DECLINED = dVar5;
        d dVar6 = new d("FAILED", 5);
        FAILED = dVar6;
        d dVar7 = new d("UNKNOWN", 6);
        UNKNOWN = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
        Companion = new c();
        mapping = r0.k(new Pair("authorisation_started", dVar), new Pair("authorisation_passed", dVar2), new Pair("authorised", dVar3), new Pair("declining", dVar5), new Pair("declined", dVar5), new Pair("failing", dVar6), new Pair("failed", dVar6), new Pair("authentication_challenge", dVar4));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
