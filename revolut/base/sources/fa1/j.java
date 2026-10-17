package fa1;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CONTACT;
    public static final j CONTACTLESS;
    public static final j UNKNOWN;

    @NotNull
    private final String key;

    static {
        j jVar = new j("CONTACT", 0, "contact");
        CONTACT = jVar;
        j jVar2 = new j("CONTACTLESS", 1, "contactless");
        CONTACTLESS = jVar2;
        j jVar3 = new j("UNKNOWN", 2, "unknown");
        UNKNOWN = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public j(String str, int i, String str2) {
        this.key = str2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String a() {
        return this.key;
    }
}
