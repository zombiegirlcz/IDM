package myh;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j STOP_LOSS;
    public static final j TAKE_PROFIT;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f210531id;

    static {
        j jVar = new j("TAKE_PROFIT", 0, "TAKE_PROFIT");
        TAKE_PROFIT = jVar;
        j jVar2 = new j("STOP_LOSS", 1, "STOP_LOSS");
        STOP_LOSS = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public j(String str, int i, String str2) {
        this.f210531id = str2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f210531id;
    }
}
