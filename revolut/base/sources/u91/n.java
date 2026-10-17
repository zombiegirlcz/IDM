package u91;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n CREATED;

    @NotNull
    public static final m Companion;
    public static final n INFORMATION_REQUIRED;
    public static final n PROCESSED;
    public static final n SELECTED;
    public static final n SUBMITTED;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f278373id;

    static {
        n nVar = new n("CREATED", 0, "CREATED");
        CREATED = nVar;
        n nVar2 = new n("SUBMITTED", 1, "SUBMITTED");
        SUBMITTED = nVar2;
        n nVar3 = new n("SELECTED", 2, "SELECTED");
        SELECTED = nVar3;
        n nVar4 = new n("INFORMATION_REQUIRED", 3, "INFORMATION_REQUIRED");
        INFORMATION_REQUIRED = nVar4;
        n nVar5 = new n("PROCESSED", 4, "PROCESSED");
        PROCESSED = nVar5;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
        Companion = new m();
    }

    public n(String str, int i, String str2) {
        this.f278373id = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f278373id;
    }
}
