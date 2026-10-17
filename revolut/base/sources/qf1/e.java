package qf1;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e POCKETS;
    public static final e SAVINGS;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f245214id;

    static {
        e eVar = new e("POCKETS", 0, "POCKETS_GROUP");
        POCKETS = eVar;
        e eVar2 = new e("SAVINGS", 1, "SAVINGS_GROUP");
        SAVINGS = eVar2;
        e[] eVarArr = {eVar, eVar2};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.f245214id = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
