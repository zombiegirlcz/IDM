package ef2;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final i ANNUAL;
    public static final i BIWEEKLY;

    @NotNull
    public static final h Companion;
    public static final i DAILY;
    public static final i MONTHLY;
    public static final i WEEKLY;

    static {
        i iVar = new i("DAILY", 0);
        DAILY = iVar;
        i iVar2 = new i("WEEKLY", 1);
        WEEKLY = iVar2;
        i iVar3 = new i("BIWEEKLY", 2);
        BIWEEKLY = iVar3;
        i iVar4 = new i("MONTHLY", 3);
        MONTHLY = iVar4;
        i iVar5 = new i("ANNUAL", 4);
        ANNUAL = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
        Companion = new h();
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new ebl.a(19));
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
