package kxk;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j MAIN_ASSET;
    public static final j RELATED_CFD;
    private final int pagePosition;

    @NotNull
    private final String tabId;

    static {
        j jVar = new j("MAIN_ASSET", 0, "TAB_MAIN_ASSET", 0);
        MAIN_ASSET = jVar;
        j jVar2 = new j("RELATED_CFD", 1, "TAB_RELATED_CFD", 1);
        RELATED_CFD = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public j(String str, int i, String str2, int i2) {
        this.tabId = str2;
        this.pagePosition = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final int b() {
        return this.pagePosition;
    }

    public final String c() {
        return this.tabId;
    }
}
