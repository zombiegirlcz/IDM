package u91;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;

    @NotNull
    public static final r Companion;
    public static final s DAILY;
    public static final s MONTHLY;
    public static final s QUARTERLY;
    public static final s WEEKLY;
    public static final s YEARLY;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f278381id;

    static {
        s sVar = new s("DAILY", 0, "DAILY");
        DAILY = sVar;
        s sVar2 = new s("WEEKLY", 1, "WEEKLY");
        WEEKLY = sVar2;
        s sVar3 = new s("MONTHLY", 2, "MONTHLY");
        MONTHLY = sVar3;
        s sVar4 = new s("QUARTERLY", 3, "QUARTERLY");
        QUARTERLY = sVar4;
        s sVar5 = new s("YEARLY", 4, "YEARLY");
        YEARLY = sVar5;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
        Companion = new r();
    }

    public s(String str, int i, String str2) {
        this.f278381id = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f278381id;
    }
}
