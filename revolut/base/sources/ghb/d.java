package ghb;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final d AWAITING_PAYROLL_RESPONSE;
    public static final d AWAITING_USER_CONFIRM;

    @NotNull
    public static final c Companion;
    public static final d UNKNOWN;

    static {
        d dVar = new d("AWAITING_PAYROLL_RESPONSE", 0);
        AWAITING_PAYROLL_RESPONSE = dVar;
        d dVar2 = new d("AWAITING_USER_CONFIRM", 1);
        AWAITING_USER_CONFIRM = dVar2;
        d dVar3 = new d("UNKNOWN", 2);
        UNKNOWN = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
        Companion = new c();
        $cachedSerializer$delegate = yhm.j.c(k.PUBLICATION, new gaa.b(20));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
