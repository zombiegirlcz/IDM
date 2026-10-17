package pie;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ACCOUNTS;
    public static final v BEREAVEMENT;
    public static final v CREDIT;
    public static final v FLAT_ROOT;
    public static final v POCKETS;
    public static final v SAVINGS;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f236474id;

    static {
        v vVar = new v("ACCOUNTS", 0, "accounts");
        ACCOUNTS = vVar;
        v vVar2 = new v("POCKETS", 1, "pockets");
        POCKETS = vVar2;
        v vVar3 = new v("SAVINGS", 2, "savings");
        SAVINGS = vVar3;
        v vVar4 = new v("CREDIT", 3, "credit");
        CREDIT = vVar4;
        v vVar5 = new v("BEREAVEMENT", 4, "bereavement");
        BEREAVEMENT = vVar5;
        v vVar6 = new v("FLAT_ROOT", 5, "root");
        FLAT_ROOT = vVar6;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public v(String str, int i, String str2) {
        this.f236474id = str2;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f236474id;
    }
}
