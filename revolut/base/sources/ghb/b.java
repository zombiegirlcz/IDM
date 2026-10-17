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
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final a Companion;
    public static final b EMAIL_PAYROLL_MANAGER;
    public static final b UNKNOWN;
    public static final b UPDATE_PAYROLL_PLATFORM_IN_APP;
    public static final b UPDATE_PAYROLL_PLATFORM_WORK_EMAIL;

    static {
        b bVar = new b("EMAIL_PAYROLL_MANAGER", 0);
        EMAIL_PAYROLL_MANAGER = bVar;
        b bVar2 = new b("UPDATE_PAYROLL_PLATFORM_WORK_EMAIL", 1);
        UPDATE_PAYROLL_PLATFORM_WORK_EMAIL = bVar2;
        b bVar3 = new b("UPDATE_PAYROLL_PLATFORM_IN_APP", 2);
        UPDATE_PAYROLL_PLATFORM_IN_APP = bVar3;
        b bVar4 = new b("UNKNOWN", 3);
        UNKNOWN = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
        $cachedSerializer$delegate = yhm.j.c(k.PUBLICATION, new gaa.b(19));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
