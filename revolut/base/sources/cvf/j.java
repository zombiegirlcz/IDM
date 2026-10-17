package cvf;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ACTIVE;
    public static final j EXPIRED;
    public static final j PENDING;
    public static final j TO_BE_ACTIVATED;

    @NotNull
    private final String value;

    static {
        j jVar = new j("ACTIVE", 0, "ACTIVE");
        ACTIVE = jVar;
        j jVar2 = new j("EXPIRED", 1, "EXPIRED");
        EXPIRED = jVar2;
        j jVar3 = new j("TO_BE_ACTIVATED", 2, "TO_BE_ACTIVATED");
        TO_BE_ACTIVATED = jVar3;
        j jVar4 = new j("PENDING", 3, "PENDING");
        PENDING = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public j(String str, int i, String str2) {
        this.value = str2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
