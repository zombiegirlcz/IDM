package w30;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u CANCELED;
    public static final u COMPLETED;

    @NotNull
    public static final t Companion;
    public static final u OFFERED;
    public static final u PENDING;
    public static final u SCHEDULED;
    public static final u UNKNOWN;

    @NotNull
    private final String key;

    static {
        u uVar = new u("PENDING", 0, "Pending");
        PENDING = uVar;
        u uVar2 = new u("OFFERED", 1, "Offered");
        OFFERED = uVar2;
        u uVar3 = new u("SCHEDULED", 2, "Scheduled");
        SCHEDULED = uVar3;
        u uVar4 = new u("CANCELED", 3, "Canceled");
        CANCELED = uVar4;
        u uVar5 = new u("COMPLETED", 4, "Completed");
        COMPLETED = uVar5;
        u uVar6 = new u("UNKNOWN", 5, "");
        UNKNOWN = uVar6;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
        Companion = new t();
    }

    public u(String str, int i, String str2) {
        this.key = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
